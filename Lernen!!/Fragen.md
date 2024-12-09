# Reguläre Prüfungsfragen

### Funktionale Ersetzbarkeit
Erläutern Sie welche Eigenschaft eine Klasse B erfüllen muss, damit die Klasse B eine Klasse A funktional ersetzen kann. Erklären sie in diesem Zusammenhang den Unterschied zwischen der Syntax und der Semantik einer Schnittstelle.
> Eine Klasse B ist dann funktional ersetzbar, wenn B die syntaktische Schnitsstelle von B umfasst und in einem Beliebigen Programm die Klasse A durch B ersetzt werden kann, ohne dass sich die Ergebnisse der Programme ändern. B muss sämtliche Methodenköpfe gleich A implementieren sprich die syntaktisch Schnittstelle muss gleich sein. Weiter muss die Klasse A und B determinitisch für die Aufruffe einer Funktion die gleichen Ergebnisse liefern (oder semantisch identisch sein). Somit beschreibt die Syntax den Klassenaufbau und die Semantik das Ergebniss der Programmausführung.

### Geheimnisprinzip

Eines der Kernkonzepte der objektorientierten Programmierung ist das Geheimnisprinzip (engl. Information Hiding). Erläutern Sie dieses Konzept. Verwenden Sie dazu die Begriffe: Sichtbarkeit, Schnittstelle und Implementierung
> Die Idee hinterdem Geheimnisprinzips ist die Trennung von Nutzungssicht und Implementierungssicht. Dem Nutzer ist nur die Schnittstelle bekannt. Die Implementierung bleibt jedoch verborgen. Dies kann durch das Setzen der Sichtbarkeiten reguliert werden. 

