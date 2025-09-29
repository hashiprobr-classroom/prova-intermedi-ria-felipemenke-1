package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListaTest {
    private Lista l;

    @BeforeEach
    public void setUp() {
        l = new Lista();
    }

    @Test
    public void constroi() {
        assertEquals(0,l.getTarefas().size());
    }

    @Test
    public void adicionaIguais() {
        l.adiciona(new Tarefa(1));
        l.adiciona(new Tarefa(1));
        assertEquals(1,l.getTarefas().size());
    }

    @Test
    public void adicionaDiferentes() {
        l.adiciona(new Tarefa(1));
        l.adiciona(new Tarefa(2));
        assertEquals(2,l.getTarefas().size());
    }
}
