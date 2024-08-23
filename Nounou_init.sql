USE Nounou;
GO

-- Création de la table PARENT avec la clé primaire
CREATE TABLE PARENT (
    id INTEGER IDENTITY(1,1) NOT NULL PRIMARY KEY, -- Définition de la clé primaire
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    telephone1 VARCHAR(10) NOT NULL,
    telephone2 VARCHAR(10),
    noRue VARCHAR(10) NOT NULL,
    rue VARCHAR(50),
    codePostal VARCHAR(5) NOT NULL,
    ville VARCHAR(50) NOT NULL,
    email VARCHAR(80) NOT NULL,
    password VARCHAR(80) NOT NULL
);

-- Création de la table ENFANT avec la clé primaire et la clé étrangère
CREATE TABLE ENFANT (
    id INTEGER IDENTITY(1,1) NOT NULL PRIMARY KEY, -- Définition de la clé primaire
    nom VARCHAR(50) NOT NULL,
    prenom VARCHAR(50) NOT NULL,
    age INTEGER,
    sexe VARCHAR(10), -- Correction de la déclaration de type
    parent_id INTEGER NOT NULL, -- Ajout de la clé étrangère
    CONSTRAINT FK_Parent FOREIGN KEY (parent_id) REFERENCES PARENT(id) -- Définition de la clé étrangère
);


-- Jointure des tables

SELECT e.id AS enfant_id, e.nom AS enfant_nom, e.prenom AS enfant_prenom, p.nom AS parent_nom, p.prenom AS parent_prenom
FROM ENFANT e
JOIN PARENT p ON e.parent_id = p.id;
