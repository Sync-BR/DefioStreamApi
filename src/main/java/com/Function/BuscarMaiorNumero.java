package com.Function;

import com.implementation.BuscarMaiorNumeroInterface;

import java.util.List;

public class BuscarMaiorNumero implements BuscarMaiorNumeroInterface {

    @Override
    public Integer  encotrarSegundoMaiorNumero(List<Integer> number){
      return number.stream().max(Integer::compareTo).get();
    }

}
