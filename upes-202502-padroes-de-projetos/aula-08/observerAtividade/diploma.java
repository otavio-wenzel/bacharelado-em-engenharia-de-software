package observerAtividade;

public class diploma extends AbsObservador{

    diploma(estudante estudante) {
        this.estudante = estudante;
        this.estudante.attach(this);
    }

    @Override
    public void processar() {
        System.out.println("Registro de diploma.");
    }
    
}
