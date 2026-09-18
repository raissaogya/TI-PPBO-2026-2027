import java.util.Scanner;

public class HargaTiket {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur: ");
        int umur = input.nextInt();

        System.out.print("Apakah mahasiswa? (true/false): ");
        boolean mahasiswa = input.nextBoolean();

        int hargaTiket;

        if (mahasiswa && umur < 25) {
            hargaTiket = 25000;
            System.out.println("Mendapatkan harga khusus mahasiswa");
        } else {
            hargaTiket = 40000;
            System.out.println("Mendapatkan harga normal");
        }

        System.out.println("Harga tiket bioskop: Rp" + hargaTiket);
    }
}
