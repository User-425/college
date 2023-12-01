public class tugas1 {
    static int deretDescendingRekursif(int n){
        if(n==1){
            return 1;
        }else{
            return n + deretDescendingRekursif(n-1);
        }
    }

    static int deretDescendingIteratif(int n){
        int total = 0;
        for(int i = n; i >= 0; i--){
            total += i;
        }
        return total;
    }

    public static void main(String[] args) {
        System.out.println(deretDescendingRekursif(5));
        System.out.println(deretDescendingIteratif(5));
    }
}
