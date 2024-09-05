import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membaca jumlah penjualan bulan ini
        int jumlahPenjualan = sc.nextInt();
        
        // Harga per item dan gaji pokok
        final int HARGA_PER_ITEM = 50000;
        final int GAJI_POKOK = 500000;
        
        // Menghitung total penjualan
        int totalPenjualan = jumlahPenjualan * HARGA_PER_ITEM;
        
        // Variabel untuk menyimpan bonus
        double bonus = 0;
        
        // Menghitung gaji berdasarkan jumlah penjualan
        if (jumlahPenjualan >= 40 && jumlahPenjualan <= 80) {
            bonus = 0.25 * totalPenjualan;
        } else if (jumlahPenjualan > 80) {
            bonus = 0.35 * totalPenjualan;
        } else if (jumlahPenjualan < 15) {
            // Menghitung denda
            int kekurangan = 15 - jumlahPenjualan;
            double denda = 0.15 * kekurangan * HARGA_PER_ITEM;
            bonus = 0.10 * jumlahPenjualan * HARGA_PER_ITEM;
            // Mengurangi gaji pokok dengan denda
            System.out.println(GAJI_POKOK - denda + bonus);
            return;
        } else {
            // Bonus untuk penjualan kurang dari 40 dan lebih dari atau sama dengan 15
            bonus = 0.10 * jumlahPenjualan * HARGA_PER_ITEM;
        }
        
        // Menghitung total gaji
        int totalGaji = GAJI_POKOK + (int)bonus;
        System.out.println(totalGaji);
    }
}