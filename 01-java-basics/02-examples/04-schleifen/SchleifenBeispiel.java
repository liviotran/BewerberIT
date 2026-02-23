/**
 * SchleifenBeispiel.java
 *
 * WO SPEICHERN: examples/SchleifenBeispiel.java
 *
 * Kompilieren: javac SchleifenBeispiel.java
 * Ausfuehren:  java SchleifenBeispiel
 *
 * Dieses Programm zeigt alle drei Schleifenarten in Java.
 */
public class SchleifenBeispiel {

    public static void main(String[] args) {

        // -----------------------------------------------
        // TEIL 1: for-Schleife
        // Benutzen wenn du weisst wie oft du wiederholen willst
        // -----------------------------------------------

        System.out.println("=== for-Schleife: Vorwaerts zaehlen ===");

        for (int i = 1; i <= 5; i++) {
            System.out.println("Schritt " + i);
        }

        System.out.println();
        System.out.println("=== for-Schleife: Einmaleins von 3 ===");

        for (int i = 1; i <= 10; i++) {
            System.out.println("3 x " + i + " = " + (3 * i));
        }

        System.out.println();
        System.out.println("=== for-Schleife: Summe berechnen ===");

        int summe = 0;
        for (int i = 1; i <= 10; i++) {
            summe = summe + i;   // addiere i zur Gesamtsumme
        }
        System.out.println("1 + 2 + 3 + ... + 10 = " + summe);

        // -----------------------------------------------
        // TEIL 2: while-Schleife
        // Benutzen wenn du nicht weisst wie oft du wiederholen willst
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== while-Schleife: Halbieren ===");

        int zahl = 100;
        int schritt = 0;

        while (zahl > 1) {
            System.out.println("Schritt " + schritt + ": " + zahl);
            zahl = zahl / 2;
            schritt++;
        }
        System.out.println("Fertig! Letzter Wert: " + zahl);

        // -----------------------------------------------
        // TEIL 3: do-while-Schleife
        // Wird immer mindestens einmal ausgefuehrt
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== do-while-Schleife: Countdown ===");

        int countdown = 5;

        do {
            System.out.println("Countdown: " + countdown);
            countdown--;
        } while (countdown > 0);

        System.out.println("Start!");

        // -----------------------------------------------
        // TEIL 4: break und continue
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== break: Schleife vorzeitig beenden ===");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Gefunden bei " + i + ", hoere auf.");
                break;   // Schleife verlassen
            }
            System.out.println("Pruefe: " + i);
        }

        System.out.println();
        System.out.println("=== continue: Durchlauf ueberspringen ===");

        System.out.print("Nur ungerade Zahlen: ");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;   // gerade Zahlen ueberspringen
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // -----------------------------------------------
        // TEIL 5: Verschachtelte Schleifen (Schleife in Schleife)
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== Sternmuster (verschachtelte Schleifen) ===");

        for (int zeile = 1; zeile <= 5; zeile++) {
            for (int stern = 1; stern <= zeile; stern++) {
                System.out.print("* ");
            }
            System.out.println();   // Zeilenumbruch nach jeder Zeile
        }

        // -----------------------------------------------
        // AUSPROBIEREN:
        // Aendere die Start- und Endwerte der Schleifen!
        // Was passiert wenn du "10" bei der Summe durch "100" ersetzt?
        // -----------------------------------------------
    }
}
