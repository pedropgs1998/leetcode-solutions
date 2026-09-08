package com.pedrosilva.leetcode;

import java.util.HashMap;
import java.util.Map;

    public class TwoSum {

        public int[] twoSum(int[] lista, int numeroAlvo) {
            Map<Integer, Integer> numerosVerificados = new HashMap<>();

            for (int i = 0; i < lista.length; i++) {
                int complementoDesejado = numeroAlvo - lista[i];

                if (numerosVerificados.containsKey(complementoDesejado)) {
                    return new int[]{numerosVerificados.get(complementoDesejado), i};
                }

                numerosVerificados.put(lista[i], i);
            }

            throw new IllegalArgumentException("Nenhuma solução encontrada");
        }
    }