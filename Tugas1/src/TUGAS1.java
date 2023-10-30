import java.util.Scanner;

public class TUGAS1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double num1, num2;
        System.out.print("Masukkan angka pertama: ");
        num1 = scanner.nextDouble();
        System.out.print("Masukkan angka kedua: ");
        num2 = scanner.nextDouble();

        System.out.println("Pilih operasi matematika:");
        System.out.println("1. Penambahan (+)");
        System.out.println("2. Pengurangan (-)");
        System.out.println("3. Perkalian (*)");
        System.out.println("4. Pembagian (/)");

        int choice = scanner.nextInt();
        double result = 0;

        switch (choice) {
            case 1:
                result = num1+num2;;
                break;
            case 2:
                result = num1-num2;
                break;
            case 3:
                result = num1*num2;
                break;
            case 4:
                if (num2 != 0) {
                    result = num1/num2;
                } else {
                    System.out.println("Tidak bisa melakukan pembagian dengan nol.");
                }
                break;
            default:
                System.out.println("Pilihan tidak valid.");
        }

        System.out.println("Hasil: " + result);
    }
}