# Smart City Route Planner – CIT300 Graded Practical Assignment 1

## 🧠 Project Overview
The **Smart City Route Planner** is a console-based system designed to model a city’s transport network using data structures such as **Graphs**, **Trees**, **Linked Lists**, **Queues**, and **Stacks**. The project allows users to add and remove city locations, connect them with roads, and display all existing connections through a simple menu-driven interface. It demonstrates how real-world relationships, such as city routes, can be represented and managed efficiently using data structures. This project helps visualize how data organization and traversal techniques support smart city concepts and efficient route planning in computer science applications.

---

## 🎯 Objectives
- Represent city locations and roads using a **Graph** (Adjacency List or Adjacency Matrix).
- Manage locations and roads through **Add/Remove** operations.
- Display all connections between locations.
- Use **Queues** or **Stacks** for traversal (BFS/DFS).
- Store location data in a **Tree** or **Linked List** for efficient management.
- Provide a **menu-driven interface** with input validation and clear outputs.

---

## 🏗️ System Features
1. **Add / Remove Locations**
2. **Add / Remove Roads**
3. **Display All Connections**
4. **Display All Locations (using Tree or Linked List)**
5. **Traverse Network (using BFS/DFS)**
6. **Menu-Based User Interface**

---

## 👥 Team Members & Responsibilities

| Member | Role | Responsibilities |
|--------|------|------------------|
| **Member 1** | Graph & Road Management Developer | - Design and implement the **Graph data structure** using an adjacency list or matrix.<br> - Implement **add/remove** location and road functions.<br> - Ensure data integrity between connected nodes.<br> - Test the Graph module. |
| **Member 2** | Data Structure & Traversal Developer | - Implement **Trees**, **AVL Trees**, or **Linked Lists** for organizing locations.<br> - Develop traversal algorithms (**BFS/DFS**) using queues or stacks.<br> - Manage sorted or hierarchical location data.<br> - Test traversal and data structure modules. |
| **Member 3** | UI, Validation & Integration Developer | - Build the **console-based menu interface**.<br> - Handle **input validation** and user errors.<br> - Integrate all modules (Graph + Tree).<br> - Perform **testing** and prepare the **final demo**. |

---

## 🧩 Technologies Used
- **Programming Language:** C++ / Java / Python (depending on course requirements)
- **Environment:** Console-based (no GUI framework)
- **Version Control:** GitHub for collaboration (branches, commits, pull requests)

---

## 🗂️ Project Structure
```
SmartCityRoutePlanner/
│
├── src/
│   ├── graph_manager.cpp
│   ├── data_structure.cpp
│   ├── main_menu.cpp
│
├── README.md
├── CONTRIBUTIONS.md
└── demo_video.mp4
```

---

## 🚀 How to Run
1. Clone the repository:
   ```bash
   git clone https://github.com/<your-team-repo>.git
   cd SmartCityRoutePlanner
   ```
2. Compile and run (example for C++):
   ```bash
   g++ graph_manager.cpp data_structure.cpp main_menu.cpp -o SmartCityRoutePlanner
   ./SmartCityRoutePlanner
   ```
3. Use the menu options to interact with the system.

---

## 📦 Deliverables
- GitHub repository link showing all commits and teamwork.
- Merged demo video showing full project functionality.
- Source code files with comments and documentation.

---

## 📽️ Demo Video
Each member records their part (1–2 minutes each), and all clips are merged into one final demo before submission.

---

## 🏁 Conclusion
This project demonstrates how **data structures** can be effectively used to model and manage a smart city transport system, integrating **graphs, trees, and traversal algorithms** in a single, practical application.
