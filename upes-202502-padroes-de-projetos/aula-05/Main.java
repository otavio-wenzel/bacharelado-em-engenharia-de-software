public class Main {

    public static void main(String[] args) {
        
        NotificacaoService service = new NotificacaoService();

        service.enviarNotificacao(new EmailFactory(), "Bem vindo ao nosso sistema!");

        service.enviarNotificacao(new SmsFactory(), "Seu código de verificação é: 1234");

        service.enviarNotificacao(new PushFactory(), "Você tem uma nova mensagem.");

    }
    
}
