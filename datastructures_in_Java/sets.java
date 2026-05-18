//The Set interface is part of the Java Collections Framework and is used to... 
//store a collection of unique elements.
//A HashSet is a collection of elements where every element is unique.
import java.util.HashSet;
import java.util.TreeSet;
import java.util.LinkedHashSet;

public class Main {
  public static void main(String[] args) {
    HashSet<String> cars = new HashSet<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("BMW");  // Duplicate does not reflect in the HashSet
    cars.add("Mazda");
    System.out.println(cars.contains("Mazda"));
    cars.remove("Volvo");
    System.out.println(cars.size());
    System.out.println(cars);

    //A TreeSet is a collection that stores unique elements in sorted order.
    TreeSet<String> cars2 = new TreeSet<>();
    cars2.add("Volvo");
    cars2.add("BMW");
    cars2.add("Ford");
    cars2.add("BMW");  // Duplicate does not reflect in the TreeSet
    cars2.add("Mazda");

    System.out.println(cars2); //Automatically sorted
    for (String i : cars2) {
        System.out.println(i);
    }

    //A LinkedHashSet is a collection that stores unique elements and remembers...
    // the order they were added.
    LinkedHashSet<String> cars3 = new LinkedHashSet<>();
    cars3.add("Volvo");
    cars3.add("BMW");
    cars3.add("Ford");
    cars3.add("BMW");  // Duplicate does not reflect in the LinkedHashSet
    cars3.add("Mazda");

    System.out.println(cars3);
  

  }
}