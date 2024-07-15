# Les Fonctions Pures

Les fonctions pures sont un concept fondamental en programmation fonctionnelle. Une fonction pure se caractérise par 
deux propriétés principales : 
- elle produit toujours le même résultat pour les mêmes entrées 
- elle n'a pas d'effets de bord. 

Cela signifie qu'une fonction pure ne dépend que de ses paramètres d'entrée et n'interagit pas avec l'extérieur
en modifiant des variables globales, en effectuant des opérations d'entrée/sortie ou en lançant des exceptions.

Par exemple, une fonction qui additionne deux nombres sans modifier d'autres variables est une fonction pure. 

Les fonctions pures facilitent la compréhension et le test du code, car elles garantissent une prédictibilité et une 
isolation totale. De plus, elles favorisent le parallélisme et la concurrence, 
car l'absence d'effets de bord évite les conflits entre différents threads ou processus.
