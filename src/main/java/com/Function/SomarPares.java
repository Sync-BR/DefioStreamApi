package com.Function;

import com.implementation.SomarParesInterface;

import java.util.List;
import java.util.stream.Collectors;

public class SomarPares implements SomarParesInterface {
    @Override
    public List<Integer> somarListaPares(List<Integer> lista){
        return lista.stream()
                .filter(numero -> numero % 2 == 0).collect(Collectors.toList()); // Coleta os números pares em uma nova lista
    }
}
