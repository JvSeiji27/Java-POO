package application;
 

import entities.Product;
import java.util.ArrayList;
import java.util.List;

import entities.Product;

import entities.Product;
import java.util.stream.Collectors;
import static java.util.stream.Collectors.toList;
import util.UpperCaseName;

public class UsingFunction {
    public static void main(String[] args){
        List <Product> list = new ArrayList<>();
        
        Product p1 = new Product("TV", 800.00);
        Product p2 = new Product("Microwave", 700.00);
        Product p3 = new Product("Apple", 0.50);
        Product p4 = new Product("Mouse", 40.0);
        
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        
        List <String> names = list.stream().map(new UpperCaseName()).collect(Collectors.toList());
        //Para aplicar map preciso converter para Stream, aplico a função Upper para elemento da lista,
        //Após isso converto para lista, que será de Strings;
        names.forEach(System.out::println);
    }
}