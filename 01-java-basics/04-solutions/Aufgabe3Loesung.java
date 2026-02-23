/**
 * Aufgabe3Loesung.java – Musterloesung fuer Aufgabe 3 (Schleifen)
 *
 * WO SPEICHERN: solutions/Aufgabe3Loesung.java
 *
 * Kompilieren: javac Aufgabe3Loesung.java
 * Ausfuehren:  java Aufgabe3Loesung
 */
public class Aufgabe3Loesung {

    public static void main(String[] args) {

        aufgabe1();
        System.out.println();
        aufgabe2();
        System.out.println();
        aufgabe3();
        System.out.println();
        aufgabe4();
        System.out.println();
        aufgabe5();
    }

    // -----------------------------------------------
    // Aufgabe 3.1 – Gerade Zahlen ausgeben
    // -----------------------------------------------
    static void aufgabe1() {
        System.out.println("=== Aufgabe 3.1 – Gerade Zahlen ===");

        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();
    }

    // -----------------------------------------------
    // Aufgabe 3.2 – FizzBuzz
    // -----------------------------------------------
    static void aufgabe2() {
        System.out.println("=== Aufgabe 3.2 – FizzBuzz ===");

        for (int i = 1; i <= 30; i++) {
            if (i % 15 == 0) {          // Durch 3 UND 5 teilbar: zuerst pruefen!
                System.out.print("FizzBuzz ");
            } else if (i % 3 == 0) {
                System.out.print("Fizz ");
            } else if (i % 5 == 0) {
                System.out.print("Buzz ");
            } else {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }

    // -----------------------------------------------
    // Aufgabe 3.3 – Sternmuster
    // -----------------------------------------------
    static void aufgabe3() {
        System.out.println("=== Aufgabe 3.3 – Sternmuster ===");

        for (int zeile = 1; zeile <= 5; zeile++) {
            // Innere Schleife: so viele Sterne wie die Zeilennummer
            for (int stern = 1; stern <= zeile; stern++) {
                System.out.print("* ");
            }
            System.out.println();   // Zeilenumbruch nach jeder Zeile
        }
    }

    // -----------------------------------------------
    // Aufgabe 3.4 – Verdoppeln bis 1000
    // -----------------------------------------------
    static void aufgabe4() {
        System.out.println("=== Aufgabe 3.4 – Verdoppeln ===");

        int zahl = 1;
        int schritt = 0;

        while (zahl <= 1000) {
            zahl = zahl * 2;
            schritt++;
            System.out.println("Schritt " + schritt + ": " + zahl);
        }

        System.out.println("Fertig nach " + schritt + " Schritten!");
    }

    // -----------------------------------------------
    // Aufgabe 3.5 – Einmaleins-Tabelle
    // -----------------------------------------------
    static void aufgabe5() {
        System.out.println("=== Aufgabe 3.5 – Einmaleins ===");

        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.printf("%4d", i * j);   // 4 Zeichen breit, rechtsbündig
            }
            System.out.println();   // neue Zeile nach jeder Reihe
        }
    }
}
