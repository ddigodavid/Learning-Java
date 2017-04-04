public class Hello {
    public static void main(String[] args) {

        System.out.println("Hello, Rodrigo!");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;

        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;

        int difference = 1000 - myTotal;

        System.out.println("My First Number Variable: " + myFirstNumber);
        System.out.println("My Second Number Variable: " + mySecondNumber);
        System.out.println("My Third Number Variable: " + myThirdNumber);

        System.out.println("My total " + myTotal);
        System.out.println("1000 - " + myTotal + " = " + difference);
    }
}