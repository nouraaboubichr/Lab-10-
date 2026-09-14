# Exercice 1 — Triplet homogène

* L’objectif est de définir une classe générique `Triplet<T>` permettant de stocker et manipuler trois objets du même type, tout en conservant la sécurité de type.
* Le paramètre `<T>` représente le type des trois éléments du triplet.
* La classe contient trois attributs `premier`, `second` et `troisieme`, ainsi que leurs accesseurs.
* La méthode `affiche()` permet d’afficher les trois éléments du triplet.
* Le programme de test utilise un triplet d’entiers et un triplet de chaînes.
* Le compilateur garantit qu’on ne mélange pas de types différents dans un même `Triplet<T>`.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />

# Exercice 2 — Triplet hétérogène

* L’objectif est d’étendre la notion de générique à plusieurs paramètres de type afin de gérer des objets de types différents dans la même structure.
* La classe `TripletH<A,B,C>` permet de stocker trois objets de types potentiellement distincts.
* Les paramètres `<A>`, `<B>` et `<C>` représentent respectivement le type du premier, du second et du troisième élément.
* Chaque méthode `getXxx()` renvoie directement le type correspondant, ce qui évite les conversions de type.
* Le programme de test utilise différentes combinaisons de types comme `Integer`, `String`, `Double` et `Boolean`.
* Cette approche permet de créer une structure générique flexible tout en conservant la sécurité de type.

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040018.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040044.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 040058.png" />

<img width="1270" height="674" alt="1" src="images/Capture d'écran 2026-09-10 050915.png" />
