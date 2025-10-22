import java.util.Scanner;

public class StudiKasus1Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int hargaTiket = 50000, totalTiketHarian = 0, jumlahTiket;
        double totalPenjualanHarian = 0, totalBayarPelanggan = 0, diskon = 0, totalDiskon = 0;
        String konfirmasi = null; // null digunakan untuk inisialisasi awalnya agar masuk ke loop do-while

        System.out.println("----- Program Kasir Bioskop -----");
        do {
            // Validasi input jumlah tiketnyaa
            while (true) {
                System.out.print("Masukkan jumlah tiket: ");
                jumlahTiket = sc.nextInt();
                if (jumlahTiket >= 0) {
                    break; // Keluar paksa dari loop validasi dan menuju ke proses selanjutnya
                } else {
                    System.out.println("Input tidak valid!. Silakan masukkan ulang.");
                }
            }

            // Digunakan buat membersihkan newline setelah nextInt()
            sc.nextLine(); 

            // Jika jumlah tiket 0, tanyakan konfirmasi untuk pelanggan berikutnya
            if (jumlahTiket == 0) {
                System.out.println("Masukkan konfirmasi (ya/tidak) untuk pelanggan berikutnya: ");
                konfirmasi = sc.nextLine();
            }

            // Hitung total bayar awal
            totalBayarPelanggan = jumlahTiket * hargaTiket;

            // Cek diskon
            if (jumlahTiket > 10) {
                diskon = 0.15; // Diskon 15%
            } else if (jumlahTiket > 4) {
                diskon = 0.1; // Diskon 10%
            } else {
                diskon = 0; // Tidak ada diskon
            }

            // Hitung total bayar setelah diskon
            totalDiskon = totalBayarPelanggan * diskon;
            totalBayarPelanggan -= totalDiskon;
            System.out.println("Total bayar pelanggan: Rp. " + totalBayarPelanggan);

            // Update total hariannya
            totalTiketHarian += jumlahTiket;
            totalPenjualanHarian += totalBayarPelanggan;

            // Menanyakan konfirmasi untuk pelanggan berikutnya
            System.out.println("Apakah ada pelanggan lagi? (ya/tidak): ");
            konfirmasi = sc.nextLine();
        } while (konfirmasi.equalsIgnoreCase("ya"));

        // Laporan harian bioskop
        System.out.println("----- Laporan Bioskop dalam Sehari -----");
        System.out.println("Total tiket terjual: " + totalTiketHarian);
        System.out.println("Total penjualan hari ini: Rp. " + totalPenjualanHarian);

        sc.close();
    }
}