package Eksamenstræning;

import java.util.ArrayList;

public class Candidate {
    String name;
    String party;
    int numberOfVotes;

    Candidate(String name, String party, int numberOfVotes) {
        this.name=name;
        this.party=party;
        this.numberOfVotes=numberOfVotes;
    }

    public static void main(String[] args) {
        Election election = new Election();

        election.getTotalVotes();
        election.getCandidateFromParty();
    }
}

class Election {
    public ArrayList<Candidate> candidates = new ArrayList<>();
    Candidate test = new Candidate("bob", "tea party", 5);
    Candidate test2 = new Candidate("Kim", "other party", 6);

    public int getTotalVotes() {
        int totalVotes = 0;
        candidates.add(test);
        candidates.add(test2);
        for (int i=0; i < candidates.size(); i++) {
            totalVotes=test.numberOfVotes+test2.numberOfVotes;
            System.out.println(totalVotes);
        }
        return candidates.size();
    }

    public String getCandidateFromParty() {
        candidates.add(test);
        candidates.add(test2);
        for (int i=0; i<candidates.size(); i++) {
            if (candidates.get(i).party.contains("tea party")) {
                System.out.println(candidates.get(i).name);
                System.out.println(candidates.get(i).party);
            }
            break;
        }
        return candidates.toString();
    }
}
