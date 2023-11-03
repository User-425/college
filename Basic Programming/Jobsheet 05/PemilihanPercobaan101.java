/**
 * PemilihanPercobaan101
 */
import java.util.Scanner;

public class PemilihanPercobaan101 {
    public static void main(String[] args) {
        Scanner input01 = new Scanner(System.in);
        System.out.println("Masukkan angka: ");
        int angka = input01.nextInt();
        
        String result = (angka % 2 == 0) ? "bilangan genap" : "bilangan ganjil";
        
        System.out.println("Angka " + angka + " " + result);
    }	
}