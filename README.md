# Generic containers 
This project consists of some different generic containers written in Java. All containers inherits from an abstract class Lenkeliste, that in turn implements the interface Liste. 

The containters are: 
- Stabel: a stack (First In First Out))
- Koe: a queue (First In Last Out)
- Prioritetskoe: a priority queue where elements in the list must implement the interface `Comparable`
- IndeksertListe: An indexed list.

The project was Assingment 2 in the course IN1010 at University of Oslo spring 2024. Because of this the class, variable and method names are Norwegian. 

## Installation

No requirements besides java. 

## Instructions

### Kø (Queue)
Methods:
- `leggTil()`: Adds an element last in the list.
- `fjern()`: Removes and returns the first element in the list. 
- `hent()`: Returns the first element in the list, without removing it. 

### Stabel (Stack)
Methods:
- `leggTil()`: Adds an element first in the list.
- `fjern()`: Removes and returns the first element in the list. 
- `hent()`: Returns the first element in the list, without removing it. 

### Prioritetskø (Priority queue)
Methods:
- `leggTil()`: Adds an element to the list based on priority. 
- `fjern()`: Removes and returns the first element in the list. 
- `hent()`: Returns the first element in the list, without removing it.

### Indeksert liste (Indexed list)
Methods:
- `leggTil()`: Adds an element to a specific index in the list. Elements on that index on higher, are moved one place up. 
- `fjern()`: Removes and returns an element on a specific index. 
- `hent()`: Returns the element on specific index, without removing it. 

### Lenkeliste

This is the abstract method the other classes inherits from. Common methods not overridden in the subclasses are:  

- `erTom()`: returns True if the list is empty
- `stoerrelse()`: returns the number of elements in the list.
- `skrivUtRekursivt()`: prints out all elements in the list to the terminal, first to last, using recursion. 
- `skrivUtMotsattRekursivt()`: prints out all elements in the list to the terminal, last to first, using recursion.
- `hentStrRekursivt()`: returns the number of elements in the list, using recursion. 
