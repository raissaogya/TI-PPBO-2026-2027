//mengimpor Scanner agar program bisa menerima input dari pengguna
import java.util.Scanner;

//membuat class dengan nama HitungTarifListrik
public class HitungTarifListrik {

    //method utama yang pertama kali dijalankan
    public static void main(String[] args) {

        //membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        //menentukan tarif listrik untuk setiap golongan
        //final digunakan agar nilai tarif tidak dapat diubah
        final int TARIF_450 = 500;
        final int TARIF_900 = 750;
        final int TARIF_1300 = 1000;
        final int TARIF_2200 = 1500;
        final int TARIF_DI_ATAS_2200 = 2000;

        //meminta pengguna memasukkan golongan daya
        //kemudian menyimpan ke variabel daya
        System.out.print("Masukkan golongan daya (450/900/1300/2200 VA): ");
        int daya = input.nextInt();

        //meminta pengguna memasukkan jumlah pemakaian listrik
        //double digunakan karena nilai kwh dapat berupa angka desimal
        System.out.print("Masukkan jumlah pemakaian listrik (kwh): ");
        double kwh = input.nextDouble();

        //mengecek apakah pemakaian listrik kurang dari atau sama dengan 0
        if (kwh < 0 || kwh == 0) {

            //menampilkan pesan kesalahan jika pemakaian tidak valid
            System.out.println("Error: pemakaian kwh tidak boleh negatif atau nol.");
        } else {

            //membuat variabel untuk menyimpan tarif listrik per kwh
            int tarifPerkwh;

            //menentukan tarif berdasarkan golongan daya yang dimasukkan
            switch (daya) {

                //jika daya 450 VA, menggunakan tarif 450 VA
                case 450:
                    tarifPerkwh = TARIF_450;
                    break;

                //jika daya 900 VA, menggunakan tarif 900 VA
                case 900:
                    tarifPerkwh = TARIF_900;
                    break;

                //jika daya 1300 VA, menggunakan tarif 1300 VA
                case 1300:
                    tarifPerkwh = TARIF_1300;
                    break;

                //jika daya 2200 VA, menggunakan tarif 2200 VA
                case 2200:
                    tarifPerkwh = TARIF_2200;
                    break;

                 //jika daya tidak sesuai dengan case sebelumnya
                default:

                    //mengecek apakah daya lebih dari 2200 VA
                    if (daya > 2200) {

                        //menggunakan tarif untuk daya di atas 2200 VA
                        tarifPerkwh = TARIF_DI_ATAS_2200;
                    } else {

                        //menampilkan pesan jika golongan daya tidak valid
                        System.out.println("Golongan daya tidak valid.");
                        return;
                    }
            }
                    //menghitung total tagihan dari jumlah kwh dikali tarif per kwh
                    double totalTagihan = kwh * tarifPerkwh;

                    //menampilkan hasil perhitungan tagihan listrik
                    System.out.println("\n==== HASIL PERHITUNGAN ====");
                    System.out.println("Golongan daya   : " + daya + "VA");
                    System.out.println("Jumlah kwh      : " + kwh + "kwh");
                    System.out.println("Tarif per kwh   : Rp" + tarifPerkwh);
                    System.out.println("Total tagihan   : Rp" + totalTagihan);

        }
    }
}
