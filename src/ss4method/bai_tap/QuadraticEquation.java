package ss4method.bai_tap;

import java.util.Scanner;

public class QuadraticEquation {
    double a;
    double b;
    double c;
public QuadraticEquation(){

}
//    public QuadraticEquation(double a, double b, double c) {
//        this.a = a;
//        this.b = b;
//        this.c = c;
//    }

    public double getA() {
        return this.a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getb() {
        return this.b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return this.c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public double getDiscriminant() {
        return (this.b * this.b) - (4 * this.a * this.c);
    }

    public double getRoot1() {
        return (-this.b + Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public double getRoot2() {
        return (-this.b - Math.pow(this.getDiscriminant(), 0.5)) / 2 * this.a;
    }

    public static void main(String[] args) {
        QuadraticEquation qe = new  QuadraticEquation();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a: ");
        double a = sc.nextDouble();
        System.out.print("Enter b: ");
        double b = sc.nextDouble();
        System.out.print("Enter c: ");
        double c = sc.nextDouble();

        qe.setA(a);
        qe.setB(b);
        qe.setC(c);

        if (qe.getDiscriminant() > 0) {
            System.out.println("phương trình có hai nghiệm \n Root 1: " + qe.getRoot1() + "\t" + "Root 2: " + qe.getRoot2());
        } else if (qe.getDiscriminant() == 0) {
            System.out.println("phuong trình có 1 nghiệm: \n Root2 : " + qe.getRoot1());
        } else {
            System.out.println("phương trình o có nghiêm");
        }
    }
            
    
}

