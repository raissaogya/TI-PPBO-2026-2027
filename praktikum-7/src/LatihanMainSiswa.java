public class LatihanMainSiswa {
    public static void main(String[] args) {
        Siswa siswa = new Siswa();

        siswa.setNilai(85);

        System.out.println("Nilai: " + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());

        System.out.println("\nMenguji nilai tidak valid:");
        siswa.setNilai(105);

        System.out.println("Nilai saat ini :" + siswa.getNilai());
        System.out.println("Nilai Huruf: " + siswa.getNilaiHuruf());
    }
}
