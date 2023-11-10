import java.util.Scanner;

public class Tugas1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan N (minimal 3): ");
        int n = input.nextInt();
        if (n<3) {
            System.out.println("Error! Masukkan N minimal 3!");
        } else {
            for (int i = 1; i <= n; i++) {
                for(int x=n; x>=i; x--){
                    System.out.print(" ");
                }
                for(int y=1; y<=i; y++){
                    System.out.print(y);
                }
                System.out.println();
            }
        }
    }
}
