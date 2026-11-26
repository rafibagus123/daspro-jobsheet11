import java.util.Scanner;

public class Kafe20 {
    public static void Menu(String namaPelanggan, boolean isMember, int jamKunjung) {

        System.out.println("\nSelamat Datang, " + namaPelanggan + "!");
        if (isMember) {
            System.out.println("Anda adalah member, sehingga anda mendapatkan diskon 10% setiap pembelian");
        }

        if (jamKunjung <= 16 && jamKunjung >= 14) {
            System.out.println("Happy Hour! Diskon 20% untuk semua minuman");
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

    public static void ubahNama(String nama) {
        nama = "Tamu";
        System.out.println("Di dalam fungsi: " + nama);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama: ");
    String nama = sc.nextLine();
    System.out.print("Apakah anda memiliki membership? (y/n): ");
    boolean membership = sc.next().equalsIgnoreCase("y");
    System.out.print("Masukkan jam kunjung anda: ");
    int jam = sc.nextInt();
    Menu(nama, membership, jam);
    System.out.println("Jumlah menu: " + jumlahMenu());
    }
}
        // public static void main(String[] args) {
        //     String nama = "Andi";
        //     ubahNama(nama);
        //     System.out.println("Di main: " + nama);
        // }