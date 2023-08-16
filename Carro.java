
package mapaprog3;

import javax.swing.JOptionPane;


public class Carro {
    
    //Atributos da Classe Carro
    private int id;
    private String modelo;
    private String marca;
    private Double valorPorKm;
    
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public Double getValorPorKm() {
        return valorPorKm;
    }

    public void setValorPorKm(Double valorPorKm) {
        this.valorPorKm = valorPorKm;
    }
    
    //Métodos da Classe Carro
    
    public void cadastrarCarro(){
        this.modelo = JOptionPane.showInputDialog("Digite o modelo do veículo: ");
        this.marca = JOptionPane.showInputDialog("Digite a marca do veículo: ");
        this.valorPorKm = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor por Km: "));
    }
    public String mostrarDadosCarro(){
        String msg = "DADOS DO VEÍCULO\n\n";
        msg += "MODELO_VEÍCULO: "  + this.modelo + "\n";
        msg += "MARCA_VEÍCULO: " + this.marca + "\n";
        msg += "VALOR / KM : R$ " + String.format("%.2f", this.valorPorKm) + "\n\n";
        
        return msg;
        
    }
    
    
    
}
