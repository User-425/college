import java.util.Scanner;

public class Percobaan601 {
    static int hitungLuas(int panjang, int lebar){
        int luas = panjang * lebar;
        return luas;
    }
    static int hitungVolume(int tinggi, int panjang, int lebar){
        int volume = hitungLuas(panjang, lebar) * tinggi;
        return volume; 
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int p,l,t,L,vol;

        System.out.println("Masukkan Panjang : ");
        p = input.nextInt();    
        System.out.println("Masukkan Lebar : ");
        l = input.nextInt();    
        System.out.println("Masukkan Tinggi : ");
        t = input.nextInt();    
                
        L = hitungLuas(p, l);
        System.out.println("Luas persegi panjang adalah "+L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume balok adalah "+vol);
    }
}
