import java.util.Scanner;

public class Main {

    static boolean isPalindromic(String word){
        int i = 0;
        int j = word.length()-1;
        while(i<j){
            if (word.charAt(i)!= word.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir kelime giriniz: ");
        String word = input.nextLine();
        if(isPalindromic(word)){
            System.out.println("Palindromiktir");
        }else{
            System.out.println("Palindromik değildir.");
        }
    }
}
