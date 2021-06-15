package Practica;

public class Cartera {
    private double money;

    public Cartera(double money) {
        this.money = money;
    }

    /** Este metodo se encarga de ir añadiendo dinero */
    synchronized void addmoney(double cuantity) {
        System.out.println("Dinero depositado: " + cuantity + " total de: " + (money += cuantity));

    }

    /** Metodo usado para ir disminuyendo la cantidad de dinero */
    synchronized void lessmoney(double cuantity) {
        System.out.println("Dinero extraido: " + cuantity + " total de: " + (money -= cuantity));

    }

}
