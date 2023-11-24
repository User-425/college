import java.util.Scanner;

public class UcapanTerimaKasih_01 {

    public static String ucapan ;

    public static String PenerimaUcapan() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Tuliskan Nama orang yang ingin anda beri ucapan: ");
        String namaOrang = sc.nextLine();
        System.out.println("Tuliskan Ucapan tambahan yang ingin diberikan: ");
        ucapan = sc.nextLine();
        return namaOrang;
    }

    public static void UcapanTambahan(String ucapan) {
        System.out.println(ucapan);
    }

    public static void ucapanTerimaKasih() {
        String nama = PenerimaUcapan();
        System.out.println("Thank you " + nama + " for being the best teacher in the world.\n"
                + "You inspired in me a love for learning and made me feel like I could ask you anything");
    }

    public static void main(String[] args) {
        ucapanTerimaKasih();
        UcapanTambahan(ucapan);
    }
}
