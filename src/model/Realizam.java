package model;

public class Realizam {
    private String codAluno;
    private String codProva;

    // Construtor
    public Realizam(String codAluno, String codProva) {
        this.codAluno = codAluno;
        this.codProva = codProva;
    }

    // Getters e Setters
    public String getCodAluno() {
        return codAluno;
    }

    public void setCodAluno(String codAluno) {
        this.codAluno = codAluno;
    }

    public String getCodProva() {
        return codProva;
    }

    public void setCodProva(String codProva) {
        this.codProva = codProva;
    }
}
