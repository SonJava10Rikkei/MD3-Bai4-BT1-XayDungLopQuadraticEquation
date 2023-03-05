package rikkei.academy;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Giải phương trình bậc 2 'a.x2 + b.x + c = 0' ");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập a: ");
        double a = scanner.nextDouble();
        System.out.println("Nhập b: ");
        double b = scanner.nextDouble();
        System.out.println("Nhập c: ");
        double c = scanner.nextDouble();
        scanner.close();
        QuadraticEquation equation = new QuadraticEquation(a, b, c);

        double discriminant = equation.getDiscriminant();
        if (discriminant > 0) {
            System.out.println("Phương trình có 2 nghiệm là: " + equation.getRoot1() + " và " + equation.getRoot2());
        } else if (discriminant == 0) {
            System.out.println("Phương trình có nghiệm kép là: " + equation.getRoot1());
        } else {
            System.out.println("Phương trình này vô nghiệm");
        }
    }
}
