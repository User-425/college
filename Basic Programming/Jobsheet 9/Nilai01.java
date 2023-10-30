import java.util.Scanner;

public class Nilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan banyaknya elemen: ");
        int jumlahElemen = input.nextInt();

        int[] array = new int[jumlahElemen];

        for (int i = 0; i < jumlahElemen; i++) {
            System.out.print("Masukkan elemen ke-" + (i + 1) + ": ");
            array[i] = input.nextInt();
        }

        int tertinggi = array[0];
        int terendah = array[0];
        int total = array[0];

        for (int i = 1; i < jumlahElemen; i++) {
            if (array[i] > tertinggi) {
                tertinggi = array[i];
            }
            if (array[i] < terendah) {
                terendah = array[i];
            }
            total += array[i];
        }

        double average = (double) total / jumlahElemen;

        System.out.println("Nilai tertinggi: " + tertinggi);
        System.out.println("Nilai terendah: " + terendah);
        System.out.println("Nilai rata-rata: " + average);

    }
}