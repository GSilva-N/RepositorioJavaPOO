
public class TestePOO {

	public static void main(String[] args) {
		
		Pessoa pessoa01 = new Pessoa("Pedro","Rua da Pedra","999887711");
		System.out.println("Nome: "+pessoa01.getNome()
						+"\nEndere�o: "+pessoa01.getEndereco()
						+"\nTelefone: "+pessoa01.getTelefone());
		
		//Fornecedor
		System.out.println("======================================");
		Fornecedor fornecedor01 = new Fornecedor("Paulo", "Avenida do A�ucar", "90033255", 2000, 150);
		System.out.println("Nome: "+fornecedor01.getNome()
						+"\nEndere�o: "+fornecedor01.getEndereco()
						+"\nTelefone: "+fornecedor01.getTelefone());
		
		fornecedor01.obterSaldo();
		
		//Empregado
		System.out.println("======================================");
		Empregado empregado01 = new Empregado("Maria", "Rua do Sol", "933856644", 001, 1910, 0.55);
		System.out.println("Nome: "+empregado01.getNome()
						+"\nEndere�o: "+empregado01.getEndereco()
						+"\nTelefone: "+empregado01.getTelefone()
						+"\nC�digo: "+empregado01.getCodigoSetor()
						+"\nSal�rio: R$ "+empregado01.getSalarioBase()
						+"\nImposto: "+empregado01.getImposto());
		System.out.println(empregado01.calcularSalario());
		
		//Administrador
		System.out.println("======================================");
		Administrador administrador01 = new Administrador("Marcos", "Rua do Dev", "38521229", 250.00);
		System.out.println("Nome: "+administrador01.getNome()
						+"\nEndere�o: "+administrador01.getEndereco()
						+"\nTelefone: "+administrador01.getTelefone()
						+"\nAjuda de custo: R$ "+administrador01.getAjudaDeCusto());
		
		//Operario
		System.out.println("======================================");
		Operario operario01 = new Operario("Helena", "Rua do Trabalho", "67346399", 800, 0.85);
		System.out.println("Nome: "+operario01.getNome()
						+"\nEndere�o: "+operario01.getEndereco()
						+"\nTelefone: "+operario01.getTelefone()
						+"\nSal�rio base: "+operario01.getValorProducao()
						+"\nComiss�o: "+operario01.getComissao()
						+"\nValor final: "+operario01.valorFinal());
		
		//Vendedor
		System.out.println("======================================");
		Vendedor vendedor01 = new Vendedor("Joaquim", "Avenidas dos Sapatos", "9996341996", 850, 0.85);
		System.out.println("Nome: "+vendedor01.getNome()
						+"\nEndere�o: "+vendedor01.getEndereco()
						+"\nTelefone: "+vendedor01.getTelefone()
						+"\nSal�rio base: "+vendedor01.getValorVendas()
						+"\nComiss�o: "+vendedor01.getComissao()
						+"\nValor final: "+vendedor01.finalVendas());
	}

}
