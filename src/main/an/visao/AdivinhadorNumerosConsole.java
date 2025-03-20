package main.an.visao;

import java.util.Scanner;
import main.an.modelo.Memoria;

public class AdivinhadorNumerosConsole {
    Scanner entrada = new Scanner(System.in);

    public AdivinhadorNumerosConsole(){
        menu();
    }

    public void menu(){
        //TODO interface do Adivinhador
        System.out.println("Bem vindo ao jogo de Adivinhação!");
        System.out.println("O intervalo de número é entre 1 e 100!");
        System.out.println("Escolha uma dificuldade: ");

        Memoria memoria = selecionarDificuldade();

        System.out.println("Você tem " + memoria.getChances() + " chances");

        //TODO fazer a implementação do metodo de tentativa

        entrada.close();
    }

    private Memoria selecionarDificuldade(){
        int dificuldade;
        System.out.println("O padrão é a dificuldade média!");
        System.out.println("1. Fácil - 10 CHANCES");
        System.out.println("2. Média - 5 CHANCES");
        System.out.println("3. Difícil - 3 CHANCES");

        while(!entrada.hasNextInt()){
            System.out.println("Valor invalido");
            entrada.nextLine();
        }

        int vBuffer = entrada.nextInt();
        dificuldade = vBuffer > 3 || vBuffer < 1 ? 2 : vBuffer;

        //Crio sem erros o meu obj memoria
        return new Memoria(dificuldade);
    }

    private void perguntarContinuar(){
        //TODO ao fim de cada jogo é executado
    }
}
