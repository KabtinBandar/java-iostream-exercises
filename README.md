# Java I/O Streams Practical Exercises

![Java](https://img.shields.io/badge/Language-Java%20SE-ED8B00?logo=openjdk&logoColor=white)
![Topics](https://img.shields.io/badge/Topics-File%20I%2FO%20%7C%20Streams%20%7C%20Parsing-blue)
![Build](https://img.shields.io/badge/Build-Apache%20Ant%20%2F%20NetBeans-E05D44)
![License](https://img.shields.io/badge/License-MIT-green)

A comprehensive academic practice repository demonstrating Java standard file I/O operations, character streams, buffered readers/writers, tokenization, file statistics, and data processing across structured datasets.

---

## Exercise Catalog

| Module | Core Concepts Demonstrated | Input Data File | Purpose & Functionality |
| :--- | :--- | :--- | :--- |
| **`Q1.java`** | `java.io.File`, file metadata | `test.txt` | Calculates and displays precise file sizes formatted in Bytes, Kilobytes (KB), and Megabytes (MB). |
| **`Q2.java`** | `FileReader`, `BufferedReader`, string tokenization | `date.txt` | Reads persisted date strings, splits components (`day`, `month`, `year`), and validates date values. |
| **`Q3.java`** | Stream parsing, continuous numeric aggregation | `profit.txt` | Computes statistical average profit values parsed from multi-line text files. |
| **`Q4.java`** | `ArrayList`, Collections sorting, data filtering | `degrees.txt` | Analyzes student grade datasets; computes maximum, minimum, and counts passing grades. |
| **`Q5.java`** | `BufferedReader`, `BufferedWriter`, `FileWriter` | `data.txt` ➔ `copy.txt` | Implements buffered character-by-character file cloning and piping with buffer flushing. |
| **`Q6.java`** | Record parsing, conditional counting | `salary.txt` | Filters and aggregates employee payroll records matching salary threshold conditions. |

---

## Project Structure

```
java-iostream-exercises/
├── src/
│   └── io/
│       ├── Q1.java            # File size calculation utility
│       ├── Q2.java            # Date stream parser
│       ├── Q3.java            # Financial average aggregator
│       ├── Q4.java            # Grade analytics & collections
│       ├── Q5.java            # File copy pipe
│       └── Q6.java            # Payroll parser
├── test.txt                   # Sample test payload
├── date.txt                   # Formatted date payload
├── profit.txt                 # Numerical profit dataset
├── degrees.txt                # Student scores dataset
├── data.txt                   # Source text payload for cloning
├── salary.txt                 # Employee salary records
├── build.xml                  # Apache Ant build specification
└── nbproject/                 # NetBeans project configuration
```

---

## Compilation & Execution

```bash
# Compile all exercises
javac -d bin src/io/*.java

# Run individual modules (ensure working directory contains input txt files)
java -cp bin io.Q1
java -cp bin io.Q3
java -cp bin io.Q4
java -cp bin io.Q5
java -cp bin io.Q6
```

---

## Author & License

- **Developer:** Hossam Ahmed ([@HossamAhmedSoft](https://github.com/HossamAhmedSoft))
- **License:** MIT
