import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class Player {

    private int damage;
    private int health;
    private int money;
    private String name;
    private String charName;
    private int originalHealth;
    private Inventory inventory;
    public Scanner input = new Scanner(System.in);

    Player(String name) {
        this.name = name;
        this.inventory = new Inventory();
    }

    public void selectChar() {
        GameChar[] charList = {new Samurai(), new Archer(), new Knight()};
        System.out.println("- - - - - - - - - - - - - - - KARAKTERLERLER - - - - - - - - - - - - - - -");
        for (GameChar gameChar : charList) {
            System.out.println("Id: " + gameChar.getId() + "\tKarakter: " + gameChar.getCharName() + "\t\tHasar: " + gameChar.getDamage() + "\t\tSağlık: " + gameChar.getHealth() + "\t\tPara: " + gameChar.getMoney());
        }
        System.out.println("- - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - - -");
        System.out.print("Lütfen bir karakter seçin: ");
        int selectChar = input.nextInt();
        switch (selectChar) {
            case 1:
                initPlayer(new Samurai());
                break;
            case 2:
                initPlayer(new Archer());
                break;
            case 3:
                initPlayer(new Knight());
                break;
            default:
                initPlayer((new Samurai()));
                break;
        }
    }

    public void initPlayer(GameChar gameChar) {
        this.setCharName(gameChar.getCharName());
        this.setDamage(gameChar.getDamage());
        this.setOriginalHealth(gameChar.getHealth());
        this.setHealth(gameChar.getHealth());
        this.setMoney(gameChar.getMoney());

    }

    public void printPlayerInfo() {
        System.out.println();
        System.out.print("Karakteriniz: " + this.getCharName() +
                "\tSilahınız: " + this.getInventory().getWeapon().getName() +
                "\tHasar: " + this.getTotalDamage() +
                "\tZırhınız: " + this.getInventory().getArmor().getName() +
                "\tBloklama: " + this.getInventory().getArmor().getBlock() +
                "\tSağlık: " + this.getHealth() +
                "\tPara: " + this.getMoney()+
                "\tÖdüller: " );this.getInventory().printAwards();
        System.out.println();
        System.out.println();
    }

    public int getTotalDamage() {
        return damage + getInventory().getWeapon().getDamage();
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        if (health < 0) {
            health = 0;
        }
        this.health = health;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCharName() {
        return charName;
    }

    public void setCharName(String charName) {
        this.charName = charName;
    }

    public Inventory getInventory() {
        return inventory;
    }

    public void setInventory(Inventory inventory) {
        this.inventory = inventory;
    }

    public int getOriginalHealth() {
        return originalHealth;
    }

    public void setOriginalHealth(int originalHealth) {
        this.originalHealth = originalHealth;
    }
}

