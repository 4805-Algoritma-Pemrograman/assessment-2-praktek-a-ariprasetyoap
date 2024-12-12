import java.util.Scanner;

public class no1 {

    public static void tampilkanAngkaGanjil(int n) {
        System.out.println("Angka ganjil dari 0 hingga " + n + " adalah:");
        for (int i = 1; i <= n; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println(); 
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Masukkan bilangan bulat n: ");
        int n = scanner.nextInt();

        
        tampilkanAngkaGanjil(n);

        
        scanner.close();
    }
}
