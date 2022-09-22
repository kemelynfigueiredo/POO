public class Filme {
    private String titulo;
    private Integer duracaoEmMinutos;

    public Filme(String titulo, Integer duracaoEmMinutos){
        this.titulo = titulo;
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getTitulo(){
        return titulo;
    }

    public Integer getduracaoEmMinutos(){
        return duracaoEmMinutos;
    }
    public void setTitulo(String titulo){
        this.titulo = titulo;
    }
    public void setDuracaoEmMinutos(Integer duracaoEmMinutos){
        this.duracaoEmMinutos = duracaoEmMinutos;
    }
    public void exibirDuracaoEmHoras(){
        int horas = duracaoEmMinutos/60;
        int minutos = duracaoEmMinutos%60;
        System.out.println("O filme "+ getTitulo() +" possui "+ horas+" horas e "+ minutos+ " minutos de duração.");
    }
}
