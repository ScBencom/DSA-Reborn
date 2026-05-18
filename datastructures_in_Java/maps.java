//The Map interface is a part of the Java Collections Framework and is used to store key-value pairs. 
//Each key must be unique, but values can be duplicated.

//A HashMap stores items in key/value pairs, where each key maps to a specific value.

import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
public class Main {
  public static void main(String[] args) {
    // Create a HashMap object called capitalCities
    HashMap<String, String> capitalCities = new HashMap<String, String>();

    // Add keys and values (Country, City)
    capitalCities.put("England", "London");
    capitalCities.put("India", "New Dehli");
    capitalCities.put("Austria", "Wien");
    capitalCities.put("Norway", "Oslo");
    capitalCities.put("Norway", "Oslo"); // Duplicate is ignored
    capitalCities.put("USA", "Washington DC");
    capitalCities.remove("England");

    System.out.println(capitalCities);

    // Print keys/values
    for (String i : capitalCities.values()) {
        System.out.println(i);
    }

    // Create a HashMap object called people
    HashMap<String, Integer> people = new HashMap<String, Integer>();

    // Add keys and values (Name, Age)
    people.put("John", 32);
    people.put("Steve", 30);
    people.put("Angie", 33);

    System.out.println(people);

    //A TreeMap is a collection that stores key/value pairs in sorted order by key.
    TreeMap<String, String> capitalCities2 = new TreeMap<>();
    capitalCities2.put("England", "London");
    capitalCities2.put("India", "New Dehli");
    capitalCities2.put("Austria", "Wien");
    capitalCities2.put("Norway", "Oslo");
    capitalCities2.put("Norway", "Oslo"); // Duplicate ignored
    capitalCities2.put("USA", "Washington DC");

    System.out.println(capitalCities2);//Sorted using keys alphabetically

    //A LinkedHashMap stores keys and values, and keeps them in the same order you put them in.
    LinkedHashMap<String, String> capitalCities3 = new LinkedHashMap<>();

    capitalCities3.put("England", "London");
    capitalCities3.put("India", "New Dehli");
    capitalCities3.put("Austria", "Wien");
    capitalCities3.put("Norway", "Oslo");
    capitalCities3.put("Norway", "Oslo"); // Duplicate ignored
    capitalCities3.put("USA", "Washington DC"); 

    System.out.println(capitalCities3);//Order of input maintained


  }


}