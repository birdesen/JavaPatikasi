
import java.util.Scanner;

public class PatikaStore {
    private Scanner input = new Scanner(System.in);

    public void run(){
        boolean loc = true;

        while(loc){
            System.out.println("Patika Store Yönetim Paneli" +
                    "\n1 - Notebook İşlemleri" +
                    "\n2 - Cep Telefonu işlemleri" +
                    "\n3 - Marka Listele" +
                    "\n0 - Çıkış");
            System.out.print("Seçiminiz: ");
            int select = input.nextInt();
            switch (select){
                case 1:
                    Notebook notebook = new Notebook();
                    notebook.run();
                    break;
                case 2:
                    MobilePhone mobilePhone = new MobilePhone();
                    mobilePhone.run();
                    break;
                case 3:
                    Brand brand = new Brand();
                    brand.printBrandList();
                    break;
                case 0:
                    System.out.println("Görüşmek üzere");
                    loc = false;
                    break;
                default:
                    System.out.println("Geçersiz giriş yaptınız lütfen tekrar deneyiniz");
                    break;
            }
        }

    }
}
