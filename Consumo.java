import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;


public class Consumo {

public static void main(String[] args) throws IOException {
    
    Locale.setDefault(Locale.US);

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    Integer distancia = Integer.parseInt(st.nextToken());

    st = new StringTokenizer(br.readLine());
    Double consumo = Double.parseDouble(st.nextToken());

    Double consumoMedio = distancia / consumo;

    System.out.printf("%.3f km/l", consumoMedio);
  }
}

