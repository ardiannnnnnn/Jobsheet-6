import java.util.Scanner;

public class rentalMobil2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //deklarasi
        int sewaMobil, sewaSupir, lamaSewa, jarak, totalBiaya, bbm = 0, totalBBM, totalPembayaran = 0;
        String bahanBakar;

        //diketahui
        sewaMobil = 300000;
        sewaSupir = 200000;
        int pertalite = 1000;
        int pertamax = 1300;

        //input
        System.out.print("Masukkan Jarak Tempuh: ");
        jarak = sc.nextInt();
        System.out.print("Masukkan Lama Sewa: ");
        lamaSewa = sc.nextInt();
        System.out.print("Masukkan Jenis BBM (Pertalite/Pertamax): ");
        bahanBakar = sc.next();

        //bahanbakar
        if (bahanBakar.equalsIgnoreCase("pertalite")) {
            bbm = pertalite * jarak;
        } else if (bahanBakar.equalsIgnoreCase("pertamax")) {
            bbm = pertamax * jarak;
        } else {
            System.out.println("Tipe Bahan Bakarmu Tidak Tersedia");
        }


        sewaMobil = (sewaMobil + sewaSupir) * lamaSewa;
        totalBBM = bbm;
        totalBiaya = sewaMobil + totalBBM;

        //proses diskon
        if (totalBiaya > 2000000) {
            System.out.println("Mendapatkan Diskon 5%");
            double diskon = 0.05;
            totalPembayaran = (int) (totalBiaya - (totalBiaya * diskon));
        } else {
            System.out.println("Tidak Mendapatkan Diskon");
        }
        
        //output
        System.out.println("Total Biaya: " + totalPembayaran);
    }
}