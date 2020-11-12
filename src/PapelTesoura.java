import java.util.Scanner;

public class PapelTesoura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        sc.nextLine();

        for(int i = 0; i < num; i++) {
            String[] teste = sc.nextLine().split(" ");

            String vencedor = testeVencedor(teste[0], teste[1]);

            System.out.println(vencedor);
        }
    }

    public static String testeVencedor(String fern, String marc){
        String tesoura = "tesoura";
        String papel = "papel";
        String pedra = "pedra";
        String lagarto = "lagarto";
        String spock = "spock";

        if(fern.equals(marc)){
            return "empate";
        }
        else if(fern.equals(tesoura) && marc.equals(papel)){
            return "fernanda";
        }
        else if(fern.equals(papel) && marc.equals(tesoura)){
            return "marcia";
        }
        else if(fern.equals(papel) && marc.equals(pedra)){
            return "fernanda";
        }
        else if(fern.equals(pedra) && marc.equals(papel)){
            return "marcia";
        }
        else if(fern.equals(pedra) && marc.equals(lagarto)){
            return "fernanda";
        }
        else if(fern.equals(lagarto) && marc.equals(pedra)){
            return "marcia";
        }
        else if(fern.equals(lagarto) && marc.equals(spock)){
            return "fernanda";
        }
        else if(fern.equals(spock) && marc.equals(lagarto)){
            return "marcia";
        }
        else if(fern.equals(spock) && marc.equals(tesoura)){
            return "fernanda";
        }
        else if(fern.equals(tesoura) && marc.equals(spock)){
            return "marcia";
        }
        else if(fern.equals(tesoura) && marc.equals(lagarto)){
            return "fernanda";
        }
        else if(fern.equals(lagarto) && marc.equals(tesoura)){
            return "marcia";
        }
        else if(fern.equals(lagarto) && marc.equals(papel)){
            return "fernanda";
        }
        else if(fern.equals(papel) && marc.equals(lagarto)){
            return "marcia";
        }
        else if(fern.equals(papel) && marc.equals(spock)){
            return "fernanda";
        }
        else if(fern.equals(spock) && marc.equals(papel)){
            return "marcia";
        }
        else if(fern.equals(spock) && marc.equals(pedra)){
            return "fernanda";
        }
        else if(fern.equals(pedra) && marc.equals(spock)){
            return "marcia";
        }
        else if(fern.equals(pedra) && marc.equals(tesoura)){
            return "fernanda";
        }
        else if(fern.equals(tesoura) && marc.equals(pedra)){
            return "marcia";
        }
        return null;
    }
}
