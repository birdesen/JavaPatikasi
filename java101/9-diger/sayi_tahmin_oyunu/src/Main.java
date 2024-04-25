import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int random = (int) (Math.random() * 100);
        int count = 0;
        while (count < 5) {
            System.out.print("Bir sayı giriniz: ");
            int guess = input.nextInt();
            if(guess > 100 || guess < 0){
                System.out.println("Girmiş olduğunuz sayı aralıkta değildir. Lütfen tekrar deneyiniz. ");
                continue;
            }else{
                if(guess == random){
                    System.out.println("Tebrikler bildiniz!");
                }else if(guess > random){
                    System.out.println("Girmiş olduğunuz sayı daha büyüktür.");
                }else{
                    System.out.println("Girmiş olduğunuz sayı daha küçüktür.");
                }
                count ++;

            }
            if(count == 5){
                System.out.println("Üzgünüz oyunu kaybettiniz");
                System.out.println("Sayı: " + random);
            }
        }
    }
}
