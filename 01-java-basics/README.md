# Java Grundlagen – Modul 1

Hallo und herzlich willkommen! Dieses Modul bringt dir die Grundlagen von Java bei – auch wenn du noch nie programmiert hast.

---

## Was ist Programmieren uberhaupt?

Programmieren bedeutet: Du gibst dem Computer genaue Anweisungen, was er tun soll. Der Computer macht genau das, was du ihm sagst – nicht mehr und nicht weniger. Deshalb muss man sehr praezise sein.

Java ist eine Programmiersprache, mit der du dem Computer diese Anweisungen gibst. Sie wird weltweit in Millionen von Projekten eingesetzt – in Apps, Webseiten, Banken und vielem mehr.

---

## Schritt 1: Java auf deinem Computer installieren

Bevor du irgendeinen Code schreiben kannst, musst du Java installieren. Folge diesen Schritten genau:

### 1.1 – JDK herunterladen

1. Oeffne deinen Browser und gehe zu: **https://adoptium.net**
2. Klicke auf den grossen Download-Button (nimm die neueste LTS-Version)
3. Waehle dein Betriebssystem (Windows, Mac oder Linux)
4. Lade die Datei herunter und fuehre sie aus

Klicke dich durch die Installation einfach mit "Weiter" durch – die Standardeinstellungen passen.

### 1.2 – Pruefen ob die Installation geklappt hat

Oeffne das Terminal (die "Eingabeaufforderung"):

- **Windows:** Druecke `Windows-Taste + R`, tippe `cmd`, druecke Enter
- **Mac:** Druecke `Cmd + Leertaste`, tippe `Terminal`, druecke Enter
- **Linux:** Druecke `Strg + Alt + T`

Tippe dann diese zwei Befehle und druecke jeweils Enter:

```
java -version
javac -version
```

Wenn du so etwas wie `java version "21.0.2"` siehst, hat die Installation geklappt. Wenn du eine Fehlermeldung bekommst, installiere Java nochmal und starte den Computer danach neu.

---

## Schritt 2: Einen Texteditor installieren

Du schreibst Java-Code in normalen Textdateien. Dafuer brauchst du einen guten Texteditor. Wir empfehlen **Visual Studio Code** (kurz: VS Code) – er ist kostenlos und einfach zu bedienen.

1. Gehe zu: **https://code.visualstudio.com**
2. Lade VS Code herunter und installiere es
3. Oeffne VS Code
4. Klicke links auf das Erweiterungs-Symbol (die vier Quadrate)
5. Suche nach "Extension Pack for Java" und installiere diese Erweiterung

---

## Schritt 3: Den Kursordner anlegen

Jetzt legst du die Ordnerstruktur fuer diesen Kurs an. So weisst du immer, wo deine Dateien sind.

### 3.1 – Hauptordner erstellen

Erstelle irgendwo auf deinem Computer (z.B. auf dem Desktop oder in "Dokumente") einen Ordner namens `java-kurs`.

### 3.2 – Unterordner erstellen

Oeffne den `java-kurs`-Ordner und erstelle darin diese Ordner:

```
java-kurs/
    01-java-basics/
        theory/         <-- Hier liegen die Theorie-Dateien (bereits vorhanden)
        examples/       <-- Hier liegen fertige Beispiele zum Anschauen
        exercises/      <-- Hier liegen die Aufgaben (bereits vorhanden)
        solutions/      <-- Hier speicherst du deine eigenen Loesungen
        meine-uebungen/ <-- Hier tippst du waehrend des Lernens
```

Den Ordner `meine-uebungen` erstellst du selbst – dort schreibst du alle deine eigenen Programme, waehrend du die Theorie durcharbeitest.

### 3.3 – Ordner in VS Code oeffnen

1. Oeffne VS Code
2. Klicke auf "File" (Datei) > "Open Folder" (Ordner oeffnen)
3. Waehle deinen `java-kurs`-Ordner aus
4. Klicke auf "Ordner auswaehlen"

Jetzt siehst du links in VS Code alle deine Ordner und Dateien.

---

## Schritt 4: Dein erstes Programm schreiben

Lass uns sofort loslegen und pruefen, ob alles funktioniert.

### 4.1 – Eine neue Datei erstellen

1. Klicke links in VS Code auf den Ordner `meine-uebungen`
2. Klicke oben auf das Symbol "Neue Datei" (ein Blatt mit einem Plus)
3. Tippe als Dateiname: `HalloWelt.java` und druecke Enter

**Wichtig:** Der Dateiname muss genau so geschrieben sein – grosses H, grosses W, Endung `.java`.

### 4.2 – Den Code eintippen

Tippe folgenden Code genau so in die Datei (nicht kopieren – tippen hilft beim Lernen!):

```java
public class HalloWelt {
    public static void main(String[] args) {
        System.out.println("Hallo, Welt!");
    }
}
```

Speichere die Datei mit `Strg + S` (Mac: `Cmd + S`).

### 4.3 – Das Programm ausfuehren

In VS Code:
1. Klicke oben rechts auf den kleinen Pfeil (Run-Button)
2. Oder: Rechtsklick im Code > "Run Java"

Im Terminal (alternativ):
1. Oeffne das Terminal in VS Code: `Terminal` > `Neues Terminal`
2. Wechsle in den richtigen Ordner: `cd meine-uebungen`
3. Kompiliere: `javac HalloWelt.java`
4. Starte: `java HalloWelt`

Wenn du `Hallo, Welt!` im Terminal siehst – herzlichen Glueckwunsch, es funktioniert!

---

## Wie dieser Kurs aufgebaut ist

Dieser Kurs besteht aus 6 Theorie-Kapiteln, Beispielen, Aufgaben und Loesungen.

**So lernst du am besten:**

1. Lies ein Theorie-Kapitel in Ruhe durch
2. Schau dir das dazugehoerige Beispiel-Programm an
3. Tippe das Beispiel selbst ab und fuehre es aus
4. Aendere etwas und schau was passiert
5. Bearbeite dann die Aufgaben dazu
6. Erst wenn du fertig bist, schau in die Musterloesungen

**Die 6 Kapitel im Ueberblick:**

| Kapitel | Thema | Was du lernst |
|---------|-------|---------------|
| 01 | Einfuehrung | Java installieren, erstes Programm |
| 02 | Variablen | Daten speichern und ausgeben |
| 03 | Kontrollstrukturen | Entscheidungen treffen (wenn...dann...) |
| 04 | Schleifen | Dinge wiederholen |
| 05 | Methoden | Code in Bausteine aufteilen |
| 06 | Erste Klassen | Objekte und echte OOP |

---

## Haeufige Anfaenger-Fehler

Keine Sorge – diese Fehler macht wirklich jeder am Anfang:

**Gross- und Kleinschreibung vergessen:**
Java unterscheidet zwischen `HalloWelt` und `hallowelt`. Der Dateiname muss genau zum Klassennamen passen.

**Semikolon vergessen:**
Fast jede Zeile in Java endet mit einem Semikolon `;`. Fehlt es, gibt es eine Fehlermeldung.

**Geschweifte Klammern nicht geschlossen:**
Jede oeffnende Klammer `{` braucht eine schliessende `}`. VS Code hilft dir dabei – es faerbt zusammengehoerige Klammern ein.

**Fehlermeldungen sind dein Freund:**
Wenn etwas nicht stimmt, beschreibt Java sehr genau, was falsch ist und in welcher Zeile. Lies die Fehlermeldung immer zuerst, bevor du etwas aenderst.

---

Starte jetzt mit Kapitel 01: [theory/01-einfuehrung.md](theory/01-einfuehrung.md)
