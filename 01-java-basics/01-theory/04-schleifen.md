# Kapitel 04 – Schleifen

Stell dir vor, du sollst "Hallo" 100 Mal ausgeben. Du koenntest 100 mal `System.out.println("Hallo")` schreiben – aber das waere sehr umstaendlich. Dafuer gibt es Schleifen: Sie wiederholen Code automatisch.

---

## Die for-Schleife – wenn du weisst, wie oft

Wenn du genau weisst, wie oft du etwas wiederholen willst, nimmst du die `for`-Schleife.

### Erstes Beispiel

Erstelle `ErsteSchleife.java` in `meine-uebungen`:

```java
public class ErsteSchleife {
    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {
            System.out.println("Durchlauf Nummer " + i);
        }

        System.out.println("Fertig!");
    }
}
```

Ausgabe:
```
Durchlauf Nummer 1
Durchlauf Nummer 2
Durchlauf Nummer 3
Durchlauf Nummer 4
Durchlauf Nummer 5
Fertig!
```

### Was bedeuten die drei Teile?

```
for ( int i = 1 ; i <= 5 ; i++ )
      ^^^^^^^^^   ^^^^^^   ^^^
         |           |      |
     Startwert   Bedingung  Schritt
```

- **Startwert** `int i = 1` – Eine Variable `i` wird angelegt und bekommt den Wert 1. Das passiert nur einmal ganz am Anfang.
- **Bedingung** `i <= 5` – Vor jedem Durchlauf wird geprueft: ist `i` noch kleiner oder gleich 5? Wenn ja, weitermachen. Wenn nein, aufhoeren.
- **Schritt** `i++` – Nach jedem Durchlauf wird `i` um 1 erhoeht. `i++` ist eine Kurzschreibweise fuer `i = i + 1`.

### Ablauf Schritt fuer Schritt

1. `i = 1`, Bedingung `1 <= 5` ist wahr → Ausgabe "Durchlauf Nummer 1", dann `i` wird zu 2
2. `i = 2`, Bedingung `2 <= 5` ist wahr → Ausgabe "Durchlauf Nummer 2", dann `i` wird zu 3
3. `i = 3`, Bedingung `3 <= 5` ist wahr → Ausgabe "Durchlauf Nummer 3", dann `i` wird zu 4
4. `i = 4`, Bedingung `4 <= 5` ist wahr → Ausgabe "Durchlauf Nummer 4", dann `i` wird zu 5
5. `i = 5`, Bedingung `5 <= 5` ist wahr → Ausgabe "Durchlauf Nummer 5", dann `i` wird zu 6
6. `i = 6`, Bedingung `6 <= 5` ist falsch → Schleife endet

---

## Beispiele fuer die for-Schleife

```java
public class SchleifenBeispiele {
    public static void main(String[] args) {

        // Rueckwaerts zaehlen
        System.out.println("Countdown:");
        for (int i = 5; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Los!");

        // Summe berechnen
        int summe = 0;
        for (int i = 1; i <= 10; i++) {
            summe = summe + i;
        }
        System.out.println("Summe von 1 bis 10: " + summe);  // 55

        // Nur gerade Zahlen ausgeben
        System.out.println("Gerade Zahlen von 2 bis 10:");
        for (int i = 2; i <= 10; i = i + 2) {
            System.out.print(i + " ");  // print ohne ln = kein Zeilenumbruch
        }
        System.out.println();  // Zeilenumbruch am Ende
    }
}
```

---

## Die while-Schleife – solange eine Bedingung gilt

Die `while`-Schleife laeuft so lange, wie eine Bedingung wahr ist. Sie eignet sich, wenn du nicht vorher weisst, wie viele Durchlaeufe es geben wird.

```java
public class WhileBeispiel {
    public static void main(String[] args) {

        int guthaben = 100;

        while (guthaben > 0) {
            System.out.println("Guthaben: " + guthaben + " Euro");
            guthaben = guthaben - 30;  // Jede Runde wird 30 Euro abgezogen
        }

        System.out.println("Kein Guthaben mehr!");
    }
}
```

Ausgabe:
```
Guthaben: 100 Euro
Guthaben: 70 Euro
Guthaben: 40 Euro
Guthaben: 10 Euro
Kein Guthaben mehr!
```

**Achtung:** Sorge immer dafuer, dass die Bedingung irgendwann falsch wird. Sonst laeuft die Schleife ewig und dein Programm "haengt".

---

## Die do-while-Schleife – mindestens einmal

Die `do-while`-Schleife ist wie die `while`-Schleife, aber der Code wird **immer mindestens einmal** ausgefuehrt – auch wenn die Bedingung von Anfang an falsch ist.

```java
public class DoWhileBeispiel {
    public static void main(String[] args) {

        int zahl = 10;

        do {
            System.out.println("Dieser Text erscheint mindestens einmal: " + zahl);
            zahl++;
        } while (zahl < 5);   // Bedingung ist sofort falsch, trotzdem einmal ausgefuehrt

        System.out.println("Fertig.");
    }
}
```

`do-while` wird oft fuer Menues verwendet, die mindestens einmal angezeigt werden sollen.

---

## break – Schleife sofort verlassen

Mit `break` kannst du eine Schleife vorzeitig beenden:

```java
public class BreakBeispiel {
    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("Gefunden! Stoppe bei " + i);
                break;   // Schleife verlassen
            }
            System.out.println("Pruefe: " + i);
        }

        System.out.println("Schleife beendet.");
    }
}
```

Ausgabe:
```
Pruefe: 1
Pruefe: 2
Pruefe: 3
Pruefe: 4
Gefunden! Stoppe bei 5
Schleife beendet.
```

---

## continue – diesen Durchlauf ueberspringen

Mit `continue` springst du direkt zum naechsten Durchlauf, ohne den Rest des aktuellen Durchlaufs auszufuehren:

```java
public class ContinueBeispiel {
    public static void main(String[] args) {

        System.out.println("Zahlen 1-10, ohne 3 und 7:");

        for (int i = 1; i <= 10; i++) {
            if (i == 3 || i == 7) {
                continue;   // diesen Durchlauf ueberspringen
            }
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
```

Ausgabe: `1 2 4 5 6 8 9 10`

---

## Wann nehme ich welche Schleife?

| Situation | Welche Schleife |
|-----------|----------------|
| Ich weiss genau, wie oft ich wiederholen will (z.B. 10 mal) | `for` |
| Ich weiss nicht wie oft, aber die Bedingung steht vorher fest | `while` |
| Der Code soll mindestens einmal laufen (z.B. ein Menue) | `do-while` |

---

## Praktisches Beispiel – Einmaleins ausgeben

```java
public class Einmaleins {
    public static void main(String[] args) {

        int zahl = 7;  // Einmaleins von 7

        System.out.println("Das kleine Einmaleins von " + zahl + ":");
        System.out.println("-------------------------------");

        for (int i = 1; i <= 10; i++) {
            int ergebnis = zahl * i;
            System.out.println(zahl + " x " + i + " = " + ergebnis);
        }
    }
}
```

Erstelle diese Datei, fuehre sie aus und aendere `zahl` auf verschiedene Werte.

---

## Uebung – Mach es selbst

Erstelle `Sterne.java`. Gib dieses Muster mit einer Schleife aus:

```
*
**
***
****
*****
```

Tipp: Du brauchst eine aeussere Schleife (fuer die Zeilen) und eine innere Schleife (fuer die Sterne in jeder Zeile).

---

Weiter zu: [05-methoden.md](05-methoden.md)
