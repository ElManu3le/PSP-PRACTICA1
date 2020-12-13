package Practica;

public class Cartera{
    private double money;

    public Cartera(double money) {
        this.money = money;
    }

    synchronized void addmoney(double cuantity){
        System.out.println("Dinero depositado: " + cuantity + " total de: " + (money += cuantity));

    }

    synchronized void lessmoney(double cuantity){
        System.out.println("Dinero extraido: " + cuantity + " total de: " + (money -= cuantity));

    }

    
}
