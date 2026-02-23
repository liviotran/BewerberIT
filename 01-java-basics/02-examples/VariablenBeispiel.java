/**
 * VariablenBeispiel.java
 *
 * WO SPEICHERN: examples/VariablenBeispiel.java
 *
 * Kompilieren: javac VariablenBeispiel.java
 * Ausfuehren:  java VariablenBeispiel
 *
 * Dieses Programm zeigt, wie Variablen in Java funktionieren.
 * Schau es dir an, fuehre es aus und aendere die Werte!
 */
public class VariablenBeispiel {

    public static void main(String[] args) {

        // -----------------------------------------------
        // TEIL 1: Die vier wichtigsten Datentypen
        // -----------------------------------------------

        // int = ganze Zahlen (keine Kommastellen)
        int alter = 22;
        int punkte = 1500;

        // double = Zahlen mit Kommastellen (Punkt statt Komma!)
        double groesse = 1.78;
        double preis = 4.99;

        // String = Text (immer in doppelten Anfuehrungszeichen)
        String name = "Anna";
        String lieblingsstadt = "Hamburg";

        // boolean = ja oder nein (true oder false)
        boolean istStudent = true;
        boolean hatFuehrerschein = false;

        // -----------------------------------------------
        // TEIL 2: Variablen ausgeben
        // -----------------------------------------------

        System.out.println("=== Mein Steckbrief ===");
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter + " Jahre");
        System.out.println("Groesse: " + groesse + " m");
        System.out.println("Punkte: " + punkte);
        System.out.println("Lieblingsstadt: " + lieblingsstadt);
        System.out.println("Student: " + istStudent);
        System.out.println("Fuehrerschein: " + hatFuehrerschein);

        // -----------------------------------------------
        // TEIL 3: Rechnen mit Variablen
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== Rechnen ===");

        int a = 10;
        int b = 3;

        System.out.println("a = " + a + ", b = " + b);
        System.out.println("a + b = " + (a + b));   // 13
        System.out.println("a - b = " + (a - b));   // 7
        System.out.println("a * b = " + (a * b));   // 30
        System.out.println("a / b = " + (a / b));   // 3  (ganze Zahl - Rest wird abgeschnitten!)
        System.out.println("a % b = " + (a % b));   // 1  (Rest der Division)

        // Fuer Ergebnis mit Kommastellen: double verwenden
        double ergebnis = (double) a / b;
        System.out.println("a / b (mit Komma) = " + ergebnis);  // 3.333...

        // -----------------------------------------------
        // TEIL 4: Werte veraendern
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== Werte veraendern ===");

        int punktestand = 0;
        System.out.println("Start: " + punktestand);

        punktestand = punktestand + 10;
        System.out.println("Nach +10: " + punktestand);  // 10

        punktestand = punktestand + 25;
        System.out.println("Nach +25: " + punktestand);  // 35

        punktestand = punktestand * 2;
        System.out.println("Nach *2:  " + punktestand);  // 70

        // Kurzschreibweisen (machen dasselbe wie oben):
        punktestand += 5;   // = punktestand + 5
        System.out.println("Nach +=5: " + punktestand);  // 75

        punktestand++;      // = punktestand + 1
        System.out.println("Nach ++:  " + punktestand);  // 76

        // -----------------------------------------------
        // TEIL 5: Konstanten - Werte die sich nie aendern
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== Konstanten ===");

        final double MEHRWERTSTEUER = 0.19;
        final int MAX_PUNKTE = 100;

        double nettopreis = 50.0;
        double bruttopreis = nettopreis * (1 + MEHRWERTSTEUER);

        System.out.println("Nettopreis:  " + nettopreis + " Euro");
        System.out.println("Bruttopreis: " + bruttopreis + " Euro");
        System.out.println("Maximale Punkte: " + MAX_PUNKTE);

        // -----------------------------------------------
        // AUSPROBIEREN: Aendere die Werte oben und starte neu!
        // -----------------------------------------------
    }
}
