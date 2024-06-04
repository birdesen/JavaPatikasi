package exception;

import java.util.Scanner;

public class Main {
    public static void checkAge(int age) throws AgeCheckException{
        if(age<20){
            throw new AgeCheckException("Yaş hatası alındı");
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Yaşınızı giriniz: ");
        int age = input.nextInt();

        try{

            checkAge(age);
        }catch(Exception e){
            System.out.println("Yaşı uymadı");
            System.out.println(e.toString());
        }
        System.out.println("Program bitti");
    }
}
