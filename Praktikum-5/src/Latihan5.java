public class Latihan5 {
    //menghitung total seluruh elemen array
    static int hitungTotal(int[] data) {
        int total = 0;

        for (int nilai : data) {
            total += nilai;
        }

        return total;
    }

    //menegmbalikan array yang berisi elemen di atas rata-rata
    static int[] filterDiAtasRataRata(int[] data) {
        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        int jumlah = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                jumlah++;
            }
        }

        int[] hasil = new int[jumlah];
        int index = 0;

        for (int nilai : data) {
            if (nilai > rataRata) {
                hasil[index] = nilai;
                index++;
            }
        }

        return  hasil;
    }

    public static void main(String[] args) {
        int[] data = {60, 70, 80, 90, 50};

        int total = hitungTotal(data);
        double rataRata = (double) total / data.length;

        System.out.println("Total = " + total);
        System.out.println("Rata-rata = " + rataRata);

        int[] hasil = filterDiAtasRataRata(data);

        System.out.print("Elemen di atas rata-rata: ");

        for (int nilai : hasil) {
            System.out.print(nilai + " ");
        }
    }
}
