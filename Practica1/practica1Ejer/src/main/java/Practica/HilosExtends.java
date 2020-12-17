package Practica;

public class HilosExtends extends Thread {

    static int contador = 0;

    public void run() {

        int miliseconds = (int) (Math.random() * 5 + 1); // Es necesario poner el (int) antes de Math.ramdom() sino
                                                         // no tira
        // Introduciendo el int, marcamos a que el MathRandom solo haga con int y no con
        // double, como lo hace de manera predefinida.
        contador++;
        System.out.println("Soy el hilo hijo " + contador + " y me pongo a dormir " + miliseconds + " segundos");

        try {
            Thread.sleep(miliseconds * 1000);

            System.out.println("Soy el hilo " + contador + " y he terminado de dormir!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
