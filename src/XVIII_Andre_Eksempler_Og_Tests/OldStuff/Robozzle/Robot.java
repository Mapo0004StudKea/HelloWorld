package XVIII_Andre_Eksempler_Og_Tests.OldStuff.Robozzle;

import java.util.ArrayList;
import java.util.Scanner;

public class Robot {
    // IMPORTANT: In the CodeJudge overwrite version this must be set to /true/.
    //	          This allows us to pass levels in through stdin instead.
    private static final boolean DO_READ_LEVEL_FROM_STDIN = false;
    private static boolean isLevelLoaded = false;

    private static final int MAX_STEP_COUNT = 1000; // NOTE: This should be synchronized with the animator!
    private static int turnCount = 0;

    private static int x;
    private static int y;
    private static int dir = 0; // 0=Right, 1=Up, 2=Left, 3=Down.
    private static boolean hasDied = false;

    private static ArrayList<ArrayList<Character>> level = new ArrayList<>();
    private static int starsLeft = 0;

    public static void move() {
        ensureLevelIsLoaded();
        if (!gameStillGoing()) return;
        printMove("m");
        if      (dir == 0) x++;
        else if (dir == 1) y++;
        else if (dir == 2) x--;
        else if (dir == 3) y--;
        advanceTurn();
    }
    public static void turnLeft() {
        ensureLevelIsLoaded();
        if (!gameStillGoing()) return;
        printMove("l");
        dir = dir == 3 ? 0 : dir + 1;
        advanceTurn();
    }
    public static void turnRight() {
        ensureLevelIsLoaded();
        if (!gameStillGoing()) return;
        printMove("r");
        dir = dir == 0 ? 3 : dir - 1;
        advanceTurn();
    }
    private static boolean gameStillGoing() {
        return starsLeft > 0 && !hasDied;
    }
    public static boolean isBlue() {
        ensureLevelIsLoaded();
        if (!gameStillGoing()) return false;
        printMove("b?");
        advanceTurn();
        return level.get(y).get(x) == 'b' || level.get(y).get(x) == 'B';
    }
    public static boolean isRed() {
        ensureLevelIsLoaded();
        if (!gameStillGoing()) return false;
        printMove("r?");
        advanceTurn();
        return level.get(y).get(x) == 'r' || level.get(y).get(x) == 'R';
    }
    public static boolean isGreen() {
        ensureLevelIsLoaded();
        if (!gameStillGoing()) return false;
        printMove("g?");
        advanceTurn();
        return level.get(y).get(x) == 'g' || level.get(y).get(x) == 'G';
    }

    private static boolean isOutOfBounds() {
        return y < 0 || y >= level.size() || x < 0 || x >= level.get(y).size();
    }
    private static boolean isOnTile() {
        return !isOutOfBounds() && level.get(y).get(x) != '.';
    }
    private static void advanceTurn() {
        turnCount++;
        if (turnCount > MAX_STEP_COUNT || isOutOfBounds() || !isOnTile()) {
            if (turnCount > MAX_STEP_COUNT) {
                System.out.format("lost by exceeding maximum allowed turns (%d)\n", MAX_STEP_COUNT);
            } else {
                System.out.format("lost by falling off the edge\n");
            }
            hasDied = true;
            System.exit(0);
        } else {
            collectStarUnderPlayerIfAny();
        }
    }
    private static boolean collectStarUnderPlayerIfAny() {
        if (isOutOfBounds() || !isOnTile()) return false;
        if (!Character.isUpperCase(level.get(y).get(x))) return false;

        level.get(y).set(x, Character.toLowerCase(level.get(y).get(x))); // Remove star.
        starsLeft--;
        if (starsLeft == 0) {
            System.out.println("won");
            System.exit(0);
        }
        return true;
    }

    private static boolean allowedCell(char c) {
        final String allowedCells = "rgbnRGBN.";
        return allowedCells.indexOf(c) >= 0;
    }

    private static void printMove(String move) {
        // The stack (from the top) will be: getStackTrace, printMove, goForward/turnX, main.
        // To be robust we get the current class (Robot) via the second element, and then search down in the stack
        // until we reach another class, which we assume is the caller.
        // NOTE: We only inspect on class names (not an object). This could break if the user runs from an identically
        //       named class. However, we assume that will not be a problem for our use case, as it requires using
        //       packages, which won't be used at bootcamp.
        StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
        String thisRobotClassName = stackTrace[1].getClassName();
        int lineNumber = -1;
        for (int i = 1; i < stackTrace.length; i++) {
            if (!stackTrace[i].getClassName().equals(thisRobotClassName)) {
                lineNumber = stackTrace[i].getLineNumber();
                break;
            }
        }

        if (lineNumber >= 0) {
            System.out.format("%s\t%d\n", move, lineNumber);
        } else {  // We failed to find a proper line number, so we ignore it.
            System.out.format("%s\n", move);
        }
    }

    private static void ensureLevelIsLoaded() {
        // This only works if the level is passed in by stdin (happen on CodeJudge). Otherwise we have no level data.
        if (!DO_READ_LEVEL_FROM_STDIN) return;
        if (isLevelLoaded) return;
        loadLevel(""); // Level string is ignored. This sets "is loaded" flag.
    }
    public static void loadLevel(String levelStr) {
        if (!parseLevel(levelStr)) System.exit(1);
    }
    private static boolean parseLevel(String levelStr) {
        String[] lines = null;
        if (DO_READ_LEVEL_FROM_STDIN) {
            ArrayList<String> linesFromStdin = new ArrayList<>();
            Scanner in = new Scanner(System.in);
            while(in.hasNextLine()) {
                linesFromStdin.add(in.nextLine());
            }

            // We use the number of input lines to differentiate between level data and player position.
            // If these lines are empty for any reason (happens on CodeJudge due to newline insert), then our parsing
            // fails. Therefore we clean these before proceeding.
            if (linesFromStdin.size() == 0) {
                System.err.println("Failed to read any input from stdin!");
                return false;
            }
            String lastLine = linesFromStdin.get(linesFromStdin.size() - 1);
            while (lastLine == null || lastLine.isEmpty()) {
                linesFromStdin.remove(linesFromStdin.size() - 1);
                if (linesFromStdin.isEmpty()) break; // Empty level data handled below.
                lastLine = linesFromStdin.get(linesFromStdin.size() - 1);
            }

            lines = new String[linesFromStdin.size()];
            lines = linesFromStdin.toArray(lines); // We pass lines just allow the type to be inferred.
        } else {
            lines = levelStr.split("\n");
        }

        if (lines.length <= 1) {
            System.err.format("Missing level data! Expected more than %d lines.\n", lines.length);
            return false;
        }

        // Parse level data.
        level.clear();
        starsLeft = 0;
        int levelHeight = lines.length - 1;
        int levelWidth  = 0;
        for (int i = 0; i < levelHeight; i++) {
            level.add(0, new ArrayList<>()); // We insert at start to achieve (0,0) in bottom-left corner.
            String line = lines[i];
            levelWidth = Math.max(levelWidth, line.length());
            for (int j = 0; j < line.length(); j++) {
                char c = line.charAt(j);
                if (!allowedCell(c)) {
                    System.err.format("Unknown cell character at position %d in line %d (%c)!\n", j, i, c);
                    return false;
                }
                level.get(0).add(c);
                if (Character.isUpperCase(c)) starsLeft++;
            }
        }
        if (levelHeight == 0 || levelWidth == 0) {
            System.err.format("Empty levels are not allowed!\n");
            return false;
        }

        // Parse player starting position.
        String[] parts = lines[lines.length - 1].split("[\t ]+"); // Allow any amount of whitespace.
        if (parts.length != 3) {
            System.err.format("Unable to read player position in last line. Ensure that it has the correct format: \nx y direction");
            return false;
        }
        try {
            x = Integer.parseInt(parts[0]);
            y = Integer.parseInt(parts[1]);
        } catch (NumberFormatException e) {
            System.err.format("Player position (x,y) is in an incorrect format. Ensure it is integers, e.g.: 4 3");
            return false;
        }
        if (isOutOfBounds()) {
            System.err.format("Player position (%d,%d) is outside the level.", x, y);
            return false;
        }
        if (!isOnTile()) {
            System.err.format("Player is not standing on a tile (%d,%d).", x, y);
            return false;
        }

        // In case the player starts on a star, collect it.
        collectStarUnderPlayerIfAny();

        String rot = parts[2];
        if ("r".equals(rot)) dir = 0;
        else if ("u".equals(rot)) dir = 1;
        else if ("l".equals(rot)) dir = 2;
        else if ("d".equals(rot)) dir = 3;
        else {
            System.err.format("Invalid player direction '%s'! Must be either 'r', 'l', 'u' or 'd'.", rot);
            return false;
        }

        turnCount = 0;
        isLevelLoaded = true;
        return true;
    }
}
