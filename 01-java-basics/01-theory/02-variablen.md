# Kapitel 02 – Variablen

In diesem Kapitel lernst du, wie du Daten in deinem Programm speicherst und wieder abrufst.

---

## Was ist eine Variable?

Eine Variable ist ein **Behaelter mit einem Namen**, in dem du einen Wert speichern kannst.

Stell dir vor, du hast eine beschriftete Schachtel. Auf der Schachtel steht "alter" und darin liegt ein Zettel mit der Zahl 20. Jederzeit kannst du in die Schachtel schauen und den Wert 20 herausnehmen. Du kannst auch den alten Zettel rauswerfen und einen neuen Zettel (z.B. 21) hineinlegen.

```java
int alter = 20;   // Schachtel namens "alter" anlegen, Wert 20 hineinlegen
alter = 21;       // Den alten Wert durch 21 ersetzen
```

---

## Eine Variable anlegen

In Java muss man beim Anlegen einer Variable immer angeben, **welche Art von Wert** darin gespeichert wird. Das nennt man den **Datentyp**.

```java
int anzahl = 5;
```

Das bedeutet:
- `int` – der Datentyp (hier: eine ganze Zahl)
- `anzahl` – der Name der Variable (du darfst dir selbst einen Namen ausdenken)
- `=` – "bekommt den Wert"
- `5` – der Wert
- `;` – Ende der Anweisung

---

## Die wichtigsten Datentypen

Du brauchst zunaechst nur diese vier Datentypen:

### Ganze Zahlen: `int`

Fuer Zahlen ohne Komma: z.B. Alter, Punktestand, Anzahl

```java
int alter = 20;
int punktestand = 1500;
int temperatur = -3;
```

### Kommazahlen: `double`

Fuer Zahlen mit Nachkommastellen. In Java wird ein Punkt (.) als Komma verwendet, kein Komma!

```java
double preis = 9.99;
double groesse = 1.82;
double pi = 3.14159;
```

### Text: `String`

Fuer Woerter und Saetze. Text steht immer in doppelten Anfuehrungszeichen.

```java
String name = "Anna";
String begruessung = "Hallo, wie geht es dir?";
String stadt = "Berlin";
```

### Ja/Nein: `boolean`

Fuer Werte, die nur wahr (`true`) oder falsch (`false`) sein koennen.

```java
boolean istStudent = true;
boolean hatFuehrerschein = false;
boolean istVolljaehrig = true;
```

---

## Dein erstes Programm mit Variablen

### Schritt 1: Datei erstellen

Erstelle im Ordner `meine-uebungen` eine neue Datei: `MeineVariablen.java`

### Schritt 2: Code eintippen

```java
public class MeineVariablen {
    public static void main(String[] args) {

        // Variablen anlegen
        String name = "Anna";
        int alter = 20;
        double groesse = 1.65;
        boolean istStudent = true;

        // Variablen ausgeben
        System.out.println("Name: " + name);
        System.out.println("Alter: " + alter);
        System.out.println("Groesse: " + groesse);
        System.out.println("Student: " + istStudent);
    }
}
```

### Schritt 3: Ausfuehren

```
javac MeineVariablen.java
java MeineVariablen
```

Ausgabe:
```
Name: Anna
Alter: 20
Groesse: 1.65
Student: true
```

Das `+` zwischen dem Text und der Variable setzt beides zusammen. `"Name: " + name` ergibt `"Name: Anna"`.

---

## Werte veraendern

Du kannst den Wert einer Variable jederzeit aendern:

```java
int punkte = 0;
System.out.println("Punkte: " + punkte);   // Ausgabe: 0

punkte = 10;
System.out.println("Punkte: " + punkte);   // Ausgabe: 10

punkte = punkte + 5;  // Nimm den alten Wert (10) und addiere 5
System.out.println("Punkte: " + punkte);   // Ausgabe: 15
```

---

## Rechnen mit Variablen

Mit Zahlen (int und double) kannst du rechnen:

```java
public class Rechnen {
    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println(a + b);   // 13  (Addition)
        System.out.println(a - b);   // 7   (Subtraktion)
        System.out.println(a * b);   // 30  (Multiplikation)
        System.out.println(a / b);   // 3   (Division – Achtung: Ganzzahl!)
        System.out.println(a % b);   // 1   (Rest der Division: 10 = 3*3 + 1)
    }
}
```

**Achtung bei der Division:** Wenn du zwei `int`-Werte dividierst, bekommst du immer eine ganze Zahl als Ergebnis. Der Rest wird einfach abgeschnitten. `10 / 3` ergibt `3`, nicht `3.33`.

Wenn du eine Kommazahl als Ergebnis willst, verwende `double`:

```java
double ergebnis = 10.0 / 3;   // ergibt 3.3333...
```

---

## Variablen kombinieren (Strings zusammensetzen)

Du kannst Texte und Variablen mit `+` zusammensetzen:

```java
String vorname = "Max";
String nachname = "Mustermann";
int alter = 25;

String satz = "Ich heisse " + vorname + " " + nachname + " und bin " + alter + " Jahre alt.";
System.out.println(satz);
// Ausgabe: Ich heisse Max Mustermann und bin 25 Jahre alt.
```

---

## Konstanten – Werte die sich nie aendern

Manchmal hat ein Wert eine feste Bedeutung und soll sich nie aendern – zum Beispiel die Mehrwertsteuer oder die Zahl Pi. Dafuer schreibst du `final` vor den Datentyp. Das "sperrt" den Wert.

Konstanten schreibt man traditionell in Grossbuchstaben mit Unterstrichen:

```java
final double MEHRWERTSTEUER = 0.19;
final int MAX_PUNKTE = 100;
final String SPIELNAME = "Ratespiel";

// MEHRWERTSTEUER = 0.20;  // Das wuerde einen Fehler geben!
```

---

## Namen fuer Variablen – Regeln und Tipps

Variablennamen darf man sich (fast) frei aussuchen. Es gibt aber Regeln und Gewohnheiten:

**Muss:** Keine Leerzeichen, nicht mit Zahl beginnen, keine Sonderzeichen (ausser `_` und `$`)

**Konvention:** Variablen schreibt man in `camelCase` – der erste Buchstabe klein, jedes neue Wort mit Grossbuchstaben:

```java
int punktestand = 100;        // gut
int maximaleAnzahl = 50;      // gut
int MeineVariable = 5;        // funktioniert, aber unueblich
int meine variable = 5;       // FEHLER – Leerzeichen nicht erlaubt
int 2mal = 5;                 // FEHLER – darf nicht mit Zahl beginnen
```

**Gute Namen sind aussagekraeftig:**

```java
int x = 25;        // schlecht – was bedeutet x?
int alter = 25;    // gut – sofort verstaendlich
```

---

## Uebung – Probiere es aus

Erstelle eine Datei `Steckbrief.java` und gib deinen eigenen Steckbrief aus:

- Name (String)
- Alter (int)
- Groesse in Meter (double)
- Lieblingsfarbe (String)
- Lernst du gerade Java? (boolean)

Gib alles mit `System.out.println(...)` aus.

---

Weiter zu: [03-kontrollstrukturen.md](03-kontrollstrukturen.md)
