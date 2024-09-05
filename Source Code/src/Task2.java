import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Cetak batas atas sesuai contoh output
        System.out.println("================================");
        
        // Loop untuk tiga baris input
        for (int i = 0; i < 3; i++) {
            // Membaca string dan integer dari input
            String s = sc.next();
            int x = sc.nextInt();
            
            // Format output sesuai dengan spesifikasi
            System.out.printf("%-15s%03d%n", s, x);
        }
        
        // Cetak batas bawah sesuai contoh output
        System.out.println("================================");
    }
}