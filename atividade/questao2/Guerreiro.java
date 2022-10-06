import java.util.Random;

public class Guerreiro{
    private Integer codigo;
    private String nome;
    private Integer energia;

    public Guerreiro(Integer codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }
    public Integer getCodigo(){
        return codigo;
    }
    public String getNome(){
        return nome;
    }
    public Integer getEnergia(){
        return energia;
    }

    public void incremento(){
        if (energia < 5){
            energia +=1;
        }
    }
    public void decremento(){
        if (energia > 0){
            energia -= 1;
        }
        if (energia == 0){
            System.out.println("Energia zerada");
        }
    }
    public void alimentar(){
        incremento();
    }
    public int atacar(){

       Random r = new Random();
       int ataque = r.nextInt(2);
        return ataque;
       
    }
    public void lutar(Guerreiro oponente){
        while(oponente.energia != 0 && energia != 0){
            if(atacar() != 0){
                oponente.decremento();
                System.out.println("Ataque realizado com sucesso");
            }
            System.out.println("Ataque falhou");
            if(oponente.atacar() != 0){
                decremento();
                System.out.println("Ataque realizado com sucesso");
            }
            System.out.println("Ataque falhou");
        
        }
        if(energia == 0){
            System.out.println("Guerreiro oponente ganhou!");
        }
        System.out.println("Você ganhou!");
    }
    public String toString(){
        return "Codigo do Guerreiro: "+ getCodigo()+ "Nome do Guerreiro: " + getNome()+ " Energia: " + getEnergia();
    }       
}