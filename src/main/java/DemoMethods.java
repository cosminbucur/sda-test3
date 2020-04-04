public class DemoMethods {

    public static void main(String[] args) {
//        printMyAge();
//        printMyName();
        int result = getSumOfTwoNumbers();
        System.out.println("the result = " + result);
    }

    // print my name

    // query = interogare

    // command = comanda

    // private = access modifier
    // void = return type
    // printMyName = method name
    private static void printMyName() {
        System.out.println("cosmin");
        System.out.println("dan");
        System.out.println("bucur");
    }

    // print my age
    private static void printMyAge() {
        int years = 32;
        int months = 11;

        System.out.println("my age is " + years + " years and " + months + " months");
    }

    // method with return type
    // sum of two numbers
    private static int getSumOfTwoNumbers() {
        int number1 = 3;
        int number2 = 5;
        int sum = number1 + number2;
        return sum;
    }
}
