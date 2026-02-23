/**
 * MethodenBeispiel.java
 *
 * WO SPEICHERN: examples/MethodenBeispiel.java
 *
 * Kompilieren: javac MethodenBeispiel.java
 * Ausfuehren:  java MethodenBeispiel
 *
 * Dieses Programm zeigt, wie Methoden definiert und aufgerufen werden.
 */
public class MethodenBeispiel {

    // -----------------------------------------------
    // METHODEN werden AUSSERHALB von main definiert,
    // aber INNERHALB der Klasse
    // -----------------------------------------------

    // Methode ohne Parameter und ohne Rueckgabewert
    public static void zeigeUeberschrift() {
        System.out.println("========================");
        System.out.println("   Methoden-Beispiel    ");
        System.out.println("========================");
    }

    // Methode mit einem Parameter (kein Rueckgabewert)
    public static void begruessung(String name) {
        System.out.println("Hallo, " + name + "! Willkommen.");
    }

    // Methode mit zwei Parametern (kein Rueckgabewert)
    public static void zeigeInfo(String name, int alter) {
        System.out.println(name + " ist " + alter + " Jahre alt.");
    }

    // Methode mit Rueckgabewert: gibt eine ganze Zahl (int) zurueck
    public static int addiere(int a, int b) {
        return a + b;   // "return" schickt das Ergebnis zurueck
    }

    // Methode mit Rueckgabewert: gibt eine Kommazahl (double) zurueck
    public static double kreisflaeche(double radius) {
        double flaeche = 3.14159 * radius * radius;
        return flaeche;
    }

    // Methode mit Rueckgabewert: gibt einen Text (String) zurueck
    public static String erstelleBegruessung(String name, String ort) {
        return "Hallo " + name + " aus " + ort + "!";
    }

    // Methode die eine Entscheidung trifft und true/false zurueckgibt
    public static boolean istVolljaehrig(int alter) {
        return alter >= 18;
    }


    // -----------------------------------------------
    // MAIN - hier werden die Methoden aufgerufen
    // -----------------------------------------------

    public static void main(String[] args) {

        // Methode ohne Parameter aufrufen
        zeigeUeberschrift();

        System.out.println();

        // Methode mit Parameter aufrufen
        begruessung("Anna");
        begruessung("Max");
        begruessung("Sophie");

        System.out.println();

        // Methode mit mehreren Parametern
        zeigeInfo("Tom", 25);
        zeigeInfo("Lisa", 32);

        System.out.println();
        System.out.println("=== Methoden mit Rueckgabewert ===");

        // Ergebnis in Variable speichern
        int summe = addiere(5, 3);
        System.out.println("5 + 3 = " + summe);

        // Ergebnis direkt verwenden
        System.out.println("10 + 20 = " + addiere(10, 20));

        // Kreisflaeche berechnen
        double radius = 5.0;
        double flaeche = kreisflaeche(radius);
        System.out.println("Kreisflaeche (r=" + radius + "): " + flaeche);

        // String-Rueckgabe
        String gruss = erstelleBegruessung("Klaus", "Berlin");
        System.out.println(gruss);

        // Boolean-Rueckgabe in if verwenden
        System.out.println();
        System.out.println("=== Volljaehrigkeits-Check ===");

        int[] alterListe = {15, 18, 21, 12};

        for (int a : alterListe) {
            if (istVolljaehrig(a)) {
                System.out.println("Alter " + a + ": volljaehrig");
            } else {
                System.out.println("Alter " + a + ": minderjährig");
            }
        }
    }
}
