public class Pegawai {
    protected String nama;
    protected String nip;
    protected double gajiPokok;

    // consturctor dengan validasi gaji pokok
    public Pegawai(String nama, String nip, double gajiPokok) {
        this.nama = nama;
        this.nip = nip;

        // validasi agar gaji tidak boleh negatif
        if (gajiPokok < 0) {
            System.out.println("Peringatan: Gaji pokok tidak boleh negatif!");
            System.out.println("Gaji pokok diatur menjadi 0.");
            this.gajiPokok = 0;
        } else {
            this.gajiPokok = gajiPokok;
        }
    }

    // method untuk menampilkan data pegawai
    public void tampilkanData() {
        System.out.println("Nama: " + nama);
        System.out.println("NIP: " + nip);
        System.out.println("Gaji Pokok: " + gajiPokok);
    }
}
