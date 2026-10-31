public class RekeningBank {
    private String nomoRekening;
    private String pemilik;
    private double saldo;
    private final String jenisRekening;

    public RekeningBank(String nomor, String pemilik, double saldoAwal, String jenisRekening) {
        this.nomoRekening = nomor;
        this.pemilik = pemilik;
        this.saldo = (saldoAwal >= 0) ? saldoAwal : 0;
        this.jenisRekening = jenisRekening;
    }

    public String getNomoRekening() {

        return nomoRekening;
    }

    public void setNomoRekening(String nomoRekening) {
        this.nomoRekening =nomoRekening;
    }

    public String getPemilik() {

        return pemilik;
    }

    public void setPemilik(String pemilik) {
        this.pemilik = pemilik;
    }

    public double getSaldo() {

        return saldo;
    }

    public void setSaldo(double saldo) {
        if (saldo >= 0) {
            this.saldo = saldo;
        }
    }

    //jenisRekening bersifat read-only, sehingga tidak memiliki setter

    public String getJenisRekening() {
        return  jenisRekening;
    }

    public void setor(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah setor harus lebih dari 0");
            return;
        }

        saldo += jumlah;
        System.out.println("Setor berhasil. saldo: " + saldo);
    }

    public void tarik(double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Jumlah tarik harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            System.out.println("Tarik berhasil. saldo: " + saldo);
        }
    }

    public void transferKe(RekeningBank tujuan, double jumlah) {
        if (jumlah <= 0) {
            System.out.println("Transfer gagal. Jumlah transfer harus lebih dari 0");
        } else if (jumlah > saldo) {
            System.out.println("Transfer gagal. Saldo tidak mencukupi");
        } else {
            saldo -= jumlah;
            tujuan.saldo += jumlah;

            System.out.println("Transfer berhasil. saldo: " + saldo);
        }
    }

    public void cetakMutasi() {
        System.out.println("=========================");
        System.out.println("Nomor Rekening: " +nomoRekening);
        System.out.println("Pemilik: " + pemilik);
        System.out.println("Jenis Rekening: " + jenisRekening);
        System.out.println("Saldo: " + saldo);
        System.out.println("=========================");
    }
}
