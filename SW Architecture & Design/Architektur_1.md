# Architektur

Schichtenmodell

• Der Schichtenansatz begünstigt die schrittweise Entwicklung von Systemen. Sobald eine
Schicht entwickelt worden ist, können einige der in dieser Schicht enthaltenen Dienste
für die Benutzer verfügbar gemacht werden.
• Diese Architektur ist veränderbar und portierbar
• Solange die Schnittstellen nicht verändert werden, kann man eine Schicht komplett
durch eine andere ersetzen
• Wenn sich die Schnittstellen einer Schicht hingegen ändern, wird davon nur die
angrenzende Schicht betroffen
• Da bei Schichtensystemen die maschinenabhängigen Eigenschaften in den unteren
Schichten angeordnet sind, können sie relativ leicht auf anderen Computern
implementiert werden, indem man die inneren, maschinenspezifischen Schichten
neu erstellt

![Komponentendiagramm](../ressources/Architektur_1.png)

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
    <td>1.1, 1.3, 1.4</td>
  </tr>
  <tr>
    <td>PersistenceManager</td>
    <td>3.2</td>
  </tr>
</table>

**Verantwortlichkeiten der Komponenten:**



## Schnittstellendefinition



## Technologiestack

| Kategorie                | Technologie / Tool            | Begründung                                                                                                   |
|--------------------------|-------------------------------|--------------------------------------------------------------------------------------------------------------|
| Sprache                  |                               |                                                                                                              |
| Buildsystem              |                               |                                                                                                              |
| Versionskontrolle        | Git + GitHub                  |                                                                                                              |
| Organisation, Tracking   |                               |                                                                                                              |
| IDE                      |                               |                                                                                                              |
| Ausgabe                  |                               |                                                                                                              |
| Dokumentation            |                               |                                                                                                              |
| Codeanalyse              |                               |                                                                                                              |
| Test-Framework           |                               |                                                                                                              |
| Frameworks, Bibliotheken |                               |                                                                                                              |

