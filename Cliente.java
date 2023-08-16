

package mapaprog3;

import javax.swing.JOptionPane;


public class Cliente {
    
    //Atributos da Classe Cliente
    private int id;
    private String nome;
    private String cpf;
    private String telefone;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
    //Métodos da Classe Cliente
    
    public void cadastrarUsuario(){
        this.nome = JOptionPane.showInputDialog("Digite o nome do Cliente: ");
        this.cpf = JOptionPane.showInputDialog("Digite o CPF do Cliente: ");
        this.telefone = JOptionPane.showInputDialog("Digite o telefone do Cliente: ");
    }
    public String mostrarDadosUsuario(){
        String msg = "DADOS DO CLIENTE \n\n";
        msg += "NOME: " + this.nome + "\n";
        msg += "CPF: " + this.cpf + "\n";
        msg += "TELEFONE: " + this.telefone + "\n\n";
        
        return msg;
    }
}

