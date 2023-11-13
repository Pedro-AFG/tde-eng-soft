package model;

public class Questao {
    private String codQuestao;
    private String enunciado;
    private int pontuacao;
    private String alternativa;

    // Construtor
    public Questao(String codQuestao, String enunciado, int pontuacao, String alternativa) {
        this.codQuestao = codQuestao;
        this.enunciado = enunciado;
        this.pontuacao = pontuacao;
        this.alternativa = alternativa;
    }

    // Getters e Setters
    public String getCodQuestao() {
        return codQuestao;
    }

    public void setCodQuestao(String codQuestao) {
        this.codQuestao = codQuestao;
    }

    public String getEnunciado() {
        return enunciado;
    }

    public void setEnunciado(String enunciado) {
        this.enunciado = enunciado;
    }

    public int getPontuacao() {
        return pontuacao;
    }

    public void setPontuacao(int pontuacao) {
        this.pontuacao = pontuacao;
    }

    public String getAlternativa() {
        return alternativa;
    }

    public void setAlternativa(String alternativa) {
        this.alternativa = alternativa;
    }
}
