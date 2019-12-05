
package dao;

import java.util.ArrayList;
import model.Aluno;

public class AlunoDAO {
    
    static ArrayList<Aluno> alunos = new ArrayList<Aluno>();
    
    
    public static Aluno getAlunos(int indice) {
        return alunos.get(indice);
    }
    
    public static void cadastrarAluno(Aluno aluno){
        alunos.add(aluno);
    }
    
    public static int tamanhoDaLista(){
        return alunos.size();
    }
    public static void excluirAluno(int k){
        alunos.remove(k);
    }
}
