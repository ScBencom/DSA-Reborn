//To find elements in a list, Java provides helper methods
//most common is Collections.binarySearch(), which searches in a sorted list

import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<String> names = new ArrayList<>();
    names.add("Liam");
    names.add("Jenny");
    names.add("Kasper");
    names.add("Angie");

    Collections.sort(names); // must be sorted first
    System.out.println(names);
    int index = Collections.binarySearch(names, "Angie");
    System.out.println("Angie is at index: " + index);
  }
}