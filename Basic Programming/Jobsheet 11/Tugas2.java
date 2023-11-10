import java.util.Scanner;

public class Tugas2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan N (minimal 5): ");
        int n = input.nextInt();
        if (n<5) {
            System.out.println("Error! Masukkan N minimal 5!");
        } else {
            for (int i = 1; i <= n; i++) {
                for(int x=n; x>=i; x--){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
