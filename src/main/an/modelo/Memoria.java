package main.an.modelo;

public class Memoria {
    private int aleatorio;
    private int chances;
    private int tentativas;

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

    public boolean executarTentativa(int chute){
        boolean terminado = true;
        setTentativas();
        if(chute > aleatorio) {
            return !terminado;
        } else if(chute < aleatorio){
            return !terminado;
        } else {
            return terminado;
        }
    }

    private void setTentativas(){
        this.tentativas += 1;
    }

    public int getTentativas(){
        return this.tentativas;
    }

    public int getAleatorio() {
        return this.aleatorio;
    }

    public int getChances(){
        return this.chances;
    }
}