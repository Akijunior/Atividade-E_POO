
package Domain;
import java.lang.reflect.Array;

import javax.swing.JOptionPane;

public class Estacionamento {

		static Carro[] Estacio = new Carro[10];
		static int cont = 0;
		
		
		public static void estadoEstacionamento(Carro[] estacionamento) {
					
					String texto = "";
					for (int i = 0; i < Estacio.length; i++) {
		
						if (Estacio[i] != null) {
		
							texto += "\nVaga " + i + "\nModelo do Carro -> " + Estacio[i].modelo + "\nPlaca -> "
							+ Estacio[i].placa + "\n\n";
						}
		
						else if(Estacio[i] == null) {
							texto += "Vaga " + i + " -> Disponível\n\n";
						}
		
					}
					JOptionPane.showMessageDialog
					(null, texto);
				}

		
		public static Carro[] adicionaCarro() {
			
			Carro carro = new Carro();

			carro.placa = JOptionPane.showInputDialog("Diga o número da placa: ");

			carro.modelo = JOptionPane.showInputDialog("Diga o modelo do carro: ");

			int valorNovo = 0;

			for (int i = 0; i < Estacio.length; i++) {

				if (Estacio[i] == null) {

					Estacio[i] = carro;

					valorNovo = 1;
					break;
				}}
	
				if (valorNovo == 0)
		
					Estacio[cont] = carro;
		
				cont ++;
			return Estacio;
		}
		
		public static void removeCarro() {
			
			JOptionPane.showMessageDialog(null, "Você escolheu retirar o Carro.");

			int posicao = (int) Double.parseDouble(JOptionPane.showInputDialog(null, "Diga a posição do estacionamento do carro que deseja retirar."));

			Estacio[posicao] = null;

		}
}

	

	