/**
 * Auto.java
 *
 * WO SPEICHERN: examples/Auto.java
 * (Zusammen mit AutoTest.java im selben Ordner)
 *
 * Kompilieren: javac Auto.java AutoTest.java
 * Ausfuehren:  java AutoTest
 *
 * Das ist ein Beispiel fuer eine eigene Klasse.
 * Diese Datei enthaelt den BAUPLAN fuer ein Auto.
 * Die Datei AutoTest.java benutzt diesen Bauplan.
 */
public class Auto {

    // -----------------------------------------------
    // ATTRIBUTE: Was hat ein Auto? (seine Eigenschaften)
    // -----------------------------------------------

    String marke;
    String farbe;
    int baujahr;
    int aktuelleGeschwindigkeit;

    // -----------------------------------------------
    // KONSTRUKTOR: Wird beim Erstellen aufgerufen
    // -----------------------------------------------

    public Auto(String marke, String farbe, int baujahr) {
        this.marke = marke;
        this.farbe = farbe;
        this.baujahr = baujahr;
        this.aktuelleGeschwindigkeit = 0;  // steht am Anfang still
    }

    // -----------------------------------------------
    // METHODEN: Was kann ein Auto machen?
    // -----------------------------------------------

    public void beschleunigen(int kmh) {
        aktuelleGeschwindigkeit = aktuelleGeschwindigkeit + kmh;
        System.out.println(marke + " beschleunigt auf " + aktuelleGeschwindigkeit + " km/h");
    }

    public void bremsen(int kmh) {
        aktuelleGeschwindigkeit = aktuelleGeschwindigkeit - kmh;
        if (aktuelleGeschwindigkeit < 0) {
            aktuelleGeschwindigkeit = 0;   // Geschwindigkeit kann nicht negativ sein
        }
        System.out.println(marke + " verlangsamt auf " + aktuelleGeschwindigkeit + " km/h");
    }

    public void hupen() {
        System.out.println(marke + ": Tuuuut!");
    }

    public void zeigeInfo() {
        System.out.println("--- Auto-Info ---");
        System.out.println("Marke:          " + marke);
        System.out.println("Farbe:          " + farbe);
        System.out.println("Baujahr:        " + baujahr);
        System.out.println("Geschwindigkeit:" + aktuelleGeschwindigkeit + " km/h");
    }
}
