import java.util.Scanner;

public class SubString {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        var primeira = sc.nextLine();
        var segunda = sc.nextLine();
        String palavra = "";

        for(int i = 0; i < primeira.length(); i++){
           if(primeira.charAt(i) == segunda.charAt(i)){
               palavra += primeira.charAt(i);
           };
        }
        System.out.println(palavra);
    }
}
