package ProgramPractise;

class Country {
    String name;
    long population;
    double land;
    double importExport;

    // Constructor
    public Country(String name, long population, double land, double importExport) {
        this.name = name;
        this.population = population;
        this.land = land;
        this.importExport = importExport;
    }

    // toString method to display country info
    public String toString() {
        return name + " - Population: " + population + ", Land: " + land + " sq.km, Import/Export: $" + importExport + "B";
    }
}


