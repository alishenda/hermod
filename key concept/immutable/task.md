# Immutabilité

L'immutabilité est un concept fondamental en programmation fonctionnelle. Elle repose sur l'idée que les données ne doivent pas être modifiées après leur création. Cela conduit à des programmes plus simples et plus faciles à comprendre, car il n'y a pas de risque que l'état des données change de manière imprévisible.

## Pourquoi l'Immutabilité ?

### Avantages de l'Immutabilité
1. **Simplicité** : Le code est plus simple car les valeurs ne changent pas.
2. **Concurrence** : Facilite la programmation concurrente et parallèle. Les objets immuables peuvent être partagés entre plusieurs threads sans risque de race condition.
3. **Débogage et Test** : Plus facile à déboguer et à tester, car les fonctions pures et les données immuables n'ont pas d'effets de bord.

### Exemple en Kotlin
En Kotlin, nous utilisons le mot-clé `val` pour déclarer des variables immuables. Une fois assignée, une variable `val` ne peut pas être réassignée.

```kotlin
val immutableValue = 10
// immutableValue = 15 // Cette ligne provoquerait une erreur de compilation
```

### Collection immutable

Kotlin fournit des versions immuables de ses collections de base, telles `List`, `Map`, et `Set`.

```kotlin
val immutableList = listOf(1, 2, 3, 4, 5)
// immutableList.add(6) // Cette ligne provoquerait une erreur, car la liste est immuable
```

### Transformation de collections
Les collections immuables peuvent être transformées en utilisant des fonctions comme map, filter, etc., qui renvoient 
de nouvelles collections plutôt que de modifier les collections existantes.

```kotlin
val numbers = listOf(1, 2, 3, 4, 5)
val doubledNumbers = numbers.map { it * 2 }
// doubledNumbers est [2, 4, 6, 8, 10] et numbers reste inchangé
```