package ADO1;
import javax.swing.*;

public class teste {
    public static void main(String[] args) {

        Encapsulamento acessoConta= new Encapsulamento();
       
        String nome;
       
        String senha;
       
        int tentaivas=5;

        acessoConta.setNome(JOptionPane.showInputDialog("Qual o nome do usuario?"));
       
        acessoConta.setSenha(JOptionPane.showInputDialog("Qual a senha do usuario"));


        do {
            nome=JOptionPane.showInputDialog("Digite o nome do usuario");
            
            senha=JOptionPane.showInputDialog("Digite a senha do usuario");

            if(!acessoConta.VerificarConta(senha,nome)) {
                System.out.println("Nome ou senha incorreto tente novamente");
                tentaivas--;

            }

            if(tentaivas<=0){
                System.out.println("Maximo de tentativas alcançadas, bloqueando acesso");
                break;
            }

        }while(!acessoConta.VerificarConta(senha,nome));

        if(acessoConta.VerificarConta(senha,nome)){
            System.out.println("Acesso permitido");


        }

    }
}