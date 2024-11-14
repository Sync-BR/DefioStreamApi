package com.extend;

import com.implementation.ListaOrdemNumericaInterface;
import com.implementation.SomarParesInterface;
import com.implementation.VerificarNumerosPositivosInterface;

import java.util.List;
import java.util.stream.Collectors;
//Desafio 2 - Imprima a soma dos números pares da lista:
//Utilizando a Stream API, realize a soma dos números pares da lista e exiba o resultado no console.
public class MetadosExtends implements ListaOrdemNumericaInterface, SomarParesInterface, VerificarNumerosPositivosInterface {
    @Override
    public List<Integer> ordenarListaOrdemCrescente(List<Integer> listaOrdenada) {
        return listaOrdenada.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public List<Integer> somarListaPares(List<Integer> lista) {
        return lista.stream()
                .filter(numero -> numero % 2 == 0).collect(Collectors.toList());
    }

    @Override
    public List<Integer> VerificarValoresPositivos(List<Integer> numeros) {
        return numeros.stream().filter(numero -> numero > 0).collect(Collectors.toList());
    }
}
