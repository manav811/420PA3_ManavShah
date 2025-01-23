package Assignment;

public class Team {
    private String teamName;
    private List<Player> players;

    public Team(String teamName) {
        this.teamName = teamName;
        this.players = new ArrayList<>();
    }

    // Adds a player to the team
    public void addPlayer(Player player) {
        players.add(player);
        System.out.println(player.getName() + " has been added to the team: " + teamName);
    }

    // Removes a player from the team by name
    public boolean removePlayer(String playerName) {
        for (Player player : players) {
            if (player.getName().equalsIgnoreCase(playerName)) {
                players.remove(player);
                System.out.println(player.getName() + " has been removed from the team: " + teamName);
                return true; // Player was removed
            }
        }
        System.out.println("Player not found in the team.");
        return false; // Player was not found
    }

    // Displays all players in the team
    public void displayPlayers() {
        if (players.isEmpty()) {
            System.out.println("No players in the team: " + teamName);
        } else {
            System.out.println("Players in " + teamName + ":");
            for (Player player : players) {
                System.out.println(player);
            }
        }
    }
}
