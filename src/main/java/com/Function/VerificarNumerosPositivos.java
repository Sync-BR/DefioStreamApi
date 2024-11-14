package com.Function;

import com.implementation.VerificarNumerosPositivosInterface;

import java.util.List;
import java.util.stream.Collectors;

//Desafio 3 - Verifique se todos os números da lista são positivos:
//Com a ajuda da Stream API, verifique se todos os números da lista são positivos e exiba o resultado no console.
public class VerificarNumerosPositivos implements VerificarNumerosPositivosInterface {
    @Override
    public List<Integer> VerificarValoresPositivos(List<Integer> numeros){
       return numeros.stream().filter(numero -> numero > 0).collect(Collectors.toList());
    }
}
