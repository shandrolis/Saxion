package BoekOpdrachten;

import java.util.List;

/**
 * Created by Joep on 24-Nov-15.
 * Design and implement a class Country that stores the name of the country, its population,
 * and its area. Then write a program that reads in a set of countries and prints
 * • The country with the largest area.
 * • The country with the largest population.
 * • The country with the largest population density (people per square
 * kilometer (or mile)).
 */
public class Country {
    private String name;
    private int population, area;

    public Country(int area, String name, int population) {
        this.area = area;
        this.name = name;
        this.population = population;
    }

    public void printLargestArea(List<Country> l) {
        int largest = 0;
        Country largestCountry = null;
        for (Country c : l) {
            if (c.getArea() > largest) {
                largest = c.getArea();
                largestCountry = c;
            }
        }
        System.out.println(largest);
    }

    public void printLargestPopulationList(List<Country> l) {
        int largest = 0;
        for (Country c : l) {
            if (c.getPopulation() > largest) {
                largest = c.getPopulation();
            }
        }
        System.out.println(largest);
    }


    public void printLargestPopDensity(List<Country> l) {
        int largest = 0;
        for (Country c : l) {
            if ((c.getPopulation() / c.getArea()) > largest) {
                largest = c.getPopulation() / c.getArea();
            }
        }
        System.out.println(largest);
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPopulation() {
        return population;
    }

    public void setPopulation(int population) {
        this.population = population;
    }
}
