package dio.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public class ExercicioPropostoList01 {

    public static void main(String[] args) {

        List<Float> temperaturas = new ArrayList<>();
        Random aleatorio = new Random();

        for (int i=0; i < 6; i++) {
            Float temperatura = aleatorio.nextFloat()*40;
            Float tempFinal = (float) (Math.round(temperatura*10.0)/10.0);
            temperaturas.add(tempFinal);
        }

        System.out.println(temperaturas);

        Iterator<Float> iterator = temperaturas.iterator();
        float soma = 0;
        while (iterator.hasNext()) {
            float next = iterator.next();
            soma += next;
        }
        float media = (float) ((Math.round((soma/temperaturas.size())*10.0)/10.0));
        System.out.println("Média das temperaturas: " + media);

        System.out.println("Temperaturas acima da média: ");
        Iterator<Float> iterator1 = temperaturas.iterator();
        while(iterator1.hasNext()) {
            float next = iterator1.next();
            if (next > media) {
                int mes = temperaturas.indexOf(next);
                String mesPorExt = null;
                if (mes == 0) mesPorExt = "Janeiro";
                if (mes == 1) mesPorExt = "Fevereiro";
                if (mes == 2) mesPorExt = "Março";
                if (mes == 3) mesPorExt = "Abril";
                if (mes == 4) mesPorExt = "Maio";
                if (mes == 5) mesPorExt = "Junho";
                System.out.println(next + " " + mesPorExt);
            }
        }


    }

}
