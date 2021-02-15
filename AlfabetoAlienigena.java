import java.util.Scanner;

public class AlfabetoAlienigena {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        while (scan.hasNextLine()) {
            String[] alfabeto = scan.nextLine().split("");
            String[] frase = scan.nextLine().split("");

            int count = 0;

            for (String i : alfabeto) {
                for (String j : frase) {
                    if (i.equals(j)) {
                        count += 1;
                    }
                }
            }
            System.out.println(count);
        }
        scan.close();
    }
}