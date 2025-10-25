package Unidade_II.Atividade_Padroes_Projetos_Criacionais.BuilderProject;

public class MainBuilder {
    public static void main(String[] args) {
        Burger burger = new Burger.BurgerBuilder()
                            .setCarne("Frango")
                            .setQueijo("Mussarela")
                            .setBacon(true)
                            .setMolho("Barbecue")
                            .build();

        System.out.println(burger);
    }
}