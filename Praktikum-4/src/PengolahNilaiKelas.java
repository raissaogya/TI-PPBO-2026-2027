import java.util.Scanner;

public class PengolahNilaiKelas {
    public static void main(String[] args) {

        //Membuat Scanner untuk membaca input dari pengguna
        Scanner input = new Scanner(System.in);

        //KKM ditentukan di awal program
        final double KKM = 70;

        //Membaca jumlah mahasiswa
        System.out.print("Masukkan jumlah mahasiswa: ");
        int N = input.nextInt();

        //Membuat array nilai dengan ukuran N
        double[] nilai = new double[N];

        //Membaca nilai ujian masing-masing mahasiswa
        for (int i = 0; i < N; i++) {
            System.out.print("Masukkan nilai mahasiswa ke-" + (i +1) + ": ");
            nilai[i] = input.nextDouble();
        }

        //Menghitung total nilai, nilai tertinggi, nilai terendah,
        //jumlah mahasiswa lulus, dan jumlah mahasiswa tidak lulus
        double total = 0;
        double nilaiTertinggi = nilai[0];
        double nilaiTerendah = nilai[0];
        int jumlahLulus = 0;
        int jumlahTidakLulus = 0;

        for (int i = 0; i < N; i++) {

            total += nilai[i];

            if (nilai[i] > nilaiTertinggi){
                nilaiTertinggi = nilai[i];
            }

            if (nilai[i] < nilaiTerendah) {
                nilaiTerendah = nilai[i];
            }

            if (nilai[i] >= KKM) {
                jumlahLulus++;
            } else {
                jumlahTidakLulus++;
            }
        }

        //Menghitung rata-rata kelas
        double rataRata = total / N;

        //Menampilkan hasil perhitungan
        System.out.println("\n===== HASIL PENGOLAHAN NILAI =====");
        System.out.printf("Rata-rata kelas                 : %.2f%n", rataRata);
        System.out.printf("Nilai tertinggi                 : %.2f%n", nilaiTertinggi);
        System.out.printf("Nilai terendah                  : %.2f%n", nilaiTerendah);
        System.out.println("Jumlah mahasiswa lulus          : " + jumlahLulus);
        System.out.println("Jumlah mahasiswa tidak lulus    : " + jumlahTidakLulus);

        //Menampilkan array sebelum diurutkan
        System.out.println("\nNilai sebelum diurutkan:");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        //Sorting menggunakan Selection Sort secara ascending
        //Tanpa menggunakan method soring bawaan Java
        for (int i = 0; i < N - 1; i++) {

            int indeksMinimum = i;

            for (int j = i + 1; j < N; j++) {
                if (nilai [j] < nilai[indeksMinimum]) {
                    indeksMinimum = j;
                }
            }

            //Menukar nilai
            double sementara = nilai[i];
            nilai[i] = nilai[indeksMinimum];
            nilai[indeksMinimum] = sementara;
        }

        //Menampilkan array setelah diurutkan
        System.out.println("\n\nNilai setelah diurutkan ascending: ");
        for (int i = 0; i < N; i++) {
            System.out.print(nilai[i] + " ");
        }

        System.out.println("\n====================");

        //Menutup Scanner
        input.close();
    }
}
