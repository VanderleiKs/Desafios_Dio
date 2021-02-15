import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class uni{
    private String nome;
    private String cor;
    private String tamanho;

    public uni(String nome, String cor, String tamanho) {
        this.nome = nome;
        this.cor = cor;
        this.tamanho = tamanho;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }
}


public class Uniform {

    public static void main(String[] args) {
        List<uni> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int num = Integer.parseInt(sc.nextLine());

        for(int i = 0; i < num; i++){
            String m = sc.nextLine();
            String[] l = sc.nextLine().split(" ");
            list.add(new uni(m, l[0], l[1]));
        }

        list.sort((x, y) -> x.getNome().compareTo(y.getNome()));
        list.sort((x, y) -> y.getTamanho().compareTo(x.getTamanho()));
        list.sort((x, y) -> x.getCor().compareTo(y.getCor()));

        for (uni x: list) {
            System.out.println(x.getCor() + " " + x.getTamanho() + " " + x.getNome());
        }

    }
}
