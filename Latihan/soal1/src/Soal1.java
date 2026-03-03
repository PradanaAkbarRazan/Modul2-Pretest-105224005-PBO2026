import java.util.Scanner;

public class Soal1 {
    public static void main(String[] args) throws Exception {
    Scanner input = new Scanner(System.in);

        System.out.print("Masukkan panjang (meter): ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar (meter): ");
        double lebar = input.nextDouble();

        System.out.print("Masukkan tinggi (meter): ");
        double tinggi = input.nextDouble();

        double luasDinding = 2 * (panjang * tinggi) + 2 * (lebar * tinggi);

        double literCat = Math.ceil(luasDinding / 10);

        System.out.println("Luas dinding: " + luasDinding + " m2");
        System.out.println("Cat yang dibutuhkan: " + literCat + " liter");

        input.close();
    }
}