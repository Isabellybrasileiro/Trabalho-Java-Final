public class FuncionarioADM implements Funcionario {
    private String nome;
    private String setor;
    private int idade;
    private int anoNascimento;
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

   public int getAnoNascimento() {
        return anoNascimento;
    }
    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public int getAnoInicio() {
        return anoInicio;
    }
    public void setAnoInicio(int anoInicio) {
        this.anoInicio = anoInicio;
    }

    public void imprimirDados() {
        System.out.print(nome + ' ' + setor + " " + idade + " " + anoNascimento + " " + anoInicio);
        System.out.println();
    }

    public String getTipo(){
        return"ADM";
    }
    @Override
    public int getCPF() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getCPF'");
    }

}

