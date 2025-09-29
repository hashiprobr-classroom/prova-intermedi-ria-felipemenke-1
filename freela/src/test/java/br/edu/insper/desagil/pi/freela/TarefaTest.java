package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TarefaTest {
    private Tarefa t;

    @BeforeEach
    public void setUp() {
        t = new Tarefa(1);
    }

    @Test
    public void constroi() {
        assertEquals(1,t.getId());
        assertEquals("",t.getDescricao());
        assertEquals(null,t.getInicio());
        assertEquals(null,t.getFim());
    }

    @Test
    public void mudaDescricao() {
        t.setDescricao("Estudar");
        assertEquals("Estudar", t.getDescricao());
    }

    @Test
    public void momentosValidos() {
        Data m1 = new Data();
        m1.atualiza(1970,1,1);

        Data m2 = new Data();
        m2.atualiza(1971,1,1);
        t.atualiza(m1,m2);

        assertEquals(1970,m1.getAno());
        assertEquals(1,m1.getMes());
        assertEquals(1,m1.getDia());

        assertEquals(1971,m2.getAno());
        assertEquals(1,m2.getMes());
        assertEquals(1,m2.getDia());
    }


    @Test
    public void momentosInvalidos() {
        Data m1 = new Data();
        m1.atualiza(1970,1,1);

        Data m2 = new Data();
        m2.atualiza(1971,1,1);
        t.atualiza(m2,m1);

        assertEquals(1970,m1.getAno());
        assertEquals(1,m1.getMes());
        assertEquals(1,m1.getDia());

        assertEquals(1971,m2.getAno());
        assertEquals(1,m2.getMes());
        assertEquals(1,m2.getDia());
    }
}
