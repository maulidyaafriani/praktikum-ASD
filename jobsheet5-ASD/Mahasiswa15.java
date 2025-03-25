public class Mahasiswa15 {

    
    String nim; 
    String nama; 
    String kelas; 
    double ipk; 

    public Mahasiswa15() { 
    
    } 

    public Mahasiswa15(String nm, String name, String kls, double ip) { 
        nim = nm; 
        nama = name; 
        kelas = kls; 
        ipk = ip; 
    }

    void tampilInformasi(){ 
        System.out.println("Nama : " + nama); 
        System.out.println("NIM : " + nim); 
        System.out.println("Kelas : " + kelas); 
        System.out.println("ipk : " + ipk); 
    } 
} 
