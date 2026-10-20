public class MainArrayPersegi {
    public static void main(String[] args) {
        Persegi[] persegi = {
                new Persegi(5),
                new Persegi(10),
                new Persegi(7),
                new Persegi(12)
        };

        Persegi terbesar = persegi[0];

        for (int i = 1; i < persegi.length; i++) {
            if (persegi[i].hitungLuas() > terbesar.hitungLuas()) {
                terbesar = persegi[i];
            }
        }

        System.out.println("Sisi: " + terbesar.sisi);
        System.out.println("Luas terbesar: " + terbesar.hitungLuas());
    }
}
