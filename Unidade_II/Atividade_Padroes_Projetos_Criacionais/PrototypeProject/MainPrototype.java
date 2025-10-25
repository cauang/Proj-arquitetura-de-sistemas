package Unidade_II.Atividade_Padroes_Projetos_Criacionais.PrototypeProject;

public class MainPrototype {
    public static void main(String[] args) {
        Refrigerante original = new Refrigerante("Cola", true, "Grande");

        // Refis = clones
        Refrigerante refil1 = (Refrigerante) original.clone();
        Refrigerante refil2 = (Refrigerante) original.clone();

        System.out.println(original);
        System.out.println(refil1);
        System.out.println(refil2);
    }
}