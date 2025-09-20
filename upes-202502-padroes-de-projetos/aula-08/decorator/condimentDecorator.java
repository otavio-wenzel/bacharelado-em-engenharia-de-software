package decorator;

//Decorador abstrato
public abstract class condimentDecorator implements iBebida {

    protected iBebida bebida;

    public condimentDecorator(iBebida bebida) {
        this.bebida = bebida;
    }

}