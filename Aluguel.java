
package mapaprog3;

import javax.swing.JOptionPane;

public class Aluguel {
    
    //Atributos da Classe Aluguel
    private int id;
    private Carro carro;
    private Cliente cliente;
    private int qtdDias;
    private int kmInicial;
    private int kmFinal;
    private double valorTotalAluguel;
    
    public Aluguel(){
        cliente = new Cliente();
        carro = new Carro();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getQtdDias() {
        return qtdDias;
    }

    public void setQtdDias(int qtdDias) {
        this.qtdDias = qtdDias;
    }

    public int getKmInicial() {
        return kmInicial;
    }

    public void setKmInicial(int kmInicial) {
        this.kmInicial = kmInicial;
    }

    public int getKmFinal() {
        return kmFinal;
    }

    public void setKmFinal(int kmFinal) {
        this.kmFinal = kmFinal;
    }

    public double getValorTotalAluguel() {
        return valorTotalAluguel;
    }

    public void setValorTotalAluguel(double valorTotalAluguel) {
        this.valorTotalAluguel = valorTotalAluguel;
    }
    
       
    public void iniciarLocacao(){
          
        cliente.cadastrarUsuario();
        carro.cadastrarCarro();
        
        this.kmInicial = Integer.parseInt(JOptionPane.showInputDialog("Informe o Km inicial:  "));
    } 
    public void fecharLocacao() {
        kmFinal = Integer.parseInt(JOptionPane.showInputDialog("Informe o Km final:   "));
        qtdDias = Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de dias do aluguel:  "));
        valorTotalAluguel = (this.kmFinal - this.kmInicial) * carro.getValorPorKm();
        if(qtdDias >= 20){
            valorTotalAluguel = valorTotalAluguel * 0.8;
        }
        else if(qtdDias >= 10 && qtdDias<= 19){
            valorTotalAluguel = valorTotalAluguel * 0.9;
        }
         else{
            
            }
        }
    
    public String mostrarResumoLocacao() {
            
            JOptionPane.showMessageDialog(null, cliente.mostrarDadosUsuario() + "\n" + carro.mostrarDadosCarro() + "\nQuantidade de Dias:  " + qtdDias + "\nKm Inicial:  " + kmInicial + "\nKm Final:  " + kmFinal +"\nVALOR DA LOCAÇÃO:   " + "R$ " + String.format("%.2f",valorTotalAluguel));
            return null;
    }
    
    
}
