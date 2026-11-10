public class Staff extends Pegawai{
    private double tunjanganKinerja;

    //constructor Staff
    public Staff(String nama, String nip, double gajiPokok, double tunjanganKinerja) {
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    //getter untuk mengambil tunjangan kinerja
    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }

    @Override
    public double hitungGaji() {
        return gajiPokok + tunjanganKinerja;
    }
}
