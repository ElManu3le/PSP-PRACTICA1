package Practica;

public class App // Clase que implementa la interfaz Runnable
{
    public static void main(String[] args) {
        HilosExtends[] hilosExtends = new HilosExtends[100];
        for (HilosExtends listahilos : hilosExtends) {
            listahilos = new HilosExtends();
            listahilos.start();

        }

    }

}
