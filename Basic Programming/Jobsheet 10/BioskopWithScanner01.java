import java.util.Scanner;

public class BioskopWithScanner01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int baris, kolom;
        String nama, next;

        String[][] penonton = new String[4][2];

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Input data penonton");
            System.out.println("2. Tampilkan daftar penonton");
            System.out.println("3. Exit");
            System.out.print("Pilih menu (1/2/3): ");
            next = sc.nextLine();

            if (next.equals("1")) {
                System.out.println("Masukkan nama: ");
                nama = sc.nextLine();
                System.out.println("Masukkan baris: ");
                baris = sc.nextInt();
                System.out.println("Masukkan kolom: ");
                kolom = sc.nextInt();
                sc.nextLine();
                penonton[baris - 1][kolom - 1] = nama;
            } else if (next.equals("2")) {
                System.out.println("Daftar Penonton:");
                for (int i = 0; i < penonton.length; i++) {
                    System.out.print(penonton[i][0] + " ");
                    System.out.print(penonton[i][1]);
                    System.out.println();
                }
            } else if (next.equals("3")) {
                break;
            } else {
                System.out.println("Pilihan tidak valid!");
            }
        }
    }
}
