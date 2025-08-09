public class professor extends pessoa {
    public String matricula;  
    
    public professor(){}

    public professor(String cpf, String nome, String email, String matricula){
        this.cpf = cpf;
        this.nome = nome;
        this.email = email;
        this.matricula = matricula;
    }


    @Override
    public boolean Salvar() {
        if (super.Salvar()) {
            System.out.println("Salvando na tabela de professores");
            return true;
        }
        return false;
    }

    public void Salvar(String cpf, String nome, String email, String matricula){
        System.out.println("Salvando com sobrecarga.");
    }
}
