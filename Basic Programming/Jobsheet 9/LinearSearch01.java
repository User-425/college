import java.util.Scanner;

public class LinearSearch01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in); 

        int hasil = 0;
        int jumlahElemen;
        
        System.out.println("Masukkan jumlah elemen array: ");
        jumlahElemen = input.nextInt();
        int[] arrayInt = new int[jumlahElemen];

        for (int i = 0; i < arrayInt.length; i++) {
            System.out.println("Masukkan elemen array ke-"+(i)+" : ");
            arrayInt[i]=input.nextInt();
        }

        int key;
        System.out.println("Masukkan key yang ingin dicari: ");
        key = input.nextInt();

        for (int i = 0; i < arrayInt.length; i++) {
            if (arrayInt[i]==key) {
                hasil = i;
                System.out.println("Key ada dalam array pada posisi indeks ke-" + hasil);
                break;
            }
            if (i==arrayInt.length-1) {
                System.out.println("Key tidak ditemukan");
                break;
            }
        }
        
    }
}
