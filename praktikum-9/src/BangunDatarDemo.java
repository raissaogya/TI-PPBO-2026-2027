public class BangunDatarDemo {
    public static void main(String[] args) {

        BangunDatar[] daftarBangun = {
                new Lingkaran(7),
                new Persegi(5),
                new Lingkaran(10),
                new Persegi(4),
                new PersegiPanjang(8, 4)
        };

        double totalLuas = 0;
        BangunDatar bangunTerbesar = daftarBangun[0];

        for (BangunDatar b : daftarBangun) {
            b.tampilkanInfo();
            System.out.println("---------------");

            totalLuas += b.hitungLuas();

            if (b.hitungLuas() > bangunTerbesar.hitungLuas()) {
                bangunTerbesar = b;
            }
        }

        System.out.printf("Total Luas: %.2f%n", totalLuas);

        System.out.println("Bangun dengan Luas Terbesar: " + bangunTerbesar.namaBangun);

        System.out.printf("Luas Terbesar: %.2f%n", bangunTerbesar.hitungLuas());
    }
}
