public class Manager extends  Pegawai {
    private double tunjanganJabatan;

    // constructor Manager
    public Manager(String nama, String nip, double gajiPokok, double tunjanganJabatan) {
        super(nama, nip, gajiPokok); // panggil constructor Pegawai
        this.tunjanganJabatan = tunjanganJabatan;
    }

    // getter untuk mengambil tunjangan jabaran
    public  double getTunjanganJabatan() {
        return tunjanganJabatan;
    }

    // method unruk menampilkan ringkasan manager
    public void tampilkanRingkasan() {
        System.out.println("Manager: " + nama);
        System.out.println("Tunjangan Jabatan: " + getTunjanganJabatan());
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganJabatan;
    }
}
