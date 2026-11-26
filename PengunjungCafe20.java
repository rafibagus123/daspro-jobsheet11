public class PengunjungCafe20 {
    static void daftarPengunjung(int nomorMeja, String... namaPengunjung) {
        System.out.println("Daftar Nama Pengunjung:");
        for (String a : namaPengunjung) {
            System.out.println("- " + a);
        }
    }

    static int hitungTotalBelanja(int... harga) {
        int total = 0;
        for (int a : harga) {
            total += a;
        }
        return total;
    }

    public static void main(String[] args) {
        int harga1 = hitungTotalBelanja(10000);
        int harga2 = hitungTotalBelanja(10000, 15000);
        int harga3 = hitungTotalBelanja(10000, 15000, 20000);
        System.out.println(harga1);
        System.out.println(harga2);
        System.out.println(harga3);
    }
}
