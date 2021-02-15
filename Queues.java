import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class Queues {
    
    public static void main(String[] args) {
        
        Queue<String> nomes = new LinkedList<>();

        nomes.add("Maria");
        nomes.add("José");
        nomes.add("Carlos");
        nomes.add("Larissa");

        System.out.println(nomes.size());

        for(String n : nomes){
            System.out.println(n);
        }

        System.out.println(nomes.poll());

        Iterator<String> it = nomes.iterator();

        while(it.hasNext()){
            System.out.println("->>> " + it.next());

        }
    }
}
