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
    public static boolean isPrime(int number){
        if (number < 2) {return false;}
        for(int i = 2; i <= Math.sqrt(number); i++){
            if (number % i == 0){return false;}
        }
        return true;
    }
}
