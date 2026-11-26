import java.util.Scanner;

public class KubusLimas20 {
    static int luasPersegi(int s) {
        int lP = s * s;
        return lP;
    }

    static int volumeKubus(int s) {
        int vK = s * s * s;
        return vK;
    }

    static int luasPermukaanKubus(int s) {
        int lpK = 6 * luasPersegi(s);
        return lpK;
    }

    static double volumeLimasPersegi(int s, int t) {
        double vLP = (luasPersegi(s) * t) / 3;
        return vLP;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int pilihan, s, t;

        do {
            System.out.println("\n=== MENU PERHITUNGAN ===");
            System.out.println("1. Luas Persegi");
            System.out.println("2. Volume Kubus");
            System.out.println("3. Luas Permukaan Kubus");
            System.out.println("4. Volume Limas Persegi");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("\nMasukkan s: ");
                    s = sc.nextInt();
                    int luasPersegi = luasPersegi(s);
                    System.out.println("Luas Persegi: "+luasPersegi);
                    break;
                case 2:
                    System.out.print("\nMasukkan s: ");
                    s = sc.nextInt();
                    int volumeKubus = volumeKubus(s);
                    System.out.println("Volume Kubus: " + volumeKubus);
                    break;
                case 3:
                    System.out.print("\nMasukkan s: ");
                    s = sc.nextInt();
                    int luasPermukaanKubus = luasPermukaanKubus(s);
                    System.out.println("Luas Permukaan Kubus: " +luasPermukaanKubus);
                    break;
                case 4:
                    System.out.print("\nMasukkan s: ");
                    s = sc.nextInt();
                    System.out.print("Masukkan t: ");
                    t = sc.nextInt();
                    double volumeLimasPersegi = volumeLimasPersegi(s, t);
                    System.out.println("Volume Limas Persegi: " +volumeLimasPersegi);
                    break;
                case 0:
                    System.out.println("Terimakasih");
                    break;
                default:
                    System.out.println("Pilihan tidak ada di menu, silahkan pilih lagi.");
                    continue;
            }
        } while (pilihan != 0);
    }
}
