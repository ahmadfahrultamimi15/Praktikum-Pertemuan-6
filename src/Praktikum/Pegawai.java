package Praktikum;

public class Pegawai {
    double gPkok ;
    private String Nama;
    public double getgPkok(){
        return gPkok;
    }
    public void setgPkok(double gPkok) {
        gPkok = gPkok;
    }
    public void setNama(String nama) {
        Nama = nama;
    }
    public String getNama(){
        return Nama;
    }
    public void info(){
        System.out.println("Nama Pegawai    : "+ this.getNama());
        System.out.println("Gaji Pegawai    : " + this.getgPkok());
    }
    Pegawai(String Nama){
        this.Nama = Nama;
    }
    Pegawai(String Nama,double gPkok){
        this.Nama = Nama;
        this.gPkok =gPkok;
    }
}
