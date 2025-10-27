import java.util.Scanner;
public class sponsor1 {
    public static void main(String[] args) {

        // untuk mendeklarasikan sc sebagai scanner
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        // deklarasi variabel
        int jumlahTim,
                biayaPublikasi = 300000,
                biayaDekorasi = 500000,
                biayaKonsumsiPanitiaJuri = 500000,
                biayaHadiah = 4000000,
                biayaOperasionalLain = 500000,
                biayaKonsumsiPesertaPerOrang = 25000,
                honorariumJuriPerJudul = 75000,
                biayaPendaftaranPerTim = 50000,
                jumlahPesertaPerTim = 3,
                totalPeserta, totalKonsumsiPeserta, totalHonorariumJuri,
                totalPendaftaran, totalAnggaran;

        double danaPolinema, danaSponsorship, presentaseBantuan;

        System.out.println("====PROGRAM DANA SPONSORSHIP INTERCOMP====");

        System.out.print("Masukkan jumlah tim yang mengikuti Intercomp: ");
        jumlahTim = sc.nextInt();

        totalPeserta = jumlahTim * jumlahPesertaPerTim;
        totalKonsumsiPeserta = totalPeserta * biayaKonsumsiPesertaPerOrang;
        totalHonorariumJuri = jumlahTim * honorariumJuriPerJudul;
        totalPendaftaran = jumlahTim * biayaPendaftaranPerTim;

        totalAnggaran = biayaPublikasi + biayaDekorasi + biayaKonsumsiPanitiaJuri +
                biayaHadiah + biayaOperasionalLain +
                totalKonsumsiPeserta + totalHonorariumJuri;

        System.out.println("\n=== HASIL PERHITUNGAN ===");
        System.out.println("Total anggaran kegiatan: Rp " + totalAnggaran);
        System.out.println("Total dana dari pendaftaran: Rp " + totalPendaftaran);
        System.out.println("--------------------------------------------");

        System.out.print("Masukkan persentase bantuan Polinema (45 / 60 / 70 / 100): ");
        presentaseBantuan = sc.nextDouble();

        presentaseBantuan = presentaseBantuan / 100;

        danaPolinema = presentaseBantuan * totalAnggaran;

        if (presentaseBantuan == 1.00) {
            System.out.println("Polinema menanggung 100% dana (Tidak memerlukan sponsorship).");
        } else if (presentaseBantuan == 0.45) {
            danaSponsorship = totalAnggaran - danaPolinema - totalPendaftaran;
            System.out.println("Polinema menanggung 45% dana:");
            System.out.println("Dana sponsorship yang dibutuhkan: Rp " + (int) danaSponsorship);
        } else if (presentaseBantuan == 0.60) {
            danaSponsorship = totalAnggaran - danaPolinema - totalPendaftaran;
            System.out.println("Polinema menanggung 60% dana:");
            System.out.println("Dana sponsorship yang dibutuhkan: Rp " + (int) danaSponsorship);
        } else if (presentaseBantuan == 0.70) {
            danaSponsorship = totalAnggaran - danaPolinema - totalPendaftaran;
            System.out.println("Polinema menanggung 70% dana:");
            System.out.println("Dana sponsorship yang dibutuhkan: Rp " + (int) danaSponsorship);
        } else {
            System.out.println("Persentase tidak dikenali! Masukkan hanya 45, 60, 70, atau 100.");
        }

        System.out.println("--------------------------------------------");
    }
}
