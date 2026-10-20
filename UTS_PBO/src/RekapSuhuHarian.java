import java.util.Scanner;

public class RekapSuhuHarian {

    public static void main (String[] args ){

        Scanner sc = new Scanner(System.in);

        System.out.print("Masukkan nama kota: ");
        String kota = sc.nextLine();

        double[] suhu = new double[3];

        for (int i = 0; i < 3; i++ ){
            System.out.print("Masukkan hari " + (i + 1) + ": ");
            suhu[i] = sc.nextDouble();
        }

        double suhuTertinggi = suhu[0];
        for (int i = 1; i < 3; i++){
            if (suhu[i] > suhuTertinggi) {
                suhuTertinggi = suhu[i];
            }
        }
        String kategori;

        if (suhuTertinggi >= 33){
            kategori = "Panas";
        } else if (suhuTertinggi >= 27){
            kategori = "Hangat";
        } else if (suhuTertinggi >= 20){
            kategori = "Sejuk";
        } else {
            kategori = "Dingin";
        }

        System.out.println();
        System.out.println("kota: " + kota);
        System.out.println("suhu tertinggi: " +suhuTertinggi);
        System.out.println("Kategori: " +kategori);
    }
}
