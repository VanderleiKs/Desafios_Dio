import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class t {

    public static void main(String[] args) throws IOException {
               
        List<Integer> list = new ArrayList<>();
                
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < 5; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int valor = Integer.parseInt(st.nextToken());
            list.add(valor);
        }
    int pares = 0, impares = 0, negativos = 0, positivos = 0;

      for(Integer i : list){
          if(i % 2 == 0){
              pares += 1;
          }
          else{
              impares += 1;
      }
    }
    for(Integer i : list){
        if(i > 0){
            positivos += 1;
        }
        else if(i < 0){
            negativos += 1;
        }
    }
    System.out.println(pares + " valor(es) par(es)");
    System.out.println(impares + " valor(es) impar(es)");
    System.out.println(positivos + " valor(es) positivo(s)");
    System.out.println(negativos + " valor(es) negativo(s)");
    }
}