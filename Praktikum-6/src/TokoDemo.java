public class TokoDemo {
    public static void main(String[] args) {

        // membuat array object produk berisi 5 produk
        Produk[] produk = {
                new Produk("P001", "Facial Wash", 75000, 10),
                new Produk("P002", "Toner", 85000, 8),
                new Produk("P003", "Serum", 150000, 6),
                new Produk("P004", "Moisturizer", 120000, 5),
                new Produk("P005", "Sunscreen", 175000, 7)
        };

        // menampilkan seluruh data produk menggunakan perulangan
        System.out.println("=== DATA PRODUK ===");
        for (Produk p : produk) {
            p.tampilkanData();
        }

        // mensimulasikan pembeli pada 3 produk
        System.out.println("=== SIMULASI PEMBELIAN ===");

        System.out.println("PEmbelian 2 Facial Wash");
        System.out.println("Total Harga : Rp" + produk[0].hitungTotalHarga(2));
        produk[0].kurangiStok(2);
        System.out.println("Stok setelah pembelian : " + produk[0].stok);
        System.out.println();

        System.out.println("Pembelian 10 Moisturizer");
        System.out.println("Total Harga : Rp" + produk[3].hitungTotalHarga(10));
        produk[3].kurangiStok(10);
        System.out.println("Stok setelah pembelian : " + produk[3].stok);
        System.out.println();

        // mencari produk dengan harga termahal menggunakan perulangan
        Produk produkTermahal = produk[0];

        for (Produk p : produk) {
            if (p.harga > produkTermahal.harga) {
                produkTermahal = p;
            }
        }

        System.out.println("=== PRODUK TERMAHAL ===");
        produkTermahal.tampilkanData();

    }
}
