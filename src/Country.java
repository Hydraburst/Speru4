public class Country implements Comparable <Country>{
    String name;
    String capital;
    String continent;
    double population;
    double area;
    static final String FORMAT = "%6.2f";


    public Country(String name, String capital, String continent, double population, double area) {
        this.name = name;
        this.capital = capital;
        this.continent = continent;
        this.population = population;
        this.area = area;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public void setContinent(String continent) {
        this.continent = continent;
    }

    public void setPopulation(double population) {
        this.population = population;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public String getCapital() {
        return capital;
    }

    public String getContinent() {
        return continent;
    }

    public double getPopulation() {
        return population;
    }

    public double getArea() {
        return area;
    }

    public String toString() {
        return  "Страна: " + this.name + "     |" +
                "Континент: " + this.continent +"     |"+
                "Столица: "+  this.capital + "     |"+
                "Численность: "+ this.population + "     |" +
                "Площадь: " + String.format("%6.2f",this.area) ;
    }

    public int compareTo(Country o) {
        int result = toString().compareTo(o.toString());
        return result;
    }


}





