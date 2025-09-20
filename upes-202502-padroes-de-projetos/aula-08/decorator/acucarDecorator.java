package decorator;

//Decorador concreto
public class acucarDecorator extends condimentDecorator{
    
    public acucarDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", acucar";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 0.1;
    }

}