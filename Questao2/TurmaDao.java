import java.util.ArrayList;
import java.util.List;

public class TurmaDao {
    List<Aluno> listaDao = new ArrayList<Aluno>();

    public List<Aluno> load(){
        return listaDao;
    }
    public void save(Aluno a){
        listaDao.add(a);
    }
    // devo atualizar um aluno ou a lista inteira?
    public void update(String matricula, Aluno alunoAtualizado){
        for(int i = 0; i<listaDao.size(); i++){
            Aluno aluno = listaDao.get(i);
            if(aluno.getMatricula().equals(matricula)){
                listaDao.set(i, alunoAtualizado);
            }
        }
    }
    // deleto um aluno ou a lista inteira?
    public void delete(Aluno a){
        listaDao.remove(a);
    }
}