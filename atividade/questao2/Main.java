public class Main {
    public static void main(String[] args){
        Guerreiro l = new Guerreiro(1, "Lucas");
        Guerreiro b = new Guerreiro(1, "Bossonara");

        l.lutar(b);
        System.out.println(l.toString());
        }

}
