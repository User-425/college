import java.util.Scanner;

public class Pemilihan2Percobaan201 {
    public static void main(String[] args) {
        int sudut1, sudut2, sudut3, totalSudut;
        Scanner input01 = new Scanner(System.in);
        System.out.println("Masukkan Sudut1 :");
        sudut1 = input01.nextInt();
        System.out.println("Masukkan Sudut2 :");
        sudut2 = input01.nextInt();
        System.out.println("Masukkan Sudut3 :");
        sudut3 = input01.nextInt();
        totalSudut = sudut1 + sudut2 + sudut3;

        if (totalSudut == 180) {
            if ((sudut1 == 90) || (sudut2 == 90) || (sudut3 == 90)) {
                System.out.println("Segitiga tersebut adalah segitiga siku-siku");
            } else if ((sudut1 == sudut2) && (sudut2 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama sisi");
            } else if ((sudut1 == sudut2) || (sudut2 == sudut3) || (sudut1 == sudut3)) {
                System.out.println("Segitiga tersebut adalah segitiga sama kaki");
            } else {
                System.out.println("Segitiga tersebut adalah segitiga sembarang");
            }
        } else {
            System.out.println("Bukan Segitiga");
        }
    }
}
