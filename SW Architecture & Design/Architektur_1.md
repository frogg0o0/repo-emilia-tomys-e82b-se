# Architektur

### Schichtenmodell

- Einfache Wartung und Austauschbarkeit
- Schrittweise Entwicklung und hohe Portierbarkeit

<br>

![Komponentendiagramm](../ressources/Architektur_1.png)

<br>

<table>
  <tr>
    <th>Komponenete</th>
    <th>Requirements</th>
  </tr>
  <tr>
    <td>UserInterface</td>
    <td>2.1, 2.2, 2.3, 2.4, 3.1, 4.5</td>
  </tr>
  <tr>
    <td>FanLogic</td>
    <td>1.3, 3.1, 4.1</td>
  </tr>
  <tr>
    <td>HardwareAbstraction</td>
    <td>1.1, 1.3, 1.4, 3.2</td>
  </tr>
  <tr>
    <td>PersistenceManager</td>
    <td>3.3</td>
  </tr>
</table>

**Verantwortlichkeiten der Komponenten:**

<table>
  <tr>
    <th>Komponenete</th>
    <th>Verantwortlichkeit</th>
  </tr>
  <tr>
    <td>UserInterface</td>
    <td>Anzeige von Drehzahl und Betriebsmodus</td>
  </tr>
  <tr>
    <td>FanLogic</td>
    <td>User Interaktionen auswerten und an die Hardware weitergeben</td>
  </tr>
  <tr>
    <td>HardwareAbstraction</td>
    <td>Sensoren durch Simulatoren abstrahieren</td>
  </tr>
  <tr>
    <td>PersistenceManager</td>
    <td>Speichern von Betriebswerten zum Wiederherstellen</td>
  </tr>
</table>

<br><hr />

## Schnittstellendefinition

<table>
  <tr>
    <th>Ziel</th>
    <th>Quelle</th>
    <th>Schnittstellen</th>
  </tr>
  <tr>
    <td><code>fanLogic</code></td>
    <td><code>userInterface</code></td>
    <td><code>togglePower()</code>, <code>raiseSpeed()</code>, <code>lowerSpeed()</code>, <code>getCurrentLevel()</code>, <code>getOperatingMode()</code>, <code>isOn()</code></td>
  </tr>
  <tr>
    <td><code>hardwareAbstraction</td>
    <td><code>fanLogic</td>
    <td><code>turnOff()</code>, <code>turnOn()</code>, <code>setMotorSpeed(int targetRpm)</code>, <code>isPowerOn()</code>, <code>getMaxRpm()</code></td>
  </tr>
  <tr>
    <td><code>persistenceManager</code></td>
    <td><code>fanLogic</code></td>
    <td><code>loadLastSpeed()</code>, <code>saveLastSpeed()</code></td>
  </tr>
</table>

<br><hr />

## Technologiestack

Im Folgenden werden die Technologien und Werkzeuge aufgeführt, die für die Umsetzung des Projekts eingesetzt wurden. Die Entscheidung für diese basiert auf vorhandenen Vorerfahrungen, der bereits eingerichteten Entwicklungsumgebung sowie persönlichen Präferenzen.

<table>
  <tr>
    <th>Kategorie</th>
    <th>Technologie/Tool</th>
  </tr>
  <tr>
    <td>Programmiersprache</td>
    <td>Java (Eclipse Temurin JDK 21)</td>
  </tr>
  <tr>
    <td>Versionskontrolle</td>
    <td>Git + GitHub</td>
  </tr>
  <tr>
    <td>IDE</td>
    <td>IntelliJ IDEA</td>
  </tr>
  <tr>
    <td>Dokumentation & Modellierung</td>
    <td>Markdown + draw.io</td>
  </tr>
  <tr>
    <td>Test-Framework</td>
    <td>JUnit</td>
  </tr>
  <tr>
    <td>Frameworks, Bibliotheken</td>
    <td>JavaSwing für die GUI</td>
  </tr>
</table>
