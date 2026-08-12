import java.util.ArrayList;
import  java.util.List;

public class Historico {

    private List<String> operacoes = new ArrayList<>();

    public void adicionar(String hist) {
        operacoes.add(hist);
         if (operacoes.size() > 10){
             operacoes.remove(0);
        }
    }


    public void mostrar() {
        for (int i = 0; i < operacoes.size(); i++) {
            System.out.println((i + 1) + " - " + operacoes.get(i));
        }

    }

    public void limpar(){
        operacoes.clear();
    }
}