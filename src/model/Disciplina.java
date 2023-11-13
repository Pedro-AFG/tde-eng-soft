package model;

public class Disciplina {
    private String codDisciplina;
    private String nome;
    private int credito;
    private String codTurma;

    // Construtor
    public Disciplina(String codDisciplina, String nome, int credito, String codTurma) {
        this.codDisciplina = codDisciplina;
        this.nome = nome;
        this.credito = credito;
        this.codTurma = codTurma;
    }

    // Getters e Setters
    public String getCodDisciplina() {
        return codDisciplina;
    }

    public void setCodDisciplina(String codDisciplina) {
        this.codDisciplina = codDisciplina;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCredito() {
        return credito;
    }

    public void setCredito(int credito) {
        this.credito = credito;
    }

    public String getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(String codTurma) {
        this.codTurma = codTurma;
    }
}
