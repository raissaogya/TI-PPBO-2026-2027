public class PerusahaanDemo {
    public static void main(String[] args) {

        // membuat objek Manager
        Manager mgr = new Manager("Budi", "M001", 8000000, 2000000);

        // membuat objek Staff
       Staff stf = new Staff("Andi", "S001", 4000000, 500000);

       // membuat objek Direktur
        Direktur dir = new Direktur("Citra", "D001", 15000000, 5000000, 3000000);


        //menampilkan data Manager
        System.out.println("\n===== DATA MANAGER =====");
        mgr.tampilkanData();

        // menampilkan data Staff
        System.out.println("\n===== DATA STAFF =====");
        stf.tampilkanData();

        // menampilkan data Direktur
        System.out.println("\n===== DATA DIREKTUR =====");
        dir.tampilkanData();

        // menguji getter Manager
        System.out.println("\nTunjangan Jabatan Manager: " + mgr.getTunjanganJabatan());

        // menguji getter Staff
        System.out.println("Tunjangan Kinerja Staff: " + stf.getTunjanganKinerja());

        // menguji getter Direktur
        System.out.println("Tunjangan saham Direktur: " + dir.getTunjanganSaham());

        // menguji validasi gaji negatif
        System.out.println("\n===== UJI VALIDASI GAJI =====");
        Pegawai pgw = new Pegawai( "Deni", "P001",  -1000000);

        pgw.tampilkanData();
    }
}
