import java.util.Scanner;

class MataKuliah {
    private String kodeMK;
    private String nama;
    private int sks;
    private int jumlahJam;
    

    public MataKuliah() {
        this.kodeMK = "TBA";
        this.nama = "Unknown";
        this.sks = 0;
        this.jumlahJam = 0;
    }
    

    public MataKuliah(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }
    

    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }
    

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS berhasil diubah menjadi: " + sksBaru);
    }
    

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam berhasil ditambah. Total sekarang: " + this.jumlahJam);
    }
    

    public void kurangiJam(int jam) {
        if (jam > this.jumlahJam) {
            System.out.println("Gagal mengurangi jam! Jam yang dikurangi lebih besar dari jumlah saat ini.");
        } else {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam berhasil dikurangi. Total sekarang: " + this.jumlahJam);
        }
    }
}


public class MataKulia{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Masukkan data mata kuliah pertama:");
        System.out.print("Kode MK: ");
        String kode1 = scanner.nextLine();
        System.out.print("Nama Mata Kuliah: ");
        String nama1 = scanner.nextLine();
        System.out.print("SKS: ");
        int sks1 = scanner.nextInt();
        System.out.print("Jumlah Jam: ");
        int jam1 = scanner.nextInt();
        scanner.nextLine(); 
        
        MataKuliah mk1 = new MataKuliah(kode1, nama1, sks1, jam1);
        

        System.out.println("nMasukkan data mata kuliah kedua:");
        System.out.print("Kode MK: ");
        String kode2 = scanner.nextLine();
        System.out.print("Nama Mata Kuliah: ");
        String nama2 = scanner.nextLine();
        System.out.print("SKS: ");
        int sks2 = scanner.nextInt();
        System.out.print("Jumlah Jam: ");
        int jam2 = scanner.nextInt();
        
        MataKuliah mk2 = new MataKuliah(kode2, nama2, sks2, jam2);
        
    
        System.out.println("=== Informasi Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        
        System.out.println("=== Informasi Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        
        System.out.print("Masukkan SKS baru untuk Mata Kuliah 1: ");
        int sksBaru = scanner.nextInt();
        mk1.ubahSKS(sksBaru);
        
        System.out.print("Masukkan jumlah jam yang ingin ditambahkan ke Mata Kuliah 2: ");
        int tambahJam = scanner.nextInt();
        mk2.tambahJam(tambahJam);
        
        System.out.print("Masukkan jumlah jam yang ingin dikurangi dari Mata Kuliah 1: ");
        int kurangiJam = scanner.nextInt();
        mk1.kurangiJam(kurangiJam);
        
        System.out.println("=== Informasi Setelah Perubahan Mata Kuliah 1 ===");
        mk1.tampilInformasi();
        
        System.out.println("=== Informasi Setelah Perubahan Mata Kuliah 2 ===");
        mk2.tampilInformasi();
        
        scanner.close();
    }
}
