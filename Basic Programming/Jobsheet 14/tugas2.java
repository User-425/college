public class tugas2 {
    public static int PenjumlahanRekursif(int n,int x) {
        System.out.print(x);
        if (x >= n) {
            return x;
        } else {
            System.out.print('+');
            return (x + PenjumlahanRekursif(n, x + 1));
        }
    }

    public static void main(String[] args) {
        int total = PenjumlahanRekursif(8,1);
        System.out.println(" = " + total);
    }
}
