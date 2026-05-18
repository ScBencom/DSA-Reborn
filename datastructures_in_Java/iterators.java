//An Iterator is an object that can be used to loop through collections, like ArrayList and HashSet.
//The iterator() method can be used to get an Iterator for any collection:

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
  public static void main(String[] args) {

    // Make a collection
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");

    // Get the iterator
    Iterator<String> it = cars.iterator();

    // Print the first item
    System.out.println(it.next());
    System.out.println(it.next());

    //Loop through a collection using an Iterator
    while(it.hasNext()) {
        System.out.println(it.next());
    }
  }
}