package Practica;

public class HilosTareas implements Runnable {
    int contador = 0;

    @Override
    public void run() {

        for (int i = 0; i < 100; i++) {

            contador++;

            int miliseconds = (int) (Math.random() * 5 + 1); // Es necesario poner el (int) antes de Math.ramdom() sino no tira 
                            //Introduciendo el int, marcamos a que el MathRandom solo haga con int y no con double, como lo hace de manera predefinida. 

            System.out.println("Soy el hilo hijo " + contador + " y me pongo a dormir " + miliseconds + " segundos");

            try {
                Thread.sleep(miliseconds * 1000);

                System.out.println("Soy el hilo " + contador + " y he terminado de dormir!");
            } catch (Exception e) {
                e.printStackTrace();
            }

        }

    }

    public static void main(String[] args) {
        Runnable h1 = new HilosTareas();
        new Thread(h1).start();

    }
}
