import java.util.*;

public class Solution {
    public static void main(String[] args) {
        // Membaca input string
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        
        // Menggunakan regular expression untuk memisahkan string berdasarkan huruf
        // Pisahkan dengan non-alphabetic characters (bukan huruf)
        String[] tokens = s.trim().split("[^A-Za-z]+");
        
        // Jika tidak ada token, kita cetak 0
        if (tokens.length == 0) {
            System.out.println(0);
        } else {
            // Cetak jumlah token
            System.out.println(tokens.length);
            
            // Cetak setiap token pada baris baru
            for (String token : tokens) {
                System.out.println(token);
            }
        }
    }
}