import org.w3c.dom.ls.LSOutput;

public class Helloworld {
    public static void main(String[] args){
        //Progtam menampilkan biodata sederhana
        System.out.println("Nama:Budi");
        /* Baris dibawah ini
            mencetak NIM mahasiswa*/
        System.out.println("NIM:12345");

        int nilaiBulat = 9;
        double nilaiDouble = nilaiBulat; //widening otomatis
        System.out.println("Widening: " + nilaiDouble);

        double pecahan = 9.8;
        int hasilCasting = (int) pecahan; //narrowing eksplisit
        System.out.println("Narrowing: " + hasilCasting);
    }
}

