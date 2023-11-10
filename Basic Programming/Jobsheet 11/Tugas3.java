import java.util.Scanner;

public class Tugas3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan N (minimal 3): ");
        int n = input.nextInt();
        int L = Integer.toString(n).length();
        if (n < 3) {
            System.out.println("Error! Masukkan N minimal 3!");
        } else {
            for (int x = 1; x <= n; x++) {
                System.out.print(n+" ");
            }
            System.out.println();
            for (int x = 1; x <= n-2; x++) {
                System.out.print(n);
                for (int y = 1; y <= ((n-1)*(L+1))-L; y++) {
                    System.out.print(" ");
                }
                System.out.print(n);
                System.out.println();
            }

            for (int x = 1; x <= n; x++) {
                System.out.print(n+" ");
            }
            System.out.println();
        }
    }
}
