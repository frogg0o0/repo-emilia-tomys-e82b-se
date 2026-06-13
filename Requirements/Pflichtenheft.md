# Pflichtenheft

### 1. Erfassung von Drehzahl und Raumtemperatur

- Kontinuierliche Messung der aktuellen Ventilatordrehzahl über Drehzahlsensor <br>
- Kontinuierliche Messung der Raumtemperatur über Temperatursensor <br>
- Automatische Erfassung beider Messgrößen ohne zusätzliche Aktion des Nutzers <br> 
- Erfassung läuft unabhängig vom Nutzer, wird nicht durch dessen Interaktionen beeinflusst

### 2. Anzeige der aktuellen Drehzahl

- Gut sichtbare, intuitiv verständliche Anzeige der aktuellen Drehzahl bei eingeschaltetem Ventilator (z.B. Stufenbalken)<br>
- Einfache, nicht überladene Darstellung <br>
- Automatische Aktualisierung der Anzeige ohne Benutzerinteraktion <br> 
- Barrierefreie Gestaltung für Nutzer mit eingeschränktem Sehvermögen (z.B. kontrastreiche Darstellung)

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

Beim Ausschalten des Ventilators beträgt die Drehzahl 0%.

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
    <td>Die Drehzahl wird ausschließlich durch den Nutzer gesteuert</td>
  </tr>
  <tr>
    <td>Auto</td>
    <td>Die Drehzahl wird automatisch proportional zur erfassten Raumtemperatur angepasst</td>
  </tr>
  <tr>
    <td>Night</td>
    <td>Wie „Auto" mit Begrenzung der maximalen Drehzahl</td>
  </tr>
</table>

- Anzeige des aktuellen Betriebsmodus bei eingeschaltetem Ventilator  <br>
- Sprachunabhängige, für jeden Nutzer intuitiv verständliche Darstellung (z.B. über Symbole)  <br>
- Bei manueller Drehzahländerung im Modus "Auto" oder "Night", wird automatisch auf Modus "Manual" gewechselt
- Modus "Night" sollte nicht lauter als 30dB sein

### 5. Schutzmechanismen

- <b>Temperaturüberwachung</b>: Motortemperatur wird während des Betriebs regelmäßig gemessen
- <b>Überhitzungsschutz</b>: Automatische Abschaltung des Ventilators bei einer Temperatur von über 90°C; Schutz greift innerhalb von 1 Sekunde nach Überschreitung der Temperaturschwelle
- <b>Drehzahlüberwachung</b>: Regelmäßige Prüfung, ob aktuelle Drehzahl die maximal zulässige Drehzahl überschreitet
- <b>Überdrehzahlschutz</b>: Automatische Abschaltung des Ventilators bei Überschreitung der maximalen Drehzahl um +10%; Schutz greift innerhalb von 3 Sekunden.
- <b>Benutzerwarnung</b>: Vor jedem automatischen Abschalten durch einen Schutzeingriff wird der Nutzer durch ein akustisches Signal gewarnt

Überhitzungs- und Überdrehzahlschutz arbeiten unabhängig voneinander, können gleichzeitig auslösen und dürfen sich gegenseitig nicht einschränken.
