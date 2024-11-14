package com.init;

import com.extend.MetadosExtends;

import java.util.List;

public class Main extends MetadosExtends {
    private void desafio1(List<Integer> number) {
        System.out.println("Desafio 1 - Mostre a lista na ordem numérica:");
        number = ordenarListaOrdemCrescente(Variable.numeros);
        number.stream().forEach(System.out::println);
    }

    private void desafio2(List<Integer> number) {
        System.out.println("Desafio 2 - Imprima a soma dos números pares da lista:");
        number = somarListaPares(number);
        number.stream().forEach(System.out::println);
    }

    private void desafio3(List<Integer> number) {
        System.out.println("Desafio 3 - Verifique se todos os números da lista são positivos:");
        number = VerificarValoresPositivos(number);
        number.stream().forEach(System.out::println);
    }

    public static void main(String[] args) {
        Main startChallenge = new Main();
        startChallenge.desafio1(Variable.numeros);
        startChallenge.desafio2(Variable.numeros);
        startChallenge.desafio3(Variable.numeros);
    }
}