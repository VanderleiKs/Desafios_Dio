import java.util.Iterator;
import java.util.TreeSet;

public class SetJava {
    
    public static void main(String[] args) {
        
        TreeSet<String> numeros = new TreeSet<>();

        numeros.add("Porto Alegre");
        numeros.add("Florienopolis");
        numeros.add("Curitiba");
        numeros.add("São paulo");


        Iterator<String> it = numeros.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

       System.out.println(numeros.lower("Florienopolis"));
        
        
        System.out.println("---> " + numeros);
        
        System.out.println(numeros.size());


    }
}
