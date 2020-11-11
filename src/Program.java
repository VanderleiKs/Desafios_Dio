import java.util.*;
import java.util.stream.Collectors;

public class Program {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        List<Integer> list = new ArrayList<>();

        int num = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < num; i++){
            list.add(sc.nextInt());
        }


        Set<Integer> setList = new HashSet<>(list);
        List<Integer> listOrder = setList.stream().sorted().collect(Collectors.toList());

        for(Integer i : listOrder){
            int qtd = 0;
            for (Integer integer : list){
                if (i.equals(integer)) {
                    qtd += 1;
                }
            }
            System.out.println(i + " aparece " + qtd + " vez(es)");
        }

    }

}
