import java.util.Scanner;

public class MahasiswaDemo15 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Mahasiswa15[] arrayOfMahasiswa = new Mahasiswa15[3];

        for (int i = 0; i < 3; i++) {
            arrayOfMahasiswa[i] = new Mahasiswa15();

            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.print("NIM    : ");
            arrayOfMahasiswa[i].nim = sc.nextLine();
            System.out.print("Nama   : ");
            arrayOfMahasiswa[i].nama = sc.nextLine();
            System.out.print("Kelas  : ");
            arrayOfMahasiswa[i].kelas = sc.nextLine();
            System.out.print("IPK    : ");
            arrayOfMahasiswa[i].ipk = Float.parseFloat(sc.nextLine());
            System.out.println("---------------------------------");
        }

        System.out.println("\nData Mahasiswa:");
        for (int i = 0; i < 3; i++) {
            System.out.println("Mahasiswa ke-" + (i + 1));
            System.out.println("NIM    : " + arrayOfMahasiswa[i].nim);
            System.out.println("Nama   : " + arrayOfMahasiswa[i].nama);
            System.out.println("Kelas  : " + arrayOfMahasiswa[i].kelas);
            System.out.println("IPK    : " + arrayOfMahasiswa[i].ipk);
            System.out.println("---------------------------------");
        }
        
        }
    }
