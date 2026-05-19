//you can use Collections.sort() to sort the elements
import java.util.*;

public class Main {
  public static void main(String[] args) {
    ArrayList<Integer> numbers = new ArrayList<>();
    numbers.add(5);
    numbers.add(1);
    numbers.add(7);
    numbers.add(3);
    numbers.add(9);

    Collections.sort(numbers);
    System.out.println(numbers); // [1, 3, 5, 7, 9]
    //You can also sort in reverse order with Collections.sort(list, Collections.reverseOrder())
    Collections.sort(numbers, Collections.reverseOrder());
    System.out.println(numbers); 
    
  }
}