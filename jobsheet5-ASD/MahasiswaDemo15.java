import java.util.Scanner; 
 
public class MahasiswaDemo15 { 
    public static void main(String[] args) { 
        Scanner sc = new Scanner(System.in); 
        mahasiswaBerprestasi15 list = new mahasiswaBerprestasi15(); 
 
        for (int i = 0; i < 5; i++) { 
            System.out.println("Masukkan Mahasiswa ke-" + (i+1) +":"); 
            System.out.print("NIM: "); 
            String nim = sc.nextLine(); 
            System.out.print("Nama: "); 
            String nama = sc.nextLine(); 
            System.out.print("Kelas: "); 
            String kelas = sc.nextLine(); 
            System.out.print("IPK: "); 
            double ipk = sc.nextDouble(); 
            System.out.println("--------------------------------"); 
            sc.nextLine(); 
 
            Mahasiswa15 m = new Mahasiswa15(nim, nama, kelas, ipk); 
            list.tambah(m); 
 
        } 
        System.out.println("Data mahasiswa sebelum sorting: "); 
        list.tampil(); 
 
        System.out.println("Data mahasiswa setelah sorting berdasarkan IPK (DESC): "); 
        list.bubbleSort(); 
        list.tampil(); 

        System.out.println("data yang sudah terurut menggunakan SELECTION SORT(ASC)");
        list.selectionSort();
        list.tampil();
 
        System.out.println("Data yang sudah terurut menggunakan INSERTION SORT (ASC)");
        list.insertionSort();
        list.tampil();
        
        sc.close(); 
    } 
     
} 
