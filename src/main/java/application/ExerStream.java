//Entender +
package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ExerStream {
    
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List <Product> list = new ArrayList<>();
            String line = br.readLine();
         
            while(line != null){
                String[] dados = line.split(",");
                list.add(new Product (dados[0],Double.parseDouble(dados[1])));
                line = br.readLine();
            }
            
            Comparator <String> comp = (p1,p2) -> -p1.toUpperCase().compareTo(p2);
            
            double media = list.stream().map(x->x.getPrice()).reduce(0.0,(x,y)->x+y)/list.size();
            System.out.println("Average price: " + String.format("%.2f", media));
            List <String> lista = list.stream().filter(x->x.getPrice() < media).map(x->x.getName()).sorted(comp).collect(Collectors.toList());
            for(String g: lista){
                System.out.println(g);
            }
        }
        catch(IOException e){
            System.out.println("Error: " + e.getMessage());
        }
    }
}
