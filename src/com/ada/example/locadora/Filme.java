package com.ada.example.locadora;

public class Filme {

    private String nome;
    private String descricao;
    private GeneroFilme generoFilme;
    private String indicacaoClassificativa;

    public Filme(String nome, GeneroFilme genero, Double valorLocacao) {
        this.nome = nome;
        this.generoFilme = genero;
    }

    public Filme(String nome, String descricao, GeneroFilme genero, String indicacaoClassificativa, Double valorLocacao) {
        this.nome = nome;
        this.descricao = descricao;
        this.generoFilme = genero;
        this.indicacaoClassificativa = indicacaoClassificativa;
    }

    public Filme(String nome, Double valorLocacao) {
        this.nome = nome;
    }

    public GeneroFilme getGeneroFilme() {
        return generoFilme;
    }

    public void setGeneroFilme(GeneroFilme generoFilme) {
        this.generoFilme = generoFilme;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getIndicacaoClassificativa() {
        return indicacaoClassificativa;
    }

    public void setIndicacaoClassificativa(String indicacaoClassificativa) {
        this.indicacaoClassificativa = indicacaoClassificativa;
    }


    @Override
    public String toString() {
        return "Filme {" +
                "nome='" + nome + '\'' +
                (descricao != null ? ", descricao='" + descricao + '\'' : "") +
                ", genero='" + generoFilme + '\'' +
                ", indicacaoClassificativa='" + indicacaoClassificativa + '\'' +
                '}';
    }
}
