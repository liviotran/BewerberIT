# Aufgabe 3 – Schleifen

## Vorbereitung

Erstelle im Ordner `solutions/` eine neue Datei: `Aufgabe3.java`

---

## Aufgabe 3.1 – Zaehlschleife

Gib mit einer `for`-Schleife alle geraden Zahlen von 2 bis 20 aus.

**Erwartete Ausgabe:**
```
2 4 6 8 10 12 14 16 18 20
```

Tipp: Starte mit `i = 2`, erhoehe um 2 pro Schritt (`i += 2`), oder pruefe mit `i % 2 == 0`.

---

## Aufgabe 3.2 – FizzBuzz

Gib die Zahlen 1 bis 30 aus. Aber:
- Wenn die Zahl durch 3 teilbar ist: gib "Fizz" aus
- Wenn die Zahl durch 5 teilbar ist: gib "Buzz" aus
- Wenn durch beides teilbar: gib "FizzBuzz" aus
- Sonst: die Zahl selbst

**Erwartete Ausgabe (Ausschnitt):**
```
1 2 Fizz 4 Buzz Fizz 7 8 Fizz Buzz 11 Fizz 13 14 FizzBuzz ...
```

Tipp: Eine Zahl ist durch 3 teilbar, wenn `zahl % 3 == 0` gilt.

---

## Aufgabe 3.3 – Sternmuster

Gib dieses Muster mit verschachtelten Schleifen aus:

```
* 
* * 
* * * 
* * * * 
* * * * * 
```

Tipp: Du brauchst eine aeussere Schleife fuer die Zeilen (1 bis 5) und eine innere Schleife fuer die Sterne (1 bis zur aktuellen Zeilennummer).

---

## Aufgabe 3.4 – Summe mit while

Berechne mit einer `while`-Schleife, wie lange man verdoppeln muss, um von 1 auf mehr als 1000 zu kommen.

Starte mit `zahl = 1`. Verdopple in jedem Schritt. Zaehle die Schritte.

**Erwartete Ausgabe:**
```
Schritt 1: 2
Schritt 2: 4
Schritt 3: 8
...
Schritt 10: 1024
Fertig nach 10 Schritten!
```

---

## Aufgabe 3.5 – Einmaleins-Tabelle

Gib das vollstaendige kleine Einmaleins als Tabelle aus (1x1 bis 10x10).

**Erwartete Ausgabe (Ausschnitt):**
```
  1  2  3  4  5  6  7  8  9 10
  2  4  6  8 10 12 14 16 18 20
  3  6  9 12 ...
```

Tipp: Verwende `System.out.printf("%4d", wert)` fuer gleichmaessige Abstände.

---

## Wenn du fertig bist

```
javac Aufgabe3.java
java Aufgabe3
```

Schau dann in die Musterloesung: [../solutions/Aufgabe3Loesung.java](../solutions/Aufgabe3Loesung.java)
