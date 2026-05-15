import java.util.ArrayList;
import java.util.Collections; 

//To modify an element, use the set() method and refer to the index number:
public class Main {
  public static void main(String[] args) {
    ArrayList<String> cars = new ArrayList<String>();
    cars.add("Volvo");
    cars.add("BMW");
    cars.add("Ford");
    cars.add("Mazda");
    System.out.println(cars);
    System.out.println(cars.get(1));
    cars.remove(3);
    System.out.println(cars.size());
    System.out.println(cars);
    Collections.sort(cars);

    for(int j=0; j<cars.size(); j++){
        System.out.println(cars.get(j));
    }

    ArrayList<Integer> ages = new ArrayList<Integer>();

    ages.add(25);
    ages.add(28);
    ages.add(35);
    ages.add(18);
    ages.add(15);
    ages.add(2);
    ages.set(1, 30);
    System.out.println(ages);
    System.out.println(ages.get(1));
    Collections.sort(ages);
    System.out.println(ages);

    for(int i : ages){
        System.out.println(i);
    }
    
  }
}