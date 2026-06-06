# Pflichtenheft

### 1. Erfassung von Drehzahl und Raumtemperatur

Kontinuierliche Messung der aktuellen Ventilatordrehzahl über einen Drehzahlsensor.
Kontinuierliche Messung der Raumtemperatur über einen Temperatursensor.
Beide Messgrößen werden automatisch und ohne zusätzliche Aktion des Nutzers erfasst.
Die Erfassung läuft unabhängig vom Nutzer und wird durch dessen Interaktionen nicht beeinflusst.

### 2. Anzeige der aktuellen Drehzahl

Gut sichtbare, intuitiv verständliche Anzeige der aktuellen Drehzahl bei eingeschaltetem Ventilator als Stufenbalken.
Einfache, nicht überladene Darstellung.
Automatische Aktualisierung der Anzeige ohne erforderliche Benutzerinteraktion.
Barrierefreie Gestaltung für Nutzer mit eingeschränktem Sehvermögen (z.B. kontrastreiche Darstellung).

### 3. Einstellung der gewünschten Drehzahl

Stufenweise Einstellung der Zieldrehzahl in fünf Stufen:

<table>
  <tr>
    <th>Stufe</th>
    <th>Zieldrehzahl</th>
  </tr>
  <tr>
    <td>1</td>
    <td>10%</td>
  </tr>
  <tr>
    <td>2</td>
    <td>25%</td>
  </tr>
  <tr>
    <td>3</td>
    <td>50%</td>
  </tr>
  <tr>
    <td>4</td>
    <td>75%</td>
  </tr>
  <tr>
    <td>5</td>
    <td>100%</td>
  </tr>
</table>

Dauerhafte Speicherung der zuletzt eingestellten Drehzahl → beim nächsten Einschalten wird diese automatisch wiederhergestellt.

### 4. Betriebsmodi

Drei wählbare Betriebsmodi:

<table>
  <tr>
    <th>Modus</th>
    <th>Verhalten</th>
  </tr>
  <tr>
    <td>Manual</td>
    <td>Die Drehzahl wird ausschließlich durch den Nutzer gesteuert.</td>
  </tr>
  <tr>
    <td>Auto</td>
    <td>Die Drehzahl wird automatisch proportional zur erfassten Raumtemperatur angepasst.</td>
  </tr>
  <tr>
    <td>Night</td>
    <td>Wie „Auto", jedoch mit Begrenzung der maximalen Drehzahl auf 30 %.</td>
  </tr>
</table>

Anzeige des aktuellen Betriebsmodus bei eingeschaltetem Ventilator.  <br>
Sprachunabhängige, für jeden Nutzer intuitiv verständliche Darstellung der Modi (z. B. über Symbole).  <br>
Wechsel des Betriebsmodus durch einmaliges Drücken der Einschalttaste.  <br>
Ändert der Nutzer im Modus „Auto" oder „Night" die Drehzahl manuell, wird automatisch in den Modus „Manual" gewechselt.

### 5. Schutzmechanismen (Motorschutz)

- <b>Temperaturüberwachung</b>: Die Motortemperatur wird während des Betriebs regelmäßig gemessen.
- <b>Überhitzungsschutz</b>: Automatische Abschaltung des Ventilators bei zu hoher Motortemperatur. Der Schutz greift innerhalb von 1 Sekunde nach Überschreitung der Temperaturschwelle.
- <b>Drehzahlüberwachung</b>: Regelmäßige Prüfung, ob die aktuelle Drehzahl die maximal zulässige Drehzahl überschreitet.
- <b>Überdrehzahlschutz</b>: Automatische Abschaltung des Ventilators bei Überschreitung der maximalen Drehzahl. Der Schutz greift innerhalb von 3 Sekunden.
- <b>Benutzerwarnung</b>: Vor jedem automatischen Abschalten durch einen Schutzeingriff wird der Nutzer durch ein akustisches Signal gewarnt.

Überhitzungs- und Überdrehzahlschutz arbeiten unabhängig voneinander, können gleichzeitig auslösen und dürfen sich gegenseitig nicht einschränken.
