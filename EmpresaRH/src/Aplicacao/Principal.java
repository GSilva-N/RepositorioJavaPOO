package Aplicacao;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;
import Entidades.Funcionarios;
import Entidades.Terceiros;

public class Principal {

	public static void main(String[] args) {
		
		List<Funcionarios> funcionario = new ArrayList<Funcionarios>();
		List<Terceiros> terceiros = new ArrayList<Terceiros>();
		Scanner scanf = new Scanner(System.in);
		
		int colaboradores, escolha;
		
		System.out.print("Digite a quantidade de colaboradores: ");
		colaboradores = scanf.nextInt();
		
		for(int i=0; i<colaboradores; i++) {
			System.out.print("\n\n1 - Funcionario | 2 - Terceirizado: ");
			escolha = scanf.nextInt();
			
			if(escolha == 1) {
				funcionario.add(new Funcionarios());
				
				System.out.print("Digite seu nome: ");
				funcionario.get(funcionario.size()-1).setNome(scanf.next());
				
				System.out.print("Digite suas horas trabalhadas: ");
				funcionario.get(funcionario.size()-1).setHorasTrabalhadas(scanf.nextInt());
				
				System.out.print("Digite o valor da sua hora de trabalho: ");
				funcionario.get(funcionario.size()-1).setValorPorHora(scanf.nextDouble());
				
				System.out.print("\n------------------------------------------\n");
				System.out.printf("Funcionario(a) %s recebeu %.2f ", funcionario.get(funcionario.size()-1).getNome(), funcionario.get(funcionario.size()-1).pagamento());
				System.out.print("\n------------------------------------------\n");
			} else {
				terceiros.add(new Terceiros());
				
				System.out.print("Digite seu nome: ");
				terceiros.get(terceiros.size()-1).setNome(scanf.next());
				
				System.out.print("Digite suas horas trabalhadas: ");
				terceiros.get(terceiros.size()-1).setHorasTrabalhadas(scanf.nextInt());
				
				System.out.print("Digite o valor da sua hora de trabalho: ");
				terceiros.get(terceiros.size()-1).setValorPorHora(scanf.nextDouble());
				
				System.out.print("Digite o valor da sua hora extra: ");
				terceiros.get(terceiros.size()-1).setHorasAdicionais(scanf.nextDouble());
				
				System.out.print("\n------------------------------------------\n");
				System.out.printf("Terceirizado(a) %s recebeu %.2f ", terceiros.get(terceiros.size()-1).getNome(), terceiros.get(terceiros.size()-1).pagamento());
				System.out.print("\n------------------------------------------\n");
			}
		}
				
		scanf.close();
	}

}
