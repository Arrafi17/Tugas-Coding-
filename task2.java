import java.util.Scanner;

public class task2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan batas atas: ");
        int batas_atas = input.nextInt();

        int angka = 1;
        int jumlah_genap = 0;
        int jumlah_ganjil = 0;

        while (angka <= batas_atas) {
            if (angka % 2 == 0) {
                jumlah_genap++;
            } else {
                jumlah_ganjil++;
            }
            angka++;
        }

        System.out.println("Jumlah bilangan genap antara 1 dan " + batas_atas + " adalah " + jumlah_genap);
        System.out.println("Jumlah bilangan ganjil antara 1 dan " + batas_atas + " adalah " + jumlah_ganjil);
    }
}
