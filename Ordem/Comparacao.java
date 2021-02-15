package Ordem;

import java.util.Comparator;

public class Comparacao implements Comparator<Estudante> {

    @Override
    public int compare(Estudante o1, Estudante o2) {
        return o1.getIdade() - o2.getIdade();
    }
}
