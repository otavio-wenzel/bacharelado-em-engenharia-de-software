class Aluno {
    public String nome;
    public Disciplina disciplina;

    public Aluno(String nome, Disciplina disciplina) {
        this.nome = nome;
        this.disciplina = disciplina;
    }

    public void resultado() {
        System.out.println("Aluno: " + nome);
        System.out.println("Disciplina: " + disciplina.getNome());
        if (disciplina.aprovado()) {
            System.out.println("Resultado: APROVADO\n");
        } else {
            System.out.println("Resultado: REPROVADO\n");
        }
    }
}