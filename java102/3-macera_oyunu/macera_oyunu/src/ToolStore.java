public class ToolStore extends NormalLoc {
    ToolStore(Player player) {
        super(player, "Mağaza");
    }

    @Override
    public boolean onLocation() {
        System.out.println("# # # # # # # # Mağazaya Hoşgeldiniz # # # # # # # #");
        boolean showMenu = true;

        while (showMenu) {
            System.out.println(" - - - - - - - - - - - - - - ");
            System.out.println("① - Silahlar" +
                    "\n② - Zırhlar" +
                    "\n⓪ - Çıkış");
            System.out.println(" - - - - - - - - - - - - - - ");
            System.out.print("Seçiminiz: ");
            int select = input.nextInt();

            while (select < 0 || select > 2) {
                System.out.print("Geçersiz giriş yaptınız lütfen takrar deneyiniz: ");
                select = input.nextInt();
            }
            switch (select) {
                case 1:
                    printWeapon();
                    buyWeapon();
                    break;
                case 2:
                    printArmor();
                    buyArmor();
                    break;
                case 0:
                    System.out.println("Tekrar bekleriz");
                    showMenu = false;
                    break;
            }
        }
        return true;
    }

    public void printWeapon() {
        System.out.println("* * * * * * * Silahlar * * * * * * *");
        for (Weapon w : Weapon.weapons()) {
            System.out.println("ID: " + w.getId() + "\tAdı: " + w.getName() + "\tHasarı: " + w.getDamage() + "\tÜcreti: " + w.getPrice());
        }
        System.out.println("0 - Çıkış");
    }

    public void buyWeapon() {
        System.out.print("Bir silah seçiniz: ");
        int selectWeaponID = input.nextInt();
        while (selectWeaponID < 0 || selectWeaponID > Weapon.weapons().length) {
            System.out.print("Lütfen geçerli bir değer giriniz: ");
            selectWeaponID = input.nextInt();
        }
        if (selectWeaponID != 0) {
            Weapon selectedWeapon = Weapon.getWeaponObjById(selectWeaponID);

            if (selectedWeapon != null) {
                if (selectedWeapon.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedWeapon.getName() + " satın alınmıştır.");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedWeapon.getPrice());
                    System.out.println("Kalan paranız: " + this.getPlayer().getMoney());

                    this.getPlayer().getInventory().setWeapon(selectedWeapon);
                }
            }

        }


    }

    public void printArmor() {
        System.out.println("* * * * * * * Zırhlar * * * * * * *");
        for (Armor a : Armor.armors()) {
            System.out.println("ID: " + a.getId() + "\tAdı: " + a.getName() + "\tBloklaması: " + a.getBlock() + "\tÜcreti: " + a.getPrice());
        }
        System.out.println("0 - Çıkış");
    }

    public void buyArmor() {
        System.out.print("Bir zırh seçiniz: ");
        int selectArmorId = input.nextInt();
        while (selectArmorId < 0 || selectArmorId > Armor.armors().length) {
            System.out.print("Geçersiz giriş yaptınız lütfen tekrar deneyiniz: ");
            selectArmorId = input.nextInt();
        }
        if (selectArmorId != 0) {
            Armor selectedArmor = Armor.getArmorObjById(selectArmorId);
            if (selectedArmor != null) {
                if (selectedArmor.getPrice() > this.getPlayer().getMoney()) {
                    System.out.println("Yeterli paranız bulunmamaktadır.");
                } else {
                    System.out.println(selectedArmor.getName() + " zırh satın alınmıştır");
                    this.getPlayer().setMoney(this.getPlayer().getMoney() - selectedArmor.getPrice());
                    System.out.println("KAlan paranız: " + this.getPlayer().getMoney());
                    this.getPlayer().getInventory().setArmor(selectedArmor);
                    System.out.println("Şuan ki zırhınız: " + this.getPlayer().getInventory().getArmor().getName());
                }
            }

        }

    }
}
