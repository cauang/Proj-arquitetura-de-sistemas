public class TurmaView {
    public void mostraDados(Turma t){
        System.out.println("Total de alunos: "+t.getTotalAlunos());
        System.out.println("Média da turma: " + t.calcMedia());
    }
    public void imprimeDados(Turma turma) {
        System.out.println("=== Dados da Turma ===");
        for (Aluno aluno : turma.getAlunos()) {
            System.out.println("Nome: " + aluno.getNome());
            System.out.println("Matrícula: " + aluno.getMatricula());
            System.out.println("Nota: " + aluno.getNota());
            System.out.println("----------------------");
        }
    }
}