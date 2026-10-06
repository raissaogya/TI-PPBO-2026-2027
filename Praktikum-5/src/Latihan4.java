import java.util.Scanner;

public class Latihan4 {

    static int cariNilaiMinimum(int[] data) {
        int minimum = data[0];

        for (int nilai : data) {
            if (nilai < minimum) {
                minimum = nilai;
            }
        }

        return minimum;
    }

    static int cariNilaiMaksimum(int[] data) {
        int maksimum = data[0];

        for (int nilai : data) {
            if (nilai > maksimum) {
                maksimum = nilai;
            }
        }

        return maksimum;
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah nilai ujian: ");
        int jumlah = input.nextInt();

        int[] data = new int[jumlah];

        for (int i = 0; i < data.length; i++) {
            System.out.print("Masukkan nilai ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        System.out.println("Nilai minimum = " + cariNilaiMinimum(data));
        System.out.println("Nilai maksimum = " + cariNilaiMaksimum(data));

        input.close();
    }
}
