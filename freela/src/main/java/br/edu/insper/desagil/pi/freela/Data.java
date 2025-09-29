package br.edu.insper.desagil.pi.freela;

import java.util.HashMap;
import java.util.Map;

public class Data extends Momento {
    private int ano;
    private int mes;
    private int dia;
    private Map<Integer, Integer> limite;

    public Data() {
        this.ano = 1970;
        this.mes = 1;
        this.dia = 1;
        this.limite = new HashMap<>();
        limite.put(1, 31);
        limite.put(2, 28);
        limite.put(3, 31);
        limite.put(4, 30);
        limite.put(5, 31);
        limite.put(6, 30);
        limite.put(7, 31);
        limite.put(8, 31);
        limite.put(9, 30);
        limite.put(10, 31);
        limite.put(11, 30);
        limite.put(12, 31);
    }

    public int getAno() {
        return ano;
    }

    public int getMes() {
        return mes;
    }

    public int getDia() {
        return dia;
    }

    public void atualiza(int novoAno, int novoMes, int novoDia) {
        if (novoAno >= 1970 && novoAno <= 2070) {
            this.ano = novoAno;
        }
        else if (novoAno < 1970 || novoAno > 2070) {
            this.ano = ajusta(novoAno,1970,2070);
        }

        if (novoMes >= 1 && novoMes <= 12) {
            this.mes = novoMes;
        }
        else if (novoMes < 1 || novoMes > 12) {
            this.mes = ajusta(novoMes,1,12);
        }

        if (novoDia >= 1 && novoDia <= limite.get(mes)) {
            this.dia = novoDia;
        }
        else if (novoDia < 1 || novoDia > limite.get(mes)) {
            this.dia = ajusta(novoDia,1,limite.get(mes));
        }
    }

    @Override
    public int minutos() {
        int diasPassados = 0;
        int soma;
        diasPassados += (ano-1970)*365;

        for (int i = 1; i < mes; i++) {
            diasPassados += limite.get(i);
        }

        diasPassados+= dia-1;

        soma = diasPassados * 24 * 60;

        return  soma;
    }
}
