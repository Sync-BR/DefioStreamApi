package com.Function;

import com.implementation.SomarParesInterface;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SomarPares implements SomarParesInterface {
    @Override
    public List<Integer> somarListaPares(List<Integer> lista){
        return Collections.singletonList(lista.stream()
                .filter(numero -> numero % 2 == 0)
                .mapToInt(Integer::intValue)
                .sum());
    }

}
