package Ordem;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {

        List<Estudante> estudantes = new ArrayList<>();

        estudantes.add(new Estudante("Maria", 17));
        estudantes.add(new Estudante("Carlos", 21));
        estudantes.add(new Estudante("Nazare", 33));
        estudantes.add(new Estudante("Silvio", 25));
        estudantes.add(new Estudante("Sauzana", 25));
        estudantes.add(new Estudante("Celoi", 21));
        estudantes.add(new Estudante("Mara", 17));

        //estudantes.sort((x, y) -> x.getNome().compareTo(y.getNome()));
        //estudantes.sort((x, y) -> x.getIdade() - y.getIdade());
        estudantes.stream().sorted((x, y) -> x.getNome().compareTo(y.getNome())).sorted((x, y) -> y.getIdade() - x.getIdade()).forEach(System.out::println);

       var nomes = estudantes.stream().filter((x) -> x.getIdade() > 20).toArray();

       List<String> novaLista = estudantes.stream().map(estudante -> estudante.getNome().toUpperCase()).collect(Collectors.toList());

       System.out.println(novaLista);

        System.out.println(estudantes.stream().map(estudante -> estudante.getNome().concat(" -- ").concat(String.valueOf(estudante.getNome().length()).concat(", "))).collect(Collectors.joining()));


       for(Object o : nomes){
           System.out.println("Quantidade: " + o);
       }

       estudantes.stream().filter(estudante -> estudante.getNome().toLowerCase().contains("z")).forEach(System.out::println);

       estudantes.stream().collect(Collectors.groupingBy(estudante -> estudante.getNome().substring(0, 1)));

        estudantes.stream().map(estudante -> estudante.getNome() + " - - > " + estudante.getIdade()).forEach(System.out::println);


        estudantes.sort((x, y) -> x.getNome().compareTo(y.getNome()));
        estudantes.sort((x, y) -> x.getIdade() - y.getIdade()); // Compara pela idade função Lambda

        estudantes.sort(Comparator.comparingInt(Estudante::getIdade)); // função por referência

        estudantes.sort(new Comparacao());

        /*for (Estudante e : estudantes) {
            System.out.println(e);
        }*/
    }
}
