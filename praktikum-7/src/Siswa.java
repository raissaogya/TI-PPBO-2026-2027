public class Siswa {
    private double nilai;
    public double getNilai() {
        return nilai;
    }

    public void setNilai(double nilai) {
        if (nilai >= 0 && nilai <= 100) {
            this.nilai = nilai;
        } else {
            System.out.println("Penolakan: nilai harus 0-100.");
        }
    }

    public char getNilaiHuruf(){
        if (nilai >= 80) {
            return 'A';
        } else if (nilai >= 70) {
            return 'B';
        } else if (nilai >= 60) {
            return 'C';
        } else if (nilai >= 50) {
            return 'D';
        } else {
            return 'E';
        }
    }
}
