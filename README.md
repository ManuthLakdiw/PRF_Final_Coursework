# 📦 IJSE Stock Management System

A console-based **Stock Management System** built in pure Java as a PRF (Programming Fundamentals) coursework project at IJSE. The application provides a complete inventory management workflow — including supplier management, item categorization, stock control, and user authentication — all operating through an interactive terminal interface.

---

## 📋 Table of Contents

- [Overview](#-overview)
- [Features](#-features)
- [Prerequisites](#-prerequisites)
- [How to Run](#-how-to-run)
- [Default Credentials](#-default-credentials)
- [Application Flow](#-application-flow)
- [Menu Structure](#-menu-structure)
- [Key Methods](#-key-methods)
- [Data Storage](#-data-storage)
- [Project Structure](#-project-structure)
- [Known Limitations](#-known-limitations)
- [Author](#-author)

---

## 🧭 Overview

This project is a single-file Java console application (`Coursework.java`) that simulates a real-world stock management system. The system is menu-driven and handles:

- **Authentication** — Secure login with username and password verification
- **Credential Management** — Change username password at runtime
- **Supplier Management** — Full CRUD (Create, Read, Update, Delete, Search) for suppliers
- **Stock Management** — Item category management and inventory control
- **Reporting** — View items grouped by category or ranked by unit price

> This project was developed as part of the **Programming Fundamentals (PRF)** module at the **Institute of Java and Software Engineering (IJSE)**.

---

## ✨ Features

### 🔐 Authentication
- Login with username and password
- Recursive re-prompting on invalid credentials
- Password change with current password verification
- Log out and return to login screen

### 🏢 Supplier Management
| Feature | Description |
|---|---|
| Add Supplier | Add new suppliers with a unique Supplier ID and name |
| Update Supplier | Modify the name of an existing supplier by ID |
| Delete Supplier | Remove a supplier record by ID |
| View Suppliers | Display all suppliers in a formatted table |
| Search Supplier | Look up a supplier by their ID |

### 📦 Stock Management
| Feature | Description |
|---|---|
| Manage Item Categories | Add, update, and delete item categories |
| Add Item | Add inventory items linked to a supplier and category |
| Get Items Supplier-Wise | Filter and display items by supplier ID |
| View Items | Display all items grouped by their category |
| Rank Items by Unit Price | Sort and display all items from lowest to highest price (Bubble Sort) |

### ⚙️ System
- Cross-platform console clearing (Linux, macOS, Windows)
- Input validation with `y/n` confirmation loops throughout
- Graceful exit (macOS-specific AppleScript terminal close)
- Dynamic array growth for suppliers, categories, and items (no ArrayList used — pure array manipulation)

---

## 🛠 Prerequisites

| Requirement | Version |
|---|---|
| Java Development Kit (JDK) | 8 or higher |
| Terminal / Command Prompt | Any |

No external libraries or build tools are required. The project uses only the Java standard library (`java.util.*`).

---

## 🚀 How to Run

### Step 1: Compile the Java file

Navigate to the project directory and compile:

```bash
cd /path/to/coursework
javac Coursework.java
```

### Step 2: Run the program

```bash
java Coursework
```

> **macOS / Linux users**: The console clearing feature will work automatically. On Windows, the `cmd /c cls` command is invoked.

---

## 🔑 Default Credentials

The system ships with the following hardcoded credentials:

| Field | Value |
|---|---|
| **Username** | `manuth13` |
| **Password** | `12345` |

> ⚠️ These credentials are stored as plain static `String` variables in the source code. You can change them at runtime via the **Change Credentials** option in the main menu. Changes are in-memory only and reset when the program exits.

---

## 🔄 Application Flow

```
Start
  └── Login Page
        ├── Enter Username  →  validates against stored username
        └── Enter Password  →  validates against stored password
              └── Welcome Page (Main Menu)
                    ├── [1] Change Credentials
                    ├── [2] Supplier Management
                    │     ├── [1] Add Supplier
                    │     ├── [2] Update Supplier
                    │     ├── [3] Delete Supplier
                    │     ├── [4] View Suppliers
                    │     ├── [5] Search Supplier
                    │     └── [6] Home Page
                    ├── [3] Stock Management
                    │     ├── [1] Manage Item Categories
                    │     │     ├── [1] Add Category
                    │     │     ├── [2] Delete Category
                    │     │     ├── [3] Update Category
                    │     │     └── [4] Back to Stock Management
                    │     ├── [2] Add Item
                    │     ├── [3] Get Items Supplier-Wise
                    │     ├── [4] View Items (by Category)
                    │     ├── [5] Rank Items by Unit Price
                    │     └── [6] Home Page
                    ├── [4] Log Out  →  returns to Login Page
                    └── [5] Exit System
```

---

## 📂 Menu Structure

### Main Menu (Welcome Page)

```
+-------------------------------------------------------------------------------------------------------+
|                               WELCOME TO IJSE STOCK MANAGEMENT SYSTEM                                |
+-------------------------------------------------------------------------------------------------------+

 [1]  Changes the Credentials          [2]  Supplier Manage

 [2]  Stock Manage                     [4]  Log Out

 [5]  Exit the System
```

### Supplier Management Menu

```
 [1]  Add Supplier                     [2]  Update Supplier

 [3]  Delete Supplier                  [4]  View Suppliers

 [5]  Search Supplier                  [6]  Home Page
```

### Stock Management Menu

```
 [1]  Manage Item Categories           [2]  Add Item

 [3]  Get Items Supplier Wise          [4]  View Items

 [5]  Rank Items per Unit Price        [6]  Home Page
```

---

## 🔍 Key Methods

| Method | Description |
|---|---|
| `loginPage()` | Renders the login screen |
| `checkUserName()` | Validates the entered username |
| `checkPassword()` | Validates the entered password |
| `welcomePage()` | Renders the main menu |
| `changeCredential()` | Allows the user to change their password |
| `addSupplier()` | Adds a new supplier with duplicate-check |
| `updateSupplier()` | Updates a supplier name by ID |
| `deleteSupplier()` | Deletes a supplier record by ID |
| `viewSuppliertable()` | Displays all suppliers in a formatted table |
| `searchSupplier()` | Searches for a supplier by ID |
| `hasDuplicate(String id)` | Checks if a supplier ID already exists |
| `manageItemCategory()` | Renders the item category management menu |
| `addItemCategory()` | Adds a new item category |
| `updateItemCategory()` | Renames an existing category |
| `deleteItemCategory()` | Removes a category |
| `addItem()` | Adds an inventory item (linked to supplier + category) |
| `searchSupWise()` | Lists all items belonging to a given supplier |
| `viewItem()` | Displays all items grouped by category |
| `rankedUnitPrice()` | Sorts and displays items by unit price (ascending) using Bubble Sort |
| `growthArray()` | Dynamically expands the `SupplierDetails` 2D array |
| `growArrayCategory()` | Dynamically expands the `category` array |
| `growArrayItem()` | Dynamically expands the `itemArray` 2D array |
| `hasDuplicateItemCode(String code)` | Checks if an item code already exists |
| `clearConsole()` | Clears the terminal (cross-platform) |
| `logOut()` | Redirects the user back to the login page |
| `exitSystem()` | Gracefully terminates the program |

---

## 💾 Data Storage

All data is stored **in-memory** using static arrays. There is **no file I/O or database** — data is lost when the program exits.

| Data | Storage Type | Fields |
|---|---|---|
| Suppliers | `String[][] SupplierDetails` | `[ID, Name]` |
| Item Categories | `String[] category` | `[Category Name]` |
| Items | `String[][] itemArray` | `[Item Code, Supplier ID, Category, Description, Unit Price, Qty]` |

Dynamic resizing is implemented manually using temporary arrays (simulating `ArrayList` behaviour without using the Java Collections Framework — as required by the assignment).

---

## 📁 Project Structure

```
coursework/
├── Coursework.java       # Single-file Java source — all logic contained here
├── Coursework.class      # Compiled bytecode (generated after javac)
└── README.md             # Project documentation
```

---

## ⚠️ Known Limitations

| Limitation | Notes |
|---|---|
| No data persistence | All data is lost on program exit |
| Single-word inputs only | `Scanner.next()` is used; multi-word names with spaces are not supported |
| Hardcoded credentials | Username and password are embedded in source code |
| No item update/delete | Items can be added but not modified or removed |
| No category-based item restriction | Deleting a category does not remove associated items |
| Recursive navigation | Some menu navigation uses deep recursion which may cause a `StackOverflowError` in long sessions |
| macOS `exitSystem()` | The AppleScript-based terminal close only works on macOS |

---

## 👤 Author

| Field | Details |
|---|---|
| **Name** | Manuth Lakdiv |
| **Username** | `manuth13` |
| **Institute** | IJSE — Institute of Java and Software Engineering |
| **Module** | PRF — Programming Fundamentals |
| **Language** | Java (Pure Standard Library) |

---

## 📄 License

This project is submitted as **academic coursework** for the PRF module at IJSE. It is intended for educational purposes only and is not licensed for commercial use.

---

*Built with ❤️ using pure Java — no frameworks, no libraries, just fundamentals.*
