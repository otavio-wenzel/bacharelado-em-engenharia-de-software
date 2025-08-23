public class fabrica_circulo implements iFabrica {
    
    @Override
    public iForma criar() {
        return new circulo();
    }

}
