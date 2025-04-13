import java.util.Scanner;
public class MahasiswaDemo15
 {
    public static void main(String[] args) {
        MahasiswaBerprestasi15 list = new MahasiswaBerprestasi15();
        Scanner sc  = new Scanner(System.in);
    
        System.out.print("Masukkan jumlah mahasiswa: ");
        int jumMhs = Integer.parseInt(sc.nextLine());

        for(int i=0; i<jumMhs; i++){
            
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));
            System.out.println("NIM: ");
            String nim = sc.nextLine();
            System.out.println("Nama: ");
            String nama = sc.nextLine();
            System.out.println("Kelas: ");
            String kelas = sc.nextLine();
            System.out.println("IPK: ");
            String ip =sc.nextLine();
            Double ipk = Double.parseDouble(ip);
            System.out.println("--------------------------------------");
            list.tambah(new Mahasiswa15(nim, nama, kelas, ipk));
        }

        list.tampil();
        System.out.println("--------------------------------------------");
        System.out.println("Pencarian data");
        System.out.println("--------------------------------------------");
        System.out.println("Masukkan ipk mahasiswa yang dicari: ");
        System.out.print("IPK: ");
        double cari = sc.nextDouble();

        System.out.println("Menggunakan sequential searching");
        double posisi = list.sequentialSerching(cari);
        int pss = (int)posisi;
        list.tampilPosisi(cari, pss);
        list.tampilDataSearch(cari, pss);
    }
}
