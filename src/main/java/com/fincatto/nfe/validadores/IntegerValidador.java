package com.fincatto.nfe.validadores;

import java.text.MessageFormat;

public class IntegerValidador {

    public static void tamanho4(final Integer valor) {
        IntegerValidador.limite(valor, 9999);
    }

    public static void tamanho7(final Integer valor) {
        IntegerValidador.limite(valor, 9999999);
    }

    public static void exatamente7(final Integer valor) {
        IntegerValidador.intervalo(valor, 1000000, 9999999);
    }

    public static void tamanho3e4(final Integer valor) {
        IntegerValidador.intervalo(valor, 100, 9999);
    }

    public static void exatamente4(final int valor) {
        IntegerValidador.intervalo(valor, 1000, 9999);
    }

    public static void tamanho3(final int valor) {
        IntegerValidador.intervalo(valor, 1, 999);
    }

    public static void tamanho3maximo990(final int valor) {
        IntegerValidador.intervalo(valor, 1, 990);
    }

    public static void exatamente6(final Integer valor) {
        IntegerValidador.intervalo(valor, 100000, 999999);
    }

    public static void tamanho2ou3(final Integer valor) {
        IntegerValidador.intervalo(valor, 10, 999);
    }

    public static void tamanho2a4(final Integer valor) {
        IntegerValidador.intervalo(valor, 10, 9999);
    }

    private static void limite(final Integer valor, final int maximo) {
        if (valor > maximo) {
            throw new IllegalStateException("Valor extrapolou o tamanho do campo");
        }
    }

    private static void intervalo(final Integer valor, final int minimo, final int maximo) {
        if (valor < minimo || valor > maximo) {
            throw new IllegalStateException(MessageFormat.format("Valor tem tamanho fora do intervalo de [{0}-{1}]", minimo, maximo));
        }
    }
}