/**
 * Aufgabe2Loesung.java – Musterloesung fuer Aufgabe 2 (Kontrollstrukturen)
 *
 * WO SPEICHERN: solutions/Aufgabe2Loesung.java
 *
 * Kompilieren: javac Aufgabe2Loesung.java
 * Ausfuehren:  java Aufgabe2Loesung
 */
public class Aufgabe2Loesung {

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
    // Aufgabe 2.1 – Ampel
    // -----------------------------------------------
    static void aufgabe1() {
        System.out.println("=== Aufgabe 2.1 – Ampel ===");

        String farbe = "gruen";   // Aendere diesen Wert zum Testen

        if (farbe.equals("rot")) {
            System.out.println("Anhalten!");
        } else if (farbe.equals("gelb")) {
            System.out.println("Vorsicht – gleich rot oder gruen");
        } else if (farbe.equals("gruen")) {
            System.out.println("Fahren!");
        } else {
            System.out.println("Unbekannte Farbe: " + farbe);
        }
    }

    // -----------------------------------------------
    // Aufgabe 2.2 – Notenrechner
    // -----------------------------------------------
    static void aufgabe2() {
        System.out.println("=== Aufgabe 2.2 – Notenrechner ===");

        // Teste verschiedene Werte: 95, 80, 65, 55, 30
        int[] testPunkte = {95, 80, 65, 55, 30};

        for (int punkte : testPunkte) {
            String note;

            if (punkte >= 90) {
                note = "Sehr gut";
            } else if (punkte >= 75) {
                note = "Gut";
            } else if (punkte >= 60) {
                note = "Befriedigend";
            } else if (punkte >= 50) {
                note = "Ausreichend";
            } else {
                note = "Nicht bestanden";
            }

            System.out.println(punkte + " Punkte: " + note);
        }
    }

    // -----------------------------------------------
    // Aufgabe 2.3 – Jahreszeit mit switch
    // -----------------------------------------------
    static void aufgabe3() {
        System.out.println("=== Aufgabe 2.3 – Jahreszeit ===");

        int monat = 4;   // Aendere diesen Wert zum Testen

        switch (monat) {
            case 12:
            case 1:
            case 2:
                System.out.println("Monat " + monat + ": Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Monat " + monat + ": Fruehling");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Monat " + monat + ": Sommer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Monat " + monat + ": Herbst");
                break;
            default:
                System.out.println("Ungueltiger Monat: " + monat);
        }
    }

    // -----------------------------------------------
    // Aufgabe 2.4 – Ticketpreis
    // -----------------------------------------------
    static void aufgabe4() {
        System.out.println("=== Aufgabe 2.4 – Ticketpreis ===");

        int alter = 14;
        boolean hatErmaessigung = true;

        double preis;

        if (alter < 6) {
            preis = 0;
            System.out.println("Kategorie: Kleinkind");
        } else if (alter < 18) {
            preis = 6;
            System.out.println("Kategorie: Kind/Jugendlicher");
        } else if (alter < 65) {
            preis = 12;
            System.out.println("Kategorie: Erwachsener");
        } else {
            preis = 8;
            System.out.println("Kategorie: Senior");
        }

        if (hatErmaessigung) {
            preis = preis - 2;
            if (preis < 0) {
                preis = 0;
            }
            System.out.println("Ermaessigung wird angewendet (-2 Euro)");
        }

        System.out.println("Endpreis: " + preis + " Euro");
    }
}
