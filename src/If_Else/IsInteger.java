package If_Else;

import java.util.Scanner;

public class IsInteger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number: ");
        double n = sc.nextDouble(); // n =  3.1415
        if(n == (int)n) System.out.println("Is an Integer");
        else System.out.println("Is Not an Integer");
    }
}
