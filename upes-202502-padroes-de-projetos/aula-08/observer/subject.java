package observer;

import java.util.ArrayList;
import java.util.List;

public class subject {

    private int state;

    //Lista de observadores
    List<AbsObserver> observers = new ArrayList<AbsObserver>();

    //Método para notificar todos os observadores
    private void notificarObservadores() {
        for (AbsObserver o : this.observers) {
            o.update();
        }
    }

    //Método que altera o estado e aciona a notificação
    public void setState ( int state) {
        this.state = state;
        this.notificarObservadores();
    }

    //Método para registro de observadores
    public void attach(AbsObserver o) {
        this.observers.add(o);
    }

    //Método para remoção de observadores
    public void dettach(AbsObserver o) {
        this.observers.remove(o);
    }
    
}
