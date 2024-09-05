import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Membaca seluruh baris input
        String input = sc.nextLine();
        // Memisahkan input berdasarkan spasi
        String[] parts = input.split(" ");
        
        // Mengambil nilai A, operator, dan B
        int A = Integer.parseInt(parts[0]);
        char operator = parts[1].charAt(0);
        int B = Integer.parseInt(parts[2]);
        
        int result = 0;
        
        // Mengecek operator dan menghitung hasilnya
        switch (operator) {
            case '+':
                result = A + B;
                break;
            case '-':
                result = A - B;
                break;
            case '*':
                result = A * B;
                break;
            case '/':
                result = A / B;
                break;
            case '%':
                result = A % B;
                break;
            default:
                System.out.println("Operator tidak valid");
                return;
        }
        // Mencetak hasil
        System.out.println(result);
    }
}