# CTS-Seminars
Pentru dezvoltarea unui joc online (cu supereroi) sa se dezvolte o solutie software care sa permita

# Adapter
1. Utilizarea unei librarii externe ce contine caractere Disney.
   -in prezent jocul contine caractere proprii ce fac parte din framework-ul ACME

# Decorator
2. Modificarea in timpul jocului a caracteristicilor unor super-eroi
- in timpul jocului super-eroii pot fi dotati cu echipamente noi
- comportamentul super-eroului se poate modifica dinamic in functie de interactiunea cu celelalte caractere din joc

# FACADE
3. Pentru a permite altor companii sau jucatorilor sa dezvolte solutii externe care sa se conecteze la joc trebuie dezvoltata o
   librarie
- API-ul contine multe clase cu multe detalii
- nu toate clasele sunt documentate
- API-ul trebuie sa ofere o interfata simplificata pentru un set de functii de baza

# COMPOSITE
4. Pentru a gestiona o structura ierarhica de caractere
   (de ex o armata sau un grup de jucatori)
- sa se gaseasca o solutie eficienta care sa permita
  gruparea jucatorilor
- un grup poate contine caractere controlate de jucator
  sau alte grupuri

# FLYWEIGHT
5. Pentru a gestiona eficient (din punct de vedere al memoriei)
   scenariile in care jucatorii interactioneaza cu
   mai multe caractere controlate de calculator
- colectia de caractere coordonate de calculator contine elemente
  de acelasi fel (aceleasi modele 3D)
- spatiul ocupat de un model 3D este semnificativ
- generarea unui astfel de scenariu necesita un spatiu semnificativ
  de memorie pentcu client
- modelele 3D sunt afisate pe ecran la coordonate diferite si pot
  avea texturi de culori diferite
- trebuie gasita o solutie eficienta privind gestiunea acestor situatii

# PROXY
6. Adaugarea unui filtru suplimentar pentru login
- in acest moment login-ul se face prin username si parola
  si in cazul in care parola este gresita utilizatorul
  poate incerca de mai multe ori
- exista atacuri asupra conturilor jucatorilor iar
  atacatorul ghiceste parola aferenta contului
  dupa mai multe incercari
- se doreste modificarea modulului de login prin
  limitarea numarului de incercari la maxim 3
- modulul de login existent trebuie modificat
  fara a intrerupe jocul

# Observer
7. In timpul jocului clientul poate pierde conexiunea la server (din diferite motive). Cand acest lucru se intampla,
   diferitele module din joc trebuie sa reactioneze in consecinta
- trebuie salvata instanta jocului pe masina clientului
- trebuie salvate atributele caracterului
  trebuie notificat clientul
- trebuie reincercata conexiunea