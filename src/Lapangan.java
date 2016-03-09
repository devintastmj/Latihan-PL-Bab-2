package BAB2;

public class Lapangan {
    final int panjangLapangan = 100;
    final int lebarLapangan = 20;
    
    public int HitungKelilingLapangan(int panjangLapangan, int lebarLapangan){
        return 2 * (this.panjangLapangan + this.lebarLapangan);
    }
    
    public int HitungJarak(Mahasiswa a, Lapangan l){
        return (int) (a.jumlahPutaran * l.HitungKelilingLapangan(panjangLapangan, lebarLapangan));
    }
}
