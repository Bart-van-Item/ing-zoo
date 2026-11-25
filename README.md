# Zoo Java Console Application
---
## Git

Voor het maken van deze opdracht wordt er gebruik gemaakt van het versiebeheersysteem Git.

Gebruikte **IDE**: [IntelliJ IDEA](https://www.jetbrains.com/idea/). (**Niet verplicht**)

Gebruikte **SDK**: [JDK 1.8](https://bitbucket.org/kychu/zoo/downloads/java-1.8.0-openjdk-1.8.0.212-3.b04.redhat.windows.x86_64.zip).

Mocht er problemen zijn met het openen van dit project, creëer dan een nieuw project binnen jouw IDE en kopieer de Java bestanden uit `src/com/ing/zoo`

Stappen:

1. Clone deze repository.
2. Maak een nieuwe repository aan, bijvoorbeeld op [Github](https://www.github.com).
3. Push jouw veranderingen naar jouw repository.
4. Maak jouw repository openbaar (public).
4. Als de applicatie af is, push dan de laatste versie naar jouw `master` branch.

--- 
## Opdracht
- Maak de applicatie af.
- Reorganiseer eventueel de folder structuur.
- Refactor eventueel de code (denk goed na over de class structure).
	- Probeer er voor de zorgen dat je bijvoorbeeld geen EatMeat methode kan aanroepen op een Zebra object.
- Voeg 2 nieuwe dieren toe.
---
## Eisen

Bij elke command laat je het resultaat in de console  zien.

- Als je de [hello] command uitvoert zonder dat er een naam is ingevuld zeggen alle dieren hallo.
- Als er wel een naam is ingevuld [hello henk] zegt alleen dat dier hallo 
- Als je de [give leaves] command uitvoert krijgen alle herbivores leaves.
- Als je de [give meat] command uitvoert krijgen alle carnivores meat.
- Als je de [perform trick] command uitvoert doen alle dieren die dat kunnen hun trucje.

---
## Checklist

### Assignment
- [x] Finish the application
- [x] Reorganise the folder structure (`animals` and `traits` packages)
- [x] Refactor the class structure: an abstract `Animal` class plus `Herbivore`, `Carnivore` and `TrickPerformer` interfaces, so `eatMeat` cannot be called on a `Zebra`
- [x] Add 2 new animals (`Shark` and `Beaver`)

### Requirements
- [x] `hello`: all animals say hello
- [x] `hello henk`: only that animal says hello
- [x] `give leaves`: all herbivores get leaves
- [x] `give meat`: all carnivores get meat
- [x] `perform trick`: all animals that can do a trick perform it

### Extras
- [x] The program keeps asking for commands until you type `exit`
- [x] `help` lists all commands, and unknown commands point to it
- [x] `hello shark` works too: you can say hello by type, not only by name
- [x] The pig now says "Oink Oink" instead of "splash"
- [x] A small easter egg: try `hello ing`
