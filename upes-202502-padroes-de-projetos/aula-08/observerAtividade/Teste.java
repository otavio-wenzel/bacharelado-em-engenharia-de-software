package observerAtividade;

public class Teste {

    public static void main(String[] args) {

        estudante veterano = new estudante();

        //Observador A
        diploma diploma = new diploma(veterano);

        //Observador B
        colacaoGrau colacao = new colacaoGrau(veterano);

        veterano.setSituacao("Formado");
        
    }
    
}
