package pessoas;

public class addPessoas {
    public static void main(String[] args) {

        pessoa Biagi = new pessoa();
        Biagi.nome = "Rafael";
        Biagi.sexo = "Masculino";
        Biagi.idade = 18;
        Biagi.telefone = 934532344;
        Biagi.endereco = "Rua uau";
        System.out.println("                                  ");

        System.out.println(Biagi.nome);
        System.out.println(Biagi.sexo);
        System.out.println(Biagi.idade);
        System.out.println(Biagi.telefone);
        System.out.println(Biagi.endereço);
        System.out.println("                                  ");

        pessoa Ruberia = new pessoa();
        Ruberia.nome = "Rubéria";
        Ruberia.sexo = "Feminino";
        Ruberia.idade = 46;
        Ruberia.telefone = 943324345;
        Ruberia.endereco = "Ondi ah inveja naum aucançah B)";

        System.out.println(Ruberia.nome);
        System.out.println(Ruberia.sexo);
        System.out.println(Ruberia.idade);
        System.out.println(Ruberia.telefone);
        System.out.println(Ruberia.endereco);
        System.out.println("                                  ");



        pessoa inflavio = new pessoa();
        inflavio.nome = "Flávio";
        inflavio.sexo = "Masculino";
        inflavio.idade = 48;
        inflavio.telefone = 944436721;
        inflavio.endereco = "Rua dezessete";

        System.out.println(inflavio.nome);
        System.out.println(inflavio.sexo);
        System.out.println(inflavio.idade);
        System.out.println(inflavio.telefone);
        System.out.println(inflavio.endereco);

    }
}
