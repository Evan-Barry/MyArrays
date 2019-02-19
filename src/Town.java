public class Town implements Comparable<Town> {
    private String name;
    private String county;
    private int population;

    public Town(String name, String county, int population) {
        this.name = name;
        this.county = county;
        this.population = population;
    }

    public String getName() {
        return name;
    }

    public String getCounty() {
        return county;
    }

    public int getPopulation() {
        return population;
    }

    public int compareTo(Town other)
    {
        /*if (population < other.population)
        {
            return -1;
        }
        else if (population == other.population)
        {
            return 0;
        }
        else
        {
            return 1;
        }*/

        return name.compareTo(other.name);
    }

    public String toString() {
        return "Town[" + name + "," + county + "," + population + "]";
    }
}


