public class app_paint {

    public static void main(String[] args) {
        
        desenhista paint = new desenhista();
        paint.desenhar(new fabrica_circulo());
        /*iFabrica fabrica = new fabrica_circulo();
        fabrica_circulo f2 = new fabrica_circulo();
        fabrica.criar(); //Cículo impresso no terminal*/

    } 
    
}
