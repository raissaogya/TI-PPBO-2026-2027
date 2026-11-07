public class Staff extends Pegawai {
    private double tunjanganKinerja;

    //constructoe Staff
    public Staff(String nama, String nip, double gajiPokok, double tunjanganKinerja) {
        super(nama, nip, gajiPokok);
        this.tunjanganKinerja = tunjanganKinerja;
    }

    //getter untuk mengabil tujangan kinerja
    public double getTunjanganKinerja() {
        return tunjanganKinerja;
    }
}
