package observer;
public class consumidorObserver {

    public static void main(String[] args) {
        //Observado
        subject observado = new subject();

        //Observador A
        observadorConcreto ObsA = new observadorConcreto(observado);

        //Observador B
        observadorConcreto ObsB = new observadorConcreto(observado);

        observado.setState(1);
    }
    
}
