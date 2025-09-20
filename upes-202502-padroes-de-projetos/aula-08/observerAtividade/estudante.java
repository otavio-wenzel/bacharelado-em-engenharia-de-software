package observerAtividade;

import java.util.ArrayList;
import java.util.List;

public class estudante {

    private String situacao;

    List<AbsObservador> observadores = new ArrayList<AbsObservador>();
    
    private void notificarTodos() {
        for (AbsObservador o : this.observadores) {
            o.processar();
        }
    }

    public String getStiacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
        this.notificarTodos();
    }

    public void attach(AbsObservador o) {
        this.observadores.add(o);
    }

    public void dettach(AbsObservador o) {
        this.observadores.remove(o);
    }
    
}
