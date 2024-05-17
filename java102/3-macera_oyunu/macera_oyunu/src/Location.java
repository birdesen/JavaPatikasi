import java.util.Scanner;

public abstract class Location {
    private Player player;
    private String name;
    private int id;
    public Scanner input = new Scanner(System.in);

    Location(Player player, String name) {
        this.player = player;
        this.name = name;
    }

    abstract boolean onLocation();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }


}
