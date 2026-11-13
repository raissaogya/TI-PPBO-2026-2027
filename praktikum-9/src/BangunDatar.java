public class BangunDatar {
    protected String namaBangun;

    public BangunDatar(String namaBangun) {
        this.namaBangun = namaBangun;
    }

    public double hitungLuas() {
        return 0;
    }

    public double hitungKeliling() {
        return 0;
    }

    public void tampilkanInfo() {
        System.out.println("Nama Bangun : " + namaBangun);
        System.out.printf("Luas     :%.2f%n", hitungLuas());
        System.out.printf("Keliling : %.2f%n", hitungKeliling());
    }
}
