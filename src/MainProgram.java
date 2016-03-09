package BAB2;

import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int jumlah_mahasiswa;
        jumlah_mahasiswa = sc.nextInt();
        sc.nextLine();
        Lapangan ukur = new Lapangan();
        System.out.println(ukur.panjangLapangan + " " + ukur.lebarLapangan);
        Mahasiswa array[] = new Mahasiswa[jumlah_mahasiswa];
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            array[i] = new Mahasiswa();
            String input = sc.nextLine();
            array[i].InsertDataMahasiswa(input);
        }
        System.out.println();
        
        for (int i = 0; i < jumlah_mahasiswa; i++) {
            array[i].DisplayMessage();
        }
        
        array[0].PenentuanPemenang(array);
    }
}
