//The Map interface is a part of the Java Collections Framework and is used to store key-value pairs. 
//Each key must be unique, but values can be duplicated.

//A HashMap stores items in key/value pairs, where each key maps to a specific value.

import java.util.HashMap;
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

    // Print keys
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
  }
}