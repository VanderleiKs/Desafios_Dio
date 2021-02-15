import java.util.Scanner;
import java.util.regex.Pattern;

public class ValidadorSenhas2 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String senha;

        while(sc.hasNextLine()){

            senha = sc.nextLine();

            Pattern p1 = Pattern.compile("[a-zA-Z0-9]+");
            Pattern p2 = Pattern.compile(".*[a-z].*");
            Pattern p3 = Pattern.compile(".*[A-Z].*");
            Pattern p4 = Pattern.compile(".*[0-9].*");

            if(senha.length() > 5 && senha.length() < 33 
                                    && p1.matcher(senha).matches() 
                                    && p2.matcher(senha).matches() 
                                    && p3.matcher(senha).matches() 
                                    && p4.matcher(senha).matches()){
                
                System.out.println("Senha valida.");
            }
            else{
                System.out.println("Senha invalida.");
            }

        }
    }
}
