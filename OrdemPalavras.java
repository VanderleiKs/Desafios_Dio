import java.io.IOException;
import java.util.*;

public class OrdemPalavras {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        List<List<String>> li = new ArrayList<>();

        for (int i = 0; i < num; i++) {
            List<List<String>> lister = new ArrayList<>();
            lister.add(Arrays.asList((sc.nextLine().split(" "))));
            lister.forEach(li::add);
        };

        for (List<String> list: li) {
            List<String> listImpress = new ArrayList<>();
            listImpress.addAll(list);
            listImpress.sort((x, y) -> x.compareTo(y));
            listImpress.sort((x, y) -> y.length() - x.length());
            for(String l: listImpress){
                l.lines().map((x) -> x + " ").forEach(System.out::print);
            }
            System.out.println();
        }

        sc.close();
    }

}
