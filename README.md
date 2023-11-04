# Tugas-Coding
## TASK 1
1. `public class task1 {`: Kode ini mendefinisikan sebuah kelas Java dengan nama "task1". Kelas ini adalah tempat utama di mana program Java dimulai.

2. `public static void main(String[] args) {`: Ini adalah metode utama (main method) yang dieksekusi ketika program dijalankan. Metode ini menerima parameter argumen dalam bentuk array string (`String[] args`), meskipun dalam program ini argumen tersebut tidak digunakan.

3. `for (int i = 1; i <= 100; i++) {`: Ini adalah struktur perulangan `for` yang digunakan untuk mengulangi pernyataan-pernyataan di dalamnya. Loop akan dieksekusi dari `i = 1` hingga `i <= 100`, dengan `i` bertambah 1 setiap iterasi.

4. `if (i <= 9) {`: Ini adalah pernyataan `if` yang digunakan untuk memeriksa apakah nilai `i` kurang dari atau sama dengan 9.

5. `System.out.println(i);`: Jika nilai `i` kurang dari atau sama dengan 9, program akan mencetak nilai `i` itu sendiri (yaitu angka dari 1 hingga 9) ke layar menggunakan `System.out.println()`.

6. `else {`: Jika nilai `i` lebih besar dari 9 (yaitu 10 hingga 100), program akan menjalankan pernyataan yang ada dalam blok `else`.

7. `System.out.println("(Arrafi Andersont)");`: Dalam blok `else`, program akan mencetak teks "(Arrafi Andersont)" ke layar menggunakan `System.out.println()`. Ini akan mencetak nama "Arrafi Andersont" sebanyak 91 kali karena perulangan `for` berjalan dari 10 hingga 100.

Dengan demikian, program ini mencetak angka dari 1 hingga 9 terlebih dahulu, dan kemudian mencetak nama "Arrafi Andersont" sebanyak 91 kali untuk nilai `i` dari 10 hingga 100.

## TASK 2
1. `import java.util.Scanner;`: Kode ini mengimpor kelas `Scanner` dari paket `java.util`, yang digunakan untuk menerima input dari pengguna.

2. `public class task2 {`: Kode ini mendefinisikan sebuah kelas Java dengan nama "task2". Kelas ini adalah tempat utama di mana program Java dimulai.

3. `public static void main(String[] args) {`: Ini adalah metode utama (main method) yang dieksekusi ketika program dijalankan. Metode ini menerima parameter argumen dalam bentuk array string (`String[] args`), meskipun dalam program ini argumen tersebut tidak digunakan.

4. `Scanner input = new Scanner(System.in);`: Program membuat objek `Scanner` dengan nama `input` untuk menerima input dari pengguna.

5. `System.out.print("Masukkan batas atas: ");`: Program mencetak pesan "Masukkan batas atas: " ke layar, meminta pengguna memasukkan batas atas.

6. `int batas_atas = input.nextInt();`: Program mengambil input yang dimasukkan oleh pengguna sebagai angka, kemudian menyimpannya dalam variabel `batas_atas`.

7. `int angka = 1;`: Program menginisialisasi variabel `angka` dengan nilai 1, yang akan digunakan untuk menghitung bilangan dari 1 hingga `batas_atas`.

8. `int jumlah_genap = 0;` dan `int jumlah_ganjil = 0;`: Program menginisialisasi dua variabel, `jumlah_genap` dan `jumlah_ganjil`, dengan nilai awal 0. Variabel ini akan digunakan untuk menghitung jumlah bilangan genap dan ganjil.

9. `while (angka <= batas_atas) {`: Ini adalah perulangan `while` yang akan terus berjalan selama `angka` kurang dari atau sama dengan `batas_atas`.

10. `if (angka % 2 == 0) {`: Dalam perulangan, program menggunakan pernyataan `if` untuk memeriksa apakah `angka` adalah bilangan genap. Jika `angka` habis dibagi 2 (artinya sisa pembagian dengan 2 adalah 0), maka `angka` adalah bilangan genap, dan `jumlah_genap` akan ditambah 1.

11. `else { `: Jika `angka` bukan bilangan genap, program akan menjalankan blok `else` dan `jumlah_ganjil` akan ditambah 1.

12. `angka++;`: Setelah periksaan selesai, program akan menambahkan 1 ke nilai `angka` untuk melanjutkan perulangan ke angka berikutnya.

13. Program mencetak hasil jumlah bilangan genap dan ganjil ke layar dengan pesan yang sesuai menggunakan `System.out.println()`.

Dengan demikian, program ini akan meminta pengguna memasukkan batas atas, menghitung jumlah bilangan genap dan ganjil dalam rentang dari 1 hingga batas atas tersebut, dan kemudian menampilkan hasilnya ke layar.

## TASK 3
1. `import java.util.Scanner;`: Kode ini mengimpor kelas `Scanner` dari paket `java.util`, yang digunakan untuk menerima input dari pengguna.

2. `public class task3 {`: Kode ini mendefinisikan sebuah kelas Java dengan nama "task3". Kelas ini adalah tempat utama di mana program Java dimulai.

3. `public static void main(String[] args) {`: Ini adalah metode utama (main method) yang dieksekusi ketika program dijalankan. Metode ini menerima parameter argumen dalam bentuk array string (`String[] args`)

4. `Scanner input = new Scanner(System.in);`: Program membuat objek `Scanner` dengan nama `input` untuk menerima input dari pengguna.

5. `System.out.print("Masukkan tanggal lahir (format DD-MM): ");`: Program mencetak pesan ke layar, meminta pengguna untuk memasukkan tanggal lahir dalam format "DD-MM".

6. `String tanggalLahir = input.next();`: Program menerima input yang dimasukkan oleh pengguna dan menyimpannya dalam variabel `tanggalLahir` sebagai string.

7. `int bulan = Integer.parseInt(tanggalLahir.substring(3, 5));` dan `int hari = Integer.parseInt(tanggalLahir.substring(0, 2));`: Program mengambil bulan dan hari dari tanggal lahir yang dimasukkan oleh pengguna. Ini dilakukan dengan mengambil potongan string yang sesuai dari `tanggalLahir`, lalu mengonversi mereka ke tipe data integer.

8. Selanjutnya, program menggunakan serangkaian pernyataan `if-else` untuk menentukan zodiak berdasarkan bulan dan hari yang telah diambil.
        } else if ((bulan == 3 && hari >= 21) || (bulan == 4 && hari <= 19)) {
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
10.  } else {
            zodiak = "erorr";  : program menampilkan error jika DD dan MM yang dimasukkan tidak sesuai

11. Terakhir, program mencetak zodiak yang sesuai dengan tanggal lahir pengguna menggunakan `System.out.println()`.

Program ini akan meminta pengguna untuk memasukkan tanggal lahir dan kemudian menampilkan zodiak yang sesuai berdasarkan tanggal lahir yang dimasukkan.

## TASK 4
1. `public class task4 {`: Kode ini mendefinisikan sebuah kelas Java dengan nama "task4". Kelas ini adalah tempat utama di mana program Java dimulai.

2. `public static void main(String[] args) {`: Ini adalah metode utama (main method) yang dieksekusi ketika program dijalankan. Metode ini menerima parameter argumen dalam bentuk array string (`String[] args`), meskipun dalam program ini argumen tersebut tidak digunakan.

3. `int[] angkaArray = {5, 10, 15, 20, 25,};`: Program mendeklarasikan variabel `angkaArray` dengan tipe data array `int`. Array ini diinisialisasi dengan beberapa nilai (5, 10, 15, 20, 25) yang dipisahkan oleh tanda koma.

4. `for (int i = 0; i < angkaArray.length; i++) {`: Ini adalah perulangan `for` yang digunakan untuk mengulangi pernyataan-pernyataan di dalamnya. Loop akan berjalan dari `i = 0` hingga `i < angkaArray.length`, dengan `i` bertambah 1 setiap iterasi. `angkaArray.length` adalah panjang (jumlah elemen) dari array `angkaArray`.

5. `System.out.println("Nilai ke-" + i + ": " + angkaArray[i]);`: Di dalam perulangan, program menggunakan `System.out.println()` untuk mencetak nilai dari array. Pesan yang dicetak akan menunjukkan indeks elemen array (`i`) serta nilai yang ada dalam array pada indeks tersebut (`angkaArray[i]`).

Dengan demikian, program ini akan mencetak semua nilai dalam array `angkaArray` beserta indeksnya ke layar. Outputnya akan terlihat seperti:

Nilai ke-0: 5
Nilai ke-1: 10
Nilai ke-2: 15
Nilai ke-3: 20
Nilai ke-4: 25

Program ini berguna untuk menampilkan nilai dalam array dan indeksnya, yang berguna dalam pemrosesan data dalam array.
