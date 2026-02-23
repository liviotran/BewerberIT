/**
 * KontrollstrukturenBeispiel.java
 *
 * WO SPEICHERN: examples/KontrollstrukturenBeispiel.java
 *
 * Kompilieren: javac KontrollstrukturenBeispiel.java
 * Ausfuehren:  java KontrollstrukturenBeispiel
 *
 * Dieses Programm zeigt, wie man Entscheidungen in Java trifft.
 */
public class KontrollstrukturenBeispiel {

    public static void main(String[] args) {

        // -----------------------------------------------
        // TEIL 1: Einfaches if
        // -----------------------------------------------

        System.out.println("=== Einfaches if ===");

        int temperatur = 28;

        if (temperatur > 25) {
            System.out.println("Es ist heiss! Trink viel Wasser.");
        }

        System.out.println("Temperatur: " + temperatur + " Grad");

        // -----------------------------------------------
        // TEIL 2: if und else
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== if und else ===");

        int alter = 17;

        if (alter >= 18) {
            System.out.println("Zutritt erlaubt.");
        } else {
            System.out.println("Zutritt verweigert. Du bist zu jung.");
        }

        // -----------------------------------------------
        // TEIL 3: Noten mit else if
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== Notenberechnung ===");

        int punkte = 72;
        System.out.println("Erzielte Punkte: " + punkte);

        if (punkte >= 90) {
            System.out.println("Note: Sehr gut");
        } else if (punkte >= 75) {
            System.out.println("Note: Gut");
        } else if (punkte >= 60) {
            System.out.println("Note: Befriedigend");
        } else if (punkte >= 50) {
            System.out.println("Note: Ausreichend");
        } else {
            System.out.println("Note: Nicht bestanden");
        }

        // -----------------------------------------------
        // TEIL 4: Mehrere Bedingungen verknuepfen
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== Bedingungen verknuepfen ===");

        boolean hatTicket = true;
        boolean istVolljährig = true;

        // && bedeutet UND - beide muessen wahr sein
        if (hatTicket && istVolljährig) {
            System.out.println("Einlass gewaehrt!");
        } else {
            System.out.println("Kein Einlass.");
        }

        // || bedeutet ODER - mindestens eine muss wahr sein
        boolean istKind = false;
        boolean istSenior = true;

        if (istKind || istSenior) {
            System.out.println("Ermaessigter Eintritt: 5 Euro");
        } else {
            System.out.println("Normaler Eintritt: 12 Euro");
        }

        // -----------------------------------------------
        // TEIL 5: switch fuer viele feste Werte
        // -----------------------------------------------

        System.out.println();
        System.out.println("=== switch ===");

        int wochentag = 3;

        switch (wochentag) {
            case 1:
                System.out.println("Montag - Wochenstart");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch - Wochenmitte");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag - fast Wochenende!");
                break;
            case 6:
            case 7:
                System.out.println("Wochenende!");
                break;
            default:
                System.out.println("Ungueltiger Tag (1-7 erlaubt)");
        }

        // -----------------------------------------------
        // AUSPROBIEREN:
        // Aendere "alter", "punkte" oder "wochentag" und starte neu!
        // -----------------------------------------------
    }
}
