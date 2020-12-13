package Practica;

public class MainCartera {

    public static void main(String[] args) {
        Cartera cartera = new Cartera(0);

        Client clientes = new Client(cartera);
        for (int i = 0; i < 10; i++) {
            clientes = new Client(cartera);
            clientes.start();
            
        }

        Worker worka = new Worker(cartera);
        for (int i = 0; i < 10; i++) {
            worka = new Worker(cartera);
            worka.start();
            
        }
    }

}
