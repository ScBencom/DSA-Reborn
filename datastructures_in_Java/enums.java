//An enum is a special "class" that represents a group of constants..
// (unchangeable variables, like final variables).
//Enum is short for "enumerations", which means "specifically listed".
public class Main {
  enum Level {
    LOW,
    MEDIUM,
    HIGH
  }

  public static void main(String[] args) {
    Level myVar = Level.MEDIUM; 
    System.out.println(myVar);
  }
}