
import java.util.Scanner;

public class rentalMobil3 {
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

        //if else

                //lamasewa
        if (lamaSewa > 30) {
            System.out.println("Tidak Dapat Menyewa");
        } else {
        sewaMobil = (sewaMobil + sewaSupir) * lamaSewa;
        totalBBM = bbm;
        totalBiaya = sewaMobil + totalBBM;
        
        //output
        System.out.println("Total Biaya: " + totalPembayaran);
        }
    }
}