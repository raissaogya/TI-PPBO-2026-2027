import java.util.Scanner;

public class MenuMakanan {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Mie Ayam");
        System.out.println("2. Bakso");
        System.out.println("3. Dimsum Mentai");
        System.out.println("1. Sambal Bakar");

        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch(pilihan) {
            case 1:
                System.out.println("Anda memilih Mie Ayam");
                break;
            case 2:
                System.out.println("Anda memilih Bakso");
                break;
            case 3:
                System.out.println("Anda memilih Dimsum Mentai");
                break;
            case 4:
                System.out.println("Anda memilih Sambal Bakar");
                break;
            default:
                System.out.println("Pilihan tidak vakid");
        }
    }
}
