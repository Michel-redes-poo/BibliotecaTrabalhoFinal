
package dao;

import java.util.ArrayList;
import model.Livro;

public class LivrosDAO {
    static ArrayList<Livro> livros = new ArrayList<Livro>();
   
    
    public static Livro getLivros(int indice) {
        return livros.get(indice);
    }
    
    public static void cadastrarLivro(Livro livro){
        livros.add(livro);
    }
    
    public static int retornarTamanhoDaLista(){
        return livros.size();
    }
    
    public static void excluirLivro(int k){
        livros.remove(k);
    }
    public static void emprestimo(int indice){
        livros.get(indice).setEmprestado(true);
        livros.get(indice).setDiasEmprestimo(15);
        
    }
    public static void renovarEmprestimo(int indice){
        livros.get(indice).setEmprestado(true);
        livros.get(indice).setDiasEmprestimo(+7); 
    }
    public static void devolver(int indice){
        livros.get(indice).setEmprestado(false);
        livros.get(indice).setDiasEmprestimo(0);
    }
    
}
