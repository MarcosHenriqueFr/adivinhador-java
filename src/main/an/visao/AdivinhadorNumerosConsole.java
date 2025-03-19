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
        //A memoria fica aqui

        entrada.close();
    }

    private Memoria selecionarDificuldade(int dif){
        //TODO pega a dificuldade e cria a memoria
        //TODO implementar um metodo que nao permite valores invalidos
        return null;
    }

    private void perguntarContinuar(){
        //TODO ao fim de cada jogo é executado
    }
}
