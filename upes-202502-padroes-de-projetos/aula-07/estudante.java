public class estudante {

    private static estudante instancia; //Pesiste a instância depois de construída
    private String nome;
    private String disciplina;
    private double nota;

    //Construtor privado
    private estudante (String nome, String disciplina, double nota) {

        this.nome = nome;
        this.disciplina = disciplina;
        this.nota = nota;
        
    }

    public static estudante getInstance (String nome, String disciplina, double nota) {

        if (instancia == null) {
            instancia = new estudante(nome, disciplina, nota);
        }
        return instancia;

    }

    public static estudante destruir_estudante () {

        if (instancia != null) {
            instancia = null;
        }
        return instancia;

    }

    public String getNome () {
        return this.nome;
    }

    public String getDisciplina () {
        return this.disciplina;
    }

    public double getNota () {
        return this.nota;
    }

    //Exemplos inúteis de setters
    public void setNome (String nome) {
        this.nome = nome;
    }

    public void setDisciplina (String disciplina) {
        this.disciplina = disciplina;
    }

    public void setNota (double nota) {
        this.nota = nota;
    }
    
}
