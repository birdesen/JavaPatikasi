import java.util.Random;

public abstract class BattleLoc extends Location {
    private int battLocID;
    private Obstacle obstacle;
    private int maxObsNumber;
    private String award;

    public BattleLoc(Player player, int battLocId, String name, Obstacle obstacle, int maxObsNumber, String award) {
        super(player, name);
        this.battLocID = battLocId;
        this.obstacle = obstacle;
        this.maxObsNumber = maxObsNumber;
        this.award = award;
    }

    @Override
    public boolean onLocation() {
        if (this.getBattLocID() == 4 || !this.getPlayer().getInventory().getAwardList()[this.getBattLocID()].equals(this.getAward())) {
            int obsNumber = this.randomObsNumber();
            System.out.println("❗ ❗ ❗ ❗ ❗ ❗ ❗ ❗ ❗ ❗ " + this.getName() + " ❗ ❗ ❗ ❗ ❗ ❗ ❗ ❗ ❗ ❗");
            System.out.println("Dikkatli ol çünkü burada " + obsNumber + " tane " + this.getObstacle().getName() + " var");
            System.out.print("<S>avaş ya da <K>aç ? :");
            String selectCase = input.nextLine().toUpperCase();
            if (selectCase.equals("S") && combat(obsNumber) && this.getPlayer().getHealth() > 0) {
                System.out.println("⭐ " + this.getName() + " tüm düşmanları yendiniz ⭐");
                if (this.getBattLocID() != 4) {
                    System.out.println(this.award + " kazandınız");
                    this.getPlayer().getInventory().getAwardList()[battLocID] = this.award;
                }
                return true;
            }
            if (this.getPlayer().getHealth() <= 0) {
                System.out.println("Öldünüz");
                return false;
            }
        } else {
            System.out.println("Daha önce burayı ziyaret edip ödülü kazandığınız için tekrar savaşamazsınız");
            return true;
        }
        return true;
    }

    public boolean combat(int obsNumber) {
        for (int i = 1; i <= obsNumber; i++) {
            if (this.battLocID == 4) {
                Random r = new Random();
                int ranDam = r.nextInt(4) + 3;
                this.getObstacle().setDamage(ranDam);
            }
            this.getObstacle().setHealth(this.getObstacle().getOriginalHealth());
            playerStats();
            obsStats(i);
            while (this.getPlayer().getHealth() > 0 && this.getObstacle().getHealth() > 0) {
                if (isStart()) {
                    System.out.print("<Vur> ya da <K>aç ? : ");
                    String selectCombat = input.nextLine().toUpperCase(); // böyle kullanılması aslında daha uygun.
                    if (selectCombat.equals("V")) {
                        System.out.println("- - - ❗ Önce siz vurdunuz - - -");
                        this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getDamage());
                        afterHit();
                        if (this.getObstacle().getHealth() > 0) {
                            System.out.println(this.getObstacle().getName() + " size vurdu");
                            int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                            if (obsDamage < 0) {
                                obsDamage = 0;
                            }
                            this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
                            afterHit();
                        }
                    } else {
                        return false;
                    }
                } else {

                    System.out.println("- - - ❗ Önce " + this.getObstacle().getName() + " size vurdu - - -");
                    int obsDamage = this.getObstacle().getDamage() - this.getPlayer().getInventory().getArmor().getBlock();
                    if (obsDamage < 0) {
                        obsDamage = 0;
                    }
                    this.getPlayer().setHealth(this.getPlayer().getHealth() - obsDamage);
                    afterHit();
                    if (this.getPlayer().getHealth() > 0) {
                        System.out.print("<Vur> ya da <K>aç ? : ");
                        String selectCombat = input.nextLine().toUpperCase(); // böyle kullanılması aslında daha uygun.
                        if (selectCombat.equals("V")) {
                            System.out.println("Siz vurdunuz");
                            this.getObstacle().setHealth(this.getObstacle().getHealth() - this.getPlayer().getDamage());
                            afterHit();
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            if (this.getObstacle().getHealth() < this.getPlayer().getHealth()) {
                if (this.getObstacle().getId() == 4) {
                    System.out.print("✅ Düşmanı yendiniz ve ");
                    snakeAward();
                } else {
                    System.out.println("✅ Düşmanı yendiniz ve " + this.getObstacle().getLoot() + " para kazandınız.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() + this.getObstacle().getLoot());
                }


            }
        }
        return true;
    }

    public boolean isStart() {
        double randomNumber = Math.random() * 100;
        return randomNumber < 50;
    }

    public void afterHit() {
        System.out.println("Sağlığınız: " + this.getPlayer().getHealth() + "\t\t\t" +
                this.getObstacle().getName() + " canı: " + this.getObstacle().getHealth());
    }

    public void playerStats() {
        System.out.println("Oyuncu değerleri: ");
        System.out.println("Sağlık: " + this.getPlayer().getHealth()
                + "\tZırh: " + this.getPlayer().getInventory().getArmor().getName() + "\tBloklaması: " + this.getPlayer().getInventory().getArmor().getBlock()
                + "\tToplam Hasar: " + this.getPlayer().getTotalDamage()
                + "\tSilah: " + this.getPlayer().getInventory().getWeapon().getName() + "\tHasarı: " + this.getPlayer().getInventory().getWeapon().getDamage()
                + "\tPara: " + this.getPlayer().getMoney());
        System.out.println();
    }

    public void obsStats(int i) {
        System.out.println(i + ". " + this.getObstacle().getName() + " değerleri: ");
        System.out.print("Can: " + this.getObstacle().getHealth()
                + "\tHasar: " + this.getObstacle().getDamage());
        if (getBattLocID() == 4) {
            System.out.println("\tÖdül: sürpriz");
        } else {
            System.out.println("\tÖdül: " + this.getObstacle().getLoot());
        }
    }

    public int getBattLocID() {
        return battLocID;
    }

    public void setBattLocID(int battLocID) {
        this.battLocID = battLocID;
    }

    public int randomObsNumber() {
        Random r = new Random();
        return r.nextInt(this.getMaxObsNumber()) + 1; // 0'dan parantez içindeki değerin bir eksiğine kadar rakam üretir. o yüzden bir ekledik.
    }

    public void snakeAward() {
        int chance1 = (int) (Math.random() * 100);
        int chance2 = (int) (Math.random() * 100);

        if (chance1 < 15) {
            if (chance2 < 50) {
                Weapon weapon = Weapon.getWeaponObjById(1);
                this.getPlayer().getInventory().setWeapon(weapon);
                System.out.println("Kılıç kazandınız");
            } else if (chance2 >= 50 && chance2 < 80) {
                Weapon weapon = Weapon.getWeaponObjById(2);
                this.getPlayer().getInventory().setWeapon(weapon);
                System.out.println("Tabanca kazandınız");
            } else {
                Weapon weapon = Weapon.getWeaponObjById(2);
                this.getPlayer().getInventory().setWeapon(weapon);
                System.out.println("Tüfek kazandınız");
            }
        } else if (chance1 > 15 && chance1 < 30) {
            if (chance2 < 50) {
                Armor armor = Armor.getArmorObjById(1);
                this.getPlayer().getInventory().setArmor(armor);
                System.out.println("Hafif zırh kazandınız");
            } else if (chance2 >= 50 && chance2 < 80) {
                Armor armor = Armor.getArmorObjById(2);
                this.getPlayer().getInventory().setArmor(armor);
                System.out.println("Orta zırh kazandınız");
            } else {
                Armor armor = Armor.getArmorObjById(3);
                this.getPlayer().getInventory().setArmor(armor);
                System.out.println("Ağır zırh kazandınız");
            }
        } else if (chance1 >= 30 && chance1 < 55) {
            if (chance2 < 50) {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 1);
                System.out.println("1 galyon kazandınız");
            } else if (chance2 >= 50 && chance2 < 80) {
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 5);
                System.out.println("5 galyon kazandınız");
            } else {
                Weapon weapon = Weapon.getWeaponObjById(2);
                this.getPlayer().setMoney(this.getPlayer().getMoney() + 10);
                System.out.println("10 galyon kazandınız");
            }
        } else {
            System.out.println("Üzgünüz bir şey kazanamadınız.");
        }
    }


    public Obstacle getObstacle() {
        return obstacle;
    }

    public void setObstacle(Obstacle obstacle) {
        this.obstacle = obstacle;
    }

    public int getMaxObsNumber() {
        return maxObsNumber;
    }

    public void setMaxObsNumber(int maxObsNumber) {
        this.maxObsNumber = maxObsNumber;
    }

    public String getAward() {
        return award;
    }

    public void setAward(String award) {
        this.award = award;
    }
}
