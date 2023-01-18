package Day23.exercise;

import java.lang.reflect.Type;
import java.util.Objects;

public class Product {

    public Object Product;
    private String Name;
    private double Price;
    private String Description;
    private double Quantity;
    private Type type;

    public Product(String name, double price, String description, double quantity, Type type) {
        Name = name;
        Price = price;
        Description = description;
        Quantity = quantity;
        this.type = type;
    }

    public Product(String ProductName, double price, String Description, int quantity, Day23.exercise.Type nonPerishable) {
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double price) {
        Price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public double getQuantity() {
        return Quantity;
    }

    public void setQuantity(double quantity) {
        Quantity = quantity;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Product{" +
                "Name='" + Name + '\'' +
                ", Price=" + Price +
                ", Description='" + Description + '\'' +
                ", Quantity=" + Quantity +
                ", type=" + type +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Double.compare(product.Price, Price) == 0 && Double.compare(product.Quantity, Quantity) == 0 && Name.equals(product.Name) && Description.equals(product.Description) && type.equals(product.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(Name, Price, Description, Quantity, type);
    }
}
