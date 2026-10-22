public class MainProduk {
    public  static void main(String[] args) {
        Produk3 produk1 = new Produk3("Buku", 50000);
        Produk3 produk2 = new Produk3("Pulpen", 10000);

        System.out.println("Produk 1");
        System.out.println("Nama Produk: " + produk1.namaProduk);
        System.out.println("Harga: " + produk1.harga);
        System.out.println("Apakah mahal? " + produk1.isMahal(30000));

        System.out.println();

        System.out.println("Produk 2");
        System.out.println("Nama Produk: " + produk2.namaProduk);
        System.out.println("Harga: " + produk2.harga);
        System.out.println("Apakah mahal? " + produk2.isMahal(30000));

    }
}
