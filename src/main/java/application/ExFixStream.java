package application;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class ExFixStream {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter full file path: ");
        String path = sc.nextLine();
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            List <Employee> list = new ArrayList<>();
            String line = br.readLine();
         
            while(line != null){
                String[] dados = line.split(",");
                list.add(new Employee (dados[0],dados[1],Double.parseDouble(dados[2])));
                line = br.readLine();
            }
            
            Comparator <String> comp = new Comparator <String>(){
                public int compare(String a, String b){
                    return a.compareTo(b);
                } 
            };
            
            
            double soma = list.stream().filter(x->x.getName().charAt(0) == 'M').map(x->x.getSalary()).reduce(0.0, (x,y)->x+y);
            List <String> lista = list.stream().filter(x->x.getSalary() > salary).map(x->x.getEmail()).sorted(comp).collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than " + String.format("%.2f", salary) + ":");
            lista.forEach(System.out::println);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", soma));
        }       
        
        catch(IOException e){
                    System.out.println("Error: " + e.getMessage());
                    }
}
}