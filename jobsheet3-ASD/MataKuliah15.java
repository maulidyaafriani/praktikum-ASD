import java.util.Scanner;

public class MataKuliah15 {

    public String kode;
    public String nama;
    public int sks;
    public int jumlahJam;

    public MataKuliah15(String kode, String nama, int sks, int jumlahJam) {
        this.kode = kode;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    public static MataKuliah15 tambahData() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Kode       : ");
        String kode = sc.nextLine();
        System.out.print("Nama       : ");
        String nama = sc.nextLine();
        System.out.print("SKS        : ");
        int sks = Integer.parseInt(sc.nextLine());
        System.out.print("Jumlah Jam : ");
        int jumlahJam = Integer.parseInt(sc.nextLine());
        System.out.println("----------------------------------------------");

        return new MataKuliah15(kode, nama, sks, jumlahJam);
    }
    public void cetakInfo() {
        System.out.println("Kode       : " + this.kode);
        System.out.println("Nama       : " + this.nama);
        System.out.println("SKS        : " + this.sks);
        System.out.println("Jumlah Jam : " + this.jumlahJam);
        System.out.println("----------------------------------------------");
    }
}
