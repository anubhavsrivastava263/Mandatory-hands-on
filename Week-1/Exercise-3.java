
class Product {

    int id;
    String name;
    String category;

    Product(int id, String name, String category) {
        this.id = id;
        this.name = name;
        this.category = category;
    }
}

public class Exercise3 {

    static Product linearSearch(Product[] products, String name) {

        for (Product p : products) {

            if (p.name.equalsIgnoreCase(name))
                return p;
        }

        return null;
    }

    public static void main(String[] args) {

        Product[] products = {
                new Product(1, "Laptop", "Electronics"),
                new Product(2, "Mobile", "Electronics"),
                new Product(3, "Shoes", "Fashion")
        };

        Product p = linearSearch(products, "Mobile");

        if (p != null)
            System.out.println(p.id + " " + p.name);
        else
            System.out.println("Not Found");
    }
}
