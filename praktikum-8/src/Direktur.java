public class Direktur extends Manager{
    private double tunjanganSaham;

    // constructor Direktur
    public Direktur(String nama, String nip, double gajiPokok, double tunjanganJabatan, double tunjanganSaham) {

        // memanggil constructoe Manager
        super(nama, nip, gajiPokok, tunjanganJabatan);

        this.tunjanganSaham = tunjanganSaham;
    }

    // getter untuk tunjangan saham

    public double getTunjanganSaham() {
        return tunjanganSaham;
    }
}
