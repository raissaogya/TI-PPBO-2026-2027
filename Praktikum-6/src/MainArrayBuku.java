public class MainArrayBuku {
    public static void main(String[] args) {
        Buku[] buku = {
                new Buku("Hujan", "Tere Liye", 2016),
                new Buku("Negeri Para Bedebah", "Tere Liye", 2012),
                new Buku("Bumi", "Tere Liye", 2014),
                new Buku("Laut Bercerita", "Leila S. Chudori", 2017)
        } ;

        //menampilkan judul buku yang terbit setelah 2015
        for (int i = 0; i < buku.length; i++) {
                if (buku[i].tahunTerbit > 2015) {
                    System.out.println("Judul: " + buku[i].judul);
            }
        }
    }
}
