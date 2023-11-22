import java.util.Scanner;

public class kelas_tabel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan nilai n (lebih kecil atau sama dengan 10): ");
        int n = scanner.nextInt();

        if (n > 0 && n <= 10) {
            // AWALAN TABEL
            System.out.println("Tabel Perkalian " +"'" + n + " x " + n+"'");
            System.out.print("   |");
            for (int i = 1; i <= n; i++) {
                System.out.printf("%4d", i);
            }
            System.out.println();
            System.out.println("----x----------------");

            // ISI DARI TABEL
            for (int i = 1; i <= n; i++) {
                System.out.printf("%2d |", i);
                for (int j = 1; j <= n; j++) {
                    System.out.printf("%4d", i * j);
                }
                System.out.println();
            }
        } else {
            System.out.println("Masukkan nilai n sesuai dengan ketentuan.");
        }

        scanner.close();
    }
}
