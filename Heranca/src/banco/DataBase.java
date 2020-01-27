package banco;
import java.util.ArrayList;

import model.Pessoa;
import model.Cliente;
import model.Fornecedor;
import model.Produto;
import model.Vendedor;

public class DataBase {
	
	private static ArrayList<Pessoa> pessoas = new ArrayList<Pessoa>();
	
	private static ArrayList<Cliente> clientes = new ArrayList<Cliente>();
	
	private static ArrayList<Fornecedor> fornecedores = new ArrayList<Fornecedor>();
	
	private static ArrayList<Vendedor> vendedores = new ArrayList<Vendedor>();
	
	private static ArrayList<Produto> produtos = new ArrayList<Produto>();

	private static Long ultimoIdPessoa = 0L;
	private static Long ultimoIdFornecedor = 0L;
	private static Long ultimoIdVendedor = 0L;
	private static Long ultimoIdCLiente = 0L;
	private static Long ultimoIdProduto = 0L;
	
	public static Fornecedor add(Fornecedor fornecedor) {
		ultimoIdFornecedor++;
		fornecedor.setId(ultimoIdFornecedor);
		fornecedores.add(fornecedor);
		return fornecedor;
	}
	public static Cliente add(Cliente cliente) {
		ultimoIdCLiente ++;
		cliente.setId(ultimoIdCLiente);
		clientes.add(cliente);
		return cliente;
	}
	public static Vendedor add(Vendedor vendedor) {
		ultimoIdVendedor++;
		vendedor.setId(ultimoIdVendedor);
		vendedores.add(vendedor);
		return vendedor;
	}
	public static Produto add(Produto produto) {
		ultimoIdProduto ++;
		produto.setId(ultimoIdProduto);
		produtos.add(produto);
		return produto;
	}
	
	public static ArrayList<Pessoa> getPessoas() {
		return pessoas;
	}
	public static ArrayList<Cliente> getClientes() {
		return clientes;
	}
	public static ArrayList<Fornecedor> getFornecedores() {
		return fornecedores;
	}
	public static ArrayList<Vendedor> getVendedores() {
		return vendedores;
	}
	public static ArrayList<Produto> getProdutos() {
		return produtos;
	}
}
