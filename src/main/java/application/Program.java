package application;

import entities.Product;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
    public static void main(String[] args){
        List <Product> list = new ArrayList<>();
        
        Product p1 = new Product("TV", 800.00);
        Product p2 = new Product("Microwave", 700.00);
        Product p3 = new Product("Apple", 0.50);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        
        Comparator <Product> comp = new Comparator<Product>(){
            public int compare(Product p1, Product p2){
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }//Declaro um comparador do tipo que quero e dps implemento o compare;
        };
        list.sort(comp);
        for(Product p : list){
            System.out.println(p);
        }

    }
}
