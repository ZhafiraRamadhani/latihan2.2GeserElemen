import java.util.Scanner;

public class Geser_Elemen{
    public static void main(String[] args) {
        // Tulis kode disini
        // Membuat Scanner untuk menerima input dari pengguna
        Scanner scanner = new Scanner(System.in);

        // Menerima input angka dari pengguna
        System.out.print("Masukkan angka (jumlah penggeseran) : ");
        int jumlahGeser = scanner.nextInt();
        scanner.nextLine(); // Membersihkan newline setelah nextInt

        // Menerima input kalimat dari pengguna
        System.out.print("Masukkan kalimat : ");
        String kalimat = scanner.nextLine();

        // Memisahkan kalimat menjadi array kata
        String[] kataArray = kalimat.split(" ");

        // Menghitung jumlah kata
        int n = kataArray.length;

        // Menggeser kata array
        jumlahGeser = jumlahGeser % n; // Menghindari geseran yang lebih dari jumlah kata
        String[] hasilArray = new String[n];

        // Menggeser kata-kata
        for (int i = 0; i < n; i++) {
            hasilArray[(i + jumlahGeser) % n] = kataArray[i];
        }

        // Menampilkan hasil
        String kalimatSetelahDigeser = String.join(" ", hasilArray);
        System.out.println("Kalimat setelah digeser: " + kalimatSetelahDigeser);

        // Menutup scanner
        scanner.close();
    }
}
