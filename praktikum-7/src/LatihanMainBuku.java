public class LatihanMainBuku {
    public static void main(String[] args) {
        Buku buku = new Buku("Hujan", "Tere Liye", 2016);

        buku.setJudul("Bumi");
        buku.setPengarang("Tere Liye");

        System.out.println("Judul: " + buku.getJudul());
        System.out.println("Pengarang: " + buku.getPengarang());
        System.out.println("Tahun Terbit: " + buku.getTahunTerbit());
    }
}
