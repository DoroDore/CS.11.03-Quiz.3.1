public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade >= 90) {
            return 'A';
        }
        else if (grade >= 80) {
            return 'B';
        }
        else if (grade >= 70) {
            return 'C';
        }
        else if (grade >= 60) {
            return 'D';
        }
        else if  (grade >= 50) {
            return 'E';
        }
        else {
            return 'F';
        }
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num) {
        boolean fizzTrue = false;
        boolean buzzTrue = false;
        if (num%3 == 0) {
            fizzTrue = true;
        }
        if (num%5 == 0) {
            buzzTrue = true;
        }
        if (fizzTrue && buzzTrue) {
            return "fizzbuzz";
        }
        else if (fizzTrue) {
            return "fizz";
        }
        else if (buzzTrue) {
            return "buzz";
        }
        else {
            return "unlucky";
        }
    }
    // Question 3 - frontBack
    public static String frontBack(String str) {
        if (str.length()<2) {
            return str;
        }
        else {
            String firstTwoChar = str.substring(0,2);
            return firstTwoChar+str+firstTwoChar;
        }
    }
    // Question 4 - twoAsOne
    public static boolean twoAsOne(int a, int b, int c) {
        return a + b == c || a + c == b || b + c == a;
    }
    // Question 5 - endUp
    public static String endUp(String str) {
        String part;
        String lastThree;
        if (str.length() < 3) {
            return str.toUpperCase();
        }
        part = str.substring(0, str.length()-3);
        lastThree = str.substring(str.length()-3);
        lastThree = lastThree.toUpperCase();
        return part+lastThree;
    }
}
