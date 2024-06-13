package entities;
public class Product {
    
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
        
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
    public static boolean test(Product p){
        return p.price >= 100.0;
    }
   
    public boolean nonStatic(){
        return price >= 100.0;
    }
    
    public static void StaticAccept(Product p){
        p.setPrice(p.getPrice()*1.1);
    }
    public  void NonStaticAccept(){
        price *=1.1; 
    }
    
    public static String staticFunction(Product p){
        return p.getName().toUpperCase();
    }
    
    public String nonStaticFunction(){
        return name.toUpperCase();
    }
    
    @Override
    public String toString() {
        return "Product{" + "name=" + name + ", price=" + String.format("%.2f", price) + '}';
    }
    
    
}
