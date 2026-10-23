package oop;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Create players
    	int a = 11;
    	ArrayList<Long>times = new ArrayList<>();
    	for(int i = 0; i<a; i++) {
    		long start = System.nanoTime();
    		Player player1 = new Player("Michael Jordan", 35, "Shooting Guard", 198, 98, 23, 82, 2392, 546, 1183, 109, 201);
        	Player player2 = new Player("Scottie Pippen", 33, "Small Forward", 203, 92, 33, 76, 1298, 421, 687, 83, 172);
        	Player player3 = new Player("Dennis Rodman", 37, "Power Forward", 201, 100, 91, 60, 328, 923, 194, 165, 98);
        	Player player4 = new Player("Kobe Bryant", 32, "Shooting Guard", 198, 96, 24, 63, 1546, 374, 487, 86, 152);
        	Player player5 = new Player("Shaquille O'Neal", 29, "Center", 216, 147, 34, 47, 846, 564, 129, 177, 59);
        	Player player6 = new Player("Allen Iverson", 26, "Point Guard", 183, 77, 3, 72, 1584, 215, 432, 58, 144);
        	Player player7 = new Player("Kevin Garnett", 25, "Power Forward", 211, 109, 21, 69, 1132, 621, 207, 140, 87);
        	Player player8 = new Player("Vince Carter", 24, "Shooting Guard", 200, 92, 15, 51, 1025, 325, 153, 65, 133);

            // Create coaches
            Coach coach1 = new Coach("Phil Jackson", 55, 20);
            Coach coach2 = new Coach("Chuck Daly", 60, 15);

            // Create teams
            Team team1 = new Team("Chicago Bulls", 50, 32);
            Team team2 = new Team("Detroit Pistons", 42, 40);

            // Add players and coaches to teams
            team1.addPlayer(player1);
            team1.addPlayer(player2);
            team1.addPlayer(player3);
            team1.addPlayer(player4);
            team1.addCoach(coach1);
            team2.addPlayer(player5);
            team2.addPlayer(player6);
            team2.addPlayer(player7);
            team2.addPlayer(player8);
            team2.addCoach(coach2);

            // Print team roasters
            team1.printRoaster();
            System.out.println();
            team2.printRoaster();

           Season season1 = new Season(2024);
           season1.addTeam(team1);
           season1.addTeam(team2);
           
           Game game1 = new Game(team1, team2, "1/1/2024");
           player1.scorePoints(3, game1);
           player1.blocks(1, game1);
           player3.assists(3);
           player8.scorePoints(8, game1);
           player3.rebounds(2, game1);
           player7.rebounds(4, game1);
           game1.printScore();
           player8.rebounds(3, game1);
           player6.scorePoints(2, game1);
           player2.blocks(3, game1);
           player1.assists(2);
           player6.rebounds(2, game1);
           player8.scorePoints(2, game1);
           game1.printScore();
           player2.rebounds(2, game1);
           player1.scorePoints(7, game1);
           player4.scorePoints(9, game1);
           player7.assists(6);
           player8.scorePoints(4, game1);
           game1.matchEnded();
           game1.printResult();
           player8.printGameStats();
           player1.printGameStats();
           
           System.out.println();
           team1.printRecord();
           System.out.println();
           team2.printRecord();
           
           System.out.println();
           player2.printAverage();
           player7.printTotal();
           player5.printAverage();
           player1.printTotal();
           
           long end = System.nanoTime();
           long time = end-start;
           times.add(time);
    	}
    	
    	int count = 0;
    	long sum = 0;
    	for(Long t : times) {
    		System.out.println(count + ". " + t);
    		if(count>0) {
        		sum+=t;
    		}
    		count++;
    	}
    	long average = sum/(a-1);
    	System.out.println("Average: " + average + " nanoseconds");
	}

}
