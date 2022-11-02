package Praktikum;

public class Programmer extends Pegawai {
    private double bonus;
    public double getBonus() {
        return bonus;
    }
    public void setBonus(double bonus) {
        bonus = bonus;
    }
    public void info(){
        super.info();
        System.out.println("Bonus           : " + this.getBonus());
    }
    Programmer(String Nama, double gPkok, double bonus) {
        super(Nama,gPkok);
        this.bonus = bonus;
    }
}
