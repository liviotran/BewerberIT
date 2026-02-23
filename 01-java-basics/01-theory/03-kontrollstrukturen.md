# Kapitel 03 – Entscheidungen treffen (if / else)

Bisher hat dein Programm immer alle Zeilen der Reihe nach ausgefuehrt. In diesem Kapitel lernst du, wie dein Programm **Entscheidungen** treffen kann – also unterschiedliche Dinge tun, je nachdem welche Bedingung gilt.

---

## Das Prinzip: wenn ... dann ...

Im echten Leben treffen wir staendig Entscheidungen:
- *Wenn* es regnet, *dann* nehme ich einen Schirm mit.
- *Wenn* ich muede bin, *dann* gehe ich schlafen, *sonst* schaue ich einen Film.

In Java funktioniert das genauso – mit `if` (wenn) und `else` (sonst).

---

## Die einfache if-Abfrage

```java
int alter = 20;

if (alter >= 18) {
    System.out.println("Zutritt erlaubt.");
}
```

Was passiert hier:
1. Java schaut, ob `alter >= 18` wahr ist (20 >= 18 ist wahr)
2. Wenn ja, wird der Block `{ ... }` ausgefuehrt
3. Wenn nein, passiert nichts

### Selbst ausprobieren

Erstelle `Einlasskontrolle.java` in `meine-uebungen`:

```java
public class Einlasskontrolle {
    public static void main(String[] args) {

        int alter = 16;  // Aendere diesen Wert und schau was passiert

        if (alter >= 18) {
            System.out.println("Zutritt erlaubt.");
        }

        System.out.println("Programmende.");
    }
}
```

Fuehre das Programm aus. Aendere dann `alter` auf verschiedene Werte (z.B. 17, 18, 19) und schau was sich veraendert.

---

## if und else – entweder oder

Oft will man fuer den Fall, dass die Bedingung falsch ist, etwas anderes tun:

```java
int alter = 16;

if (alter >= 18) {
    System.out.println("Zutritt erlaubt.");
} else {
    System.out.println("Zutritt verweigert. Mindestalter ist 18.");
}
```

Jetzt wird immer eine der beiden Meldungen ausgegeben – entweder die eine oder die andere.

---

## Mehrere Bedingungen – else if

Manchmal gibt es mehr als zwei Moeglichkeiten. Zum Beispiel ein Notensystem:

```java
public class Notenrechner {
    public static void main(String[] args) {

        int punkte = 72;  // Aendere diesen Wert

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
    }
}
```

Java prueft die Bedingungen von oben nach unten. Sobald eine Bedingung stimmt, wird dieser Block ausgefuehrt und alle anderen werden uebersprungen.

Erstelle diese Datei und teste sie mit verschiedenen Punktzahlen: 95, 80, 65, 55, 30.

---

## Vergleichsoperatoren

In den Bedingungen verwendest du diese Zeichen:

| Zeichen | Bedeutung | Beispiel |
|---------|-----------|---------|
| `==` | gleich | `alter == 18` |
| `!=` | nicht gleich | `alter != 18` |
| `>` | groesser als | `alter > 18` |
| `<` | kleiner als | `alter < 18` |
| `>=` | groesser oder gleich | `alter >= 18` |
| `<=` | kleiner oder gleich | `alter <= 18` |

**Wichtig:** Fuer den Vergleich auf Gleichheit braucht man zwei Gleichheitszeichen `==`, nicht eines. Ein einzelnes `=` bedeutet "zuweisen", nicht "vergleichen".

```java
int x = 5;         // x bekommt den Wert 5 (Zuweisung)
if (x == 5) { }   // Ist x gleich 5? (Vergleich)
```

---

## Zwei Bedingungen gleichzeitig pruefen

Manchmal braucht man mehrere Bedingungen auf einmal:

**UND (`&&`) – beide Bedingungen muessen stimmen:**

```java
int alter = 20;
boolean hatFuehrerschein = true;

if (alter >= 18 && hatFuehrerschein) {
    System.out.println("Du darfst Auto fahren.");
}
```

Das funktioniert nur, wenn `alter >= 18` UND `hatFuehrerschein` beide wahr sind.

**ODER (`||`) – mindestens eine Bedingung muss stimmen:**

```java
boolean istKind = false;
boolean istRentner = true;

if (istKind || istRentner) {
    System.out.println("Ermaessigter Eintritt: 3 Euro");
} else {
    System.out.println("Normaler Eintritt: 10 Euro");
}
```

**NICHT (`!`) – Bedingung umkehren:**

```java
boolean istGesperrt = false;

if (!istGesperrt) {   // wenn NICHT gesperrt
    System.out.println("Anmelden moeglich.");
}
```

---

## Beispielprogramm – Alles zusammen

Erstelle `TicketpreisRechner.java`:

```java
public class TicketpreisRechner {
    public static void main(String[] args) {

        int alter = 14;
        boolean hatErmaessigung = true;

        double preis;

        if (alter < 6) {
            preis = 0.0;
            System.out.println("Kategorie: Kleinkind");
        } else if (alter < 14) {
            preis = 5.0;
            System.out.println("Kategorie: Kind");
        } else if (alter < 18) {
            preis = 8.0;
            System.out.println("Kategorie: Jugendlicher");
        } else if (alter >= 65) {
            preis = 10.0;
            System.out.println("Kategorie: Senior");
        } else {
            preis = 15.0;
            System.out.println("Kategorie: Erwachsener");
        }

        if (hatErmaessigung) {
            preis = preis * 0.5;
            System.out.println("(50% Ermaessigung wird angewendet)");
        }

        System.out.println("Ticketpreis: " + preis + " Euro");
    }
}
```

Teste das Programm mit verschiedenen Altersangaben. Aendere auch `hatErmaessigung` auf `false` und schau, was sich aendert.

---

## switch – fuer viele feste Werte

Wenn du eine Variable gegen viele genaue Werte pruefen willst, ist `switch` oft uebersichtlicher als viele `else if`:

```java
public class Wochentag {
    public static void main(String[] args) {

        int tag = 3;  // 1 = Montag, 2 = Dienstag, ...

        switch (tag) {
            case 1:
                System.out.println("Montag");
                break;
            case 2:
                System.out.println("Dienstag");
                break;
            case 3:
                System.out.println("Mittwoch");
                break;
            case 4:
                System.out.println("Donnerstag");
                break;
            case 5:
                System.out.println("Freitag");
                break;
            case 6:
                System.out.println("Samstag");
                break;
            case 7:
                System.out.println("Sonntag");
                break;
            default:
                System.out.println("Ungueltiger Tag");
        }
    }
}
```

Das `break` am Ende jedes `case` ist wichtig – ohne es wuerden alle nachfolgenden Faelle auch ausgefuehrt werden.

`default` ist wie `else` – wird ausgefuehrt, wenn kein anderer Fall zutrifft.

---

## Uebung – Mach es selbst

Erstelle `BMIRechner.java`. Speichere Gewicht (double) und Groesse (double) als Variablen. Berechne den BMI mit dieser Formel:

```
BMI = Gewicht / (Groesse * Groesse)
```

Gib dann aus:
- Wenn BMI kleiner als 18.5: "Untergewicht"
- Wenn BMI zwischen 18.5 und 24.9: "Normalgewicht"
- Wenn BMI zwischen 25 und 29.9: "Uebergewicht"
- Wenn BMI 30 oder groesser: "Stark uebergewichtig"

Teste mit: Gewicht = 70, Groesse = 1.75

---

Weiter zu: [04-schleifen.md](04-schleifen.md)
