package application;

import java.util.List;
import java.util.Arrays;
import java.util.stream.Stream;
public class UsingStream {
    
    public static void main(String[] args){
        
        List <Integer> list = Arrays.asList(3,4,5,10,7);
        Stream <Integer> st1 = list.stream().map(x->x*10);
        System.out.println(Arrays.toString(st1.toArray()));
        //Arrays.toString é um método que passa array para string(Deve ter um array dentro)
        //Stream.of permite inicializar uma Stream com valores, semelhante com Arrays.asList;
        Stream <String> st2 = Stream.of("Maria", "Alex", "Bob");
        System.out.println(Arrays.toString(st2.toArray()));
        
        //Como se estivesse em um for infinito
        Stream <Integer> st3 = Stream.iterate(0, x-> x + 2);
        //Gero uma nova stream limitada e a partir dela gero um array e dps string
        System.out.println(Arrays.toString(st3.limit(10).toArray()));
        // Como se eu criasse um novo vetor (tupla) para cada iteração com o segundo elemento do anterior na 1 posicao e soma dos anteriores na segunda posição
        Stream <Integer> st4 = Stream.iterate(new Integer[] {0,1}, p->new Integer[] {p[1],p[0]+p[1]}).map(p->p[0]);
        System.out.println(Arrays.toString(st4.limit(20).toArray()));
        
    
    }
}
