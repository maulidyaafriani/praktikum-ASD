import java.util.Scanner;
public class fungsi03 {
    static int[][] stokBunga;
    static int[] hargaBunga = {75000, 50000, 60000, 10000};

    public static void tampilkanPendapatanCabang() {
        for (int i = 0; i < stokBunga.length; i++) {
            int pendapatan = 0;
            for (int j = 0; j < stokBunga[i].length; j++) {
                pendapatan += stokBunga[i][j] * hargaBunga[j];
            }
            System.out.println("Pendapatan RoyalGarden " + (i + 1) + ": " + pendapatan);
        }
    }
    
    public static void tampilkanJumlahStokBunga() {
        int[] totalStok = new int[stokBunga[0].length];
        for (int j = 0; j < stokBunga[0].length; j++) {
            int jumlah = 0;
            for (int i = 0; i < stokBunga.length; i++) {
                jumlah += stokBunga[i][j];
            }
            totalStok[j] = jumlah;
            System.out.println("Jumlah stok " + namaBunga(j) + ": " + jumlah);
        }
    }

    public static void perbaruiStokBunga(Scanner input) {
        System.out.println("Masukkan pengurangan stok karena bunga mati untuk setiap jenis bunga:");
        int[] penguranganStok = new int[stokBunga[0].length];
        for (int j = 0; j < penguranganStok.length; j++) {
            System.out.print("Pengurangan stok untuk " + namaBunga(j) + ": ");
            penguranganStok[j] = input.nextInt();
        }

        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                stokBunga[i][j] -= penguranganStok[j];
            }
        }
        System.out.println("Stok bunga telah diperbarui berdasarkan informasi pengurangan stok.");
    }

    public static String namaBunga(int index) {
        String[] namaBunga = {"Aglonema", "Keladi", "Alocasia", "Mawar"};
        return namaBunga[index];
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        stokBunga = new int[4][4];  

        for (int i = 0; i < stokBunga.length; i++) {
            for (int j = 0; j < stokBunga[i].length; j++) {
                System.out.print("Masukkan stok bunga " + namaBunga(j) + " untuk cabang " + (i + 1) + ": ");
                stokBunga[i][j] = sc.nextInt();
            }
        }

        tampilkanPendapatanCabang();
        tampilkanJumlahStokBunga();
        perbaruiStokBunga(sc);
        tampilkanJumlahStokBunga();  
    }
}