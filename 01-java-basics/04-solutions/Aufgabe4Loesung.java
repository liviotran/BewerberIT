/**
 * Aufgabe4Loesung.java – Musterloesung fuer Aufgabe 4 (Methoden)
 *
 * WO SPEICHERN: solutions/Aufgabe4Loesung.java
 *
 * Kompilieren: javac Aufgabe4Loesung.java
 * Ausfuehren:  java Aufgabe4Loesung
 */
public class Aufgabe4Loesung {

    // -----------------------------------------------
    // Aufgabe 4.1 – Begruessung
    // -----------------------------------------------
    static void begruessung(String name) {
        System.out.println("Willkommen, " + name + "! Schoen, dass du dabei bist.");
    }

    // -----------------------------------------------
    // Aufgabe 4.2 – Groessere Zahl
    // -----------------------------------------------
    static int groessereZahl(int a, int b) {
        if (a >= b) {
            return a;
        } else {
            return b;
        }
    }

    // -----------------------------------------------
    // Aufgabe 4.3 – Temperaturumrechner
    // -----------------------------------------------
    static double celsiusZuFahrenheit(double celsius) {
        return celsius * 9.0 / 5.0 + 32;
    }

    static double fahrenheitZuCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // -----------------------------------------------
    // Aufgabe 4.4 – Sternzeile
    // -----------------------------------------------
    static void sternzeile(int anzahl) {
        for (int i = 0; i < anzahl; i++) {
            System.out.print("* ");
        }
        System.out.println();
    }

    // -----------------------------------------------
    // Aufgabe 4.5 – Primzahl pruefen
    // -----------------------------------------------
    static boolean istPrimzahl(int zahl) {
        if (zahl < 2) {
            return false;
        }
        // Pruefe ob zahl durch irgendeine Zahl von 2 bis zahl-1 teilbar ist
        for (int i = 2; i < zahl; i++) {
            if (zahl % i == 0) {
                return false;   // teilbar -> keine Primzahl
            }
        }
        return true;   // nicht teilbar -> Primzahl
    }

    // -----------------------------------------------
    // MAIN – hier werden die Methoden aufgerufen
    // -----------------------------------------------
    public static void main(String[] args) {

        System.out.println("=== Aufgabe 4.1 – Begruessung ===");
        begruessung("Anna");
        begruessung("Max");
        begruessung("Sophie");

        System.out.println();
        System.out.println("=== Aufgabe 4.2 – Groessere Zahl ===");
        System.out.println(groessereZahl(5, 12));    // 12
        System.out.println(groessereZahl(20, 7));    // 20
        System.out.println(groessereZahl(8, 8));     // 8

        System.out.println();
        System.out.println("=== Aufgabe 4.3 – Temperatur ===");
        System.out.println("0 Grad Celsius = " + celsiusZuFahrenheit(0) + " Fahrenheit");
        System.out.println("100 Grad Celsius = " + celsiusZuFahrenheit(100) + " Fahrenheit");
        System.out.println("212 Fahrenheit = " + fahrenheitZuCelsius(212) + " Celsius");

        System.out.println();
        System.out.println("=== Aufgabe 4.4 – Sterndreieck ===");
        for (int i = 1; i <= 5; i++) {
            sternzeile(i);
        }

        System.out.println();
        System.out.println("=== Aufgabe 4.5 – Primzahlen bis 50 ===");
        System.out.print("Primzahlen: ");
        for (int i = 2; i <= 50; i++) {
            if (istPrimzahl(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
}
