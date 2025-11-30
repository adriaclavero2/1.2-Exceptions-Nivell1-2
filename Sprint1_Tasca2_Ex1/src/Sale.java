import java.util.List;

public class Sale {
  private List<Product>products;
  private double totalPrice;

    public Sale(List<Product> products) {
        this.products = products;
        this.totalPrice = 0.0;
    }

    public List<Product> getProducts() {
        return products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void calculateTotal() throws EmptySaleException {
        if(products == null || products.isEmpty()){
            throw new EmptySaleException();
        }

        double sum = 0.0;
        for(Product p : products){
            sum += p.getPrice();
        }
        totalPrice = sum;

        System.out.println("Total price of sale: " + totalPrice);
    }
}
