public class testeHeranca {
    public static void main(String[] args) {

        professor prof = new professor();

        //professor profa = new professor(null, null, null, null); //metodo com sobrecarga

        estudante e1 = new estudante();

        universidade up = new universidade();

        prof.cpf="888";
        System.out.println(prof.Salvar());

        //prof.Salvar("111", "222", "333", "444"); //metodo com sobrecarga

        e1.cpf="888";
        System.out.println(e1.Salvar());

        up.processar(e1);
    }
}
