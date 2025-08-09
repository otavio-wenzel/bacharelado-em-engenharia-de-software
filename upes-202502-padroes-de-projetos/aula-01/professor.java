public class professor extends pessoa {
    public String matricula;    

    @Override
    public boolean Salvar() {
        if (super.Salvar()) {
            System.out.println("Salvando na tabela de professores");
            return true;
        }
        return false;
    }
}
