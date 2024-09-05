import java.math.BigInteger;
import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Membaca dua baris input yang masing-masing berisi angka besar
        BigInteger a = new BigInteger(sc.nextLine());
        BigInteger b = new BigInteger(sc.nextLine());
        
        // Menghitung penjumlahan dan perkalian dari dua angka besar
        BigInteger sum = a.add(b);
        BigInteger product = a.multiply(b);
        
        // Mencetak hasil penjumlahan dan perkalian
        System.out.println(sum);
        System.out.println(product);
    }
}