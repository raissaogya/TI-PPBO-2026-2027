public class Latihan1 {
    static double luasPersegiPanjang(double p, double l) {
        return p * l;
    }

    static double luasLingkaran(double r) {
        return Math.PI * r * r;
    }

    public static void main(String[] args) {
        System.out.println("Luas Persegi Panjang: ");
        System.out.println("p = 10, l = 5 :" + luasPersegiPanjang(10, 5));
        System.out.println("p = 8, l = 4 : " + luasPersegiPanjang(8, 4));
        System.out.println("p + 12, l = 6 :" + luasPersegiPanjang(12, 6));

        System.out.println("\nLuas Lingkara: ");
        System.out.println("r = 7 :" + luasLingkaran(7));
        System.out.println("r = 10 :" + luasLingkaran(10));
        System.out.println("r = 14 :" + luasLingkaran(14));
    }
}
