import java.util.Scanner;

public class rentalMobil1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int sewaMobil, sewaSupir, lamaSewa, jarak, totalBiaya, pertalite, pertamax, bbm = 0, totalBBM ;
        String bahanBakar;

        sewaMobil = 300000;
        sewaSupir = 200000;
        pertalite = 1000;
        pertamax = 1300;

        System.out.println("Masuktan lama sewa (dalam hari)");
        lamaSewa = sc.nextInt();
        System.out.println("Masukan jarak tempuh (dalam km)");
        jarak = sc.nextInt();
        System.out.println("Masukkan jenis BBM (petalite/pertamax)");
        bahanBakar = sc.next();


        //proses diskon
        totalBiaya = sewaMobil + bbm;
        if (totalBiaya > 2000000) {
            double diskon = 0.05;
        } else {
            System.out.println("Tidak Mendapatkan Diskon");
        }

        //bahanbakar
        if (bahanBakar.equalsIgnoreCase("pertalite")) {
            bbm = pertalite * jarak;
        } else if (bahanBakar.equalsIgnoreCase("pertamax")) {
            bbm = pertamax * jarak;
        } else {
            System.out.println("Tipe Bahan Bakarmu Tidak Tersedia");
        }

        //lamasewa
        if (lamaSewa > 30) {
            System.out.println("Tidak Dapat Menyewa");
        } else {
        sewaMobil = (sewaMobil + sewaSupir) * lamaSewa;
        totalBBM = bbm;
        totalBiaya = sewaMobil + totalBBM;
        
        //output
        System.out.println("Total Biaya: " + totalBiaya);
        }
    }
}
