public class Kendaraan {
    protected String merek;
    protected double kecepatanMaks;

    public Kendaraan(String merek, double kecepatanMaks) {
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }
}

class Mobil extends Kendaraan {
    int jumlahPintu;

    public Mobil(String merek, double kecepatanMaks, int jumlahPintu) {
        super(merek, kecepatanMaks);
        this.jumlahPintu = jumlahPintu;
    }

    public  void tampilkanInfo(){
        System.out.println("Merek: " + merek);
        System.out.println("Kecepatan Maks: " + kecepatanMaks);
    }
}

class Motor extends Kendaraan {
    String jenisMotor;

    public Motor(String merek, double kecepatanMaks, String jenisMotor) {
        super(merek, kecepatanMaks);
        this.jenisMotor = jenisMotor;
    }
}