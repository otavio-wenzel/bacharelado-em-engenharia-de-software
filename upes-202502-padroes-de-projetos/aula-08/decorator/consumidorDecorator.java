package decorator;

//Consumidor do Decorator
public class consumidorDecorator {
    public static void main(String[] args) {

    //Preparar um café
    iBebida cafe = new cafe();
    System.out.println("Bebida pedida: " +cafe.Descricao());
    System.out.println("Custo : " +cafe.Preco());

    //Adicionando leite
    cafe = new leiteDecorator(cafe);
    System.out.println("Bebida pedida: " +cafe.Descricao());
    System.out.println("Custo : " +cafe.Preco());

    //Adicionando acucar
    cafe = new acucarDecorator(cafe);
    System.out.println("Bebida pedida: " +cafe.Descricao());
    System.out.println("Custo : " +cafe.Preco());
    }
    
}