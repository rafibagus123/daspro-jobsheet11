import java.util.Scanner;

public class BankSampah20 {

    static Scanner sc = new Scanner(System.in);

    static double[] inputSetoran(int n) {
        double[] setoran = new double[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Masukkan berat setoran nasabah ke-" + (i + 1) + " (kg): ");
            setoran[i] = sc.nextDouble();
        }
        return setoran;
    }

    static void tampilSetoran(double[] setoran) {
        System.out.println("\n=== DAFTAR SETORAN NASABAH ===");
        for (int i = 0; i < setoran.length; i++) {
            System.out.println("Nasabah ke-" + (i + 1) + ": " + setoran[i] + " kg");
        }
    }

    static double totalSetoran(double[] setoran) {
        double total = 0;

        for (int i = 0; i < setoran.length; i++) {
            total += setoran[i];
        }

        return total;
    }

    static double hitungSaldo(double beratSetoran, double hargaPerKg) {
        return beratSetoran * hargaPerKg;
    }

    static int nasabahTerbanyak(double[] setoran) {
        int indeksTerbesar = 0;

        for (int i = 1; i < setoran.length; i++) {
            if (setoran[i] > setoran[indeksTerbesar]) {
                indeksTerbesar = i;
            }
        }

        return indeksTerbesar;
    }

    public static void main(String[] args) {

        System.out.print("Masukkan jumlah nasabah: ");
        int n = sc.nextInt();

        double[] setoran = inputSetoran(n);

        tampilSetoran(setoran);

        double total = totalSetoran(setoran);
        System.out.println("\nTotal berat seluruh setoran: " + total + " kg");

        System.out.println("\n=== SALDO NASABAH ===");

        double hargaPerKg = 3000;

        for (int i = 0; i < setoran.length; i++) {
            double saldo = hitungSaldo(setoran[i], hargaPerKg);

            System.out.println("Saldo nasabah ke-" + (i + 1) + ": Rp" + saldo);
        }

        int indeks = nasabahTerbanyak(setoran);

        System.out.println("\n=== SETORAN TERBESAR ===");
        System.out.println("Nasabah ke-" + (indeks + 1));
        System.out.println("Berat setoran: " + setoran[indeks] + " kg");

        sc.close();
    }
}