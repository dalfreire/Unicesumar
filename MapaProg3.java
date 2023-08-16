
package mapaprog3;

import javax.swing.JOptionPane;


public class MapaProg3 {

    public static void main(String[] args) {
        
        Aluguel loc = new Aluguel();
        loc.iniciarLocacao();
        loc.fecharLocacao();
        loc.mostrarResumoLocacao();
    }
}
