public class fabrica_triangulo implements iFabrica {

    @Override
    public iForma criar() {
        return new triangulo();
    }
    
}
