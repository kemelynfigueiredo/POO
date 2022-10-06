package atividade.questao1;

public class Helicoptero {
    private Boolean estaLigado;
    private Integer altitude;
    private Integer capacidade;
    private Integer pessoasPresentes;

    public Helicoptero(Integer capacidade, Integer pessoasPresentes){
        this.estaLigado = false;
        this.altitude = 0;
        this.capacidade = capacidade;
        this.pessoasPresentes = pessoasPresentes;
    }

    public Boolean getEstaLigado(){
        return estaLigado;
    }
    public Integer getAltitude(){
        return altitude;
    }
    public Integer getCapacidade(){
        return capacidade;
    }
    public Integer getPessoasPresentes(){
        return pessoasPresentes;
    }

    public void entra(){
        if (pessoasPresentes < capacidade){
            this.pessoasPresentes += 1;
        }
    }
    public void sai(){
        if (pessoasPresentes != 0){
            this.pessoasPresentes -=1;
        }
    }
    public void ligar(){
        if(estaLigado == false){
            this.estaLigado = true;
        }
    }
    public void decolar(Integer novaAltitude){
        if (altitude == 0 & estaLigado == true){
            this.altitude = novaAltitude;
        }
    }
    public void aterrizar(){
        if(altitude > 0 & estaLigado == true){
            this.altitude = 0;
        }
    }
    public void desligar(){
        if (estaLigado == true){
            this.estaLigado = false;
        }
    }
    public void setCapacidade(Integer capacidade){
        this.capacidade = capacidade;
    }
    public String toString(){
        return "Esta ligado: " + this.estaLigado + " Altitude: " + this.altitude + " Capacidade: " + this.capacidade + " Pessoas Presentes no Helicóptero: " + this.pessoasPresentes;
    }

}
