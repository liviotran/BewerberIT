# Kapitel 05 – Methoden

Bisher hast du alles in `main` geschrieben. In diesem Kapitel lernst du, wie du deinen Code in einzelne, wiederverwendbare Bausteine aufteilst – sogenannte **Methoden**.

---

## Warum brauche ich Methoden?

Stell dir vor, du willst an drei verschiedenen Stellen in deinem Programm eine Begruessung ausgeben. Ohne Methoden muesst du denselben Code dreimal schreiben. Wenn du dann etwas aendern willst, musst du es an drei Stellen aendern – und vergisst vielleicht eine.

Mit Methoden schreibst du den Code einmal und rufst ihn einfach auf:

```java
public class OhneMethoden {
    public static void main(String[] args) {
        // Gleicher Code dreimal
        System.out.println("------------------");
        System.out.println("Herzlich Willkommen");
        System.out.println("------------------");

        // ... irgendwas ...

        System.out.println("------------------");
        System.out.println("Herzlich Willkommen");
        System.out.println("------------------");
    }
}
```

```java
public class MitMethoden {
    public static void main(String[] args) {
        begruessung();  // Methode aufrufen
        // ... irgendwas ...
        begruessung();  // nochmal aufrufen
    }

    // Methode definieren
    public static void begruessung() {
        System.out.println("------------------");
        System.out.println("Herzlich Willkommen");
        System.out.println("------------------");
    }
}
```

---

## Erste eigene Methode – Schritt fuer Schritt

### Schritt 1: Datei erstellen

Erstelle `MeineMethoden.java` in `meine-uebungen`.

### Schritt 2: Code eintippen

```java
public class MeineMethoden {

    public static void main(String[] args) {
        // Methoden aufrufen
        begruessung();
        trennlinie();
        begruessung();
    }

    // Methode definieren
    public static void begruessung() {
        System.out.println("Hallo! Willkommen im Programm.");
    }

    public static void trennlinie() {
        System.out.println("========================");
    }
}
```

### Schritt 3: Ausfuehren

```
javac MeineMethoden.java
java MeineMethoden
```

Ausgabe:
```
Hallo! Willkommen im Programm.
========================
Hallo! Willkommen im Programm.
```

---

## Methoden mit Eingaben (Parameter)

Eine Methode kann Werte entgegennehmen, mit denen sie dann arbeitet. Diese Werte nennt man **Parameter**.

```java
public class MethodeMitParameter {

    public static void main(String[] args) {
        begruesseBenutzer("Anna");
        begruesseBenutzer("Max");
        begruesseBenutzer("Sophie");
    }

    public static void begruesseBenutzer(String name) {
        System.out.println("Hallo, " + name + "! Schoen, dass du da bist.");
    }
}
```

Ausgabe:
```
Hallo, Anna! Schoen, dass du da bist.
Hallo, Max! Schoen, dass du da bist.
Hallo, Sophie! Schoen, dass du da bist.
```

Der Parameter `String name` in der Methodendefinition ist wie eine Variable, die beim Aufruf befuellt wird. Wenn du `begruesseBenutzer("Anna")` schreibst, bekommt `name` den Wert `"Anna"`.

### Mehrere Parameter

```java
public static void zeigeInfo(String name, int alter) {
    System.out.println(name + " ist " + alter + " Jahre alt.");
}

// Aufruf:
zeigeInfo("Tom", 25);
zeigeInfo("Lisa", 22);
```

---

## Methoden die etwas zurueckgeben

Bisher haben unsere Methoden nur Dinge ausgegeben. Oft will man aber, dass eine Methode ein Ergebnis berechnet und es zurueckgibt – damit man damit weiterarbeiten kann.

Das Schluesselwort dafuer ist `return`.

```java
public class MethodeMitRueckgabe {

    public static void main(String[] args) {
        int summe = addiere(5, 3);    // Ergebnis wird in Variable gespeichert
        System.out.println("5 + 3 = " + summe);

        int ergebnis = addiere(10, 20);
        System.out.println("10 + 20 = " + ergebnis);

        // Man kann das Ergebnis auch direkt verwenden
        System.out.println("7 + 8 = " + addiere(7, 8));
    }

    public static int addiere(int a, int b) {
        int ergebnis = a + b;
        return ergebnis;   // Ergebnis zurueckgeben
    }
}
```

### Was bedeutet das `int` vor dem Methodennamen?

```
public static  int  addiere(int a, int b)
               ^^^
               Das ist der Rueckgabetyp.
               Die Methode gibt eine ganze Zahl (int) zurueck.
```

Wenn eine Methode nichts zurueckgibt (wie unsere `begruessung()`), schreibt man `void` (englisch fuer "nichts"):

```
public static  void  begruessung()
               ^^^^
               void = gibt nichts zurueck
```

---

## Vollstaendiges Beispiel – ein einfacher Taschenrechner

Erstelle `Taschenrechner.java`:

```java
public class Taschenrechner {

    public static void main(String[] args) {

        System.out.println("=== Taschenrechner ===");
        System.out.println("10 + 5 = " + addiere(10, 5));
        System.out.println("10 - 5 = " + subtrahiere(10, 5));
        System.out.println("10 * 5 = " + multipliziere(10, 5));
        System.out.println("10 / 5 = " + dividiere(10, 5));
        System.out.println("10 / 0 = " + dividiere(10, 0));  // Fehlerfall
    }

    public static int addiere(int a, int b) {
        return a + b;
    }

    public static int subtrahiere(int a, int b) {
        return a - b;
    }

    public static int multipliziere(int a, int b) {
        return a * b;
    }

    public static double dividiere(int a, int b) {
        if (b == 0) {
            System.out.println("Fehler: Division durch Null nicht erlaubt!");
            return 0;
        }
        return (double) a / b;
    }
}
```

Fuehre das Programm aus und schau dir die Ausgabe an.

---

## Wo werden Methoden geschrieben?

Methoden kommen **ausserhalb** der `main`-Methode, aber **innerhalb** der Klasse. Das sieht so aus:

```java
public class MeinProgramm {

    public static void main(String[] args) {
        // Hier stehen nur die Aufrufe
        methodeA();
        methodeB();
    }

    // Methoden kommen hier her - nach (oder auch vor) main
    public static void methodeA() {
        System.out.println("Ich bin Methode A");
    }

    public static void methodeB() {
        System.out.println("Ich bin Methode B");
    }

}  // Ende der Klasse
```

Die Reihenfolge der Methoden spielt keine Rolle – du kannst `methodeA()` in `main` aufrufen, auch wenn `methodeA()` erst danach im Code steht.

---

## Uebung – Mach es selbst

Erstelle `FlaechemRechner.java` mit diesen drei Methoden:

- `rechteckFlaeche(double breite, double hoehe)` – berechnet und gibt Breite * Hoehe zurueck
- `kreisFlaeche(double radius)` – berechnet und gibt Pi * radius * radius zurueck (Pi = 3.14159)
- `dreieckFlaeche(double basis, double hoehe)` – berechnet und gibt 0.5 * basis * hoehe zurueck

Rufe alle drei Methoden in `main` auf und gib die Ergebnisse aus.

---

Weiter zu: [06-erste-oop.md](06-erste-oop.md)
