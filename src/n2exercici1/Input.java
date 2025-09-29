package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println(message);
                value = scanner.nextByte();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error.");
            } finally {
                scanner.nextLine();
            }
        }
        return value;
    }

    public static int readInt(String message) {
        int value = 0;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println(message);
                value = scanner.nextInt();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }

        }

        return value;
    }


    public static float readFloat(String message) {
        float value = 0.0F;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println(message);
                value = scanner.nextFloat();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }
        }

        return value;
    }

    public static double readDouble(String message) {
        double value = 0.0;
        boolean correct = false;

        while (!correct) {
            try {
                System.out.println(message);
                value = scanner.nextDouble();
                correct = true;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.next();
            } finally {
                scanner.nextLine();
            }
        }

        return value;
    }

    public static char readChar(String message) {
        char value = ' ';
        String input = "";
        boolean correct = false;

        while (!correct) {
            System.out.println(message);
            input = scanner.nextLine().trim();

            try {
                if (input.length() != 1) {
                    throw new CustomException("You must enter one single character.");
                }
                value = input.charAt(0);
                correct = true;
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }

        }

        return value;
    }

    public static String readString(String message) {
        String value = "";
        String input = "";
        boolean correct = false;

        while (!correct) {
            System.out.println(message);
            input = scanner.nextLine();

            try {
                if (input.isEmpty()) {
                    throw new CustomException("Your answer cannot be empty.");

                }
                value = input;
                correct = true;
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }

        }
        return value;

    }

    public static boolean readYesNo(String message) {
        boolean value = false;
        boolean correct = false;
        String input = "";
        char answer = ' ';

        while (!correct) {
            System.out.println(message);
            input = scanner.nextLine().trim();

            try {
                if ((input.equalsIgnoreCase("y")) || (input.equalsIgnoreCase("n"))) {
                    answer = input.charAt(0);
                    if (answer == 'y') {
                        value = true;
                    } else if (answer == 'n') {
                        value = false;
                    }
                    correct = true;
                } else {
                    throw new CustomException("You must enter only y or n.");

                }
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }


        }

        return value;
    }

}

