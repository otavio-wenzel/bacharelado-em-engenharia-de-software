public class desenhista {

    public void desenhar (iFabrica fabrica) {
        //fabrica.criar().desenhar();
        iForma forma = fabrica.criar();
        forma.desenhar();
    }
  
}
