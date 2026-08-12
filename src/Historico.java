import java.util.ArrayList;
import  java.util.List;

public class Historico {

    private List<String> operacoes = new ArrayList<>();

    public void adicionar(String hist) {
        operacoes.add(hist);
    }

    public void mostrar() {
        for (String hist : operacoes) {
            System.out.println(hist);
        }

    }
}