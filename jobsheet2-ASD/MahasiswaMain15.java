public class MahasiswaMain15 {

    public static void main(String[] args) {

        
        
        Mahasiswa15 mhs1 = new Mahasiswa15 ();
        mhs1.nama = "Muhammad ali Farhan ";
        mhs1.nim = "2441720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIpk (3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa15 mhs2 = new Mahasiswa15("Annisa Nabila", "2141720160", 3.25, "TI 2L");
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa15 mhsMaulidya = new Mahasiswa15("maulidya Afriani", "244107020059", 3.75,"TI 1E");
        mhsMaulidya.tampilkanInformasi();
    }
}