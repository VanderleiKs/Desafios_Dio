import java.util.Scanner;

public class Weblogger {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()){
            String texto = sc.nextLine();
                    for(int i = 0; i < texto.length(); i++) {
                        texto = texto.replaceFirst("\\*",  "<b>");
                        texto = texto.replaceFirst("\\*", "</b>");
                        texto = texto.replaceFirst("_",  "<i>");
                        texto = texto.replaceFirst("_", "</i>");
                    }

            System.out.println(texto);
        }
    }
}
