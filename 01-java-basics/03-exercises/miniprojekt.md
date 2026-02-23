# Miniprojekt – Einfaches Kontaktbuch

## Was du baust

Ein kleines Kontaktbuch. Du erstellst eine Klasse `Kontakt` (fuer eine Person im Adressbuch) und ein Hauptprogramm `Kontaktbuch`, das mehrere Kontakte verwaltet.

---

## Vorbereitung

Erstelle im Ordner `solutions/` zwei neue Dateien:
- `Kontakt.java` – der Bauplan fuer einen Kontakt
- `Kontaktbuch.java` – das Hauptprogramm

---

## Teil 1: Die Klasse `Kontakt`

### Was hat ein Kontakt? (Attribute)

- `name` (String) – vollstaendiger Name
- `telefon` (String) – Telefonnummer
- `email` (String) – E-Mail-Adresse
- `alter` (int) – Alter

### Wie wird ein Kontakt erstellt? (Konstruktor)

```java
public Kontakt(String name, String telefon, String email, int alter) {
    // alle Werte speichern
}
```

### Was kann ein Kontakt? (Methoden)

Schreibe diese drei Methoden:

**`void anzeigen()`** – gibt alle Daten des Kontakts aus:
```
Name:     Max Mustermann
Telefon:  0151-12345678
E-Mail:   max@beispiel.de
Alter:    35 Jahre
```

**`boolean istVolljaehrig()`** – gibt `true` zurueck wenn Alter >= 18

**`String getKurzinfo()`** – gibt Name und Telefon als Text zurueck:
`"Max Mustermann (0151-12345678)"`

---

## Teil 2: Das Hauptprogramm `Kontaktbuch`

Erstelle mindestens 4 Kontakte und lege sie in einem Array ab:

```java
Kontakt[] kontakte = new Kontakt[4];
kontakte[0] = new Kontakt("Anna Müller", "0151-11111111", "anna@mail.de", 28);
kontakte[1] = new Kontakt("Max Schmidt", "0152-22222222", "max@mail.de", 16);
kontakte[2] = new Kontakt("Sara Weber", "0153-33333333", "sara@mail.de", 67);
kontakte[3] = new Kontakt("Tom Koch", "0154-44444444", "tom@mail.de", 42);
```

Mache dann Folgendes:

**1. Alle Kontakte anzeigen**
Gehe mit einer Schleife durch alle Kontakte und rufe `anzeigen()` auf.

**2. Alle Volljaehrigen anzeigen**
Gehe durch alle Kontakte. Wenn `istVolljaehrig()` true ist, gib `getKurzinfo()` aus.

**3. Den aeltesten Kontakt finden**
Schreibe eine Methode `findeAeltesten(Kontakt[] kontakte)`, die den Kontakt mit dem hoechsten Alter zurueckgibt. Gib seinen Namen aus.

---

## Erwartete Ausgabe (Beispiel)

```
=== Alle Kontakte ===

Name:     Anna Müller
Telefon:  0151-11111111
E-Mail:   anna@mail.de
Alter:    28 Jahre

Name:     Max Schmidt
...

=== Volljaehrige Kontakte ===
Anna Müller (0151-11111111)
Sara Weber (0153-33333333)
Tom Koch (0154-44444444)

=== Aeltester Kontakt ===
Sara Weber (67 Jahre)
```

---

## Kompilieren und Ausfuehren

```
javac Kontakt.java Kontaktbuch.java
java Kontaktbuch
```

---

## Wenn du fertig bist

Schau dann in die Musterloesung: [../solutions/MiniprojektLoesung.java](../solutions/MiniprojektLoesung.java)
