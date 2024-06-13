package model.services;

import entities.Product;
import java.util.List;
import java.util.function.Predicate;

public class ProductService {
    public static Double sum(List <Product> list, Predicate <Product> rule){
        
        double soma = 0;
        for(Product p : list){
            if(rule.test(p)) //Isso é um predicado, então poderia passar um predicado{
                soma+=p.getPrice();
            }
            return soma;
    }
        
    }

