public class Main {
    public static void main(String[] args) {

        Disciplina d1 = new DisciplinaGraduacao("Programação I", new double[]{6});
        Aluno a1 = new Aluno("Maria", d1);
        a1.resultado();

        
        Disciplina d2 = new DisciplinaEspecializacao("Arquitetura de Software", new char[]{'A'});
        Aluno a2 = new Aluno("João", d2);
        a2.resultado();

        
        Disciplina d3 = new DisciplinaEspecializacao("Segurança da Informação", new char[]{'D'});
        Aluno a3 = new Aluno("Carla", d3);
        a3.resultado();
       
    }
}