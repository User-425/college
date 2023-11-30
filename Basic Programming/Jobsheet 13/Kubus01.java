public class Kubus01 {
    double sisi; 

    public Kubus01(double sisi) {
        this.sisi = sisi;
    }

    public double hitungVolume() {
        double volume = sisi * sisi * sisi ;
        return volume;
    }

    public double hitungLuasPermukaan() {
        double luasPermukaan = 6 * sisi * sisi ;
        return luasPermukaan;
    }

    public static void main(String[] args) {
        Kubus01 kubus = new Kubus01(4);
        System.out.println("Volume Kubus: " + kubus.hitungVolume());
        System.out.println("Luas Permukaan Kubus: " + kubus.hitungLuasPermukaan());
    }
}
