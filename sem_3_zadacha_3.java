import java.util.ArrayList;
import java.util.HashMap;

public class sem_3_zadacha_3 {
    public static void main(String[] args) {
        ArrayList<String> planetList = new ArrayList<String>();
        planetList.add("Mercury");
        planetList.add("Venus");
        planetList.add("Earth");
        planetList.add("Mars");
        planetList.add("Jupiter");
        planetList.add("Saturn");
        planetList.add("Uranus");
        planetList.add("Neptune");
        planetList.add("Pluto");
        planetList.add("Mercury");
        planetList.add("Mars");
        planetList.add("Saturn");
        planetList.add("Mars");

        HashMap<String, Integer> planetCount = new HashMap<String, Integer>();
        for (String planet : planetList) {
            if (planetCount.containsKey(planet)) {
                int count = planetCount.get(planet);
                planetCount.put(planet, count + 1);
            } else {
                planetCount.put(planet, 1);
            }
        }

        for (String planet : planetCount.keySet()) {
            int count = planetCount.get(planet);
            System.out.println(planet + ": " + count);
        }
    }
}