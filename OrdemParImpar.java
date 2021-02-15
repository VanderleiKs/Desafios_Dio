import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class OrdemParImpar {

        public static void main(String[] args) throws IOException {

            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                StringTokenizer st = new StringTokenizer(br.readLine());
                var lines = (Integer.parseInt(st.nextToken()));
            String[] lista = null;

            List<String> values = new ArrayList<>();
            for(int i = 0; i < lines; i++) {
                st = new StringTokenizer(br.readLine());
                lista = (st.nextToken().split(" "));
            }

            Arrays.stream(lista).forEach(System.out::println);
            System.out.println(lista);

          //  values.stream().filter((par) -> par % 2 == 0).sorted((x, y) -> x - y).forEach(System.out::println);
          //  values.stream().filter((imper) -> imper % 2 != 0).sorted((x, y) -> y - x).forEach(System.out::println);
        }
    }

