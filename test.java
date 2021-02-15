import java.io.IOException;
import java.util.Scanner;


public class test {
  public static void main(String[] args) throws IOException {
    
    Scanner sc = new Scanner(System.in);
    int valor1 = sc.nextInt();

    int test = 2;

    if(valor1 % 2 == 1){
        valor1 -= 1;
        int i = valor1;
        while(valor1 > test){
            test = valor1 - i + 2;
              System.out.println(test);
               i -= 2;
             } 
    }
    else{
        int i = valor1;
    while(valor1 > test){
    test = valor1 - i + 2;
      System.out.println(test);
       i -= 2;
     }
    
    }
    sc.close(); 
   }
  }

    

