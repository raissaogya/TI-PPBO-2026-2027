/*
    * Nama Program  : KalkulatorBangunDatar
    * Nama          : Raissa Ogya
    * NIM           : 2025573010063
    * Kelas         : TI 2A
 */

import java.util.Scanner;

public class KalkulatorBangunDatar {
    public static void main(String[] args) {

        //Membuat objek Scanner untuk menerima imput dari pengguna
        Scanner input = new Scanner(System.in);

        //Meminta pengguna memasukkan panjang dan lebar persegi panjang
        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        //Menghitung luas persegi panjang
        double luasPersegiPanjang = panjang * lebar;

        //Menghitung keliling persegi panjang
        double kelilingPersegiPanjang =2 * (panjang + lebar);

        //Menampilkan hasil luas dan keliling persegi panjang
        System.out.println("\n=== Persegi Panjang ===");
        System.out.println("Luas     : " + luasPersegiPanjang);
        System.out.println("Keliling :" + kelilingPersegiPanjang);

        //Menentukan apakah luas persegi panjang lebih dari 100
        boolean luasBesar = luasPersegiPanjang > 100;

        //Menampilkan nilai boolean luasBesar
        System.out.println("Luas > 100 : " + luasBesar);

        //Memeinta pengguna memasukkan jari-jari lingkaran
        System.out.println("\nMasukkan jari-jari lingkaran: ");
        double jarijari = input.nextDouble();

        //Menghitung luas lingkaran menggunakan Math.PI
        double luasLingkaran = Math.PI * jarijari * jarijari;

        //Menghitung keliling lingkaran menggunakan Math.PI
        double kelilingLingkaran = 2 * Math.PI * jarijari;

        //Menampilkan hasil luas dan keliling lingkaran
        System.out.println("\n==== Lingkaran ====");
        System.out.println("Luas     : " + luasLingkaran);
        System.out.println("Keliling : " + kelilingLingkaran);

        //Menutup Scanner
        input.close();
    }
}
