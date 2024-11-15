package com.Function;

import com.implementation.CheckFunctionInterface;

import java.util.List;
import java.util.stream.Collectors;
//Desafio 6 - Verificar se a lista contém algum número maior que 10:
//Utilize a Stream API para verificar se a lista contém algum número maior que 10 e exiba o resultado no console.
public class CheckFunction implements CheckFunctionInterface {
    @Override
    public List<Integer> checkNumerosMaiorQueDez(List<Integer> list){
        return list.stream()
                .filter(number -> number > 10).collect(Collectors.toList());
    }
}
