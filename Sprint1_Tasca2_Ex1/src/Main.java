import java.util.List;

public class Main {
    public static void main(String[] args) {
        try {
            Sale s1 = new Sale(List.of());
            s1.calculateTotal();
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }

        try{
            Product p1 = new Product("PC", 999.99);
            Product p2 = new Product("TV", 666.66);
            Sale s2 = new Sale(List.of(p1, p2));

            System.out.println(s2.getProducts().get(3).getName());

        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error accessing product: " + e.getMessage());
        }

        try {
            Product p3 = new Product("Pencil", 2.99);
            Product p4 = new Product("Rubber", 0.99);
            Sale s3 = new Sale(List.of(p3, p4));

            s3.calculateTotal();
            System.out.printf("Total price list is %.2f%s%n", s3.getTotalPrice(), "€");

        }catch (EmptySaleException e){
            System.out.println(e.getMessage());
        }
    }
    }

