public class NotificacaoService {

    public void enviarNotificacao(NotificacaoFactory factory, String mensagem) {
        Notificacao notificacao = factory.criarNotificacao();
        notificacao.enviar(mensagem);
    }
    
}
