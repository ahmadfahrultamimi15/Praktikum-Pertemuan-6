package Praktikum;

public class testPayroll {
    public static void main(String args[]) {
        Programmer Anton;
        Anton = new Programmer("ANTON",80000,5000);
        Manager Riko;
        Riko = new Manager("RIKO",80000,10000);
        System.out.println("Manager: ");
        System.out.println("=====================================");
        Riko.info();
        System.out.println();
        System.out.println("Programmer: ");
        System.out.println("=====================================");
        Anton.info();
        System.out.println();
    }
}