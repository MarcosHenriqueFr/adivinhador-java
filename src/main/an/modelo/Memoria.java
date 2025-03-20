package main.an.modelo;

public class Memoria {
    private int aleatorio;
    private int chances;

    public Memoria(int dificuldade){
        setAleatorio();
        setChances(dificuldade);
    }

    private void setAleatorio() {
        this.aleatorio = (int) (Math.random() * 100) + 1;
    }

    private void setChances(int dificuldade) {
        switch (dificuldade){
            case 1: this.chances = 10;
                break;
            case 2: this.chances = 5;
                break;
            case 3: this.chances = 3;
                break;
        }
    }

    public void reiniciarJogo(){
        //TODO implementação do reinicio dos atributos
    }

    public String executarTentativa(){
        //TODO retorna ao meu console os valores
        return null;
    }

    public int getAleatorio() {
        return this.aleatorio;
    }

    public int getChances(){
        return this.chances;
    }
}
