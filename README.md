# data-structures-algorithms-java
Studying data structures and algorithms in Java


### linked list
A linked list is a linear data structure made up of nodes, where each node stores a value and a reference (pointer) to the next node in the list. Unlike arrays, elements are not stored in sequential memory locations.

- Insertions and deletions are efficient, as you only need to adjust pointers.
- No direct access by index (unlike arrays).

A linked list allows dynamic growth or reduction, making it useful for scenarios where the collection size changes frequently.


### binary search
Binary search is an efficient algorithm for finding an element in a **ordered array**. It works like this:

1. Define the beginning (start) and end (end) of the array.
2. Calculate the middle (mid).
3. Compare the middle value with the searched value:
    - If they are equal, the element is found.
    - If the middle value is smaller, the search continues in the right half (set start).
    - If it is larger, the search continues in the left half (set end).
4. Repeat until the search is found or all possibilities are exhausted.

Binary search splits the search space with each iteration, making it very fast for large arrays (complexity O(log n)).