public class ConsumidorEstudante {

    public static void main(String[] args) {
        
        //Estudante estudante = estudante.getInstance("Ana", "Matematica", 20);
        estudante aluno = estudante.getInstance("Ana", "Matemática", 20);

        System.out.println(aluno.getNome() + " "
                            + aluno.getDisciplina() + " "
                            + aluno.getNota());
      
        estudante.destruir_estudante();

        estudante aluno2 = estudante.getInstance("João", "Ciências", 8);

        System.out.println(aluno2.getNome() + " "
                            + aluno2.getDisciplina() + " "
                            + aluno2.getNota());
        
    }
    
}
