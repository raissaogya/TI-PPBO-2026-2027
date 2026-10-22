public class Produk3 {
    String namaProduk;
    double harga;

    Produk3(String namaProduk, double harga) {
        this.namaProduk = namaProduk;
        this.harga = harga;
    }

    boolean isMahal(double bataHarga) {
        return harga > bataHarga;
    }
}

