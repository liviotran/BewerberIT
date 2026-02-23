# Aufgabe 4 – Methoden

## Vorbereitung

Erstelle im Ordner `solutions/` eine neue Datei: `Aufgabe4.java`

Definiere alle Methoden in dieser Datei, ausserhalb von `main`. Rufe sie von `main` aus auf.

---

## Aufgabe 4.1 – Begruessung

Schreibe eine Methode `begruessung(String name)`, die folgenden Text ausgibt:

```
Willkommen, [name]! Schoen, dass du dabei bist.
```

Rufe sie in `main` mit mindestens drei verschiedenen Namen auf.

---

## Aufgabe 4.2 – Groesseres von zwei berechnen

Schreibe eine Methode `groessereZahl(int a, int b)`, die die groessere der beiden Zahlen zurueckgibt.

Teste sie in `main`:
```java
System.out.println(groessereZahl(5, 12));   // soll 12 ausgeben
System.out.println(groessereZahl(20, 7));   // soll 20 ausgeben
System.out.println(groessereZahl(8, 8));    // soll 8 ausgeben
```

---

## Aufgabe 4.3 – Temperaturumrechner

Schreibe zwei Methoden:
- `celsiusZuFahrenheit(double celsius)` – Formel: `celsius * 9.0 / 5.0 + 32`
- `fahrenheitZuCelsius(double fahrenheit)` – Formel: `(fahrenheit - 32) * 5.0 / 9.0`

Beide sollen ein `double` zurueckgeben. Teste sie in `main`.

**Beispielausgabe:**
```
0 Grad Celsius = 32.0 Fahrenheit
100 Grad Celsius = 212.0 Fahrenheit
212 Fahrenheit = 100.0 Celsius
```

---

## Aufgabe 4.4 – Sterne ausgeben

Schreibe eine Methode `sternzeile(int anzahl)`, die eine Zeile mit der angegebenen Anzahl Sterne ausgibt.

Beispiel: `sternzeile(5)` gibt `* * * * *` aus.

Nutze diese Methode dann, um ein Dreieck auszugeben:
```java
for (int i = 1; i <= 5; i++) {
    sternzeile(i);
}
```

---

## Aufgabe 4.5 – Ist die Zahl eine Primzahl?

Schreibe eine Methode `istPrimzahl(int zahl)`, die `true` zurueckgibt, wenn die Zahl eine Primzahl ist, und sonst `false`.

Eine Primzahl ist nur durch 1 und sich selbst teilbar. Pruefe dafuer alle Zahlen von 2 bis zahl-1.

Gib in `main` alle Primzahlen von 2 bis 50 aus.

**Erwartete Ausgabe:**
```
Primzahlen bis 50: 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47
```

---

## Wenn du fertig bist

```
javac Aufgabe4.java
java Aufgabe4
```

Schau dann in die Musterloesung: [../solutions/Aufgabe4Loesung.java](../solutions/Aufgabe4Loesung.java)
