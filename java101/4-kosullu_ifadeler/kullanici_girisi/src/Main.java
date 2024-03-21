import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String userName, password, pass = "12345", user = "Birdesen";

        System.out.print("Kullanıcı adınız: ");
        userName = input.nextLine();
        System.out.print("Şifreniz: ");
        password = input.nextLine();

        if (userName.equals(user) && (password.equals(pass))) {
            System.out.println("Sisteme giriş yaptınız");

        } else if (userName.equals("Birdesen")) {
            System.out.print("Şifreniz yanlış, sıfırlamak ister misiniz. Evet/Hayır: ");
            String tercih = input.nextLine();
            if (tercih.equals("Evet")) {
                System.out.print("Yeni şifrenizi giriniz: ");
                String newPassword = input.nextLine();
                if (newPassword.equals(pass)) {
                    System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz lütfen farklı bir şifre seçiniz: ");
                    newPassword = input.nextLine();
                    pass = newPassword;
                    System.out.println("Şifre oluşuruldu");
                } else {
                    pass = newPassword;
                    System.out.println("Şifre oluşturuldu ");
                }
            } else {
                System.out.println("Şifreniz hatalı olduğu için sisteme girişinizi gerçekleştiremiyoruz");
            }
        } else {
            System.out.println("Bilgileriniz hatalı olduğu için sisteme girişinizi gerçekleştiremiyoruz");
        }
    }
}
