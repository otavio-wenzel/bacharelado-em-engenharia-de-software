public class fabrica_retangulo implements iFabrica {

    @Override
    public iForma criar() {
        return new retangulo();
    }
    
}
