package com.init;

import com.extend.FunctionExtends;
import com.extend.MetadosExtends;

import java.util.List;

public class Main extends FunctionExtends {
    private void desafio1(List<Integer> number) {
        System.out.println("Desafio 1 - Mostre a lista na ordem numérica");
        number = ordenarListaOrdemCrescente(Variable.numeros);
        number.stream().forEach(System.out::println);
    }

    private void desafio2(List<Integer> number) {
        System.out.println("Desafio 2 - Imprima a soma dos números pares da lista");
        number = somarListaPares(number);
        number.stream().forEach(System.out::println);
    }

    private void desafio3(List<Integer> number) {
        System.out.println("Desafio 3 - Imprimir números  positivos");
        number = VerificarValoresPositivos(number);
        number.stream().forEach(System.out::println);
    }

    private void desafio4(List<Integer> number) {
        System.out.println("Desafio 4 Remova todos os valores ímpares");
        number = DeletarNumerosImpar(number);
        number.stream().forEach(System.out::println);
    }

    private void desafio5(List<Integer> number) {
        System.out.println("Desafio 5 Remova todos os valores par");
        number = DeletarNumerosPar(number);
        number.stream().forEach(System.out::println);
    }

    private void desafio6(List<Integer> number) {
        System.out.println("Verificar se a lista contém algum número maior que 10");
        number = checkNumerosMaiorQueDez(number);
        if (number.size() != 0) {
            number.stream().forEach(System.out::println);
        } else {
            System.out.println("Não possuir valores maior que 10");
        }
    }


    public static void main(String[] args) {
        Main startChallenge = new Main();
        startChallenge.desafio1(Variable.numeros);
        startChallenge.desafio2(Variable.numeros);
        startChallenge.desafio3(Variable.numeros);
        startChallenge.desafio4(Variable.numeros);
        startChallenge.desafio5(Variable.numeros);
        startChallenge.desafio6(Variable.numeros);
    }
}