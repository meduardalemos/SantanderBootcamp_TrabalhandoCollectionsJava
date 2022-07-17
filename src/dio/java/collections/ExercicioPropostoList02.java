package dio.java.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class ExercicioPropostoList02 {
    public static void main(String[] args) {

        List<Integer> respostas = new ArrayList<>();

        Scanner scan = new Scanner(System.in);
        System.out.println("Responda 1 para sim e 0 para não: ");

        System.out.println("Telefonou para a vítima? ");
        int resp1 = scan.nextInt();
        respostas.add(resp1);

        System.out.println("Esteve no local do crime? ");
        int resp2 = scan.nextInt();
        respostas.add(resp2);

        System.out.println("Mora perto da vítima? ");
        int resp3 = scan.nextInt();
        respostas.add(resp3);

        System.out.println("Devia para a vítima? ");
        int resp4 = scan.nextInt();
        respostas.add(resp4);

        System.out.println("Já trabalhou com a vítima? ");
        int resp5 = scan.nextInt();
        respostas.add(resp5);

        Iterator<Integer> iterator = respostas.iterator();
        int positives = 0;
        while (iterator.hasNext()) {
            Integer resp = iterator.next();
            if (resp == 1) positives++;
        }

        if (positives == 0 || positives == 1) System.out.println("Inocente");
        if (positives == 2) System.out.println("Suspeito");
        if (positives == 3 || positives == 4) System.out.println("Cúmplice");
        if (positives == 5) System.out.println("Assassino");

    }
}
