import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = input.nextInt();
        if(isPrime(num)){System.out.println("true");}
        else{System.out.println("false");}
        input.close();
    }
    private static boolean isPrime(int number){
        if (number < 2) {return false;}
        if (number == 2) {return true;}
        for(int i = 3; i < (Math.log((double)number) / Math.log(2)); i+=2){
            if (number % i == 0){return false;}
        }
        return true;
    }
}
