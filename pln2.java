import java.util.Scanner;
public class pln2 {
    public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int kwh, daya;
        int biayaBulanan = 50000;
        int tarif; 
        double ppn = 0.1, total;

        System.out.println("====PROGRAM TARIF LISTRIK (SWITCH-CASE)====");

        // input daya
        System.out.print("Masukkan daya listrik (900 / 1300 / 2200 / 3500 / 5500 VA): ");
        daya = sc.nextInt();

        switch (daya) {
            case 900:
                tarif = 1300;
                break;
            case 1300:
            case 2200:
                tarif = 1500;
                break;
            case 3500:
            case 5500:
                tarif = 1700;
                break;
            default:
                System.out.println("Daya tidak valid!");
                return;
        }

        System.out.print("Masukkan jumlah pemakaian (kWh): ");
        kwh = sc.nextInt();

        ppn = ppn * (biayaBulanan + (kwh * tarif));
        total = (kwh * tarif) + biayaBulanan + ppn;

        System.out.println("--------------------------------------");
        System.out.println("Daya: " + daya + " VA");
        System.out.println("Tarif Per KWh: Rp " + tarif);
        System.out.println("Total Tarif Per Kwh: Rp " + (tarif * kwh));
        System.out.println("Total Biaya Bulanan: Rp " + biayaBulanan);
        System.out.println("Total PPN: Rp " + (int) ppn);
        System.out.println("Total Tagihan Listrik (Total Tarif/Kwh + Biaya Bulanan + Total PPN): Rp " + (int) total);
    }
}
