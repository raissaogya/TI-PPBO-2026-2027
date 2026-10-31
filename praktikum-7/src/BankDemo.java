public class BankDemo {
    public static void main(String[] args) {

        RekeningBank rekening1 = new RekeningBank(
                "001",
                "Raissa",
                100000,
                "Tabungan"
        );

        RekeningBank rekening2 = new RekeningBank(
                "002",
                "Gia",
                200000,
                "Giro"
        );

        //skenario 1: Sektor dan tarik pada rekening pertama
        System.out.println("===== REKENING 1 =====");
        rekening1.setor(50000);
        rekening1.tarik(30000);

        System.out.println();

        //skenario 2: Setor dan terik pada rekening kedua
        System.out.println("===== REKENING 2 =====");
        rekening2.setor(100000);
        rekening2.tarik(50000);

        System.out.println();

        //skenario 3: Transfer Berhasil
        System.out.println("===== TRANSFER  BERHASIL =====");
        rekening1.transferKe(rekening2, 50000);

        System.out.println();

        //skenario 4: Transfer gagal karena saldo tidak cukup
        System.out.println("===== TRANSFER GAGAL =====");
        rekening2.transferKe(rekening1, 1000000);

        System.out.println();

        //mutasi akhir kedua rekening
        System.out.println("===== MUTASI AKHIR =====");
        rekening1.cetakMutasi();
        rekening2.cetakMutasi();
    }
}

