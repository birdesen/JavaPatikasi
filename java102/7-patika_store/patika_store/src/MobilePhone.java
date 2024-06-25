import java.util.HashMap;
import java.util.Scanner;

public class MobilePhone {

    private int id;
    private String name;
    private Brand brand = new Brand();
    private String brandName;
    private double price;
    private double discountRate;
    private int memory;
    private double screen;
    private int camera;
    private double batteryPower;
    private int ram;
    private String color;
    private Scanner input = new Scanner(System.in);
    private HashMap<Integer, MobilePhone> mobileList = new HashMap<>();

    public MobilePhone(int id, String brandName, String name, double price, double discountRate, int memory, int ram, double screen, int camera, double batteryPower, String color) {
        this.id = id;
        this.name = name;
        this.brandName = brandName;
        this.price = price;
        this.discountRate = discountRate;
        this.memory = memory;
        this.ram = ram;
        this.screen = screen;
        this.camera = camera;
        this.batteryPower = batteryPower;
        this.color = color;
    }

    public MobilePhone() {

    }

    public void run() {
        mobileList.put(1, new MobilePhone(1, brand.getBrandById(4), "Matabook 14", 7000, 10,16,16,10.2,16,4000,"Siyah"));
        mobileList.put(2, new MobilePhone(2, brand.getBrandById(2), "V 14 IGL", 3999, 10,8,16,14,16,4000,"Beyaz"));
        mobileList.put(3, new MobilePhone(3, brand.getBrandById(6), "Tuf Gaming", 8199, 15, 32,16,14,8,4000, "Gri"));



        boolean showMenu = true;
        while (showMenu) {
            System.out.println("Cep Telefonu işlemleri" +
                    "\n1 - Listeleme" +
                    "\n2 - Ürün Ekleme" +
                    "\n3 - Ürün Silme" +
                    "\n4 - Filtreleme" +
                    "\n0 - Çıkış");
            System.out.print("Seçiminiz: ");
            int select = input.nextInt();
            switch (select) {
                case 1:
                    printList();
                    break;
                case 2:
                    addProduct();
                    break;
                case 3:
                    removePruduct();
                    break;
                case 4:
                    filteringByBrand();
                    break;
                case 0:
                    showMenu = false;
                    break;
                default:
                    System.out.print("Geçersiz giriş yaptınız lütfen tekrar deneyiniz: ");
                    select = input.nextInt();
                    break;
            }
        }
    }

    public void printList() {
        System.out.format("%-5s %-10s %-20s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|İndirim|", "|Hafıza|", "|Bellek|", "|Ekran|", "|Kamera|", "|Batarya|", "|Renk|");

        for (MobilePhone mP : mobileList.values()) {
            System.out.format("%-5s %-10s %-20s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                    mP.id, mP.brandName, mP.name, mP.price + " TL", mP.discountRate + " %",
                    mP.memory + " GB", mP.screen, mP.camera, mP.batteryPower, mP.ram + " GB", mP.color);
        }
    }

    public void addProduct() {
        System.out.println("Eklemek istediğiniz ürünün;");

        int productId;
        while (true) {
            System.out.print("Ürün id: ");
            productId = input.nextInt();
            if (mobileList.get(productId) != null) {
                System.out.println("Belirtmiş olduğunuz id doludur. Lütfen yeni bir id seçiniz.");
            } else {
                break;
            }
        }
        System.out.print("Marka id: ");
        int brandId = input.nextInt();
        System.out.print("Ürün adı: ");
        String name = input.next();
        System.out.print("Fiyat: ");
        double price = input.nextDouble();
        System.out.print("İndirim oranı: ");
        double discountRate = input.nextDouble();
        System.out.print("Depolama alanı: ");
        int memory = input.nextInt();
        System.out.print("RAM: ");
        int ram = input.nextInt();
        System.out.print("Çözünürlük: ");
        double screen = input.nextDouble();
        System.out.print("Kamera: ");
        int camera = input.nextInt();
        System.out.print("Batarya Gücü: ");
        double batteryPower = input.nextDouble();
        System.out.print("Renk: ");
        String color = input.next();

        mobileList.put(productId, new MobilePhone(productId, brand.getBrandById(brandId), name, price, discountRate, memory,ram, screen, camera, batteryPower, color));


    }

    public void removePruduct() {
        System.out.print("Silmek istediğiniz ürünün ID'sini giriniz: ");
        int id = input.nextInt();
        mobileList.remove(id);
    }

    public void filteringByBrand() {
        System.out.println("Filtrelemek istediğiniz markanın IDsini giriniz: ");
        int filteringID = input.nextInt();
        System.out.format("%-5s %-10s %-20s %-15s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                "|ID|", "|Marka|", "|Model|", "|Fiyat|", "|İndirim|", "|Hafıza|", "|Bellek|", "|Ekran|", "|Kamera|", "|Batarya|", "|Renk|");

        for (MobilePhone mP : mobileList.values()) {
            if (brand.getBrandById(filteringID) == mP.brandName) {
                System.out.format("%-5s %-10s %-20s %-15s %-10s %-10s %-10s %-10s %-10s %-10s %-10s\n",
                        mP.id, mP.brandName, mP.name, mP.price + " TL", mP.discountRate + " %",
                        mP.memory + " GB", mP.ram + " GB", mP.screen, mP.camera, mP.batteryPower, mP.color);
            }

        }

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getDiscountRate() {
        return discountRate;
    }

    public void setDiscountRate(double discountRate) {
        this.discountRate = discountRate;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public double getScreen() {
        return screen;
    }

    public void setScreen(double screen) {
        this.screen = screen;
    }

    public double getBatteryPower() {
        return batteryPower;
    }

    public void setBatteryPower(double batteryPower) {
        this.batteryPower = batteryPower;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public HashMap<Integer, MobilePhone> getMobileList() {
        return mobileList;
    }

    public void setMobileList(HashMap<Integer, MobilePhone> mobileList) {
        this.mobileList = mobileList;
    }
}
