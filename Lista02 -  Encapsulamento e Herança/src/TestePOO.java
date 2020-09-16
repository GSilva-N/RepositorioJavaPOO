
public class TestePOO {

	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa("Pedro","Rua da Pedra","999887711");
		System.out.println("Nome: "+pessoa01.getNome()
						+"\nEndereço: "+pessoa01.getEndereco()
						+"\nTelefone: "+pessoa01.getTelefone());
		
		//Fornecedor
		System.out.println("======================================");
		Fornecedor fornecedor01 = new Fornecedor("Paulo", "Avenida do Açucar", "90033255", 2000, 150);
		System.out.println("Nome: "+fornecedor01.getNome()
						+"\nEndereço: "+fornecedor01.getEndereco()
						+"\nTelefone: "+fornecedor01.getTelefone());
		
		fornecedor01.obterSaldo();
		
		//Empregado
		System.out.println("======================================");
		Empregado empregado01 = new Empregado("Maria", "Rua do Sol", "933856644", 001, 1910, 0.55);
		System.out.println("Nome: "+empregado01.getNome()
						+"\nEndereço: "+empregado01.getEndereco()
						+"\nTelefone: "+empregado01.getTelefone()
						+"\nCódigo: "+empregado01.getCodigoSetor()
						+"\nSalário: R$ "+empregado01.getSalarioBase()
						+"\nImposto: "+empregado01.getImposto());
		System.out.println(empregado01.calcularSalario());
		
		//Administrador
		System.out.println("======================================");
		Administrador administrador01 = new Administrador("Marcos", "Rua do Dev", "38521229", 250.00);
		System.out.println("Nome: "+administrador01.getNome()
						+"\nEndereço: "+administrador01.getEndereco()
						+"\nTelefone: "+administrador01.getTelefone()
						+"\nAjuda de custo: R$ "+administrador01.getAjudaDeCusto());
		
		//Operario
		System.out.println("======================================");
		Operario operario01 = new Operario("Helena", "Rua do Trabalho", "67346399", 800, 0.85);
		System.out.println("Nome: "+operario01.getNome()
						+"\nEndereço: "+operario01.getEndereco()
						+"\nTelefone: "+operario01.getTelefone()
						+"\nSalário base: "+operario01.getValorProducao()
						+"\nComissão: "+operario01.getComissao()
						+"\nValor final: "+operario01.valorFinal());
		
		//Vendedor
		System.out.println("======================================");
		Vendedor vendedor01 = new Vendedor("Joaquim", "Avenidas dos Sapatos", "9996341996", 850, 0.85);
		System.out.println("Nome: "+vendedor01.getNome()
						+"\nEndereço: "+vendedor01.getEndereco()
						+"\nTelefone: "+vendedor01.getTelefone()
						+"\nSalário base: "+vendedor01.getValorVendas()
						+"\nComissão: "+vendedor01.getComissao()
						+"\nValor final: "+vendedor01.finalVendas());
	}

}
