public class LatihanMainProduk {
    public static void main(String[] args) {
        Produk produk = new Produk("P002", "Keyboard", 150000, 8);

        System.out.println("Data Produk Awal:");
        produk.tampilkanData();

        System.out.println("\nMenambahkan stok:");
        produk.tambahStok(5);
        System.out.println("Stok sekarang: " + produk.getStok());

        System.out.println("\nMengurangi stok:");
        produk.kurangiStok(3);
        System.out.println("Stok sekarang: " + produk.getStok());

        System.out.println("\nMenguji validasi:");
        produk.setHarga(-5000);
        produk.tambahStok(0);
        produk.kurangiStok(20);

        System.out.println("\nData Produk Akhir:");
        produk.tampilkanData();
    }
}
