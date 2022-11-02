package Praktikum;

public class Manager extends Pegawai {
    private double Tunjangan;
    public double getTunjangan() {
        return Tunjangan;
    }
    public void setTunjangan(double Tunjangan) {
        Tunjangan = Tunjangan;
    }
    public void info(){
        super.info();
        System.out.println("Tunjangan       : " + this.getTunjangan());
    }
    Manager(String Nama, double gPkok, double Tunjangan) {
        super(Nama,gPkok);
        this.Tunjangan=Tunjangan;
    }
}
