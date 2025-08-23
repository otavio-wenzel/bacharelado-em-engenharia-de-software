abstract class DisciplinaBase implements Disciplina {
    protected String nome;

    public DisciplinaBase(String nome) {
        this.nome = nome;
    }

    @Override
    public String getNome() {
        return nome;
    }
}