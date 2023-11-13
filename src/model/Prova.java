package model;

public class Prova {
    private String codProva;
    private String dataProva;
    private String codTurma;
    private int codQuestao;

    // Construtor
    public Prova(String codProva, String dataProva, String codTurma, int codQuestao) {
        this.codProva = codProva;
        this.dataProva = dataProva;
        this.codTurma = codTurma;
        this.codQuestao = codQuestao;
    }

    // Getters e Setters
    public String getCodProva() {
        return codProva;
    }

    public void setCodProva(String codProva) {
        this.codProva = codProva;
    }

    public String getDataProva() {
        return dataProva;
    }

    public void setDataProva(String dataProva) {
        this.dataProva = dataProva;
    }

    public String getCodTurma() {
        return codTurma;
    }

    public void setCodTurma(String codTurma) {
        this.codTurma = codTurma;
    }

    public int getCodQuestao() {
        return codQuestao;
    }

    public void setCodQuestao(int codQuestao) {
        this.codQuestao = codQuestao;
    }
}
