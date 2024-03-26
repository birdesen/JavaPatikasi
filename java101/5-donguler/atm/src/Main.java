import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int right = 3;
        int balance = 1500;
        int select;
        while (right > 0) {
            System.out.print("Kullanıcı adınızı giriniz: ");
            String userName = input.nextLine();
            System.out.print("Şifrenizi giriniz: ");
            String password = input.nextLine();
            if (userName.equals("Birdesen") && (password.equals("1234"))) {
                System.out.println("Sisteme giriş yaptınız");
                do {
                    System.out.println("- - - - - - - - - - - - - - - -" +
                            "\n1 - Para yatırma" +
                            "\n2 - Para çekme" +
                            "\n3 - Bakiye sorgulama" +
                            "\n4 - Çıkış");
                    System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
                    select = input.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Yatırmak istedğiniz tutarı giriniz: ");
                            int price = input.nextInt();
                            balance += price;
                            System.out.println("Yeni bakiyeniz: " + balance);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı giriniz: ");
                            price = input.nextInt();
                            if (balance > price) {
                                balance -= price;
                                System.out.println("Yeni bakiyeniz: " + balance);
                            } else {
                                System.out.println("Bakiyeniz yetersiz");
                            }
                            break;
                        case 3:
                            System.out.println("Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Görüşmek üzere");
                break;

            } else {
                right--;
                System.out.println("Hatalı kullanıcı adı ya da şifre girdiniz");
                if (right == 0) {
                    System.out.println("Hesabınız bloke olmuştur. Lütfen banka ile iletişime geçiniz");
                } else {
                    System.out.println("Kalan hakkınız: " + right);
                }

            }


        }


    }
}
