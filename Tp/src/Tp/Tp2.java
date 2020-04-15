package Tp;
import java.util.Scanner;
public class Tp2 {
	public static void main(String[] args) {
        double a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter your A ");
        a = sc.nextInt();
        System.out.println("enter your B");
        b = sc.nextInt();
        System.out.println("enter your C");
        c = sc.nextInt();
        Polynome Po=new Polynome(a,b,c);
        Po.Resoudre();
        Po.Derive();
	}}


