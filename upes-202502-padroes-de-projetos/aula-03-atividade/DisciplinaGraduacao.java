class DisciplinaGraduacao extends DisciplinaBase {
    private double[] notas;

    public DisciplinaGraduacao(String nome, double[] notas) {
        super(nome);
        this.notas = notas;
    }

    @Override
    public boolean aprovado() {
        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.length;
        return media >= 7.0;
    }
}