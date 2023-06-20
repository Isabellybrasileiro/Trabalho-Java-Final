import java.io.File;

public class Funcionarios {
    public static void main(String[] args) {
        try{
            File arquivo = new File("func.txt");

            boolean naoExiste = arquivo.createNewFile();
            if(naoExiste){
                System.out.println("Criou Arquivo");
            }else{
                System.out.println("Arquivo já foi criado");
            }


        }catch(Exception e){
            e.printStackTrace();
    }
}

}