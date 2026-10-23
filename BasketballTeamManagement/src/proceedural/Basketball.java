package proceedural;

import java.util.ArrayList;

public class Basketball {
	// Define data structures
    private static ArrayList<Player> players = new ArrayList<>();
    private static ArrayList<Coach> coaches = new ArrayList<>();
    private static ArrayList<Team> teams = new ArrayList<>();
    private static ArrayList<Game> games = new ArrayList<>();
    
    public static void main(String[] args) {
        int a = 101;
        ArrayList<Long> times = new ArrayList<>();
        
        for (int i = 0; i < a; i++) {
            long start = System.nanoTime();

            // Add players
            addPlayer("Michael Jordan", 35, "Shooting Guard", 198, 98, 23, 82, 2392, 546, 1183, 109, 201);
            addPlayer("Scottie Pippen", 33, "Small Forward", 203, 92, 33, 76, 1298, 421, 687, 83, 172);
            addPlayer("Dennis Rodman", 37, "Power Forward", 201, 100, 91, 60, 328, 923, 194, 165, 98);
            addPlayer("Kobe Bryant", 32, "Shooting Guard", 198, 96, 24, 63, 1546, 374, 487, 86, 152);
            addPlayer("Shaquille O'Neal", 29, "Center", 216, 147, 34, 47, 846, 564, 129, 177, 59);
            addPlayer("Allen Iverson", 26, "Point Guard", 183, 77, 3, 72, 1584, 215, 432, 58, 144);
            addPlayer("Kevin Garnett", 25, "Power Forward", 211, 109, 21, 69, 1132, 621, 207, 140, 87);
            addPlayer("Vince Carter", 24, "Shooting Guard", 200, 92, 15, 51, 1025, 325, 153, 65, 133);

            // Add coaches
            addCoach("Phil Jackson", 55, 20);
            addCoach("Chuck Daly", 60, 15);

            // Create teams and add players and coaches
            Team team1 = createTeam("Chicago Bulls", 50, 32);
            Team team2 = createTeam("Detroit Pistons", 42, 40);

            addPlayerToTeam(team1, players.get(0));
            addPlayerToTeam(team1, players.get(1));
            addPlayerToTeam(team1, players.get(2));
            addPlayerToTeam(team1, players.get(3));
            addCoachToTeam(team1, coaches.get(0));

            addPlayerToTeam(team2, players.get(4));
            addPlayerToTeam(team2, players.get(5));
            addPlayerToTeam(team2, players.get(6));
            addPlayerToTeam(team2, players.get(7));
            addCoachToTeam(team2, coaches.get(1));

            // Print team rosters
            printRoster(team1);
            System.out.println();
            printRoster(team2);

            // Create season
            Season season1 = createSeason(2024);
            addTeamToSeason(season1, team1);
            addTeamToSeason(season1, team2);

            // Create and play a game
            Game game1 = createGame(team1, team2, "1/1/2024");
            playerScoresPoints(players.get(0), 3, game1);
            playerBlocks(players.get(0), 1, game1);
            playerAssists(players.get(2), 3);
            playerScoresPoints(players.get(7), 8, game1);
            playerRebounds(players.get(2), 2, game1);
            playerRebounds(players.get(6), 4, game1);
            printScore(game1);
            playerRebounds(players.get(7), 3, game1);
            playerScoresPoints(players.get(5), 2, game1);
            playerBlocks(players.get(1), 3, game1);
            playerAssists(players.get(0), 2);
            playerRebounds(players.get(5), 2, game1);
            playerScoresPoints(players.get(7), 2, game1);
            printScore(game1);
            playerRebounds(players.get(1), 2, game1);
            playerScoresPoints(players.get(0), 7, game1);
            playerScoresPoints(players.get(3), 9, game1);
            playerAssists(players.get(6), 6);
            playerScoresPoints(players.get(7), 4, game1);
            endMatch(game1);
            printResult(game1);

            // Print player game stats
            players.get(7).printGameStats();
            players.get(0).printGameStats();

            System.out.println();
            printTeamRecord(team1);
            System.out.println();
            printTeamRecord(team2);

            System.out.println();
            players.get(1).printAverage();
            players.get(6).printTotal();
            players.get(4).printAverage();
            players.get(0).printTotal();

            long end = System.nanoTime();
            long time = end - start;
            times.add(time);
        }

        int count = 0;
        long sum = 0;
        for (Long t : times) {
            if(count>0) {
            	System.out.println(count + ". " + t);
                sum += t;
            }
            count++;
        }
        long average = sum /(a-1);
        System.out.println("Average: " + average + " nanoseconds");
    }

    // Function to add a player
    private static void addPlayer(String name, int age, String position, double height, double weight, int jerseyNumber, int matches, int tps, int tr, int ta, int tb, int ts) {
        Player player = new Player(name, age, position, height, weight, jerseyNumber, matches, tps, tr, ta, tb, ts);
        players.add(player);
    }

    // Function to add a coach
    private static void addCoach(String name, int age, int yearsOfExperience) {
        Coach coach = new Coach(name, age, yearsOfExperience);
        coaches.add(coach);
    }

    // Function to create a team
    private static Team createTeam(String name, int wins, int loses) {
        Team team = new Team(name, wins, loses);
        teams.add(team);
        return team;
    }

    // Function to add a player to a team
    private static void addPlayerToTeam(Team team, Player player) {
        team.players.add(player);
        player.team = team;
    }

    // Function to add a coach to a team
    private static void addCoachToTeam(Team team, Coach coach) {
        team.coaches.add(coach);
    }

    // Function to print a team's roster
    private static void printRoster(Team team) {
        System.out.println(team.name + "'s Roster: ");
        for (Player p : team.players) {
            System.out.println(p.name + " (Power: " + p.power + ")");
        }
    }

    // Function to create a season
    private static Season createSeason(int year) {
        return new Season(year);
    }

    // Function to add a team to a season
    private static void addTeamToSeason(Season season, Team team) {
        season.teams.add(team);
    }

    // Function to create a game
    private static Game createGame(Team awayTeam, Team homeTeam, String date) {
    	Game game = new Game(awayTeam, homeTeam, date);
        games.add(game);
        return game;
    }

    // Function for a player to score points
    private static void playerScoresPoints(Player player, int points, Game game) {
        player.pointsScored += points;
        player.tps += points;
        if (player.team == game.awayTeam) {
            game.atScore += points;
        } else {
            game.htScore += points;
        }
    }

    // Function for a player to get rebounds
    private static void playerRebounds(Player player, int rebounds, Game game) {
        player.rebounds += rebounds;
        player.tr += rebounds;
        if (player.team == game.awayTeam) {
            game.atRebound += rebounds;
        } else {
            game.htRebound += rebounds;
        }
    }

    // Function for a player to get assists
    private static void playerAssists(Player player, int assists) {
        player.assists += assists;
        player.ta += assists;
    }

    // Function for a player to get blocks
    private static void playerBlocks(Player player, int blocks, Game game) {
        player.blocks += blocks;
        player.tb += blocks;
        if (player.team == game.awayTeam) {
            game.atBlocks += blocks;
        } else {
            game.htBlocks += blocks;
        }
    }

    // Function to print the score of a game
    private static void printScore(Game game) {
        System.out.println(game.homeTeam.name + " " + game.htScore + " : " + game.atScore + " " + game.awayTeam.name);
    }

    // Function to end a match
    private static void endMatch(Game game) {
        game.done = true;
        if (game.atScore > game.htScore) {
            game.winner = game.awayTeam;
            game.awayTeam.wins++;
            game.loser = game.homeTeam;
            game.homeTeam.loses++;
        } else if (game.atScore < game.htScore) {
            game.winner = game.homeTeam;
            game.homeTeam.wins++;
            game.loser = game.awayTeam;
            game.awayTeam.loses++;
        } else {
            game.draw = true;
        }
        System.out.println("Match has Ended! Good Game!");
    }

    // Function to print the result of a game
    private static void printResult(Game game) {
        if (game.done) {
            System.out.println("Match Ended!");
            if (game.draw) {
                System.out.println("It's a Draw!");
            } else {
                System.out.println(game.winner.name + " Wins!");
            }
            System.out.println("         ----Scores----");
            printScore(game);
            System.out.println("         ----Rebounds----");
            System.out.println(game.homeTeam.name + " " + game.htRebound + " : " + game.atRebound + " " + game.awayTeam.name);
            System.out.println("         ----Blocks----");
            System.out.println(game.homeTeam.name + " " + game.htBlocks + " : " + game.atBlocks + " " + game.awayTeam.name);
        }
    }

    // Function to print a team's record
    private static void printTeamRecord(Team team) {
        System.out.println(team.name + "'s Record");
        System.out.println("Wins: " + team.wins);
        System.out.println("Loses: " + team.loses);
        double winrate = ((double) team.wins / (team.wins + team.loses)) * 100;
        System.out.println("Winrate: " + String.format("%.2f", winrate) + "%");
    }
 }

 // Supporting classes
 class Coach {
    public String name;
    public int age;
    public int yearsOfExperience;

    public Coach(String name, int age, int yearsOfExperience) {
        this.name = name;
        this.age = age;
        this.yearsOfExperience = yearsOfExperience;
    }
 }

 class Player {
    public String name;
    public int age;
    public Team team;
    public String position;
    public double height;
    public double weight;
    public int jerseyNumber;
    public int pointsScored, tps;
    public int rebounds, tr;
    public int assists, ta;
    public int blocks, tb;
    public int steals, ts;
    public int numberOfMatch;
    public double power;

    public Player(String name, int age, String position, double height, double weight, int jerseyNumber, int matches, int tps, int tr, int ta, int tb, int ts) {
        this.name = name;
        this.age = age;
        this.position = position;
        this.height = height;
        this.weight = weight;
        this.jerseyNumber = jerseyNumber;
        this.tps = tps;
        this.tr = tr;
        this.ta = ta;
        this.tb = tb;
        this.ts = ts;
        this.numberOfMatch = matches;
        calcPower();
    }

    private void calcPower() {
        double sum = ((double) tps * 3) + ((double) ta * 2) + ((double) tr * 2) + ((double) tb);
        power = sum / numberOfMatch;
    }
    
    public void printGameStats() {
        System.out.println("Player name: " + name + "\nPoints: " + pointsScored + " Assists: " + assists + " Rebounds: " + rebounds + " Blocks: " + blocks);
    }

    public void printAverage() {
        System.out.println(name + "'s Average Stats");
        double aps = (double) tps / numberOfMatch;
        double ar = (double) tr / numberOfMatch;
        double aa = (double) ta / numberOfMatch;
        double ab = (double) tb / numberOfMatch;
        double as = (double) ts / numberOfMatch;
        System.out.println("Player name: " + name + "\nAVGPoints: " + aps + " AVGAssist: " + aa + " AVGRebounds: " + ar + " AVGBlocks: " + ab + " AVGSteal: " + as);
    }

    public void printTotal() {
        System.out.println(name + "'s Total Stats: ");
        System.out.println("Player name: " + name + "\nPoints: " + tps + " Assists: " + ta + " Rebounds: " + tr + " Blocks: " + tb);
    }
 }

 class Team {
    public String name;
    public ArrayList<Player> players;
    public ArrayList<Coach> coaches;
    public ArrayList<Game> games;
    public int wins;
    public int loses;

    public Team(String name, int wins, int loses) {
        this.name = name;
        this.wins = wins;
        this.loses = loses;
        players = new ArrayList<>();
        coaches = new ArrayList<>();
        games = new ArrayList<>();
    }
 }

 class Season {
    public int year;
    public ArrayList<Team> teams;

    public Season(int year) {
        this.year = year;
        teams = new ArrayList<>();
    }
 }

 class Game {
    public Team awayTeam;
    public Team homeTeam;
    public String date;
    public int atScore;
    public int htScore;
    public int atRebound;
    public int htRebound;
    public int atBlocks;
    public int htBlocks;
    public boolean done;
    public Team winner;
    public Team loser;
    public boolean draw;

    public Game(Team awayTeam, Team homeTeam, String date) {
        this.awayTeam = awayTeam;
        this.homeTeam = homeTeam;
        this.date = date;
    }
}

