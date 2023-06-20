public enum funMes { 
    JANEIRO("Ana", "RH"),
    FEVEREIRO("Rafaela", "RH"),
    MARCO("Fernando", "ADM");   

    private String nome;
    private String departamento;

    private funMes(String nome, String departamento){
        this.nome = nome;
        this.departamento = departamento;
    }

    public String getNome(){
        return nome;
    }

    public String getDepartatamento(){
        return departamento;
    }
    
}
