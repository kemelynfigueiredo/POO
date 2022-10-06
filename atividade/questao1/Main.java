package atividade.questao1;

public class Main {
    public static void main(String[] args){

        Helicoptero Heli1 = new Helicoptero(5, 0);
        Helicoptero Heli2 =  new Helicoptero(4, 0);

        System.out.println(Heli1.toString());
        System.out.println(Heli2.toString());

        Heli1.entra();
        Heli1.entra();

        Heli2.entra();
        Heli2.entra();
        Heli2.entra();

        Heli1.ligar();
        Heli2.ligar();

        Heli1.decolar(75);
        Heli2.decolar(35);

        System.out.println(Heli1.toString());
        System.out.println(Heli2.toString());

        Heli1.aterrizar();
        Heli2.aterrizar();

        Heli1.desligar();
        Heli2.desligar();
        
        Heli1.sai();
        Heli1.sai();

        Heli2.sai();
        Heli2.sai();
        Heli2.sai();

        System.out.println(Heli1.toString());
        System.out.println(Heli2.toString());

    }
}
