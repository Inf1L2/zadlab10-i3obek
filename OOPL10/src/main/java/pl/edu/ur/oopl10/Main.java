package pl.edu.ur.oopl10;

import java.io.*;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        zero();
        zapis();
        odczyt();
    }

    public static void zero() {
        int i=0;
        do{
            try {
                Random rand = new Random();
                int a = rand.nextInt(10) * (-1);
                int b = rand.nextInt(10);
                System.out.println("Liczba1\t"+a+"\tLiczba2\t"+b);
                int z=(a/b);
            }
            catch(ArithmeticException e) {
                System.out.println("Kto mi zabroni dzielić przez 0???");
                i+=1;
            }
            if (i==3){
                System.out.println("3-ci \"błąd\" => break\n");
                break;
            }
        }while(i<=3);
    }

    public static void zapis() {
        String filePath = "..\\plik.txt";
        String tekst = "Ala ma kot4";
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(filePath);
            fileWriter.write(tekst);
            fileWriter.close();
            System.out.println("Tekst \""+tekst+"\" został zapisany");
        }
        catch(IOException e){
            System.out.println("Error "+e+"\n");
        }
    }
    public static void odczyt() {
        String filePath = "..\\plik.txt";
        BufferedReader fileReader = null;

        try {
            fileReader = new BufferedReader(new FileReader(filePath));
            String readText = fileReader.readLine();
            System.out.println("Odczyt z plikt:\t"+readText);
            fileReader.close();
        } catch(FileNotFoundException e){
            System.out.println("Error "+e+"\n");
        } catch(IOException e){
            System.out.println("Error "+e+"\n");
        }
    }
}