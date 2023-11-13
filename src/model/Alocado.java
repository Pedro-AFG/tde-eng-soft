package model;

public class Alocado {
    private String codAluno;
    private String codTurma;

    // Construtor
    public Alocado(String codAluno, String codTurma) {
        this.codAluno = codAluno;
        this.codTurma = codTurma;
    }

    // Getters e Setters
    public String getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(String codAluno) {
        this.codAluno = codAluno;
    }

    public String getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(String codTurma) {
        this.codTurma = codTurma;
    }
}
