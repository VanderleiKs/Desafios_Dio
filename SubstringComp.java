import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SubstringComp {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            var primeira = sc.nextLine();
            var segunda = sc.nextLine();
            int qtd = 0;
            List<Integer> listQtd = new ArrayList<>();
            char[] primeiraChar = primeira.toCharArray();
            char[] segundaChar = segunda.toCharArray();

            for (int ind = 0; ind < primeira.length() && ind < segunda.length(); ind++) {
                for (int i = 0; i < primeiraChar.length && i < segundaChar.length; i++) {
                    if (primeiraChar[ind] == segundaChar[i]) {
                        qtd += 1;
                        int contpri = ind + 1;
                        int contseg = i + 1;
                        while (contpri < primeiraChar.length && contseg < segundaChar.length
                                && primeiraChar[contpri] == segundaChar[contseg]) {
                            qtd += 1;
                            contpri += 1;
                            contseg += 1;
                        }
                    }
                        listQtd.add(qtd);
                        qtd = 0;
                    
                }
            }
            listQtd.add(qtd);
            qtd = 0;

            System.out.println(listQtd.stream().max(Integer::compareTo).get());

        }
        sc.close();
    }
}

/*
 * if (primeira.length() >= 1 && primeira.length() <= 50 && segunda.length() >=
 * 1 && segunda.length() <= 50) { if (primeira.charAt(0) >= 65 &&
 * primeira.charAt(0) <= 90 || primeira.charAt(0) >= 97 && primeira.charAt(0) <=
 * 122) { if (segunda.charAt(0) >= 65 && segunda.charAt(0) <= 90 ||
 * segunda.charAt(0) >= 97 && segunda.charAt(0) <= 122) {
 */