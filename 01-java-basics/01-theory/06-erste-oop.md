# Kapitel 06 – Deine erste Klasse (Einfuehrung in OOP)

Bisher hast du Variablen und Methoden einzeln verwendet. In diesem Kapitel lernst du, wie du beides zusammenfasst – in einer **Klasse**. Das ist der Kern der objektorientierten Programmierung (OOP).

---

## Was ist eine Klasse?

Eine Klasse ist wie ein **Bauplan**. Genau wie ein Bauplan beschreibt, wie ein Haus aussieht, beschreibt eine Klasse, wie ein bestimmtes "Ding" aussieht und was es kann.

Aus einem Bauplan kannst du viele Haeuser bauen. Genauso kannst du aus einer Klasse viele **Objekte** erstellen.

**Beispiel:**
- Klasse `Auto` = der Bauplan
- `meinAuto`, `papasAuto`, `taxiAuto` = konkrete Autos (Objekte)

---

## Deine erste eigene Klasse

Wir bauen eine Klasse fuer eine Person. Eine Person hat Eigenschaften (Name, Alter) und kann etwas tun (sich vorstellen).

### Schritt 1: Zwei Dateien erstellen

Wichtig: Eine Klasse kommt in ihre eigene Datei! Erstelle in `meine-uebungen` zwei Dateien:

- `Person.java` – der Bauplan
- `PersonTest.java` – das Programm, das den Bauplan benutzt

### Schritt 2: Person.java eintippen

```java
public class Person {

    // Eigenschaften (nennt man "Attribute" oder "Felder")
    String name;
    int alter;
    String beruf;

    // Was die Person kann (nennt man "Methoden")
    public void vorstellen() {
        System.out.println("Hallo! Ich heisse " + name + ".");
        System.out.println("Ich bin " + alter + " Jahre alt.");
        System.out.println("Ich arbeite als " + beruf + ".");
    }

    public void geburtstag() {
        alter = alter + 1;
        System.out.println(name + " hat Geburtstag und wird " + alter + "!");
    }
}
```

### Schritt 3: PersonTest.java eintippen

```java
public class PersonTest {
    public static void main(String[] args) {

        // Ein Objekt erstellen (aus dem Bauplan "Person")
        Person person1 = new Person();

        // Eigenschaften setzen
        person1.name = "Anna";
        person1.alter = 28;
        person1.beruf = "Lehrerin";

        // Methode aufrufen
        person1.vorstellen();

        System.out.println("---");

        // Ein zweites Objekt - voellig unabhaengig vom ersten!
        Person person2 = new Person();
        person2.name = "Max";
        person2.alter = 34;
        person2.beruf = "Entwickler";

        person2.vorstellen();
        person2.geburtstag();
        person2.vorstellen();
    }
}
```

### Schritt 4: Beide Dateien kompilieren und ausfuehren

```
javac Person.java PersonTest.java
java PersonTest
```

Ausgabe:
```
Hallo! Ich heisse Anna.
Ich bin 28 Jahre alt.
Ich arbeite als Lehrerin.
---
Hallo! Ich heisse Max.
Ich bin 34 Jahre alt.
Ich arbeite als Entwickler.
Max hat Geburtstag und wird 35!
Hallo! Ich heisse Max.
Ich bin 35 Jahre alt.
Ich arbeite als Entwickler.
```

---

## Was ist `new`?

Das Schluesselwort `new` erstellt ein neues Objekt aus dem Bauplan:

```java
Person person1 = new Person();
//     ^^^^^^^        ^^^^^^
//     Name des       Bauplan (Klasse)
//     Objekts
```

Jedes mit `new` erstellte Objekt ist voellig unabhaengig. Wenn du `person2.alter` aenderst, hat das keinen Einfluss auf `person1.alter`.

---

## Konstruktoren – Objekte sofort befuellen

Im vorherigen Beispiel musst du nach `new Person()` die Eigenschaften einzeln setzen. Das ist umstaendlich. Ein **Konstruktor** ermoeglicht es, alle Werte direkt beim Erstellen zu uebergeben.

```java
public class Person {

    String name;
    int alter;
    String beruf;

    // Das ist der Konstruktor
    public Person(String name, int alter, String beruf) {
        this.name = name;     // "this.name" = das Attribut der Klasse
        this.alter = alter;   // "alter" = der uebergebene Wert
        this.beruf = beruf;
    }

    public void vorstellen() {
        System.out.println("Hallo! Ich heisse " + name + ", bin " + alter + " und arbeite als " + beruf + ".");
    }
}
```

Was ist `this`? Wenn der Parameter und das Attribut denselben Namen haben, sagt man mit `this.name`: "Das `name` der Klasse". Ohne `this` wuerde Java nur den Parameter meinen.

Jetzt kannst du Objekte viel kuerzer erstellen:

```java
public class PersonTest {
    public static void main(String[] args) {
        // Alles in einer Zeile!
        Person p1 = new Person("Anna", 28, "Lehrerin");
        Person p2 = new Person("Max", 34, "Entwickler");
        Person p3 = new Person("Sara", 22, "Studentin");

        p1.vorstellen();
        p2.vorstellen();
        p3.vorstellen();
    }
}
```

---

## Ein groesseres Beispiel – Bankkonto

Erstelle `Bankkonto.java` und `BankkontoTest.java`:

**Bankkonto.java:**

```java
public class Bankkonto {

    String inhaber;
    double kontostand;

    public Bankkonto(String inhaber, double startguthaben) {
        this.inhaber = inhaber;
        this.kontostand = startguthaben;
    }

    public void einzahlen(double betrag) {
        if (betrag <= 0) {
            System.out.println("Fehler: Betrag muss groesser als 0 sein.");
            return;
        }
        kontostand = kontostand + betrag;
        System.out.println(betrag + " Euro eingezahlt. Neuer Stand: " + kontostand + " Euro");
    }

    public void abheben(double betrag) {
        if (betrag <= 0) {
            System.out.println("Fehler: Betrag muss groesser als 0 sein.");
            return;
        }
        if (betrag > kontostand) {
            System.out.println("Fehler: Nicht genug Guthaben! Aktuell: " + kontostand + " Euro");
            return;
        }
        kontostand = kontostand - betrag;
        System.out.println(betrag + " Euro abgehoben. Neuer Stand: " + kontostand + " Euro");
    }

    public void zeigeKontostand() {
        System.out.println("Konto von " + inhaber + ": " + kontostand + " Euro");
    }
}
```

**BankkontoTest.java:**

```java
public class BankkontoTest {
    public static void main(String[] args) {

        Bankkonto konto1 = new Bankkonto("Anna Müller", 500.0);
        Bankkonto konto2 = new Bankkonto("Max Schmidt", 1200.0);

        konto1.zeigeKontostand();
        konto1.einzahlen(300.0);
        konto1.abheben(100.0);
        konto1.abheben(900.0);  // sollte Fehler zeigen
        konto1.zeigeKontostand();

        System.out.println("---");

        konto2.zeigeKontostand();
        konto2.abheben(400.0);
        konto2.zeigeKontostand();
    }
}
```

Kompiliere und fuehre es aus:

```
javac Bankkonto.java BankkontoTest.java
java BankkontoTest
```

---

## Klassen vs. Methoden in `main` – wann was?

Du fragst dich vielleicht, wann du eine eigene Klasse brauchst und wann einfache Methoden in `main` reichen.

Als Daumenregel:
- **Methoden in main** – fuer einfache Berechnungen oder Ausgaben ohne "Zustand"
- **Eigene Klasse** – wenn du etwas modelllieren willst, das Eigenschaften UND Verhalten hat (Person, Auto, Bankkonto, Spiel, ...)

---

## Zusammenfassung

Was du in diesem Modul gelernt hast:

- Eine Klasse ist ein Bauplan fuer Objekte
- Objekte erstellst du mit `new`
- Attribute sind Variablen, die zu einem Objekt gehoeren
- Methoden sind Funktionen, die zu einem Objekt gehoeren
- Der Konstruktor setzt die Startwerte beim Erstellen eines Objekts
- `this` verweist auf das aktuelle Objekt

---

Weiter zu den Aufgaben: [../exercises/aufgabe-1-variablen.md](../exercises/aufgabe-1-variablen.md)
