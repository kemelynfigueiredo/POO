public class Main{
    public static void main(String[] args){
        Filme f = new Filme("Titanic", 194);
        f.exibirDuracaoEmHoras();

        Filme f1 = new Filme("Vingadores", 142);
        f1.exibirDuracaoEmHoras();

        System.out.println("Os filmes em cartaz são " + f.getTitulo()+ " e " + f1.getTitulo()+".");


        Funcionario func = new Funcionario("Jose", "Barros", 70, 30.0);
        func.calcularSalario();
        System.out.println(func.getHorasTrabalhadas());
        func.incrementarHora(10);
        System.out.println(func.getHorasTrabalhadas());

    }
}
