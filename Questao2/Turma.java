import java.util.ArrayList;
import java.util.List;

public class Turma {
    private List <Aluno> alunos = new ArrayList<>();

    public Turma() {

    }

    public double calcMedia(){
        double soma = 0;
        for(Aluno aluno : alunos){
            soma+=aluno.getNota();
        }
        return soma/alunos.size();
    }

    public List<Aluno> getAlunos(){
        return alunos;
    }

    public int getTotalAlunos(){
        int tamanho = alunos.size();
        return tamanho;
    }

    public Aluno add(Aluno a){
        alunos.add(a);
        return a;
    }
    public void delete(Aluno a){
        alunos.remove(a);
    }

}
