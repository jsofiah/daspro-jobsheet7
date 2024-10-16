import java.util.Scanner;
public class Bioskop21 {
    public static void main(String[] args) {
        Scanner bioskop = new Scanner(System.in);
        int tiket, totalTiket = 0;
        double hargaTiket = 50000, totalPenjualan = 0, hargaTotal = 0, hargaBeli;

        do {
            System.out.print("Masukkan jumlah tiket yang akan dibeli (0 untuk berhenti): ");
            tiket = bioskop.nextInt();

            if(tiket==0){
                break;
            }
            if(tiket < 0){
                System.out.println("Jumlah tiket tidak valid, masukkan jumlah yang benar.");
                continue;
            }

            hargaBeli = tiket * hargaTiket;
            if (tiket > 10){
                hargaTotal = hargaBeli - (hargaBeli * 0.15);
                System.out.println("Anda mendapatkan diskon sebesar 15%");
            }
            else if (tiket > 4){
                hargaTotal = hargaBeli - (hargaBeli * 0.10);
                System.out.println("Anda mendapatkan diskon sebesar 10%");
            }
            else if (tiket > 0){
                hargaTotal = hargaBeli;
            }
            System.out.println("Total pembelian tiket: Rp. " + hargaTotal);

            totalTiket += tiket;
            totalPenjualan += hargaTotal;

        } while (true);
        System.out.println("Total tiket yang terjual hari ini: " + totalTiket);
        System.out.println("Total pendapatan penjualan tiket: Rp. " + totalPenjualan);
    }
}
