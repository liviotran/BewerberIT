# Kapitel 01 – Einfuehrung in Java

In diesem Kapitel schreibst du dein erstes eigenes Java-Programm und verstehst, wie es funktioniert.

---

## Was passiert, wenn du ein Java-Programm startest?

Stell dir vor, du backst einen Kuchen. Du hast ein Rezept (das ist dein Code), und du folgst den Schritten der Reihe nach. Der Computer macht genau dasselbe: Er liest deinen Code von oben nach unten und fuehrt jeden Schritt aus.

In Java laeuft das in zwei Phasen ab:

**Phase 1 – Kompilieren:**
Du uebersetzt deinen Code mit dem Befehl `javac` in eine spezielle Zwischensprache (Bytecode). Das ist wie das Uebersetzen eines deutschen Rezepts ins Englische.

**Phase 2 – Ausfuehren:**
Du startest das Programm mit dem Befehl `java`. Java liest den Bytecode und fuehrt ihn aus.

```
Deine .java Datei  -->  javac  -->  .class Datei  -->  java  -->  Ergebnis
(lesbarer Code)          (uebersetzen)    (Bytecode)          (ausfuehren)
```

---

## Dein erstes Programm – Schritt fuer Schritt

### Schritt 1: Datei erstellen

Gehe in VS Code in den Ordner `meine-uebungen`.
Erstelle eine neue Datei und nenne sie `HalloWelt.java`.

**Wichtig:** Gross-H, Gross-W, und die Endung `.java` nicht vergessen!

### Schritt 2: Code eintippen

Tippe diesen Code exakt so ab:

```java
public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo, Welt!");
    }
}
```

Speichere mit `Strg + S`.

### Schritt 3: Ausfuehren

Oeffne das Terminal in VS Code (`Terminal` > `Neues Terminal`) und tippe:

```
javac HalloWelt.java
java HalloWelt
```

Du solltest sehen:
```
Hallo, Welt!
```

---

## Was bedeuten die einzelnen Zeilen?

Lass uns jede Zeile erklaeren. Du musst das nicht sofort auswendig koennen – es reicht, grob zu verstehen was gemeint ist.

### Zeile 1: `public class HalloWelt {`

Jedes Java-Programm lebt in einer sogenannten **Klasse**. Stell dir eine Klasse wie eine Schachtel vor, in der dein Code aufbewahrt wird.

- `public` – die Schachtel ist fuer alle sichtbar
- `class` – sagt Java: "Ich erstelle eine neue Schachtel"
- `HalloWelt` – das ist der Name der Schachtel (du darfst dir einen eigenen Namen ausdenken)
- `{` – hier beginnt der Inhalt der Schachtel

**Sehr wichtig:** Der Name nach `class` muss **genau** mit dem Dateinamen uebereinstimmen. Heisst die Klasse `HalloWelt`, muss die Datei `HalloWelt.java` heissen – inklusive Grossschreibung.

### Zeile 2: `public static void main(String[] args) {`

Diese Zeile ist der **Startpunkt** deines Programms. Wenn du `java HalloWelt` tippst, sucht Java genau nach dieser Zeile und beginnt dort.

Du musst diese Zeile zunaechst einfach so uebernehmen, wie sie ist. Was die einzelnen Woerter bedeuten, lernst du in spaeteren Kapiteln. Merke dir nur: **Diese Zeile braucht jedes Java-Programm.**

### Zeile 3: `System.out.println("Hallo, Welt!");`

Das ist die eigentliche Anweisung: "Gib diesen Text auf dem Bildschirm aus."

- `System.out.println(...)` – gibt Text aus und macht danach einen Zeilenumbruch
- `"Hallo, Welt!"` – das ist der Text, der ausgegeben wird (immer in Anführungszeichen)
- `;` – das Semikolon zeigt an: diese Anweisung ist fertig

Wenn du `println` durch `print` ersetzt, gibt es keinen automatischen Zeilenumbruch.

### Zeilen 4 und 5: `}` und `}`

Jede geoeffnete geschweifte Klammer `{` muss wieder geschlossen werden `}`. Die erste schliesst die `main`-Methode, die zweite schliesst die Klasse.

---

## Probiere es selbst aus

Aendere deinen Code so, dass er deinen eigenen Namen ausgibt. Zum Beispiel:

```java
public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo, mein Name ist Anna!");
        System.out.println("Ich lerne gerade Java.");
        System.out.println("Das macht Spass.");
    }
}
```

Du kannst beliebig viele `System.out.println(...)` Zeilen untereinander schreiben. Java fuehrt sie der Reihe nach aus.

Speichere, kompiliere (`javac HalloWelt.java`) und starte (`java HalloWelt`).

---

## Kommentare – Notizen im Code

Du kannst dir Notizen direkt in den Code schreiben. Diese Kommentare werden von Java komplett ignoriert – sie sind nur fuer Menschen gedacht.

```java
public class HalloWelt {
    public static void main(String[] args) {
        // Das hier ist ein Kommentar. Java ignoriert diese Zeile.
        System.out.println("Hallo!");  // Kommentar kann auch am Zeilenende stehen

        /*
           Das ist ein mehrzeiliger Kommentar.
           Alles hier drin wird ignoriert.
           Nuetzlich fuer laengere Erklaerungen.
        */
        System.out.println("Tschuss!");
    }
}
```

Schreibe Kommentare immer dann, wenn du erklaeren moechtest, **warum** du etwas machst – nicht nur was du machst.

---

## Die wichtigsten Regeln auf einen Blick

Bevor du weitermachst, hier die drei wichtigsten Regeln:

**Regel 1:** Dateiname = Klassenname (inkl. Gross-/Kleinschreibung)

**Regel 2:** Fast jede Anweisung endet mit einem Semikolon `;`

**Regel 3:** Jede geoeffnete Klammer `{` braucht eine schliessende `}`

---

## Haeufige Fehlermeldungen und was sie bedeuten

Wenn du einen Fehler machst, bricht das Kompilieren ab und du siehst eine Fehlermeldung. Keine Panik – das ist normal.

**Fehler: `class HalloWelt is public, should be declared in a file named HalloWelt.java`**
Dein Dateiname stimmt nicht mit dem Klassennamen ueberein. Benennt eine der beiden um.

**Fehler: `';' expected`**
Du hast irgendwo ein Semikolon vergessen. Java zeigt dir die Zeilennummer – schau dort nach.

**Fehler: `reached end of file while parsing`**
Du hast eine geschweifte Klammer `}` vergessen.

**Fehler: `cannot find symbol`**
Du hast dich bei einem Wort vertippt. Java kennt dieses Wort nicht.

---

Weiter zu: [02-variablen.md](02-variablen.md)
