class DisciplinaEspecializacao extends DisciplinaBase {
    private char[] conceitos; // A, B, C ou D

    public DisciplinaEspecializacao(String nome, char[] conceitos) {
        super(nome);
        this.conceitos = conceitos;
    }

    @Override
    public boolean aprovado() {
        for (char conceito : conceitos) {
            if (conceito == 'D' || conceito == 'd') {
                return false;
            }
        }
        return true;
    }
}