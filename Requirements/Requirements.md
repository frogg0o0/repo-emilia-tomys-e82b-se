### 1. Funktionale Requirements

<table>
  <thead>
    <tr>
      <th>Nr.</th>
      <th>Titel</th>
      <th>Beschreibung</th>
      <th>Priorität</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1.1</td>
      <td>Erfassung der aktuellen Drehzahl</td>
      <td>Die aktuelle Drehzahl des Ventilators wird zuverlässig gemessen.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>1.2</td>
      <td>Erfassung der aktuellen Raumtemperatur</td>
      <td>Die aktuelle Raumtemperatur wird zuverlässig gemessen.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>2.1</td>
      <td>Drehzahlanzeige</td>
      <td>Die aktuelle Drehzahl des Ventilators wird dem Nutzer bei eingeschaltenen Ventilator angezeigt.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>3.1</td>
      <td>Stufenweise Drehzahleinstellung</td>
      <td>Der Benutzer kann die gewünschte Zieldrehzahl in fünf Stufen einstellen: 10 %, 25 %, 50 %, 75 %, 100 %.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>3.2</td>
      <td>Speicherung der letzten Drehzahleinstellung</td>
      <td>Die zuletzt eingestellte Drehzahl wird dauerhaft gespeichert und beim nächsten Einschalten des Ventilators automatisch wiederhergestellt.</td>
      <td>Kann</td>
    </tr>
    <tr>
      <td>4.1</td>
      <td>Auswahl verschiedener Betriebsmodi</td>
      <td>Der Ventilator unterstützt drei Betriebsmodi: "Manual", "Auto" und "Night".</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>4.2</td>
      <td>Betriebsmodus Manual</td>
      <td>Im Modus "Manual" wird die Drehzahl ausschließlich durch den Nutzer gesteuert.</td>
      <td>Kann</td>
    </tr>
    <tr>
      <td>4.3</td>
      <td>Betriebsmodus Auto</td>
      <td>Im Modus "Auto" wird die Drehzahl automatisch proportional zur erfassten Raumtemperatur angepasst.</td>
      <td>Kann</td>
    </tr>
    <tr>
      <td>4.4</td>
      <td>Betriebsmodus Night</td>
      <td>Im Modus "Night" wird die Drehzahl automatisch proportional zur erfassten Raumtemperatur angepasst mit Begrenzung der maximalen Drehzahl auf 30%.</td>
      <td>Kann</td>
    </tr>
    <tr>
      <td>4.5</td>
      <td>Anzeige des aktuellen Betriebsmodus</td>
      <td>Der Name des aktuellen Betriebsmodus wird bei eingeschaltenen Ventialtor dauerhaft angezeigt.</td>
      <td>Kann</td>
    </tr>
    <tr>
      <td>4.6</td>
      <td>Wechseln des aktuellen Betriebsmodus</td>
      <td>Der aktuelle Betriebsmodus wird durch einmaliges Drücken der Einschalttaste gewechselt.</td>
      <td>Kann</td>
    </tr>
    <tr>
      <td>4.7</td>
      <td>Wechseln in "Manual" bei Nutzereingriff</td>
      <td>Ändert der Nutzer im Modus "Night" oder "Auto" die Drehzahl, wird automatisch in den "Manual"-Modus gewechselt.</td>
      <td>Kann</td>
    </tr>
    <tr>
      <tr>
      <td>5.1</td>
      <td>Temperaturüberwachung des Motors</td>
      <td>Die Temperatur des Motors wird während dem Betrieb regelmäßig gemessen.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>5.2</td>
      <td>Überhitzungsschutz</td>
      <td>Der Ventilator schaltet sich automatisch bei zu hoher Motortemperatur ab.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>5.3</td>
      <td>Überwachung der Drehzahl</td>
      <td>Es wird regelmäßig geprüft, ob die aktuelle Drehzahl die maximale Drehzahl überschreitet.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>5.4</td>
      <td>Überdrehzahlschutz</td>
      <td>Der Ventilator schaltet sich automatisch bei Überschreitung der maximalen Drehzahl ab.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>5.5</td>
      <td>Benutzerinformation bei Schutzeingriff</td>
      <td>Vor dem automatischen Abschalten durch Schutzeingriffe wird der Nutzer durch ein akustisches Signal gewarnt.</td>
      <td>Muss</td>
    </tr>
  </tbody>
  </tbody>
</table>

### 2. Nicht-Funktionale Requirements
<table>
  <thead>
    <tr>
      <th>Nr.</th>
      <th>Titel</th>
      <th>Beschreibung</th>
      <th>Priorität</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1.3</td>
      <td>Automatische Erfassung</td>
      <td>Die aktuelle Drehzahl des Ventilators und die Raumtemperatur werden ohne zusätzliche Aktion des Nutzers gemessen.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>1.4</td>
      <td>Unbeeinflusste Erfassung</td>
      <td>Die Erfassung der aktuelle Drehzahl des Ventilators und der Raumtemperatur werden nicht durch Nutzerinteraktionen beeinflusst.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>2.2</td>
      <td>Intuitive Anzeige der Drehzahl</td>
      <td>Die aktuelle Drehzahl wird in einer einfachen und verständlichen Form dargestellt.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>2.3</td>
      <td>Automatische Aktualisierung der Anzeige</td>
      <td>Die Anzeige der aktuellen Drehzahl wird automatisch aktualisiert, ohne dass eine Benutzerinteraktion erforderlich ist.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>2.4</td>
      <td>Barrierefreie Anzeige der Drehzahl (Sehschwäche)</td>
      <td>Die Anzeige ist auch für Nutzer mit eingeschränktem Sehvermögen gut erkennbar.</td>
      <td>Muss</td>
    </tr>
    <tr>
      <td>4.8</td>
      <td>Intuitive Anzeige des Betriebsmodus</td>
      <td>Die Betriebsmodi werden verständlich für jeden Nutzer angezeigt, unabhängig von der Sprache.</td>
      <td>Soll</td>
    </tr>
    <tr>
      <td>5.6</td>
      <td>Reaktionszeit des Überhitzungsschutzes</td>
      <td>Der Überhitzungsschutz greift innerhalb von einer Sekunde nach Überschreitung der Temperaturschwelle.</td>
      <td>Soll</td>
    </tr>
    <tr>
      <td>5.7</td>
      <td>Reaktionszeit des Überdrehzahlschutz</td>
      <td>Der Überdrehzahlschutz greift innerhalb von 3 Sekunden nach Überschreitung der maximalen Drehzahl.</td>
      <td>Soll</td>
    </tr>
  </tbody>
</table>

### 3. Abhängigkeiten zwischen Requirements
<table>
  <thead>
    <tr>
      <th>Requirement-Nr.</th>
      <th>Zusammenhang / Abhängigkeit / Konfliktbeschreibung</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1.1 → 2.1</td>
      <td>Die Drehzahlanzeige (1.2) setzt voraus, dass die Drehzahl erfasst wird (1.1).</td>
    </tr>
    <tr>
      <td>1.1 → 5.4, 5.5</td>
      <td>Die Überwachung und der Schutz vor Überdrehzahl (5.4, 5.5) basieren auf der erfassten Drehzahl (1.1).</td>
    </tr>
    <tr>
      <td>1.2 → 4.3, 4.4</td>
      <td>Der "Auto"- und "Night"-Modus (4.3,4.4) benötigen die Temperaturerfassung (1.2) als interne Regelgröße.</td>
    </tr>
    <tr>
      <td>5.1 → 5.2</td>
      <td>Der Überhitzungsschutz (5.2) setzt voraus, dass die Motortemperatur überwacht wird (5.1).</td>
    </tr>
    <tr>
      <td>5.3 → 5.2, 5.5</td>
      <td>Die Benutzerwarnung (5.3) setzt voraus, dass ein Schutzeingriff stattfindet (5.2, 5.5).</td>
    </tr>
    <tr>
      <td>5.4 → 5.5</td>
      <td>Der Überdrehzahlschutz (5.5) setzt voraus, dass die maximale Drehzahl überwacht wird (5.4).</td>
    </tr>
    <tr>
      <td>4.1 → 4.2, 4.3, 4.4</td>
      <td>Die einzelnen Modi (4.2–4.4) setzen voraus, dass die Modusauswahl grundsätzlich unterstützt wird (4.1).</td>
    </tr>
    <tr>
      <td>4.7 → 3.1</td>
      <td>Das Wechseln in den Manual-Modus bei Nutzereingriff (4.7) setzt voraus, dass eine manuelle Drehzahleinstellung möglich ist (3.1).</td>
    </tr>
  </tbody>
</table>

### 4. Konflikte zwischen Requirements
<table>
  <thead>
    <tr>
      <th>Requirement-Nr.</th>
      <th>Zusammenhang / Abhängigkeit / Konfliktbeschreibung</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>5.2, 5.6 ↔ 5.4, 5.7</td>
      <td>Überhitzungsschutz und Überdrehungsschutz können gleichzeitig auftauchen und dürfen sich nicht gegenseitig einschränken.</td>
    </tr>
  </tbody>
</table>

### 5. Zusammengehörigkeiten zwischen Requirements
<table>
  <thead>
    <tr>
      <th>Requirement-Nr.</th>
      <th>Zusammenhangengehörigkeiten</th>
    </tr>
  </thead>
  <tbody>
    <tr>
      <td>1.1, 1.2, 5.1, 5.3</td>
      <td>Erfassen wichtiger Daten.</td>
    </tr>
    <tr>
      <td>2.1, </td>
      <td>Anzeige oder so.</td>
    </tr>
  </tbody>
</table>
