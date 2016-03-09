package BAB2;

public class Mahasiswa {

    public String nama_mahasiswa, nim;
    public int jumlahPutaran, jumlahWaktu;

    public Mahasiswa() {
        nama_mahasiswa = "";
        nim = "";
        jumlahPutaran = 0;
        jumlahWaktu = 0;
    }

    public Mahasiswa(String nama, String nim, int waktu, int putaran) {
        this.nama_mahasiswa = nama;
        this.nim = nim;
        this.jumlahWaktu = waktu;
        this.jumlahPutaran = putaran;
    }

    void InsertDataMahasiswa(String input) {
        String[] arraySplit = input.split(", ");
        if (arraySplit.length == 4) {
            this.nim = arraySplit[0];
            this.nama_mahasiswa = arraySplit[1];
            this.jumlahPutaran = Integer.parseInt(arraySplit[2]);
            this.jumlahWaktu = Integer.parseInt(arraySplit[3]);
        } else {
            System.out.println("Format salah! Data tidak diproses!");
        }
    }
    
     public double HitungWaktuTercepat(){
        return (double)this.jumlahWaktu / (double)this.jumlahPutaran;
    }
    
    public void PenentuanPemenang(Mahasiswa a[]){
        double tercepat = 0;
        int count = 0;
        tercepat = a[0].HitungWaktuTercepat();
        for (int i = 0; i < a.length; i++) {
            if (tercepat > a[i].HitungWaktuTercepat()) {
                tercepat = a[i].HitungWaktuTercepat();
                count++;
            }
        }
        System.out.println(a[count].nama_mahasiswa);
    }

    void DisplayMessage() {
        Lapangan lap = new Lapangan();
        System.out.println(this.nama_mahasiswa + " " + lap.HitungJarak((this), lap));
    }
}
