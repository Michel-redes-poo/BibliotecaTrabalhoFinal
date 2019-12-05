
package model;

import java.util.ArrayList;


public class Aluno { 
    
    private String nome;
    private String matricula;
    private String curso;
    private String cpf;
    private String telefone;
    private String nascimento;
    private Livro livro;
    
    
    public Aluno(String nome, String matricula, String curso, String cpf, String telefone, String nascimento) {
        this.nome = nome;
        this.matricula = matricula;
        this.curso = curso;
        this.cpf = cpf;
        this.telefone = telefone;
        this.nascimento = nascimento;
        this.livro = null;
    }
    
    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNascimento() {
        return nascimento;
    }

    public void setNascimento(String nascimento) {
        this.nascimento = nascimento;
    }

    @Override
    public String toString() {
        return "Nome: " + nome + "Matricula: " + matricula;
    }
    
}
