package n2exercici1;

public class N2Exercici1 {
    public static void main(String[] args) {


        byte age = Input.readByte("Please enter your age.");
        System.out.println("You have entered: " + age);

        int year = Input.readInt("Please enter your year of birth.");
        System.out.println("You have entered: " + year);

        float height = Input.readFloat("Please enter your height in meters.");
        System.out.println("You have entered: " + height);

        double population = Input.readDouble("Please enter the current population of Barcelona.");
        System.out.println("You have entered: " + population);

        char characterAnswer = Input.readChar("Please enter a single character.");
        System.out.println("You have entered: " + characterAnswer);

        String name = Input.readString("Please enter your name and surname.");
        System.out.println("You have entered: " + name);

        boolean answer = Input.readYesNo("Do you live in Barcelona?\nPlease answer Yes or No (y/n).");
        System.out.println("You have entered: " + answer);



        System.out.println("Goodbye!");

    }
}
