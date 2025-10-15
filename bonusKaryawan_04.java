import java.util.Scanner;

public class bonusKaryawan_04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int gaji = 5000000;

        // masukkan input
        System.out.println("masukkan kinerja = ");
        int kinerja = input.nextInt();
        System.out.println("masukkan tahun kerja = ");
        int tahun = input.nextInt();
        System.out.println("punya sertifikasi profesional(ya/tidak) = ");
        String sertifikasi = input.next();

        // pemilihan bonus
        if (kinerja < 70) {
            System.out.println("keryawan tidak mendapatkan bonus");
        } else if (kinerja >= 70) {
            if (tahun < 2) {
                System.out.println("bonus : " + gaji * 0.01);
            } else if (tahun >= 2 && tahun < 5) {
                System.out.println("bonus : " + gaji * 0.03);
            } else {
                System.out.println("bonus : " + gaji * 0.05);
            }
        } else if (kinerja >= 90 && kinerja <= 100) {
            if (tahun < 2) {
                System.out.println("bonus : " + gaji * 0.02);
            } else if (tahun >= 2 && tahun < 5) {
                System.out.println("bonus : " + gaji * 0.04);
            } else {
                System.out.println("bonus : " + gaji * 0.07);
            }
        } else if (sertifikasi.equalsIgnoreCase("ya")) {
            gaji += 500000;
        }

        // output
        System.out.println(" === OUTPUT ===");
      System.out.println("total gaji dan bonus adalah = " + gaji);
    }
}
