import java.util.Scanner;

public class pln1 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        
        int kwh, daya;
        int biayaBulanan = 50000;
        int tarif;
        double ppn = 0.1, total;

        System.out.println("====PROGRAM TARIF LISTRIK (IF-ELSE)====");

    
        System.out.print("Masukkan daya listrik (900 / 1300 / 2200 / 3500 / 5500 VA): ");
        daya = sc.nextInt();

        if (daya == 900) {
            tarif = 1300;
        } else if (daya == 1300 || daya == 2200) {
            tarif = 1500;
        } else if (daya == 3500 || daya == 5500) {
            tarif = 1700;
        } else {
            System.out.println("Daya tidak valid!");
            return; 
        }

        // input 
        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        kwh = sc.nextInt();

        // proses
        ppn = ppn * (biayaBulanan + (kwh * tarif));
        total = (kwh * tarif) + biayaBulanan + ppn;

    
        System.out.println("--------------------------------------");
        System.out.println("Daya: " + daya + " VA");
        System.out.println("Tarif Per kWh: Rp " + tarif);
        System.out.println("Total Tarif Per KWH: Rp" + ((int)tarif * kwh));
        System.out.println("Biaya Bulanan: Rp " + biayaBulanan);
        System.out.println("Total PPN: Rp" + (int)ppn );
        System.out.println("Total Tagihan Listrik (Biaya Bulanan + Total Tarif/Kwh + PPN): Rp " + (int) total);
    }
}