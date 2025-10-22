import java.util.Scanner;

public class StudiKasus2Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int jenis, durasi, total = 0;
        
        System.out.println("----- Program Penghitung Pembayaran Parkir -----");

        // Menggunakan do-while untuk memastikan setidaknya satu input diproses
        do {
            // Validasi input jenis kendaraan
            System.out.print("Masukkan Jenis Kendaraan (1. Mobil, 2. Motor, 0 Keluar): ");
            jenis = sc.nextInt();

            // Menghitung total pembayaran berdasarkan jenis kendaraan
            if (jenis == 1 || jenis == 2) {
                System.out.print("Masukkan Durasi Parkir (jam): ");
                durasi = sc.nextInt();

                // Menghitung total pembayaran berdasarkan durasi 
                if (durasi > 5) { // Tarif tetap untuk durasi lebih dari 5 jam
                    total += 12500;
                } else if (jenis == 1) { // Mobil
                    total += durasi * 3000;
                } else if (jenis == 2) { // Motor
                    total += durasi * 2000;
                }
            } else {
                System.out.println("Jenis kendaraan tidak valid! Silakan masukkan ulang.");
            }
        } while (jenis != 0); // Terus meminta input selama jenis bukan 0

        // Menampilkan total pembayaran parkir
        System.out.println("----- Laporan Total Pembayaran Parkir -----");
        System.out.println("Total pembayaran parkir: Rp " + total);
        sc.close();
    }    
}



























/**
 * Sebuah tempat parkir ingin membuat program untuk menghitung total pembayaranparkir dari beberapa kendaraan. Tarif parkir adalah Rp 3.000 per jam untuk mobil dan Rp2.000 per jam untuk motor. Namun, jika durasi parkir lebih dari 5 jam, diberikan tariftetap sebesar Rp 12.500 untuk semua kendaraan. Program akan terus meminta masukanselama input bukan 0. Implementasikan flowchart tersebut ke dalam bentuk kodeprogram Java!
 * int jenis, durasi, total = 0;
 * Output: Masukkan Jenis Kendaraan (1. Mobil, 2. Motor, 0 Keluar)
 * Input Jenis
 * if (Jenis == 1 || Jenis == 2) {
 * input durasi
 * if (durasi > 5) {
 * total += 12500;
 * } else if (jenis == 1) {
 * total += durasi * 3000;
 * } else if (jenis == 2) {
 * total += durasi * 2000;
 * } else {
 *  ke while (jenis != 0)
 * }
 *
 * } else {
 *      while (jenis != 0) {
 * true: balik ke if (Jenis == 1 || Jenis == 2)
 * false: output total 
 * }
 * }
 */