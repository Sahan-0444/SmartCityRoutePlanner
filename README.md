## 🧑‍🤝‍🧑 Team Members

| Name | Index no |
|---------|----------------|
| Sahan Thejana | 22UG3-0444 |
| Yasith Wijesuriya | 22UG3-0723 |
| Methmi Ekanayaka | 22UG3-0107 |
|  |  |

# 🏙️ Smart City Route Planner

## 📘 Overview
**Smart City Route Planner** is a console-based Java program designed to model a city's transport network using **graph data structures**.  
It demonstrates how **linear data structures**, **trees**, **hashing**, and **graphs** can be integrated to represent and manage real-world city connections between locations.

This project is part of **CIT300 - Data Structures and Algorithms** (Week 10 Graded Practical Assignment) and contributes **10%** to the final module grade.

---

## 🎯 Objectives
- Represent city locations and roads using **graph representations** (Adjacency List / Matrix)
- Manage locations (add/remove) and roads dynamically
- Display all connections between locations
- Use **queues/stacks** for route traversal (BFS/DFS)
- Demonstrate the link between **trees (AVL Tree)** and graphs by storing and listing location data in a balanced tree
- Provide a **menu-driven interface** with clear console outputs and input validation

---

## 🧩 Features
✅ Add or remove locations  
✅ Add or remove roads between locations  
✅ Display all connections in the graph  
✅ View all locations stored in an **AVL Tree (alphabetical order)**  
✅ Menu-driven user interface  
✅ Input validation and clean console design  

---

## 🏗️ System Design

### 1. **Graph Representation**
- Implemented using an **Adjacency List** (`HashMap<String, List<String>>`)
- Supports bidirectional connections (undirected roads)

### 2. **AVL Tree**
- Stores location names alphabetically
- Demonstrates tree balancing and sorted traversal

### 3. **Menu Interface**
- Provides all options to the user
- Handles invalid input gracefully

---

## 🧠 Data Structures Used
| Data Structure | Usage |
|----------------|--------|
| **Graph (Adjacency List)** | Stores city locations and roads |
| **AVL Tree** | Manages sorted location data |
| **Queue/Stack** | Used for route traversal (can be extended with BFS/DFS) |
| **Linked List** | Implicit in adjacency list representation |

---

## 🧑‍🤝‍🧑 Team Role Distribution

| Member | Responsibility |
|---------|----------------|
| **Member 1** | Design and implement the Graph data structure (Adjacency List / Matrix) |
| **Member 2** | Implement location and road management (add/remove operations) |
| **Member 3** | Implement data organization using Trees / AVL Tree |
| **Member 4** | Develop the menu-driven interface, perform integration, and testing |

---

## 💻 How to Run

### 🔧 Prerequisites
- Java JDK 17 or later
- VS Code (with Java extensions)

### ⚙️ Steps
1. **Clone or download** this repository  
   ```bash
   


