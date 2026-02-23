# Aufgabe 2 – Kontrollstrukturen (Entscheidungen)

## Vorbereitung

Erstelle im Ordner `solutions/` eine neue Datei: `Aufgabe2.java`

---

## Aufgabe 2.1 – Ampel

Speichere eine Farbe als String (z.B. `"rot"`, `"gelb"` oder `"gruen"`).

Gib mit `if / else if / else` aus, was der Autofahrer tun soll:
- rot → "Anhalten!"
- gelb → "Vorsicht – gleich rot oder gruen"
- gruen → "Fahren!"
- alles andere → "Unbekannte Farbe"

Teste mit allen vier Moeglichkeiten (aendere den Wert und starte neu).

---

## Aufgabe 2.2 – Notenrechner

Speichere eine Punktzahl zwischen 0 und 100 als `int`.

Gib die Note aus:
- 90 bis 100 Punkte → "Sehr gut"
- 75 bis 89 Punkte  → "Gut"
- 60 bis 74 Punkte  → "Befriedigend"
- 50 bis 59 Punkte  → "Ausreichend"
- unter 50 Punkte   → "Nicht bestanden"

Teste mit mindestens 5 verschiedenen Punktzahlen.

---

## Aufgabe 2.3 – Jahreszeit

Speichere einen Monat als Zahl (1 = Januar, 2 = Februar, usw.).

Gib die Jahreszeit aus:
- Dezember, Januar, Februar → "Winter"
- Maerz, April, Mai → "Fruehling"
- Juni, Juli, August → "Sommer"
- September, Oktober, November → "Herbst"
- andere Zahl → "Ungueltiger Monat"

Verwende `switch` fuer diese Aufgabe.

---

## Aufgabe 2.4 – Ticketpreis

Speichere ein Alter als `int` und ob die Person eine Ermaessigung hat als `boolean`.

Berechne den Ticketpreis:
- unter 6 Jahre: kostenlos (0 Euro)
- 6 bis 17 Jahre: 6 Euro
- 18 bis 64 Jahre: 12 Euro
- ab 65 Jahre: 8 Euro

Wenn `hatErmaessigung` auf `true` steht: ziehe 2 Euro ab (aber mindestens 0).

Gib den endgueltigen Preis aus.

---

## Wenn du fertig bist

```
javac Aufgabe2.java
java Aufgabe2
```

Schau dann in die Musterloesung: [../solutions/Aufgabe2Loesung.java](../solutions/Aufgabe2Loesung.java)
