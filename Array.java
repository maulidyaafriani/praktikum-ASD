import java.util.Scanner;
public class Array {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String[] mataKuliah = {"Pancasila", "Konsep Teknologi Informasi","Critical Thinking Problem Solving", "Matematika Dasar", "Bahasa Inggris", "Dasar Pemrograman", "Praktikum Dasar Pemrograman", "Keselamatan dan Kesehatan Kerja"};
        System.out.println("===============================");
        System.out.println("Program Menghitung  IP Semester");
        System.out.println("===============================");
        double[] nilai = new double[mataKuliah.length];
        double[] bobotNilai = new double[mataKuliah.length];
        for (int i = 0; i < mataKuliah.length; i++) {
            System.out.print("Masukkan nilai Mata Kuliah " + mataKuliah[i] + ": ");
            nilai[i] = sc.nextDouble();
        }
        System.out.println("====================");
        System.out.println("Hasil Konversi Nilai");
        System.out.println("====================");
        System.out.printf("%-40s %-12s %-12s %-12s\n", "Mata Kuliah", "Nilai Angka", "Nilai Huruf", "Bobot Nilai");
        double totalBobot = 0;
        int SKS = mataKuliah.length;
        for (int i = 0; i < mataKuliah.length; i++) {
            String nilaiHuruf = "";
            if (nilai[i] > 80 && nilai[i] <= 100) {
                nilaiHuruf = "A";
                bobotNilai[i] = 4.0;
            } else if (nilai[i] > 73 && nilai[i] <= 80) {
                nilaiHuruf = "B+";
                bobotNilai[i] = 3.5;
            } else if (nilai[i] > 65 && nilai[i] <= 73) {
                nilaiHuruf = "B";
                bobotNilai[i] = 3.0;
            } else if (nilai[i] > 60 && nilai[i] <= 65) {
                nilaiHuruf = "C+";
                bobotNilai[i] = 2.5;
            } else if (nilai[i] > 50 && nilai[i] <=60) {
                nilaiHuruf = "C";
                bobotNilai[i] = 2.0;
            } else if (nilai[i] > 39 && nilai[i] <=50){
                nilaiHuruf = "D";
                bobotNilai[i] = 1.0;
            }else {
                nilaiHuruf = "E";
                bobotNilai[i] = 0.0;
            }
            totalBobot += bobotNilai[i];

            System.out.printf("%-40s %-12.2f %-12s %-12.2f\n", mataKuliah[i], nilai[i], nilaiHuruf, bobotNilai[i]);
        }
        
        double ips = totalBobot / SKS;
        System.out.printf("IP Semester : %.2f\n", ips);

    }
}