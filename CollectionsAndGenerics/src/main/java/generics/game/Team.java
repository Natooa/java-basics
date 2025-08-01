package generics.game;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Team <T extends Participant> {
    private String name;
    private List<T> participants = new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public void addNewParticipant(T newParticipant) {
        participants.add(newParticipant);
        System.out.println("New participant added: " + newParticipant.getName() + " to team: " + name);
    }

    public void playWith(Team<T> team) {
        String winnerName;
        Random rand = new Random();
        int i = rand.nextInt(2);
        if(i == 0){
            winnerName = this.name;
        } else {
            winnerName = team.name;
        }

        System.out.println("Winner: " + winnerName);
    }
}
