package main.an.visao;

import java.util.Scanner;
import main.an.modelo.Memoria;

public class AdivinhadorNumerosConsole {
    Scanner entrada = new Scanner(System.in);

    public AdivinhadorNumerosConsole(){
        menu();
    }

    public void menu(){
        System.out.println("Bem vindo ao jogo de Adivinhação!");
        System.out.println("O intervalo do número inteiro é entre 1 e 100!");
        System.out.println("Escolha uma dificuldade: ");

        Memoria memoria = selecionarDificuldade();

        executarJogo(memoria);
        System.out.println("Fim de Jogo");

        entrada.close();
    }

    private void executarJogo(Memoria memoria) {
        boolean res = true;
        System.out.println("Você possui " + memoria.getChances() + " chances para ganhar!");

        for(int c = 0; c < memoria.getChances(); c++){
            System.out.println("Insira um número: ");
            validarNumero();

            int chute = entrada.nextInt();
            entrada.nextLine();

            res = memoria.executarTentativa(chute);

            if(res){
                break;
            } else {
                if(chute > memoria.getAleatorio()){
                    System.out.println("O valor é menor que " + chute);
                } else {
                    System.out.println("O valor é maior que " + chute);
                }
            }
        }

        if(res){
            System.out.println("Você ganhou em " + memoria.getTentativas() + " tentativas! :)");
        } else {
            System.out.println("Você perdeu o jogo. :(");
        }

        perguntarContinuar();
    }

    private Memoria selecionarDificuldade(){
        int dificuldade;
        System.out.println("O padrão é a dificuldade média!");
        System.out.println("1. Fácil - 10 CHANCES");
        System.out.println("2. Média - 5 CHANCES");
        System.out.println("3. Difícil - 3 CHANCES");

        validarNumero();

        int vBuffer = entrada.nextInt();
        entrada.nextLine();
        dificuldade = vBuffer > 3 || vBuffer < 1 ? 2 : vBuffer;

        //Crio sem erros o meu obj memoria
        return new Memoria(dificuldade);
    }

    private void validarNumero(){
        while(!entrada.hasNextInt()){
            System.out.println("Valor invalido");
            entrada.nextLine();
        }
    }

    private void perguntarContinuar(){
        String opContinuar;
        System.out.println("Você quer continuar o jogo? (s/n)");
        opContinuar = entrada.nextLine().toLowerCase();

        if(opContinuar.equals("s")){
            executarJogo(selecionarDificuldade());
        } else if(opContinuar.equals("n")) {
            return;
        } else {
            System.out.println("Valor de seleção inválido");
            perguntarContinuar();
        }
    }
}
