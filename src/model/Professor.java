package model;

public class Professor {
    private String codProf;
    private String nome;
    private String dataNasc;
    private String especializacao;
    private String situacao;
    private String codTurma;
    private Turma turma;

    // Construtor
    public Professor(String codProf, String nome, String dataNasc, String especializacao, String situacao, String codTurma) {
        this.codProf = codProf;
        this.nome = nome;
        this.dataNasc = dataNasc;
        this.especializacao = especializacao;
        this.situacao = situacao;
        this.codTurma = codTurma;
    }

    // Getters e Setters
    public String getCodProf() {
        return codProf;
    }

    public void setCodProf(String codProf) {
        this.codProf = codProf;
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

    public String getEspecializacao() {
        return especializacao;
    }

    public void setEspecializacao(String especializacao) {
        this.especializacao = especializacao;
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

    // Métodos específicos para Professor
    public void cadastrarDados() {
        // Implementação
    }

    public void ativarProf() {
        // Implementação
    }

    public void desativarProf() {
        // Implementação
    }

    public void desligarProfessor() {
        // Implementação
    }

    public void criarAgendaHorarios() {
        // Implementação
    }

    public void excluirAgendaHorarios() {
        // Implementação
    }

    public void agendarHoraio() {
        // Implementação
    }

    public void liberarHorario() {
        // Implementação
    }
    public Turma getTurma() {
        return turma;
    }

    public void setTurma(Turma turma) {
        this.turma = turma;
    }
}
