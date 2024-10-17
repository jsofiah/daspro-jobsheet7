import java.util.Scanner;
public class Parkir21 {
    public static void main(String[] args) {
        Scanner parkir = new Scanner(System.in);
        int jenis, durasi, total = 0, totalPembayaran = 0;

        do {
            System.out.println("=============================");
            System.out.println("|       Kode kendaraan      |");
            System.out.println("=============================");
            System.out.println("| 1. Mobil                  |");
            System.out.println("| 2. Motor                  |");
            System.out.println("| 0. Keluar                 |");
            System.out.println("=============================");
            System.out.print("Masukkan jenis kendaraan: ");
            jenis = parkir.nextInt();

                if( jenis == 1 || jenis ==2){
                    System.out.print("Input durasi parkir: ");
                    durasi = parkir.nextInt();

                    total = 0;
                    if(durasi > 5){
                        total += 12500;
                    }
                    else if( jenis == 1){
                        total += durasi * 3000;
                    }
                    else if( jenis == 2){
                        total += durasi * 2000;
                    }
                }
                else {
                    System.out.println("Input yang anda masukkan salah.");
                    continue;
                }
                totalPembayaran += total;
                System.out.println("Total pembayaran parkir: Rp." + total);
        } while (jenis != 0);
        System.out.println("Total pembayaran parkir dari beberapa kendaraan: Rp. " + totalPembayaran);
    }
}
