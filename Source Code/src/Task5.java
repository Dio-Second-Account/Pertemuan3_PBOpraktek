import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membaca input satu baris berupa plat nomor mobil
        String input = sc.nextLine();
        
        // Memisahkan input berdasarkan spasi
        String[] platNomor = input.split(" ");
        
        // Menggabungkan angka dari plat nomor mobil menjadi satu string
        StringBuilder gabunganAngkaBuilder = new StringBuilder();
        for (String plat : platNomor) {
            gabunganAngkaBuilder.append(plat);
        }
        
        // Mengonversi gabungan angka ke dalam bentuk long
        long gabunganAngkaLong;
        try {
            gabunganAngkaLong = Long.parseLong(gabunganAngkaBuilder.toString());
        } catch (NumberFormatException e) {
            System.out.println("Error: Angka terlalu besar.");
            return;
        }
        
        // Memeriksa apakah gabungan angka dibagi 5 tanpa sisa
        if (gabunganAngkaLong % 5 == 0) {
            System.out.println("berhenti");
        } else {
            System.out.println("jalan");
        }
    }
}