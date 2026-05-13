public class MethodOverload {
static int plusMethod(int x, int y) {
  return x + y;
}

static double plusMethod(double x, double y) {
  return x + y;
}

static String plusMethod(String firstName, String lastName){
    return firstName + lastName;
}

public static void main(String[] args) {
  int myNum1 = plusMethod(8, 5);
  double myNum2 = plusMethod(4.3, 6.26);
  String myString3 = plusMethod("Benedict", " Musila");
  System.out.println("int: " + myNum1);
  System.out.println("double: " + myNum2);
  System.out.println("string: " + myString3);
}
}

//Testing my commit messages