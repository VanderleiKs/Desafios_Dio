import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class test1 {

public static void main(String[] args) throws IOException {
    

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Integer valor = Integer.parseInt(st.nextToken());
    
    int notas100, notas50, notas20, notas10, notas5, notas2, notas1;

    System.out.println(valor);

    notas100 = (valor / 100);
    valor %= 100;
    notas50 = (valor / 50);
    valor %= 50;
    notas20 = (valor / 20);
    valor %= 20;
    notas10 = (valor / 10);
    valor %= 10;
    notas5 = (valor / 5);
    valor %= 5;
    notas2 = (valor / 2);
    valor %= 2;
    notas1 = (valor / 1);
    valor %= 1;

    
    System.out.println(notas100 + " nota(s) de R$ 100,00");
    System.out.println(notas50 + " nota(s) de R$ 50,00");
    System.out.println(notas20 + " nota(s) de R$ 20,00");
    System.out.println(notas10 + " nota(s) de R$ 10,00");
    System.out.println(notas5 + " nota(s) de R$ 5,00");
    System.out.println(notas2 + " nota(s) de R$ 2,00");
    System.out.println(notas1 + " nota(s) de R$ 1,00");
    
  }
}
