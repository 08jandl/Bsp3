package edu.campus02;

public class Main {

    public static void main(String[] args) {
	// write your code here

        dauer(6);

    }
    public static int dauer (int station) {
        if (station == 1) {
            System.out.println("Noch 20 min");
        } else if (station == 2) {
            System.out.println("Noch 16 min");
        } else if (station == 3) {
            System.out.println("Noch 15 min");
        } else if (station == 4) {
            System.out.println("Noch 10 min");
        } else if (station == 5) {
            System.out.println("Noch 3 min");
        } else if (station == 6) {
            System.out.println("Warnung: Aussteigen!");
        } else {
            System.out.println("vorbei");
        }
        return station;
    }
}
