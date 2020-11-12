
import java.util.Scanner;

public class ValidaSenha {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            var senha = sc.nextLine();
            var valida = "Senha invalida.";


            if (testSenha(senha)) {
                valida = "Senha valida.";
            }

            System.out.println(valida);
        }
    }

    public static boolean testSenha(String senha){
        if(senha.length() < 5 || senha.length() > 31){
            return false;
        }
        var numero = false;
        var maiuscula = false;
        var minuscula = false;
        for(char c : senha.toCharArray()){
            if(c >= 48 && c <= 57){
                numero = true;
            }
            else if(c >= 65 && c <= 90){
                maiuscula = true;
            }
            else if(c >= 97 && c <= 122){
                minuscula = true;
            }
            else{
                return false;
            }
        }
        return numero && maiuscula && minuscula;
    }

}