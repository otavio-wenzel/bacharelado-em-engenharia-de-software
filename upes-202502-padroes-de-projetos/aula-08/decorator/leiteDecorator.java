package decorator;

//Decorador concreto
public class leiteDecorator extends condimentDecorator{

    public leiteDecorator(iBebida bebida) {
        super(bebida);
    }

    @Override
    public String Descricao() {
        return bebida.Descricao() + ", Leite";
    }

    @Override
    public double Preco() {
        return bebida.Preco() + 0.5;
    }

}