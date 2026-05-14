public class myRecursion{
    static void countdown(int n) {
        if (n > 0) {
            System.out.print(n + "\n");
            countdown(n-1);
        }
    }

    public static int sum(int k) {
        if (k > 0) {
            return k + sum(k - 1);
        } else {
            return 0;
    }
    }

public static void main(String[] args) {
  countdown(5);
  int result = sum(5);
  System.out.println(result);

}
}