package com.extend;

import com.Function.CheckFunctionInterface;
import com.implementation.*;

import java.util.Collections;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.Collectors;

public class MetadosExtends implements ListaOrdemNumericaInterface, SomarParesInterface, VerificarNumerosPositivosInterface , RemoverNumerosImparInterface, CheckFunctionInterface {
    @Override
    public List<Integer> ordenarListaOrdemCrescente(List<Integer> listaOrdenada) {
        return listaOrdenada.stream().sorted().collect(Collectors.toList());
    }

    @Override
    public List<Integer> somarListaPares(List<Integer> lista) {
        return Collections.singletonList(lista.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum());
    }

    @Override
    public List<Integer> VerificarValoresPositivos(List<Integer> numeros) {
        return numeros.stream().filter(numero -> numero > 0).collect(Collectors.toList());
    }

    @Override
    public List<Integer> DeletarNumerosImpar(List<Integer> listNumber) {
        return listNumber.stream().filter(numero -> numero % 2 ==0).collect(Collectors.toList());
    }

    @Override
    public List<Integer> DeletarNumerosPar(List<Integer> listNumber) {
        return listNumber.stream().filter(numero -> numero % 2 != 0).collect(Collectors.toList());
    }


    @Override
    public List<Integer> checkNumerosMaiorQueDez(List<Integer> list) {
        return list.stream()
                .filter(number -> number > 10).collect(Collectors.toList());
    }
}
