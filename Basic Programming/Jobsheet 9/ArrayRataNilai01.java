import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] nilaiMhs = new int[10];
        double total = 0;
        double rata2;

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]=input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
         total += nilaiMhs[i];   
        }

        
    }
}
