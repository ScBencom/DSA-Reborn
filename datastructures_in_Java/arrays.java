 public class MyArray {
    public static void main(String[] args){
        System.out.println("A test");
        System.out.print("A test");
        System.out.println(15);
        System.out.println("15");
        System.out.println("15" + 10);

        String kimoda = "Hello guyss!";
        System.out.println(kimoda.indexOf("e"));
        String kimoda2 = kimoda.concat(" Greetings");
        System.out.println(kimoda2);
        System.out.println("We are the so called \"Vikings\" from the North");
        System.out.println(Math.pow(8,2));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.abs(-7));
        System.out.println(Math.random());

        int score = 75;
        String grade = (score >= 50) ? "Pass" : "Fail"; //Java shot hand
        System.out.println(grade);

        //switch operation
        int day = 4;

        switch (day) {
        case 1:
            System.out.println("Saturday");
            break;
        case 4:
            System.out.println("Thursday");  
            break;
        case 2:
            System.out.println("Sunday");  
            break;
        default:
            System.out.println("Weekend");
        }

        //while loop

        int i = 5;
        while (i > 2){
            System.out.println(i + " iteration");
            i-=1;
        }

        //for loop
        for (int j = 0; j < 5; j++) {
                System.out.println(j);
            }

    }
 }