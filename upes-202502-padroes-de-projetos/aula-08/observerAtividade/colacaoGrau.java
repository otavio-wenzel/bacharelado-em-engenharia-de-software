package observerAtividade;

public class colacaoGrau extends AbsObservador{

    colacaoGrau(estudante estudante) {
        this.estudante = estudante;
        this.estudante.attach(this);
    }

    @Override
    public void processar() {
        System.out.println("Agendando colação de grau.");
    }
    
}
