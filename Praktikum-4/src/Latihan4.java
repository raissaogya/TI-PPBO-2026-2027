import java.util.Scanner;

public class Latihan4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] matriks = new int[3][3];

        System.out.println("Masukkan elemen matriks 3x3:");

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                System.out.print("Matriks[" + baris + "][" + kolom + "] = ");
                matriks[baris][kolom] = input.nextInt();
            }
        }

        System.out.println("\nMatriks:");

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                System.out.print(matriks[baris][kolom] + "\t");
            }
            System.out.println();
        }  // <-- tutup for matriks di sini

        System.out.println("\nJumlah setiap baris:");

        for (int baris = 0; baris < matriks.length; baris++) {
            int jumlahBaris = 0;

            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                jumlahBaris += matriks[baris][kolom];
            }

            System.out.println("Jumlah baris " + (baris + 1) + ": " + jumlahBaris);
        }

        int totalMatriks = 0;

        for (int baris = 0; baris < matriks.length; baris++) {
            for (int kolom = 0; kolom < matriks[baris].length; kolom++) {
                totalMatriks += matriks[baris][kolom];
            }
        }

        System.out.println("Total seluruh elemen: " + totalMatriks);
    }
}
