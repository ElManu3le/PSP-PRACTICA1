package Practica;

public class Client implements Runnable {

    private Cartera cartera;

    public Client(Cartera cartera) { //Constructor que permite funcionar al MainCartera a la hora e crear los clientes
        this.cartera = cartera;
	}

	

	@Override
    public void run() {
        while (true) { // bucle infinito 

            try {
                Thread.sleep(1000);//El cliente duerme surante 1segundo 
                cartera.addmoney(Math.random() * 100); //Añade dinero de manera aleatoria entre 0 y 100 uds de dinero
            } catch (InterruptedException e) {
                
                e.printStackTrace();
            }

        }

    }



	public void start() {
	}

}
