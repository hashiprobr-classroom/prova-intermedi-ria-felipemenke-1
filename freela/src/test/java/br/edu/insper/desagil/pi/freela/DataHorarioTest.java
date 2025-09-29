package br.edu.insper.desagil.pi.freela;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DataHorarioTest {
    private DataHorario dh;

    @BeforeEach
    public void setUp() {
        dh = new DataHorario(new Data());
    }

    @Test
    public void constroi() {
        assertEquals(0,dh.getHora());
        assertEquals(0,dh.getMinuto());
        assertEquals(0,dh.minutos());
    }

    @Test
    public void horarioBaixo() {
        dh.atualiza(-1,-1);
        assertEquals(0,dh.getHora());
        assertEquals(0,dh.getMinuto());
        assertEquals(0,dh.minutos());
    }

    @Test
    public void horarioAlto() {
        dh.atualiza(24,60);
        assertEquals(23,dh.getHora());
        assertEquals(59,dh.getMinuto());
        assertEquals(1439,dh.minutos());
    }
}
