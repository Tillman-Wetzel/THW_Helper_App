CREATE TABLE Fahrzeuge (
    ID INT AUTO_INCREMENT NOT NULL PRIMARY KEY,
    numberPlate char(255) NOT NULL UNIQUE,
    buildType char(255) NOT NULL,
    buidYear int NOT NULL,
    brand char(255) NOT NULL,
    typeOfDrive char(255) NOT NULL,
    methodOfMovement char(255) NOT NULL,
    nameOfOwner char(255) NOT NULL,
    phoneNumberOfOwner char(255) NOT NULL,
    emailAdressOfOwner char(255) NOT NULL,
    cityOfOwner char(255) NOT NULL,
    zipCodeOfCity char(255) NOT NULL,
    streetNameOfOwner char(255) NOT NULL,
    streetNumberOfOwner char(255) NOT NULL,
    pricePerHour char(255) NOT NULL
)