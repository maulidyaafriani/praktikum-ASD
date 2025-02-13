import java.util.Scanner;

public class TUGAS1 {
    public static void main(String[] args) {
        
        char[] kode = {'A', 'B', 'D', 'E', 'F', 'G', 'H', 'L', 'N', 'T'};
        
        
        String[] kota = {
            "BANTEN", "JAKARTA", "BANDUNG", "CIREBON", "BOGOR",
            "PEKALONGAN", "SEMARANG", "SURABAYA", "MALANG", "TEGAL"
        };
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukkan kode plat mobil: ");
        char inputKode = scanner.next().charAt(0);
    
        boolean ditemukan = false;
        for (int i = 0; i < kode.length; i++) {
            if (kode[i] == Character.toUpperCase(inputKode)) {
                System.out.println("Kota: " + kota[i]);
                ditemukan = true;
                break;
            }
        }
        
        if (!ditemukan) {
            System.out.println("Kode plat tidak ditemukan.");
        }
    }
}
