package n2exercici1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {
    private static final Scanner scanner = new Scanner(System.in);

    public static byte readByte(String message) {
        byte value = 0;

        while (true) {
            try {
                System.out.println(message);
                value = scanner.nextByte();
                break;
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

        while (true) {
            try {
                System.out.println(message);
                value = scanner.nextInt();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }

        }

        return value;
    }


    public static float readFloat(String message) {
        float value = 0.0F;

        while (true) {
            try {
                System.out.println(message);
                value = scanner.nextFloat();
                break;
            } catch (InputMismatchException e) {
                System.out.println("Format error");
                scanner.nextLine();
            }
        }

        return value;
    }

    public static double readDouble(String message) {
        double value = 0.0;

        while (true) {
            try {
                System.out.println(message);
                value = scanner.nextDouble();
                break;
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

        while (true) {
            System.out.println(message);
            input = scanner.nextLine().trim();

            try {
                if (input.length() != 1) {
                    throw new CustomException("You must enter one single character.");
                }
                value = input.charAt(0);
                break;
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }

        }

        return value;
    }

    public static String readString(String message) {
        String value = "";
        String input = "";

        while (true) {
            System.out.println(message);
            input = scanner.nextLine();

            try {
                if (input.isEmpty()) {
                    throw new CustomException("Your answer cannot be empty.");

                }
                value = input;
                break;
            } catch (CustomException e) {
                System.out.println(e.getMessage());
            }

        }
        return value;

    }

    public static boolean readYesNo(String message) {
        boolean value = false;
        String input = "";
        char answer = ' ';

        while (true) {
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
                    break;
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

