import java.util.Scanner;

public class Tugas02 {
    static Scanner sc = new Scanner(System.in);
    static int jumlahMahasiswa=sc.nextInt();
    static int jumlahTugas=sc.nextInt();
    static int[][] arrayNilai = new int[jumlahMahasiswa][jumlahTugas];

    static void inputData() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < arrayNilai[0].length; i++) {
            System.out.println("Tugas ke : " + (i + 1));
            for (int j = 0; j < arrayNilai.length; j++) {
                System.out.println("Masukkan Nilai Mahasiswa ke-" + j + ": ");
                arrayNilai[j][i] = sc.nextInt();
            }
        }
    }

    static void tampilSeluruhData() {
        for (int i = 0; i < arrayNilai[0].length; i++) {
            System.out.println("Tugas ke : " + (i + 1));
            for (int j = 0; j < arrayNilai.length; j++) {
                System.out.println("Nilai Mahasiswa ke-" + j + ": " + arrayNilai[j][i]);
            }
        }
    }

    static void nilaiTertinggi() {
        int nilai = 0, Tugas = -1;
        for (int i = 0; i < arrayNilai[0].length; i++) {
            for (int j = 0; j < arrayNilai.length; j++) {
                if (nilai < arrayNilai[j][i]) {
                    nilai = arrayNilai[j][i];
                    Tugas = i;
                }
            }
        }
        System.out.println("Nilai tertinggi ada pada Tugas ke-" + (Tugas + 1));
    }

    static void mahasiswaTertinggi() {
        int nilai = 0, Tugas = -1, mahasiswa = -1;
        for (int i = 0; i < arrayNilai[0].length; i++) {
            for (int j = 0; j < arrayNilai.length; j++) {
                if (nilai < arrayNilai[j][i]) {
                    nilai = arrayNilai[j][i];
                    Tugas = i;
                    mahasiswa = j;
                }
            }
        }
        System.out.println("Nilai tertinggi diraih oleh mahasiswa ke-" + mahasiswa + " pada Tugas ke-" + (Tugas + 1)
                + " dengan nilai " + nilai);
    }

    public static void main(String[] args) {
        inputData();
        tampilSeluruhData();
        nilaiTertinggi();
        mahasiswaTertinggi();
    }
}
