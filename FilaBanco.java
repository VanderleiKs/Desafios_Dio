import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FilaBanco {

    public static void main(String[] args) {

        List<List<Integer>> senhas = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
    int num = Integer.parseInt(sc.nextLine());

    for(int i = 0; i < num; i++){
        int n = Integer.parseInt(sc.nextLine());
        String[] ent = sc.nextLine().split(" ");
        List<Integer> k = new ArrayList<>();
        for(String y : ent) {
           k.add(Integer.parseInt(y));
            }
        senhas.add(k);
        }

        for(List<Integer> imp : senhas){
           List<Integer> test = new ArrayList<>(imp);
            imp.sort((x, y) -> y - x);
            int alt = 0;
           for(int i = 0; i < imp.size(); i++){
               if (imp.get(i) == test.get(i)) {
                   alt += 1;
               }
           }
            for(Integer a : imp){
               // System.out.print(a + " ");
            }

            System.out.println(alt);
        }

    }
}

