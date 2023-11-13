package model;

public class Aluno {
    private String codAluno;
    private String nome;
    private String dataNasc;
    private String curso;
    private String situacao;
    private String codTurma;

    // Construtor
    public Aluno(String codAluno, String nome, String dataNasc, String curso, String situacao, String codTurma) {
        this.codAluno = codAluno;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.curso = curso;
        this.situacao = situacao;
        this.codTurma = codTurma;
    }

    // Getters e Setters
    public String getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(String codAluno) {
        this.codAluno = codAluno;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(String dataNasc) {
        this.dataNasc = dataNasc;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }

    public String getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(String codTurma) {
        this.codTurma = codTurma;
    }

    // Métodos específicos para Aluno
    public void cadastrarDados() {
        // Implementação
    }

    public void finalizarCadastro() {
        // Implementação
    }

    public void escolherForma() {
        // Implementação
    }

    public void realizarProva() {
        // Implementação
    }

    public void enviarDocumentos() {
        // Implementação
    }

    public void aprovarMatricula() {
        // Implementação
    }

    public void graduarAluno() {
        // Implementação
    }

    public void reprovarMatricula() {
        // Implementação
    }

    public void refazerIngresso() {
        // Implementação
    }

    public void encerrarProcesso() {
        // Implementação
    }
}
