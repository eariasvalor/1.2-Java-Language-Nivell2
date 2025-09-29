package n2exercici1;

public class N2Exercici1 {
    public static void main(String[] args) {
        byte b = ' ';
        int i = 0;
        float f = 0F;
        double d = 0.0;
        char ch = ' ';
        String s = "";
        boolean answer = false;



        b = Input.readByte("Please enter your age.");
        System.out.println("You have entered: " + b);

        i = Input.readInt("Please enter your year of birth.");
        System.out.println("You have entered: " + i);

        f = Input.readFloat("Please enter your height in meters.");
        System.out.println("You have entered: " + f);

        d = Input.readDouble("Please enter the current population of Barcelona.");
        System.out.println("You have entered: " + d);

        ch = Input.readChar("Please enter a single character.");
        System.out.println("You have entered: " + ch);

        s = Input.readString("Please enter your name and surname.");
        System.out.println("You have entered: " + s);

        answer = Input.readYesNo("Do you live in Barcelona?\nPlease answer Yes or No (y/n).");
        System.out.println("You have entered: " + answer);



        System.out.println("Goodbye!");

    }
}
