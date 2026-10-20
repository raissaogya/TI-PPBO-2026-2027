import java.util.Scanner;

public class TotalHarga {

   public static void main (String[] args) {
       Scanner sc = new Scanner(System.in);

       System.out.print("Masukkan harga barang: ");
       double harga = sc.nextDouble();

       System.out.print("Masukkan jumlah barang: ");
       int jumlah = sc.nextInt();

       double total = harga * jumlah;

       System.out.println("Total harga: " + total);
   }
}
