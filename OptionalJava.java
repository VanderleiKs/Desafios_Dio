import java.util.Optional;
import java.util.OptionalDouble;

public class OptionalJava {
    

    public static void main(String[] args) {
        
        Optional<String> op = Optional.ofNullable(null);



        Optional<String> op3 = Optional.of(null);

        //caso tenha valor presente, executa primeira parte, caso nulo executa a segunda parte.
        op3.ifPresentOrElse(System.out::println, () -> System.out.println("Erro na execução"));

        op.ifPresentOrElse(System.out::println, () -> System.out.println("Valor está vazio"));

        System.out.println(op);

        System.out.println(op);

        op.map((x) -> x.concat(" Bacana")).ifPresent(System.out::println);

        OptionalDouble.of(25.5);




    }
}
