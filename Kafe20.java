import java.util.Scanner;

public class Kafe20 {
    public static void Menu(String namaPelanggan, boolean isMember) {

        System.out.println("\nSelamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, sehingga anda mendapatkan diskon 10% setiap pembelian");
        }

        System.out.println(" ===== MENU RESTO KAFE ===== ");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappuccino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("===========================");
        System.out.println("Silakan pilih menu yang Anda inginkan.");
    }

    public static int jumlahMenu() {
        return 6;
    }

    public static int hitungTotalHarga20(int pilihanMenu, int banyakItem) {
        int[] hargaItems = { 15000, 20000, 22000, 12000, 10000, 18000 };

        int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        return hargaTotal;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Menu("Andi", true);
        int totalBayar = 0;
        String pesan;
        int pilihanMenu;

        do {
            do {
                System.out.print("\nMasukkan nomor menu yang ingin Anda pesan: ");
                pilihanMenu = sc.nextInt();
                if (pilihanMenu < 1 || pilihanMenu > 6) {
                    System.out.println("Nomor menu tidak valid, silahkan masukkan nomor menu lagi");
                }
            } while (pilihanMenu < 1 || pilihanMenu > 6);
            System.out.print("Masukkan jumlah item yang ingin dipesan: ");
            int banyakItem = sc.nextInt();
            
            int bayar = hitungTotalHarga20(pilihanMenu, banyakItem);
            totalBayar += bayar;
            
            System.out.print("Apakah anda ingin memesan lagi? (y/n): ");
            pesan = sc.next();
            
            
        } while (pesan.equalsIgnoreCase("y"));

        System.out.println("Total harga untuk pesanan Anda: Rp" + totalBayar);
    }
}