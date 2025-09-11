//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Turma t = new Turma();
        Aluno leo =  new Aluno("leonardo", "121221", 10.0);
        Aluno and =  new Aluno("anderson", "131231", 8.5);
        TurmaView view =  new TurmaView();
        t.add(leo);
        t.add(and);
        view.imprimeDados(t);
        view.mostraDados(t);
    }
}