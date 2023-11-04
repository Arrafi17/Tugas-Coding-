import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Menerima input tanggal lahir
        System.out.print("Masukkan tanggal lahir (format DD-MM): ");
        String tanggalLahir = input.next();

        // Mengambil bulan dan hari dari tanggal lahir
        int bulan = Integer.parseInt(tanggalLahir.substring(3, 5));
        int hari = Integer.parseInt(tanggalLahir.substring(0, 2));

        // Menentukan zodiak berdasarkan tanggal lahir
        String zodiak = "";

        if ((bulan == 3 && hari >= 21) || (bulan == 4 && hari <= 19)) {
            zodiak = "Aries";
        } else if ((bulan == 4 && hari >= 20) || (bulan == 5 && hari <= 20)) {
            zodiak = "Taurus";
        } else if ((bulan == 5 && hari >= 21) || (bulan == 6 && hari <= 20)) {
            zodiak = "Gemini";
        } else if ((bulan == 6 && hari >= 21) || (bulan == 7 && hari <= 22)) {
            zodiak = "Cancer";
        } else if ((bulan == 7 && hari >= 23) || (bulan == 8 && hari <= 22)) {
            zodiak = "Leo";
        } else if ((bulan == 8 && hari >= 23) || (bulan == 9 && hari <= 22)) {
            zodiak = "Virgo";
        } else if ((bulan == 9 && hari >= 23) || (bulan == 10 && hari <= 22)) {
            zodiak = "Libra";
        } else if ((bulan == 10 && hari >= 23) || (bulan == 11 && hari <= 21)) {
            zodiak = "Scorpio";
        } else if ((bulan == 11 && hari >= 22) || (bulan == 12 && hari <= 21)) {
            zodiak = "Sagittarius";
        } else if ((bulan == 12 && hari >= 22) || (bulan == 1 && hari <= 19)) {
            zodiak = "Capricorn";
        } else if ((bulan == 1 && hari >= 20) || (bulan == 2 && hari <= 18)) {
            zodiak = "Aquarius";
        } else if ((bulan == 2 && hari >= 19) || (bulan == 3 && hari <= 20)) {
            zodiak = "pisces";
        } else {
            zodiak = "erorr";
        }

        // Menampilkan zodiak
        System.out.println("Zodiak Anda adalah: " + zodiak);
    }
}