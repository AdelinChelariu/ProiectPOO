# MagazinEchipamenteMoto

A Java Swing desktop application for a motorcycle gear shop, built as an object-oriented programming (POO) project. It lists products by category in a simple GUI and stores them in files using Java serialization.

## Features

- Main window with a menu bar, one menu per product category: **Jachete** (jackets), **Casti** (helmets), **Manusi** (gloves), **Incaltaminte** (boots), **Intercom** and **Suport Telefon** (phone mounts)
- Each category opens a list window showing product name and price (formatted in lei)
- An "Adauga" (add) form per category with validation: all text fields are required
- Product data persisted to `.dat` files with Java object serialization, no database needed

## Object-oriented design

The project is built around inheritance from a common base class:

```
Produs                      denumire, descriereFull, descriereShort,
│                           marca, imagine, pret, disponibilitate
├── Casca                   tip, culoare
├── Jacheta                 material, culoare
├── Manusi                  culoare, material, tip
├── Incaltaminte            culoare, material, tip, marime
├── Intercom                autonomie, distanta, bluetooth
└── SuportTelefonMobil      prindere, material, diagonalaTelefon
```

Each class provides a default constructor, a full constructor, a copy constructor, getters and setters, and overridden `toString()` methods (a full one and a short one for list views). `Produs` implements `Serializable`, so all subclasses can be written to and read from disk.

## Project structure

```
MagazinEchipamenteMoto/
├── src/
│   ├── Menu.java                 # Main window (entry point)
│   ├── Produs.java               # Base product class
│   ├── Casca.java, Jacheta.java, Manusi.java,
│   │   Incaltaminte.java, Intercom.java,
│   │   SuportTelefonMobil.java   # Product subclasses
│   ├── *Window.java              # List window per category
│   ├── Add*.java                 # Add-product form per category
│   ├── TestInstante.java         # Scratch class creating sample objects
│   └── menuBackground.jpg        # Main window background
├── casti.dat, jachete.dat, manusi.dat   # Serialized sample data
├── nbproject/, build.xml         # NetBeans (Ant) project files
```

## Getting started

### Prerequisites

- JDK 15 or newer (the project uses Java text blocks)
- NetBeans is recommended, since the GUI was built with its form designer, but it is not required

### Run in NetBeans

1. Open the `MagazinEchipamenteMoto` folder as a NetBeans project.
2. Run it. The main class is `Menu`.

### Run from the command line

Compile and run from inside the `MagazinEchipamenteMoto` folder, because the app reads and writes its `.dat` files relative to the working directory:

```bash
cd MagazinEchipamenteMoto
mkdir out
javac -d out src/*.java
cp src/menuBackground.jpg out/
java -cp out Menu
```

On Windows, replace `cp` with `copy`.

## Data files

| Category | File | Included in the repo |
|---|---|---|
| Helmets | `casti.dat` | yes |
| Jackets | `jachete.dat` | yes |
| Gloves | `manusi.dat` | yes |
| Boots | `ghete.dat` | no, created on first add |
| Intercoms | `intercom.dat` | no, created on first add |
| Phone mounts | `suport.dat` | no, created on first add |

Opening the list for a category whose file doesn't exist yet shows an error dialog until a product has been added.

## Current status and known limitations

This is a work in progress. Not everything in the interface is implemented yet:

- The **Sterge** (delete) button exists in every list window but has no behavior yet.
- The **Filtre** (filters) button exists but has no behavior yet.
- Selecting a product in a list does not yet show its full details or image.
- The add forms currently save only the product just entered, replacing the contents of that category's `.dat` file instead of appending to it. Existing products in that file are lost when a new one is added.
- List windows load their data when opened, so a new product appears only after reopening the window.
- Prices are parsed without validation, so non-numeric input in the price field raises an exception.

## Possible next steps

- Load the existing list before saving in the add forms, so new products are appended
- Implement delete and filtering
- Add a detail view with the product description and image
- Add input validation and move shared window code into a common base class
