package com.implementation;

import java.util.List;
import java.util.stream.Collectors;

//Desafio 4 - Remova todos os valores ímpares:
//Utilize a Stream API para remover os valores ímpares da lista e imprima a lista resultante no console.
public class RemoverNumerosImparEPar implements RemoverNumerosImparInterface {
    @Override
    public List<Integer> DeletarNumerosImpar(List<Integer> listNumber) {
        return listNumber.stream().filter(numero -> numero % 2 == 0).collect(Collectors.toList());
    }

    @Override
    public List<Integer> DeletarNumerosPar(List<Integer> listNumber) {
        return listNumber.stream().filter(numero -> numero % 2 != 0).collect(Collectors.toList());
    }

}
