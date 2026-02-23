/**
 * MiniprojektLoesung.java – Musterloesung fuer das Miniprojekt (Kontaktbuch)
 *
 * WO SPEICHERN: solutions/MiniprojektLoesung.java
 *
 * Hinweis: In einem echten Projekt waeren Kontakt und Kontaktbuch
 * in separaten Dateien. Hier sind beide in einer Datei zusammengefasst.
 *
 * Kompilieren: javac MiniprojektLoesung.java
 * Ausfuehren:  java Kontaktbuch
 */

// ===================================================
// KLASSE: Kontakt – der Bauplan fuer einen Kontakt
// ===================================================
class Kontakt {

    // Attribute: Was hat ein Kontakt?
    String name;
    String telefon;
    String email;
    int alter;

    // Konstruktor: Wie wird ein Kontakt erstellt?
    public Kontakt(String name, String telefon, String email, int alter) {
        this.name = name;
        this.telefon = telefon;
        this.email = email;
        this.alter = alter;
    }

    // Methode: Alle Infos anzeigen
    public void anzeigen() {
        System.out.println("Name:     " + name);
        System.out.println("Telefon:  " + telefon);
        System.out.println("E-Mail:   " + email);
        System.out.println("Alter:    " + alter + " Jahre");
    }

    // Methode: Ist die Person volljaehrig?
    public boolean istVolljaehrig() {
        return alter >= 18;
    }

    // Methode: Kurze Info als Text
    public String getKurzinfo() {
        return name + " (" + telefon + ")";
    }
}


// ===================================================
// HAUPTPROGRAMM: Kontaktbuch
// ===================================================
public class Kontaktbuch {

    // Hilfsmethode: Aeltesten Kontakt finden
    static Kontakt findeAeltesten(Kontakt[] kontakte) {
        Kontakt aeltester = kontakte[0];   // starte mit dem ersten

        for (int i = 1; i < kontakte.length; i++) {
            if (kontakte[i].alter > aeltester.alter) {
                aeltester = kontakte[i];   // neuer Aeltester gefunden
            }
        }

        return aeltester;
    }

    public static void main(String[] args) {

        // Kontakte erstellen
        Kontakt[] kontakte = new Kontakt[4];
        kontakte[0] = new Kontakt("Anna Müller", "0151-11111111", "anna@mail.de", 28);
        kontakte[1] = new Kontakt("Max Schmidt", "0152-22222222", "max@mail.de", 16);
        kontakte[2] = new Kontakt("Sara Weber",  "0153-33333333", "sara@mail.de", 67);
        kontakte[3] = new Kontakt("Tom Koch",    "0154-44444444", "tom@mail.de", 42);

        // 1. Alle Kontakte anzeigen
        System.out.println("=== Alle Kontakte ===");
        System.out.println();

        for (int i = 0; i < kontakte.length; i++) {
            kontakte[i].anzeigen();
            System.out.println();
        }

        // 2. Volljaehrige anzeigen
        System.out.println("=== Volljaehrige Kontakte ===");

        for (int i = 0; i < kontakte.length; i++) {
            if (kontakte[i].istVolljaehrig()) {
                System.out.println(kontakte[i].getKurzinfo());
            }
        }

        // 3. Aeltesten finden
        System.out.println();
        System.out.println("=== Aeltester Kontakt ===");
        Kontakt aeltester = findeAeltesten(kontakte);
        System.out.println(aeltester.name + " (" + aeltester.alter + " Jahre)");
    }
}
