package br.edu.insper.desagil.pi.freela;

import java.util.ArrayList;
import java.util.List;

public class Lista {
    private List<Tarefa> tarefas;

    public Lista() {
        this.tarefas = new ArrayList<>();
    }

    public void adiciona(Tarefa tarefa) {
        int diferentes = 0;
        for (Tarefa t : tarefas) {
            if (t.getId() != (tarefa.getId())) {
                diferentes += 1;
            }
        }
        if (tarefas.size() == diferentes) {
            tarefas.add(tarefa);
        }
    }
}
