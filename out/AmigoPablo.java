package out;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class AmigoPablo {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        List<Voto> listaVotos = new ArrayList<>();
        var test = true;

        while (test) {
            String[] voto = scan.nextLine().split(" ");
            if (voto[0].equals("FIM")) {
                test = false;
            } else {
                listaVotos.add(new Voto(voto[0], voto[1]));
            }
        }

        for(Voto v : listaVotos){
            for(Voto j : listaVotos){
                if(v.getNome().equals(j.getNome())){
                    v.addQuantidade();
                }
            }
        }
       Set<String> listaImprime = new HashSet<>(listaVotos.stream()
                     .map((p) -> p.getNome()).collect(Collectors.toList()));

        for (String i : listaImprime.stream().sorted().collect(Collectors.toList())) {
            System.out.println(i);
        }
        System.out.println();
        System.out.println("Amigo do Pablo: " + listaVotos.stream().max((p, n) -> p.getQuantidade()).get().getNome());

        scan.close();
    }
}

class Voto {

    private String nome;
    private String voto;
    private int quantidade;

    Voto(){}

    Voto(String nome, String voto) {
        this.nome = nome;
        this.voto = voto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getVoto() {
        return voto;
    }

    public void setVoto(String voto) {
        this.voto = voto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void addQuantidade() {
        quantidade += 1;
    }
    
}