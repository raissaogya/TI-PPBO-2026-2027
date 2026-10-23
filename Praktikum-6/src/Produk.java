public class Produk {
    String kodeProduk;
    String namaProduk;
    double harga;
    int stok;

    // constuctor dengan parameter
    Produk(String kodeProduk, String namaProduk, double harga, int stok) {
        this.kodeProduk = kodeProduk;
        this.namaProduk = namaProduk;
        this.harga = harga;
        this.stok = stok;
    }

    // menghitung total harga
    double hitungTotalHarga(int jumlahBeli) {
        return harga * jumlahBeli;
    }

    // mengurangi stok
    void kurangiStok(int jumlah) {
        if (jumlah <= stok) {
            stok -= jumlah;
        } else {
            System.out.println("Stok tidak mencukupi");
        }
    }

    // menampilkan data produk
    void tampilkanData() {
        System.out.println("Kode Produk : " + kodeProduk);
        System.out.println("Nama Produk : " + namaProduk);
        System.out.println("Harga       : Rp" + harga);
        System.out.println("Stok        :  " + stok);
        System.out.println();
    }
}
