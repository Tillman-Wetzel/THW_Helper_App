CREATE TABLE Fahrzeuge (
    ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    nummernschild char(255) NOT NULL UNIQUE,
    bauArt char(255) NOT NULL,
    bauJahr int NOT NULL,
    marke char(255) NOT NULL,
    getriebeArt char(255) NOT NULL,
    AntriebsArt char(255) NOT NULL,
    preisProStunde char(255) NOT NULL,
    personal INT NOT NULL,
    nameVomPersonal char(255) NOT NULL,
    qualifiationenVomPersonal char(255),
    idVomBesitzer INT NOT NULL,
    FOREIGN KEY (idVomBesitzer) REFERENCES Users(BenutzerID)
        ON DELETE CASCADE
);

CREATE TABLE Users(
    ID INT AUTO_INCREMENT PRIMARY KEY,
    emailAdresse char(255) UNIQUE KEY NOT NULL,
    passwort char(255) NOT NULL,
    postleitzahl char(255) NOT NULL,
    telefonnummer char(255) UNIQUE KEY NOT NULL,
    name char(255),
    adresse char(255) UNIQUE KEY
)