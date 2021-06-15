package Practica;

public class Hilo extends Thread {

    int id;

    public Hilo(int id) {
        this.id = id;
    }

    public void run() {

        int miliseconds = (int) (Math.random() * 5 + 1); // Es necesario poner el (int) antes de Math.ramdom() sino
                                                         // no tira
        // Introduciendo el int, marcamos a que el MathRandom solo haga con int y no con
        // double, como lo hace de manera predefinida.

        System.out.println("Soy el hilo hijo " + id + " y me pongo a dormir " + miliseconds + " segundos");

        try {
            Thread.sleep(miliseconds * 1000);

            System.out.println("Soy el hilo " + id + " y he terminado de dormir!");
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
