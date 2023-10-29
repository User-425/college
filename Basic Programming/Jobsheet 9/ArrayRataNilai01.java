import java.util.Scanner;

public class ArrayRataNilai01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int jumlahLulus = 0, jumlahMhs;
        double total = 0;
        double rata2;

        System.out.println("Masukkan jumlah mahasiswa");
        jumlahMhs = input.nextInt();
        int[] nilaiMhs = new int[jumlahMhs];

        for (int i = 0; i < nilaiMhs.length; i++) {
            System.out.println("Masukkan nilai mahasiswa ke-"+(i+1)+" : ");
            nilaiMhs[i]=input.nextInt();
        }

        for (int i = 0; i < nilaiMhs.length; i++) {
            total += nilaiMhs[i];   
            if (nilaiMhs[i]>70) {
                jumlahLulus+=1;
            }
        }

        rata2 = total/nilaiMhs.length;
        System.out.println("Rata-rata nilai = "+rata2);
        System.out.println("Jumlah Mahasiswa yang lulus = " + jumlahLulus);
    }
}
