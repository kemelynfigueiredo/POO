public class Funcionario {
    private String nome;
    private String sobrenome;
    protected Integer horasTrabalhadas;
    protected double valorPorHora;

    public Funcionario(String nome, String sobrenome, Integer horasTrabalhadas, double valorPorHora){
        this.nome = nome;
        this.sobrenome = sobrenome;
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorPorHora = valorPorHora;
    }
    public String getNome(){
        return nome;
    }
    public String getSobrenome(){
        return sobrenome;
    }
    public Integer getHorasTrabalhadas(){
        return horasTrabalhadas;
    }
    public double getValorPorHora(){
        return valorPorHora;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setsobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }
    public void setHorasTrabalhadas(Integer horasTrabalhadas){
        this.horasTrabalhadas = horasTrabalhadas;
    }
    public void setValorPorHora(double valorPorHora){
        this.valorPorHora = valorPorHora;
    }

    public void nomeCompleto(){
        System.out.println( getNome() + getSobrenome());
    }
    public void calcularSalario(){
        double salario = getHorasTrabalhadas() * getValorPorHora();
        System.out.println("O salario final do funcionário é: " + salario);
    }
    public void incrementarHora(Integer valor){
        this.horasTrabalhadas = this.horasTrabalhadas + valor;
    }
}
