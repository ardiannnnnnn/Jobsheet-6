import java.util.Scanner;
public class percetakan1 {
     public static void main(String[] args) {

        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        System.out.println("====PROGRAM PERCETAKAN====");

        System.out.print("Masukkan jumlah halaman buku yang dicetak: ");
        int jumlahHalaman = sc.nextInt();

        System.out.print("Masukkan jenis cover (hard/soft): ");
        String jenisCover = sc.next().toLowerCase(); 

        int biayaPerHalaman = 200;
        int jumlahLembar = (int) Math.ceil((double) jumlahHalaman / 2);
        int biayaCetak = jumlahHalaman * biayaPerHalaman;
        int beratKertas = jumlahLembar * 3;
        int beratCover, biayaCover;

        if (jenisCover.equals("hard")) {
            biayaCover = 20000;
            beratCover = 250;
        } else if (jenisCover.equals("soft")) {
            biayaCover = 10000;
            beratCover = 100;
        } else {
            System.out.println("Jenis cover tidak valid! Gunakan 'hard' atau 'soft'.");
            return; 
        }

        int beratKemasan = 300;
        int totalBerat = beratKertas + beratCover + beratKemasan;
        int totalBeratKg = (int) Math.ceil((double) totalBerat / 1000);
        int biayaPengiriman = totalBeratKg * 15000;

        int totalBiaya = biayaCetak + biayaCover + biayaPengiriman;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Jenis cover: " + jenisCover);
        System.out.println("Total berat: " + totalBerat + " gram (" + totalBeratKg + " kg)");
        System.out.println("Biaya pengiriman: Rp" + biayaPengiriman);
        System.out.println("Total biaya percetakan: Rp" + totalBiaya);
    }
}
