import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

public class Zoologico{

    ArrayList<Funcionario> funcionarios;
    Scanner sc;
    String dados;

    public void salvarNoArquivo(String dados){
        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter("func.txt", true));
            writer.write(dados);
            writer.newLine();
            writer.close();

        }catch(Exception erro){
            erro.printStackTrace();

        }

    }

    public void salvarTodos(){

        //deleta o arquivo antes de salvar
        File arquivo = new File("func.txt");
        boolean resultado = arquivo.delete();

        if(resultado){
            System.out.println("Apagado");
        }else{
            System.out.println("Falha ao apagar");
        }

        // salva cada posição do arryList 
        for(int i = 0; i<funcionarios.size(); i++){
            if(funcionarios.get(i).getTipo().equals("RH")){
                FuncionarioRH funRH = (FuncionarioRH) funcionarios.get(i);
                dados = funRH.getNome() + "," + funRH.getSetor() + "," + funRH.getIdade() + "," + funRH.getCPF() + "," + funRH.getAnoInicio();
            salvarNoArquivo(dados);
            }else{
                FuncionarioADM funADM = (FuncionarioADM) funcionarios.get(i);
                dados = funADM.getNome() + "," + funADM.getSetor() + "," + funADM.getIdade() + "," + funADM.getAnoNascimento() + "," + funADM.getAnoInicio();
            salvarNoArquivo(dados);
            }
            
        }
    }

    public void cadastrarFuncionarioRH() {
        System.out.println("Digite os dados funcionário:");

        FuncionarioRH novoFuncionarioRH = new FuncionarioRH();

    System.out.print("Nome: ");
    String nome = sc.nextLine();

    System.out.print("Setor: ");
    String setor = sc.nextLine();

    System.out.print("Idade: ");
    int idade = sc.nextInt();

    System.out.print("CPF: ");
    int cpf = sc.nextInt();

    System.out.print("Ano de início: ");
    int anoInicio = sc.nextInt();
        
        novoFuncionarioRH.setNome(nome);
        novoFuncionarioRH.setSetor(setor); 
        novoFuncionarioRH.setIdade(idade); 
        novoFuncionarioRH.setCPF(cpf);
        novoFuncionarioRH.setAnoInicio(anoInicio); 

        funcionarios.add(novoFuncionarioRH); 

    }

    public void cadastrarFuncionarioADM() {
        System.out.println("Digite os dados funcionário:");

        FuncionarioADM novoFuncionarioADM = new FuncionarioADM();

    System.out.print("Nome: ");
    String nome = sc.nextLine();

    System.out.print("Setor: ");
    String setor = sc.nextLine();

    System.out.print("Idade: ");
    int idade = sc.nextInt();

    System.out.print("Ano de Nascimento: ");
    int anoNascimento = sc.nextInt();

    System.out.print("Ano de início: ");
    int anoInicio = sc.nextInt();
        
        novoFuncionarioADM.setNome(nome);
        novoFuncionarioADM.setSetor(setor); 
        novoFuncionarioADM.setIdade(idade); 
        novoFuncionarioADM.setAnoNascimento(anoNascimento);
        novoFuncionarioADM.setAnoInicio(anoInicio); 

        funcionarios.add(novoFuncionarioADM); 
    }

    public void listarFuncionarios() {

        try{
        BufferedReader r = new BufferedReader(new FileReader("func.txt"));
        String lerArquivo;

        while ((lerArquivo= r.readLine()) != null){
            System.out.println(lerArquivo);
        }
    
        r.close();
    }catch (Exception e){
        e.printStackTrace();

    }
}

    public void alterarNome(String velhoNome, String novoNome) {
        Funcionario nomeFun = null;

        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getNome().equals(velhoNome)) {
                nomeFun = funcionario;
                break;
            }
        }

        if (nomeFun != null) {
            nomeFun.setNome(novoNome);
            System.out.println("Nome Alterado");
        } else {
            System.out.println("Não encontrado");
        }
    }


public void listarA(){
  for (int i=0; i < funcionarios.size(); ++i) {
              System.out.print("" + i + ": ");
              funcionarios.get(i).imprimirDados();
        }
    }

    public void removerFuncionario(String nomeFun) {
             
             boolean funcionarioRemovido = false;
         
             // Procura o funcionario no ArrayList e remove
             for (Funcionario funcionario : funcionarios) {
                 if (funcionario.getNome().equals(nomeFun)) {
                     funcionarios.remove(funcionario); // Remove o funcionario do ArrayList
                     funcionarioRemovido = true;
                     break; 
                 }
             }
         
             // Verifica se o funcionario foi removido do ArrayList
             if (funcionarioRemovido) {
                 System.out.println("Funcionario removido ");
             } else {
                 System.out.println("Erro");
             }

            }

    public void listarFuncionariosRH() {
    System.out.println("Funcionários do RH:");

    //o instanceof é usado para verificar se o objeto funcionario é uma instância da classe FuncionarioRH
    for (Funcionario funcionario : funcionarios) {
        if (funcionario instanceof FuncionarioRH) {
            funcionario.imprimirDados();
        }
    }
}

public void listarFuncionariosADM(){
    System.out.println("Funcionários ADM:");
    for(Funcionario funcionario : funcionarios){
        if(funcionario instanceof FuncionarioADM){
            funcionario.imprimirDados();
        }
    }
}


public void mostrarEnun(){
        for(funMes funMes : funMes.values()){
            System.out.println("Mês: " + funMes.name());
            System.out.println("Nome: " + funMes.getNome());
            System.out.println("Departamento: " + funMes.getDepartatamento());
        }

    }

    public void criarFuncionarios(int quantidade) {
    for (int i = 0; i < quantidade; i++) {
        FuncionarioRH novoFuncionarioRH = new FuncionarioRH(); 

        System.out.println("Funcionário RH" + (i + 1));

        String nome = "Isa";
        String setor = "RH";
        int idade = 22;
        int cpf = 45612300;
        int anoInicio = 2023;

        novoFuncionarioRH.setNome(nome);
        novoFuncionarioRH.setSetor(setor); 
        novoFuncionarioRH.setIdade(idade); 
        novoFuncionarioRH.setCPF(cpf);
        novoFuncionarioRH.setAnoInicio(anoInicio); 

        funcionarios.add(novoFuncionarioRH);
    }
}

    public void apagarFuncionarios(int quant){
        for(int i = 0; i < quant; i++){
            funcionarios.remove(funcionarios.size() - quant);
        }
        System.out.println("Funcionários removidos");
    }


    public void menu() {
        while (true) {
            System.out.println("1 - Cadastrar funcionario RH;\n 2- Cadastrar funcionario ADM; \n 3 - Listar Arquivo;\n 4 - Alterar;\n 5 - Remover;\n 6 - Funcionário do mês; \n 7 - Listar ArrayList; \n 8 - Salvar; \n 9 - Listar Funcionarios RH; \n 10 - Listar Funcionarios ADM; \n 11 - Sair; \n 12 - Modo desenvolvedor;");
            int opcao = sc.nextInt();
            sc.nextLine(); // Limpa o \n da entrada

            switch(opcao) {
                case 1:
                    this.cadastrarFuncionarioRH();
                    break;
                case 2:
                    this.cadastrarFuncionarioADM();
                    break;    
                case 3:
                    this.listarFuncionarios();
                    break;
                case 4:
                System.out.println("Digite o nome antigo:");
                    String velhoNome = sc.nextLine();
                    System.out.println("Digite o novo nome:");
                    String novoNome = sc.nextLine();
                    this.alterarNome(velhoNome, novoNome);
                break;
                case 5:
                System.out.println("Digite o nome do funcionario a ser removido");
                String nomeFun = sc.nextLine();
                    this.removerFuncionario(nomeFun);
                    break;
                case 6:
                    this.mostrarEnun();
                    break;
                case 7:
                    this.listarA();
                    break;
                case 8: 
                    this.salvarTodos();
                    break;
                case 9:
                    this.listarFuncionariosRH();
                    break;
                case 10:
                    this.listarFuncionariosADM();
                    break;
                case 11:
                    System.out.println("Saindo");
                    return;
                case 12:
                    System.out.println("Cria e adiciona: 13, Apaga: 14");
                    String func = sc.nextLine();

                    if(func.equals("13") ){
                    System.out.println("Quantos itens devem ser adicionados?");
                    int quantidade = sc.nextInt();
                    criarFuncionarios(quantidade);
                    break;
                    }
                    else if (func.equals("14")){
                    System.out.println("Quantos itens devem ser apagados?");
                    int quant = sc.nextInt();
                    this.apagarFuncionarios(quant);
                    }
                    break;
        

            }

        }
    }

    public static void main(String[] args) {

        Zoologico zoo = new Zoologico();

        zoo.sc = new Scanner(System.in);
        zoo.funcionarios = new ArrayList<Funcionario>();

        zoo.menu();
        
    }



}