/**
 * AutoTest.java
 *
 * WO SPEICHERN: examples/AutoTest.java
 * (Zusammen mit Auto.java im selben Ordner)
 *
 * Kompilieren: javac Auto.java AutoTest.java
 * Ausfuehren:  java AutoTest
 *
 * Diese Datei BENUTZT den Bauplan aus Auto.java.
 * Hier werden konkrete Auto-Objekte erstellt und gesteuert.
 */
public class AutoTest {

    public static void main(String[] args) {

        System.out.println("=== Auto-Simulation ===");
        System.out.println();

        // Ein Auto-Objekt erstellen
        // "new Auto(...)" sagt: baue ein Auto nach dem Bauplan
        Auto meinAuto = new Auto("VW Golf", "Silber", 2021);
        Auto sportWagen = new Auto("BMW M3", "Blau", 2023);

        // Infos ausgeben
        meinAuto.zeigeInfo();
        System.out.println();
        sportWagen.zeigeInfo();

        System.out.println();
        System.out.println("=== Fahrt beginnt ===");

        // Mein Auto fahren
        meinAuto.beschleunigen(50);
        meinAuto.beschleunigen(30);
        meinAuto.hupen();
        meinAuto.bremsen(20);
        meinAuto.bremsen(80);   // bremst bis auf 0

        System.out.println();

        // Der Sportwagen ist voellig unabhaengig!
        // Aenderungen am Sportwagen beeinflussen meinAuto nicht.
        sportWagen.beschleunigen(100);
        sportWagen.beschleunigen(50);
        sportWagen.hupen();

        System.out.println();
        System.out.println("=== Aktueller Stand ===");

        // Beide Autos zeigen ihren aktuellen Zustand
        meinAuto.zeigeInfo();
        System.out.println();
        sportWagen.zeigeInfo();
    }
}
