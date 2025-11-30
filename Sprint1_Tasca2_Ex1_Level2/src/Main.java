public class Main {
    public static void main(String[] args) {

        byte age = Entrada.readByte("Enter your age: ");
        System.out.println("You entered age: " + age);

        int miles = Entrada.readInt("Enter the number of miles: ");
        System.out.println("You entered miles are " + miles);

        float celsius = Entrada.readFloat("Enter a temperature in celsius: ");
        System.out.println("Your temperature in celsius is: " + celsius);

        double hectares = Entrada.readDouble("Enter the number of hectares in the forest: ");
        System.out.println("In the forest are " + hectares + " hectares.");

        char letter = Entrada.readChar("Enter a single character: ");
        System.out.println("You entered: " + letter);

        String name = Entrada.readString("Enter your name: ");
        System.out.println("You entered: " + name);

        boolean answer = Entrada.readYesNo("Do you want a beer? (y/n): ");
        System.out.println("You answered: " + answer);

    }
}

