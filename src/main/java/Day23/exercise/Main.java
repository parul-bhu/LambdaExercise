package Day23.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Main {



    public static void main(String[] args) {
        List<Product> product = new ArrayList<>();
        product.add(new Product("Cookies", 4.00, "chocolate chip cookie", 1, Type.NonPerishable));
        product.add(new Product("Tomatoes", 5.00, "Roman Tomato", 6, Type.Perishable));
        product.add(new Product("Pasta", 1.50, "Spiral Creamy Pasta", 2, Type.NonPerishable));
        product.add(new Product("Chips", 3.00, "Unsalted Chips", 1, Type.NonPerishable));
        product.add(new Product("Cake", 30, "Chocolate Cake", 1, Type.Perishable));
        product.add(new Product("EggPlant", 4.00, "Purple EggPlant", 3, Type.Perishable));
        product.add(new Product("Bread", 2.50, "Brown Bread", 1, Type.Perishable));
        product.add(new Product("Tortillas", 2.50, "Spicy Tortillas", 4, Type.NonPerishable));
        product.add(new Product("Coffee", 5.00, "Coffee Powder", 1, Type.NonPerishable));
        product.add(new Product("Sugar", 3.50, "Fine Sugar", 2, Type.NonPerishable));
        product.add(new Product("Pasta", 1.50, "Spiral Creamy Pasta", 2, Type.NonPerishable));
        product.add(new Product("EggPlant", 4.00, "Purple EggPlant", 3, Type.Perishable));
        product.add(new Product("Bread", 2.50, "Brown Bread", 1, Type.Perishable));



        /* Print all the product with full list*/
       product.forEach((p)-> System.out.println(p));

  //      product.stream();
       //product.forEach(Main::println);

          /* Print only those products whose price is less than 30$ */
        List<String> collect = product.stream().filter((d) -> d.getPrice() < 30).map((d) -> d.getName()).collect(Collectors.toList());
        System.out.println(collect);


        /* Map */
        product.stream().map((d)->d.Product);

    }

   }
