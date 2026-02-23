# Aufgabe 1 – Variablen

## Vorbereitung

Erstelle im Ordner `solutions/` eine neue Datei: `Aufgabe1.java`

Alle Aufgaben kommen in diese eine Datei. Rufe die Methoden aus `main` auf.

---

## Aufgabe 1.1 – Steckbrief ausgeben

Erstelle Variablen fuer:
- Deinen Namen (String)
- Dein Alter (int)
- Deine Groesse in Metern (double)
- Ob du gerade lernst (boolean)

Gib dann alle vier Informationen mit `System.out.println(...)` aus.

**Erwartete Ausgabe (mit deinen eigenen Werten):**
```
Name: Anna Muster
Alter: 21 Jahre
Groesse: 1.68 m
Am Lernen: true
```

---

## Aufgabe 1.2 – Einkauf berechnen

Du kaufst drei Produkte:
- Brot: 2.49 Euro
- Milch: 1.19 Euro
- Kaese: 3.79 Euro

Speichere jeden Preis in einer `double`-Variable. Berechne die Gesamtsumme und gib sie aus.

**Erwartete Ausgabe:**
```
Brot:   2.49 Euro
Milch:  1.19 Euro
Kaese:  3.79 Euro
Gesamt: 7.47 Euro
```

---

## Aufgabe 1.3 – Zeitumrechnung

Speichere eine Anzahl Sekunden in einer `int`-Variable (z.B. 3725).

Rechne aus, wie viele Stunden, Minuten und Sekunden das sind.

Tipp:
- Stunden = Sekunden / 3600
- Restminuten = (Sekunden % 3600) / 60
- Restsekunden = Sekunden % 60

**Erwartete Ausgabe fuer 3725 Sekunden:**
```
3725 Sekunden sind:
1 Stunden, 2 Minuten, 5 Sekunden
```

---

## Aufgabe 1.4 – Kreis berechnen

Speichere einen Radius in einer `double`-Variable (z.B. 5.0).

Berechne:
- Umfang = 2 * 3.14159 * Radius
- Flaeche = 3.14159 * Radius * Radius

Gib beides aus.

**Erwartete Ausgabe fuer Radius 5.0:**
```
Radius: 5.0
Umfang: 31.4159
Flaeche: 78.53975
```

---

## Wenn du fertig bist

Kompiliere und starte dein Programm:
```
javac Aufgabe1.java
java Aufgabe1
```

Schau dann in die Musterloesung: [../solutions/Aufgabe1Loesung.java](../solutions/Aufgabe1Loesung.java)
