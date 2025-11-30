import java.util.InputMismatchException;
import java.util.Scanner;

public class Entrada {
    public static Scanner sc = new Scanner(System.in);

    public static byte readByte(String message) {
        while (true) {
            try {
                System.out.println(message);
                byte b1 = sc.nextByte();
                return b1;

            } catch (InputMismatchException e) {
                System.out.println("Invalid format. Try again: ");
                sc.nextLine();
            }

        }

    }

    public static int readInt(String message) {
        while (true) {
            try {
                System.out.println(message);
                int i1 = sc.nextInt();
                return i1;

            } catch (InputMismatchException e) {
                System.out.println("Invalid format. Try again: ");
                sc.nextLine();
            }
        }
    }

    public static float readFloat(String message) {
        while (true) {
            try {
                System.out.println(message);
                Float f1 = sc.nextFloat();
                return f1;
            } catch (InputMismatchException e) {
                System.out.println("Invalid format. Try again: ");
                sc.nextLine();
            }
        }
    }

    public static double readDouble(String message) {
        while (true) {
            try {
                System.out.println(message);
                double d1 = sc.nextDouble();
                return d1;
            } catch (InputMismatchException e) {
                System.out.println("Invalid format. Try again: ");
                sc.nextLine();
            }
        }
    }

    public static char readChar(String message) {
        while (true) {
            try {
                System.out.println(message);
                String input = sc.nextLine();
                if (input.length() != 1) {
                    throw new Exception("Introduce only one character.");
                }
                return input.charAt(0);
            } catch (Exception e) {
                System.out.println("Error: " + e.getMessage());
                sc.nextLine();
            }
        }
    }

        public static String readString (String message){
            while (true) {
                try {
                    System.out.println(message);
                    String input = sc.nextLine();
                    if (input.trim().isEmpty()) {
                        throw new Exception("The string cannot be empty.");
                    }
                    return input;
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }

        public static boolean readYesNo(String message){
            while(true){
                try {
                    System.out.println(message);
                    String input = sc.next().toLowerCase();
                    if(input.equals("s")) {
                        return true;
                    } else if (input.equals("n")) {
                        return false;
                    } else {
                        throw new Exception("You must enter 's' or 'n'.");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e.getMessage());
                    sc.nextLine();
                }
            }
        }
    }
