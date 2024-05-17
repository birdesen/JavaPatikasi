public class Inventory {
    private Weapon weapon;
    private Armor armor;
    private String[] awardList;
    private BattleLoc battleLoc;

    public Inventory() {

        this.weapon = new Weapon(-1, "Yumruk", 0, 0);
        this.armor = new Armor(-1, "Paçavra", 0, 0);
        this.awardList = new String[]{"-", "-","-"};
    }

    public void printAwards(){
        System.out.print("(");
        for (String a : awardList){
            System.out.print(" " + a + " ");
        }
        System.out.print(")");
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public Armor getArmor() {
        return armor;
    }

    public void setArmor(Armor armor) {
        this.armor = armor;
    }

    public String[] getAwardList() {
        return awardList;
    }

    public void setAwardList(String[] awardList) {
        this.awardList = awardList;
    }

    public BattleLoc getBattleLoc() {
        return battleLoc;
    }

    public void setBattleLoc(BattleLoc battleLoc) {
        this.battleLoc = battleLoc;
    }
}