package basic;

import java.util.Scanner;

public class Area {
    static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double r = sc.nextDouble();
        double a = 3.14 * r * r;
        System.out.println(a);
    }
}
