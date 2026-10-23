package game;

public class Team {
    private int skillPoints;
    private static Heroes[] team;

    public Team(Heroes... heroes) {
        this.team = heroes;
        this.skillPoints = 3;
    }

    public int getSP() {
        return skillPoints;
    }

    public void increaseSP() {
        skillPoints++;
    }

    public void decreaseSP() {
        skillPoints--;
    }

    public static Heroes[] getTeam() {
        return team;
    }
}
