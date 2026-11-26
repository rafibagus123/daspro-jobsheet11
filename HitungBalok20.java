import java.util.Scanner;

public class HitungBalok20 {

    static int hitungLuas(int pjg, int lb) {
        int Luas = pjg * lb;
        return Luas;

    }

    static int hitungVolume(int tinggi, int a, int b) {
        int volume = hitungLuas(a, b) * tinggi;
        return volume;

    }

    static int hitungLuasPermukaanBalok(int p, int l, int t) {
        int lp = 2 * ((p * l) + (p * t) + (l * t));
        return lp;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int p, l, t, L, vol;

        System.out.println("Masukkan panjang");
        p = input.nextInt();

        System.out.println("Masukkan lebar");
        l = input.nextInt();

        System.out.println("Masukkan tinggi");
        t = input.nextInt();
        L = hitungLuas(p, l);
        System.out.println("Luas Persegi Panjang adalah " + L);

        vol = hitungVolume(t, p, l);
        System.out.println("Volume Balok adalah " + vol);

        int luasPermukaan = hitungLuasPermukaanBalok(p, l, t);
        System.out.println("Luas Permukaan: "+luasPermukaan);

        input.close();
    }
}