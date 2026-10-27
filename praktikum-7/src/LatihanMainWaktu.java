public class LatihanMainWaktu {
    public static void main(String[] args) {
        Waktu waktu = new Waktu();

        waktu.setJam(10);
        waktu.setMenit(30);
        waktu.setDetik(45);

        System.out.println("Jam: " + waktu.getJam());
        System.out.println("Menit: " + waktu.getMenit());
        System.out.println("Detik: " + waktu.getDetik());

        waktu.setJam(25);
        waktu.setMenit(60);
        waktu.setDetik(60);
    }
}
