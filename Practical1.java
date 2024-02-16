/*1.  Define Product class with name, price,  and sort it price wise (use comparable interface) 
*/

package Thursday_LAB_15_02_24;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Product implements Comparable<Product> 
{
    private String name;
    private double price;

    public Product(String name, double price) 
    {
        this.name = name;
        this.price = price;
    }

    public String getName() 
    {
        return name;
    }

    public double getPrice() 
    {
        return price;
    }

    @Override
    public int compareTo(Product other) 
    {
        return Double.compare(this.price, other.price);
    }

    @Override
    public String toString() 
    {
        return name + ": \t"+ price + " Rs" ;
    }
}

public class Practical1 
{
    public static void main(String[] args) 
    {
        List<Product> products = new ArrayList<>();
        products.add(new Product("Smart TV", 25000));
        products.add(new Product("Headphones", 	3000));
        products.add(new Product("Smartphone", 	12000));
        products.add(new Product("Refrigerator", 18000));
        products.add(new Product("LED TV", 	20000));
        products.add(new Product("Laptop", 	30000));

        Collections.sort(products);

        System.out.println("Products sorted by price:");
        System.out.println();
        System.out.println("Products \t Price");
        System.out.println("-------------------------");

        
        for (Product product : products) 
        {
            System.out.println(product);
        }
    }
}
