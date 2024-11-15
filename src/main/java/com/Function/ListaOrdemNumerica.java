package com.Function;

import com.init.Variable;
import com.implementation.ListaOrdemNumericaInterface;

import java.util.List;
import java.util.stream.Collectors;

//Desafio 1 - Mostre a lista na ordem numérica:
//Crie um programa que utilize a Stream API para ordenar a lista de números em ordem crescente e a exiba no console.
public class ListaOrdemNumerica implements ListaOrdemNumericaInterface {
    @Override
    public List<Integer> ordenarListaOrdemCrescente(List<Integer> listaOrdenada) {
        return listaOrdenada.stream().sorted().collect(Collectors.toList());
    }
}
