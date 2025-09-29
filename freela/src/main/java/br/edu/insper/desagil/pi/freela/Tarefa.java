package br.edu.insper.desagil.pi.freela;

public class Tarefa {
    private int id;
    private String descricao;
    private Data inicio;
    private Data fim;

    public Tarefa(int id) {
        this.id = id;
        this.descricao = "";
        this.inicio = null;
        this.fim = null;
    }

    public int getId() {
        return id;
    }

    public String getDescricao() {
        return descricao;
    }

    public Momento getInicio() {
        return inicio;
    }

    public Momento getFim() {
        return fim;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public void atualiza(Data m1, Data m2) {
        if (m1.minutos() < m2.minutos()) {
            this.inicio = m1;
            this.fim = m2;
        }
        else {
            throw new IllegalArgumentException("Data Impossível!");
        }
    }
}
