import java.util.HashMap;
import java.util.Map;

public class MapJava {
    
    public static void main(String[] args) {
        
        HashMap<String, String> estados = new HashMap<>();

        estados.put("RS", "Rio Grande do Sul");
        estados.put("SC", "Santa Catarina");
        estados.put("SP", "São Paulo");
        estados.put("PR", "Paraná");
        estados.put("MG", "Minas Gerais");

        for(Map.Entry<String, String> entry : estados.entrySet()){
            System.out.println(entry.getKey() + " -- " + entry.getValue());
        }


        System.out.println(estados.size());

        System.out.println(estados);

        System.out.println(estados.get("Rio Grande do Sul"));

        System.out.println(estados.containsValue("Rio de Janeiro"));

    }



}
