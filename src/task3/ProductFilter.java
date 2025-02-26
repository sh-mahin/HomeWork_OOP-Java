/*
Practice Problem 04(Contd.)
 ● Design a product filtering system for an e-commerce platform where users can search for products based
  on different criteria such as:
 ○ By category (e.g., "electronics", "fashion").
 ○ By price range (e.g., products between $100 and $500).
 ○ By brand (e.g., "Apple", "Nike").
 ○ By category and price range.
 ○ By category, price range, and brand.
 Implement this functionality using method overloading, where the filterProducts method is defined multiple
times with varying parameters to handle these use cases. Each overloaded method should print what the user is
searching for
*/



package task3;


public class ProductFilter {

    // Method to filter by category and brand
    public void filterProducts(String category, String brand) {
        System.out.println("Searching for " + brand + " products in the category: " + category);
    }

    // Method to filter by price range
    public void filterProducts(double minPrice, double maxPrice) {
        System.out.println("Searching for products between $" + minPrice + " and $" + maxPrice);
    }

    // Method to filter by category and price range
    public void filterProducts(String category, double minPrice, double maxPrice) {
        System.out.println("Searching for products in the category: " + category +
                " with a price range between $" + minPrice + " and $" + maxPrice);
    }

    // Method to filter by category, price range, and brand
    public void filterProducts(String category, double minPrice, double maxPrice, String brand) {
        System.out.println("Searching for " + brand + " products in the category: " + category +
                " with a price range between $" + minPrice + " and $" + maxPrice);
    }

    public static void main(String[] args) {
        ProductFilter filter = new ProductFilter();

        // Testing the overloaded methods
        filter.filterProducts("Electronics","Apple");
        filter.filterProducts(100, 500);
        filter.filterProducts("Fashion", 50, 200);
        filter.filterProducts("Electronics", 200, 1000, "Apple");
    }
}
