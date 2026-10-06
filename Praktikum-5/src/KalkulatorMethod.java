import java.util.Arrays;
import java.util.Scanner;

public class KalkulatorMethod {
    // method tambah dengan 2 parameter
    //method ini digunakan untuk menjumlahkan 2 angka
    static double tambah(double a, double b) {
        return a + b;
    }

    //method tambah dengan 3 parameter
    //method ini merupakan overloading dari method tambah sebelumnya
    //method ini digunakan untuk menjumlahkan 3 angka
    static double tambah(double a, double b, double c) {
        return a + b + c;
    }

    //method kurang
    static double kurang(double a, double b) {
        return a - b;
    }

    //method kali
    static double kali(double a, double b) {
        return a * b;
    }

    //method bagi
    static double bagi(double a, double b) {
        return a / b;
    }

    //method pangkat
    static double pangkat(double a, double b) {
        return  Math.pow(a, b);
    }

    //method kuadrat
    static double akarKuadrat(double a) {
        return Math.sqrt(a);
    }

    //method mencari nilai maksimum dari riwayat hasil
    //parameter berupa array yang berisi hasil-hasil perhitungan
    static double riwayatMaksimum(double[] riwayatHasil) {

        // Nilai pertama array dijadikan nilai maksimum awal
        double maksimum = riwayatHasil[0];

        // Melakukan perulangan untuk memeriksa setiap hasil
        // yang terdapat di dalam array riwayat
        for (double hasil : riwayatHasil) {

            // Jika hasil lebih besar dari nilai maksimum saat ini,
            // maka nilai maksimum diperbarui
            if (hasil > maksimum) {
                maksimum = hasil;
            }
        }
        // Mengembalikan nilai maksimum dari seluruh riwayat hasil
        return maksimum;
    }

    public static void main(String[] args) {

        // Membuat objek Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        // Membuat array kosong untuk menyimpan seluruh hasil perhitungan
        double[] riwayatHAsil = new double[0];

        // Perulangan menu agar kalkulator dapat digunakan
        // berulang kali sampai pengguna memilih keluar
        while (true) {

            // Menampilkan menu kalkulator
            System.out.println("\n==== KALKULATOR METHOD====");
            System.out.println("1. Tambah");
            System.out.println("2. Kurang");
            System.out.println("3, Kali");
            System.out.println("4. Bagi");
            System.out.println("5. Pangkat");
            System.out.println("6. Akar Kuadrat");
            System.out.println("0. keluar");
            System.out.print("Pilih operasi:");

            // Membaca pilihan operasi dari pengguna
            int pilihian = input.nextInt();

            // Jika pengguna memilih 0, maka program akan berhenti
            if (pilihian == 0) {

                // Mencari nilai maksimum dari seluruh hasil perhitungan
                double maksimum = riwayatMaksimum(riwayatHAsil);

                // Menampilkan nilai maksimum dari riwayat hasil
                System.out.println("Nilai maksimum dari seluruh riwayat hasil = " + maksimum);

                // Mengentikan perulangan menu
                break;
            }

            // Variabel untuk menyimpan hasil dari operasi yang dipilih
            double hasil;

            // Menentukan operasi berdasarkan pilihan pengguna
            switch (pilihian) {

                case 1:

                    // Meminta pengguna menentukan jumlah angka
                    // yang akan dijumlahkan, yaitu 2 atau 3 angka
                    System.out.print("Masukkan jumlah angka yang akan dijumlahkan (2 atau 3): ");
                    int jumlahAngka = input.nextInt();

                    // Jika pengguna memilih 2 angka,
                    // maka method tambah dengan 2 parameter digunakan
                    if (jumlahAngka == 2) {

                        System.out.print("Masukkan angka pertama: ");
                        double a = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        double b = input.nextDouble();

                        // Memanggil method tambah dengan 2 parameter
                        hasil = tambah(a, b);

                    } else {

                        // Jika bukan 2 angka, program menggunakan
                        // method tambah dengan 3 parameter
                        System.out.print("Masukkan angka pertama: ");
                        double a = input.nextDouble();

                        System.out.print("Masukkan angka kedua: ");
                        double b = input.nextDouble();

                        System.out.print("Masukkan angka ketiga: ");
                        double c = input.nextDouble();

                        // Memanggil method tambah dengan 3 parameter
                        hasil = tambah(a, b, c);
                    }

                    break;

                case 2:
                    // Meminta angka pertama untuk operasi pengurangan
                    System.out.print("Masukkan angka pertama: ");
                    double a = input.nextDouble();

                    // Meminta angka kedua untuk operasi pengurangan
                    System.out.print("Masukkan angka kedua: ");
                    double b = input.nextDouble();

                    // Memanggil method kurang
                    hasil = kurang(a, b);
                    break;

                case 3:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    // Memamnggil method kali
                    hasil = kali(a, b);
                    break;

                case 4:
                    System.out.print("MAsukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    // Memanggil method bagi
                    hasil = bagi(a, b);
                    break;

                case 5:
                    System.out.print("Masukkan angka pertama: ");
                    a = input.nextDouble();

                    System.out.print("Masukkan angka kedua: ");
                    b = input.nextDouble();

                    // Memanggil method pangkat
                    hasil = pangkat(a, b);
                    break;

                case 6:
                    System.out.print("Masukkan angka: ");
                    a = input.nextDouble();

                    // Memanggil method akarKuadrat
                    hasil = akarKuadrat(a);
                    break;

                default:

                    // Jika pilihan tidak sesuai dengan menu,
                    // program kembali ke awal perulangan
                    continue;
            }

            // menampilkan hasil operasi yang telah dilakukan
            System.out.println("Hasil = " + hasil);

            // Menambah ukuran array riwayat hasil sebanyak 1 elemen
            // agar dapat menyimpan hasil perhitungan baru
            riwayatHAsil = Arrays.copyOf(
                    riwayatHAsil,
                    riwayatHAsil.length + 1
            );

            // Menyimpan hasil perhitungan ke elemen terakhir array riwayat
            riwayatHAsil[riwayatHAsil.length - 1] = hasil;
        }

        // Menutup Scanner setelah program selesai digunakan
        input.close();
    }
}
