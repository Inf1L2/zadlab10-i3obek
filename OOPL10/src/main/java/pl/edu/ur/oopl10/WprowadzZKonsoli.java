package pl.edu.ur.oopl10;

import java.util.*;

public class WprowadzZKonsoli {

    public static void main(String[] args) {
        znak();
        liczba0();
        liczba1();
        liczba2();
        liczba3();
        liczba4();
        przyklad();
    }

    private static void liczba0() {
        Scanner scan = new Scanner(System.in);
        int i = 0;
        System.out.println("Podaj liczbę całkowitą(INT)");
        try {
            i = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Idiota...");
        }
    }
    private static void znak() {
        Scanner scan = new Scanner(System.in);
        char a = ' ';
        System.out.println("Podaj znak");
        try {
            a = scan.next(".").charAt(0);
        } catch (InputMismatchException e) {
            System.out.println("Idiota...");
        }
    }
    private static void liczba1() {
        Scanner scan = new Scanner(System.in);
        long l = 0;
        System.out.println("Podaj liczbę LONG");
        try {
            l = scan.nextLong();
        } catch (InputMismatchException e) {
            System.out.println("Idiota...");
        }
    }
    private static void liczba2() {
        Scanner scan = new Scanner(System.in);
        short s = 0;
        System.out.println("Podaj liczbę SHORT");
        try {
            s = scan.nextShort();
        } catch (InputMismatchException e) {
            System.out.println("Idiota...");
        }
    }
    private static void liczba3() {
        Scanner scan = new Scanner(System.in);
        float f = 0;
        System.out.println("Podaj liczbę FLOAT");
        try {
            f = scan.nextFloat();
        } catch (InputMismatchException e) {
            System.out.println("Idiota...");
        }
    }
    private static void liczba4(){
        Scanner scan = new Scanner(System.in);
        double d = 0;
        System.out.println("Podaj liczbę DOUBLE");
        try {
            d = scan.nextInt();
        } catch (InputMismatchException e) {
            System.out.println("Idiota...");
        }
    }
    private static void przyklad() {
        System.out.println("\nPrzykład obsługi ArrayIndexOutOfBoundsException przy użyciu tablicy rozmiaru 2");
        int i=0;
        try {
        int[] Array = new int[2];
        Random rand = new Random();
        for (i = 0; i <= Array.length; i++) {
        Array[i] = rand.nextInt(100);
        }
        }catch(ArrayIndexOutOfBoundsException e) {
            System.out.println("Error "+e);
        }
    }
}