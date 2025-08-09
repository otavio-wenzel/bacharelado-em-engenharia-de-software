public class estudante extends pessoa {
    public String rgm;    

    @Override
    public boolean Salvar() {
        if (super.Salvar()) {
            System.out.println("Salvando na tabela de estudantes");
            return true;
        }
        return false;
    }
}
