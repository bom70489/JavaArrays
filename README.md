# Java Array Programming Exercises and Algorithmic Solvers

Welcome to this repository containing a curated collection of Java programs focusing primarily on **Arrays (1D and 2D)**, **Matrix Manipulations**, and **Grid-based Algorithms**. These exercises demonstrate array indexing, dimensional translation, sorting, and coordinate-based logic.

---

## 📂 Table of Contents
1. [Logical Categories & Concepts](#-logical-categories--concepts)
2. [Complete File Directory & Technical Breakdown](#-complete-file-directory--technical-breakdown)
   - [2D Matrix & Grid Manipulations](#1-2d-matrix--grid-manipulations)
   - [1D Array Algorithms & Sorting](#2-1d-array-algorithms--sorting)
   - [Basic Logic & Number Manipulations](#3-basic-logic--number-manipulations)
3. [Compilation and Execution Guide](#-compilation-and-execution-guide)
4. [Key Educational Reflections & Architectural Trade-offs](#-key-educational-reflections--architectural-trade-offs)
5. [Conclusion](#-conclusion)

---

## 🧠 Logical Categories & Concepts

This repository is structured around array structures and matrix logic:

| Category | Key Concepts Covered | Target Java Files |
| :--- | :--- | :--- |
| **Matrix & Grid Manipulation** | 2D Arrays, Diagonal Checks, Coordinate Translations, Border logic, Directions | `Checkerboard_Pattern.java`, `Cross_Matrix.java`, `Horizontal_Flip.java`, `Minesweeper_number.java`, `Nested_Border.java`, `Q5_Arrays.java`, `RC_sums.java`, `Rotate_Matrix.java`, `Set_Matrix_Zeroes.java`, `Transpose_Matrix.java` |
| **1D Arrays & Sorting** | Array Sorting, Percentiles, Index Arithmetic | `Grading_2_Sort.java` |
| **Control Flow & Logic** | Modulo Divisibility, Loops, State Counters | `HotandCool.java`, `OddEven.java` |

---

## 🔍 Complete File Directory & Technical Breakdown

### 1. 2D Matrix & Grid Manipulations

#### 🟦 `Checkerboard_Pattern.java`
*   **Concepts**: Alternating grid formulas, nested loops.
*   **Description**: Generates an $N \times N$ board displaying alternating `'X'` and `'O'` characters based on the coordinates parity: `(row + col) % 2 == 0`.
*   **Example**:
    *   **Input**: `3`
    *   **Output**:
        ```text
        X O X 
        O X O 
        X O X 
        ```

#### ❌ `Cross_Matrix.java`
*   **Concepts**: Square matrix diagonal conditions (`row == col` and `row + col == N - 1`).
*   **Description**: Creates an $N \times N$ matrix displaying a geometric cross of `'*'` along the primary and secondary diagonals, with `'.'` elsewhere.
*   **Example**:
    *   **Input**: `5`
    *   **Output**:
        ```text
        * . . . *
        . * . * .
        . . * . .
        . * . * .
        * . . . *
        ```

#### ↔️ `Horizontal_Flip.java`
*   **Concepts**: Row-wise index reversal, 2D matrix transformation.
*   **Description**: Flips an $R \times C$ matrix horizontally by reversing the elements of each row in-place or into a destination matrix.
*   **Example**:
    *   **Input**:
        ```text
        2 3
        1 2 3
        4 5 6
        ```
    *   **Output**:
        ```text
        3 2 1 
        6 5 4 
        ```

#### 💣 `Minesweeper_number.java`
*   **Concepts**: Matrix exploration, 8-directional neighbor navigation, boundary checks.
*   **Description**: Solves the standard Minesweeper clue grid. Given a 2D grid containing mines (`*`) and empty spaces (`-`), it replaces empty spaces with the count of adjacent mines.
*   **Example**:
    *   **Input**:
        ```text
        3 3
        * - -
        - * -
        - - -
        ```
    *   **Output**:
        ```text
        * 2 1
        2 * 1
        1 1 1
        ```

#### 🔲 `Nested_Border.java`
*   **Concepts**: Boundary constraints checking (`i == 0 || j == 0 || i == R-1 || j == C-1`).
*   **Description**: Sets the outermost border of an $R \times C$ 2D matrix to `"1"` and the inside cells to `"0"`, outputting the total sum of the border elements.
*   **Example**:
    *   **Input**: `3 3`
    *   **Output**:
        ```text
        1 1 1
        1 0 1
        1 1 1

        Total sum = 8
        ```

#### 💺 `Q5_Arrays.java`
*   **Concepts**: Multi-conditional index matching, seating arrangement generation.
*   **Description**: Maps a custom zoning layout into an $R \times C$ 2D character array:
    *   First row (`i == 0`) is filled with `'V'` (VIP).
    *   Outer columns (`j == 0 || j == C - 1`) are filled with `'A'` (Aisle).
    *   Main diagonal (`i == j`) is filled with `'L'` (Luxury).
    *   Remaining cells are `'N'` (Normal).
*   **Example**:
    *   **Input**: `4 4`
    *   **Output**:
        ```text
        V V V V 
        A L N A 
        A N L A 
        A N N L 
        ```

#### ➕ `RC_sums.java`
*   **Concepts**: Horizontal/Vertical dimension aggregation, transposing.
*   **Description**: Reads a matrix, builds its transpose, and computes the sum of each individual row and column.
*   **Example**:
    *   **Input**:
        ```text
        2 3
        1 2 3
        4 5 6
        ```
    *   **Output**:
        ```text
        Row 0 sum = 6
        Row 1 sum = 15
        Column 0 sum = 5
        Column 1 sum = 7
        Column 2 sum = 9
        ```

#### 🔄 `Rotate_Matrix.java`
*   **Concepts**: 90-degree clockwise matrix rotation formula (`dest[i][j] = src[N - 1 - j][i]`).
*   **Description**: Rotates an $N \times N$ square matrix 90 degrees clockwise.
*   **Example**:
    *   **Input**:
        ```text
        3
        1 2 3
        4 5 6
        7 8 9
        ```
    *   **Output**:
        ```text
        7 4 1 
        8 5 2 
        9 6 3 
        ```

#### 🫥 `Set_Matrix_Zeroes.java`
*   **Concepts**: Matrix space optimization, state caching flags.
*   **Description**: Checks if any element in a matrix is `0`. If so, its entire row and column are set to `0`. Uses separate arrays for rows and columns to cache zeroes, avoiding cascade failures during linear scanning.
*   **Example**:
    *   **Input**:
        ```text
        3 3
        1 1 1
        1 0 1
        1 1 1
        ```
    *   **Output**:
        ```text
        1 0 1 
        0 0 0 
        1 0 1 
        ```

#### 📐 `Transpose_Matrix.java`
*   **Concepts**: Grid transpose transformation (`sort[j][i] = matrix[i][j]`).
*   **Description**: Transposes an $R \times C$ rectangular matrix into a $C \times R$ matrix.
*   **Example**:
    *   **Input**:
        ```text
        2 3
        1 2 3
        4 5 6
        ```
    *   **Output**:
        ```text
        1 4 
        2 5 
        3 6 
        ```

---

### 2. 1D Array Algorithms & Sorting

#### 📊 `Grading_2_Sort.java`
*   **Concepts**: Array sorting, percentile calculations (`(P * (N + 1)) / 100`).
*   **Description**: Sorts a 1D array of scores and maps them into percentile-based grades (A-F) according to 10%, 30%, 50%, 70%, and 90% boundary indices.

---

### 3. Basic Logic & Number Manipulations

#### 🔥❄️ `HotandCool.java`
*   **Concepts**: Range iteration, multiples check, counters.
*   **Description**: Classifies numbers 1 to 30 into `Super-Hot` (divisible by 2 and 3), `Warm` (divisible by 2), `Cool` (divisible by 3), and `Cold` categories.

#### 🔢 `OddEven.java`
*   **Concepts**: Arithmetic range processing, loop variable side-effects.
*   **Description**: Loops through a user range, extracting digits of numbers divisible by 3 or 5 to count odd and even digits. Mutates the loop index directly inside the loop (`i /= 10`), serving as a demonstration of index variable side effects.

---

## 💻 Compilation and Execution Guide

To compile and run any of these files, ensure you have a Java Development Kit (JDK 8+) installed.

### 1. Compile a Program
```bash
javac Checkerboard_Pattern.java
```

### 2. Run the Program
```bash
java Checkerboard_Pattern
```

---

## 🎓 Key Educational Reflections & Architectural Trade-offs

Through these array and matrix exercises, several fundamental engineering principles are highlighted:

1.  **State Isolation vs. Cascade Bugs (`Set_Matrix_Zeroes.java`)**
    *   If you zero out rows and columns immediately during your scan, you'll overwrite values that haven't been evaluated yet, causing a "cascade" bug where the entire matrix becomes zeroes.
    *   The solution caches states in two lightweight 1D arrays (`zeroRows` of size $R$, `zeroCols` of size $C$). This demonstrates how storing metadata can save you from high-overhead structures or incorrect state transformations.

2.  **Efficient Neighbors Query (`Minesweeper_number.java`)**
    *   Iterating 8 coordinates manually with separate conditionals is error-prone. The standard game-dev approach of using offset arrays (looping `di` and `dj` from -1 to 1) allows clean, reusable coordinate checks.

3.  **Transposition vs Rotation**
    *   Transposition swaps rows and columns (`[i][j] -> [j][i]`). Rotation shifts coordinates across indices. These patterns form the core foundation of graphics engines, 2D physics layouts, and image processing.

---

## 🏁 Conclusion

This repository demonstrates the power of arrays as foundational data structures in Java. Through spatial coordinates, nested iterations, boundary definitions, and index mathematics, these programs showcase how to structure complex layout models. They teach crucial lessons about loop index invariants, synchronization of states, space-time optimizations, and coordinate system boundaries.