package Questao3;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

public class Estoque {

	public static void main(String[] args) {
		
		List<Camisas> camisas = new ArrayList<Camisas>();
 		List<Sapatos> sapatos = new ArrayList<Sapatos>();
 		List<Calcas> calcas = new ArrayList<Calcas>();
 		
 		String opcao[] = {"CAMISAS", "SAPATOS", "CALÇAS"}; 
		
		String entrada = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:", "Inserir Produto",
				JOptionPane.QUESTION_MESSAGE,null,opcao, opcao[0]);
		
		if(entrada =="CAMISAS") {
			int numProd = Integer.parseInt(JOptionPane.showInputDialog("Adicionar quantos?"));
			String corCamisa = JOptionPane.showInputDialog("Cor da Camisa");
			String tamCamisa= JOptionPane.showInputDialog("Tamanho da Camisa");
			
			for (int i=0; i<numProd; i++) {	
				camisas.add(new Camisas(corCamisa,tamCamisa));	
			}
			
			for (Camisas cam:camisas)
			{
				System.out.println(cam.getCor()+" "+cam.getTamanho());
			}
		}
		
		if(entrada =="SAPATOS") {
			int numProd = Integer.parseInt(JOptionPane.showInputDialog("Adicionar quantos?"));
			String corSapato = JOptionPane.showInputDialog("Cor do Sapato");
			int tamSapato= Integer.parseInt(JOptionPane.showInputDialog("Tamanho do Sapato"));
			
			for (int i=0; i<numProd; i++) {	
				sapatos.add(new Sapatos(corSapato,tamSapato));	
			}
			
			for (Sapatos sap:sapatos)
			{
				System.out.println(sap.getCor()+" "+sap.getTamanho());
			}
		}
		
		if(entrada =="CALÇAS") {
			int numProd = Integer.parseInt(JOptionPane.showInputDialog("Adicionar quantos?"));
			String corCalca = JOptionPane.showInputDialog("Cor da Calça");
			int tamCalca= Integer.parseInt(JOptionPane.showInputDialog("Tamanho da Calças"));
			
			for (int i=0; i<numProd; i++) {	
				calcas.add(new Calcas(corCalca,tamCalca));	
			}
			
			for (Calcas cal:calcas)
			{
				System.out.println(cal.getCor()+" "+cal.getTamanho());
			}
		}
		
		String saida = (String) JOptionPane.showInputDialog(null, "Selecione uma opção:", "Remover Produto",
				JOptionPane.QUESTION_MESSAGE,null,opcao, opcao[0]);
		
		if(saida =="CAMISAS") {
			int numProd = Integer.parseInt(JOptionPane.showInputDialog("Remover quantos?"));
			
			for (int i=0; i<numProd; i++) {	
				camisas.remove(camisas.size()-1);	
			}
			System.out.println("===========ATUALIZADO=========");
			for (Camisas cam:camisas)
			{
				System.out.println(cam.getCor()+" "+cam.getTamanho());
			}
		}
		
		if(saida =="SAPATOS") {
			int numProd = Integer.parseInt(JOptionPane.showInputDialog("Remover quantos?"));
			
			for (int i=0; i<numProd; i++) {	
				sapatos.remove(sapatos.size()-1);	
			}
			System.out.println("===========ATUALIZADO=========");
			for (Sapatos sap:sapatos)
			{
				System.out.println(sap.getCor()+" "+sap.getTamanho());
			}
		}
		
		if(saida =="CALÇAS") {
			int numProd = Integer.parseInt(JOptionPane.showInputDialog("Remover quantos?"));
			
			for (int i=0; i<numProd; i++) {	
				calcas.remove(calcas.size()-1);	
			}
			System.out.println("===========ATUALIZADO=========");
			
			for (Calcas cal:calcas)
			{
				System.out.println(cal.getCor()+" "+cal.getTamanho());
			}
		}
		
		
		

	}

}
