public class FuncionarioRH implements Funcionario {

    private String nome;
    private String setor;
    private int idade;
    private int CPF;
    private int anoInicio;
 
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }
    public void setSetor(String string) {
        this.setor = string;
    }

    public int getIdade() {
        return idade;
    }
    public void setIdade(int idade) {
        this.idade = idade;
    }

    public int getCPF() {
        return CPF;
    }
    public void setCPF(int CPF) {
        this.CPF = CPF;
    }

    public int getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public String getTipo(){
        return"RH";
    }

    public void imprimirDados() {
        System.out.print(nome + ' ' + setor + " " + idade + " " + CPF + " " + anoInicio);
        System.out.println();
    }
}
    
