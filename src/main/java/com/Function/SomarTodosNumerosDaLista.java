package com.Function;

import com.init.Variable;
import com.implementation.SomarTodosNumerosDaListaInterface;
import java.util.List;

public class SomarTodosNumerosDaLista implements SomarTodosNumerosDaListaInterface {
    //Desafio 8 - Somar os dígitos de todos os números da lista:
    //Utilizando a Stream API, realize a soma dos dígitos de todos os números da lista e exiba o resultado no console.
    @Override
    public Integer somarTodossNumeros(List<Integer> number){
       //identity valor inicial da variavel.
        //Acumulador vai receber dois parametros entre as ()
        //Conbiner combinar o resultado parcial.
        //Integer::sum somar tudo
        return number.stream()
                .reduce(0, Integer::sum);
    }

}
