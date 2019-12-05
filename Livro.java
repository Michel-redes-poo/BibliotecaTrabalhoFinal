
package model;

public class Livro {
    private String titulo;
    private String autor;
    private String isbn;
    private String descricao;
    private boolean emprestado;
    private Aluno aluno;
    private int diasEmprestimo;


    public Livro(String titulo, String autor, String isbn, String descricao) {
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.descricao = descricao;
        this.aluno = null;
        this.emprestado = false;   
        this.diasEmprestimo = 0;
    }    

    public int getDiasEmprestimo() {
        return diasEmprestimo;
    }

    public void setDiasEmprestimo(int diasEmprestimo) {
        this.diasEmprestimo = diasEmprestimo;
    }
    

    public Aluno getAluno() {
        return aluno;
    }

    public void setAluno(Aluno aluno) {
        this.aluno = aluno;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void setEmprestado(boolean emprestado) {
        this.emprestado = emprestado;
    }
    
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    
    @Override
    public String toString() {
        return "Título: " + titulo + ", Descrição: " + descricao 
                + ", Tempo restante de empréstimo: " + diasEmprestimo;
    }
    
    
    
}
