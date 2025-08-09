public class testeHeranca {
    public static void main(String[] args) {
        professor prof = new professor();
        estudante e1 = new estudante();
        prof.cpf="888";
        System.out.println(prof.Salvar());

        e1.cpf="000";
        System.out.println(e1.Salvar());
    }
}
