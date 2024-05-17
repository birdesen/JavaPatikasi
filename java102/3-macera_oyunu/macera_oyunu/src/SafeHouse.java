public class SafeHouse extends NormalLoc {
    SafeHouse(Player player) {
        super(player, "Güvenli Ev");
    }

    private Inventory inventory;

    @Override
    public boolean onLocation() {
        System.out.println("♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ Güvenli Eve Hoşgeldiniz ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥ ♥");

        this.getPlayer().setHealth(this.getPlayer().getOriginalHealth());
        System.out.println("Canınız yenilendi: " + this.getPlayer().getHealth());
        isWin();
        return true;
    }

    public boolean isWin() {
        if (this.getPlayer().getInventory().getAwardList()[0].equals("Yemek") &&
                this.getPlayer().getInventory().getAwardList()[1].equals("Odun") &&
                this.getPlayer().getInventory().getAwardList()[2].equals("Su")) {
            return true;
        }else{
            return false;
        }

    }
}
