package observer;

public abstract class AbsObserver {
    //Atributo do tipo observado
    protected subject observado;

    //Assinatura do método acionado durante a notificação
    public abstract void update();
}