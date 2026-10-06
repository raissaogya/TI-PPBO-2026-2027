public class MethodDemo {
    // Method void: tidak mengambalikan nilai apa pun
    static void sapa(String nama) {
        System.out.println("Hallo, " + nama + "!");
    }

    static void tampilkanBiodata(String nama, int umur, String kota) {
        System.out.println(nama + " ( " + umur + " tahun) -" + kota);
    }

    // Panggil pada method main:
    public static void main(String[] args) {
        sapa("Budi");
        sapa("Siti");

        tampilkanBiodata("Budi", 20, "Bandung");
    }
}
