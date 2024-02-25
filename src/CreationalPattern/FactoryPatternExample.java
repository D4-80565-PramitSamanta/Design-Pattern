package CreationalPattern;

interface Product {
    void use();
}

class Concrete implements Product {
    @Override
    public void use() {
        System.out.println("Using Concrete");
    }
}

class Plastic implements Product {
    @Override
    public void use() {
        System.out.println("Using Plastic");
    }
}

class ProductFactory {
    // Method to create products based on input
    public static Product createProduct(String type) {
        switch (type) {
            case "Concrete":
                return new Concrete();
            case "Plastic":
                return new Plastic();
            default:
                throw new IllegalArgumentException("Invalid product type: " + type);
        }
    }
}

public class FactoryPatternExample {
    public static void main(String[] args) {
        Product product1 = ProductFactory.createProduct("Concrete");
        product1.use();

        Product product2 = ProductFactory.createProduct("Plastic");
        product2.use(); 
    }
}
