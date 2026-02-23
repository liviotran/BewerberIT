/**
 * Aufgabe1Loesung.java – Musterloesung fuer Aufgabe 1 (Variablen)
 *
 * WO SPEICHERN: solutions/Aufgabe1Loesung.java
 *
 * Kompilieren: javac Aufgabe1Loesung.java
 * Ausfuehren:  java Aufgabe1Loesung
 */
public class Aufgabe1Loesung {

    public static void main(String[] args) {

        aufgabe1();
        System.out.println();
        aufgabe2();
        System.out.println();
        aufgabe3();
        System.out.println();
        aufgabe4();
    }

    // -----------------------------------------------
    // Aufgabe 1.1 – Steckbrief
    // -----------------------------------------------
    static void aufgabe1() {
        System.out.println("=== Aufgabe 1.1 – Steckbrief ===");

        String name = "Anna Muster";
        int alter = 21;
        double groesse = 1.68;
        boolean amLernen = true;

        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter + " Jahre");
        System.out.println("Groesse: " + groesse + " m");
        System.out.println("Am Lernen: " + amLernen);
    }

    // -----------------------------------------------
    // Aufgabe 1.2 – Einkauf berechnen
    // -----------------------------------------------
    static void aufgabe2() {
        System.out.println("=== Aufgabe 1.2 – Einkauf ===");

        double brot = 2.49;
        double milch = 1.19;
        double kaese = 3.79;

        double gesamt = brot + milch + kaese;

        System.out.println("Brot:   " + brot + " Euro");
        System.out.println("Milch:  " + milch + " Euro");
        System.out.println("Kaese:  " + kaese + " Euro");
        System.out.println("Gesamt: " + gesamt + " Euro");
    }

    // -----------------------------------------------
    // Aufgabe 1.3 – Zeitumrechnung
    // -----------------------------------------------
    static void aufgabe3() {
        System.out.println("=== Aufgabe 1.3 – Zeitumrechnung ===");

        int sekunden = 3725;

        int stunden = sekunden / 3600;
        int restSekunden = sekunden % 3600;
        int minuten = restSekunden / 60;
        int sek = restSekunden % 60;

        System.out.println(sekunden + " Sekunden sind:");
        System.out.println(stunden + " Stunden, " + minuten + " Minuten, " + sek + " Sekunden");
    }

    // -----------------------------------------------
    // Aufgabe 1.4 – Kreis berechnen
    // -----------------------------------------------
    static void aufgabe4() {
        System.out.println("=== Aufgabe 1.4 – Kreis ===");

        double radius = 5.0;
        double pi = 3.14159;

        double umfang = 2 * pi * radius;
        double flaeche = pi * radius * radius;

        System.out.println("Radius: " + radius);
        System.out.println("Umfang: " + umfang);
        System.out.println("Flaeche: " + flaeche);
    }
}
