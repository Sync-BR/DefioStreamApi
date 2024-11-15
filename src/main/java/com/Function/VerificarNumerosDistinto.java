package com.Function;
import java.util.List;
import java.util.stream.Collectors;
import com.implementation.VerificarNumerosDistintoInterface;

public class VerificarNumerosDistinto implements VerificarNumerosDistintoInterface {
    public List<Integer> checkList(List<Integer> Number){
        return Number.stream().distinct().collect(Collectors.toList());
    }

}
