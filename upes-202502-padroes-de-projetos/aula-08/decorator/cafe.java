package decorator;

//Componentes concreto
public class cafe implements iBebida{

    @Override
    public String Descricao() {
        return "Café ";
    }

    @Override
    public double Preco() {
        return 3.0;
    }

}