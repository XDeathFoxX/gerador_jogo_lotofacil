package org.gerador;
import java.util.ArrayList;
import java.util.Random;

public class gerador_jogo_lotofacil {
    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        Random random = new Random();


        while (numeros.size() < 15) {
            int num = random.nextInt(1, 26);
            if (numeros.contains(num)) {

            } else {
                numeros.add(num);
            }

            }
            numeros.sort(null);
            System.out.println(numeros);
        }
    }
