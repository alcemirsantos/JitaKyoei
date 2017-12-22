package br.ufpi.pdsi2.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;
import org.junit.Before;
import org.junit.Test;

public class MyTest {
	AppView view = new MainAppView();
	
	AppFacade facade = new AppFacadeImpl(view);
	
	Aluno aluno;
	Filiado filiado;
	@Before
	public void setup() {
		aluno = new Aluno();
		filiado = new Filiado();
	}
	
	
	
	
	
	
	// Testes Para a variavel "Nome"
	
	@Test
	public void nomeValido() {
		String nome = "Francisco Antonio";
		filiado.setNome(nome);
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		String nomecadastrado = facade.searchAluno(aluno).get(0).getFiliado().getNome();
		assertEquals("Não são iguais",nome,nomecadastrado);	
	}
	
	@Test(expected=Exception.class)
	public void nomeVazio() {
		filiado.setNome(" ");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void nomeComNumeros() {
		filiado.setNome("Fr4nc15c0");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void nomeComCaracteresEspeciais() {
		filiado.setNome("Fr#nci$co");
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
	}
	
	
	
	
	
	
	
	
	// Testes Para a variavel "registroCbj"
	
	@Test
	public void registroCbjValido() {
		String registroCbj = "47741";
		filiado.setRegistroCbj(registroCbj);
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		String registroCbjcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getRegistroCbj();
		
		assertEquals("Não são iguais",registroCbj,registroCbjcadastrado);
	}
	
	@Test(expected=Exception.class)
	public void registroCbjComLetras() throws Exception{
		filiado.setCpf("477r1");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void registroCbjComMaisDe6Digitos() throws Exception{
		filiado.setCpf("9477415");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void registroCbjComMenosDe5Digitos() throws Exception{
		filiado.setCpf("9475");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void registroCbjComEspacosEmBranco() throws Exception{
		filiado.setCpf("947 74 15");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void registroCbjVazio() throws Exception{
		filiado.setCpf(" ");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void registroCbjComCaracteresEspeciais() throws Exception{
		filiado.setCpf("4774$&");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	
	
	
	
	
	// Testes Para a variavel "dataNascimento"
	
	@Test
	public void  dataNascimentoValida() throws Exception{
		Date data = new Date();
		filiado.setDataNascimento(data);
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		Date datacadastrada = facade.searchAluno(aluno).get(0).getFiliado().getDataNascimento();
		
		assertEquals("Não são iguais",data,datacadastrada);	
	}
	
	
	
	
	
	
	// Testes Para a variavel "dataCadastro"
	
		@Test
		public void  dataCadastroValida() throws Exception{
			Date data = new Date();
			filiado.setDataCadastro(data);
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			Date datacadastrada = facade.searchAluno(aluno).get(0).getFiliado().getDataCadastro();
			
			assertEquals("Não são iguais",data,datacadastrada);	
		}
	
	
		
	
	
		
		
		
	// Testes para a variavel "telefone1"
		
		@Test
		public void telefone1Valido() {
			String telefone1 = "(89) 99407-9165";
			filiado.setNome(telefone1);
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			String telefone1cadastrado = facade.searchAluno(aluno).get(0).getFiliado().getTelefone1();
			assertEquals("Não são iguais",telefone1,telefone1cadastrado);	
		}
		
		@Test
		public void telefone1VazioValido() {
			String telefone1 = " ";
			filiado.setNome(telefone1);
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			String telefone1cadastrado = facade.searchAluno(aluno).get(0).getFiliado().getTelefone1();
			assertEquals("Não são iguais",telefone1,telefone1cadastrado);	
		}
		
		@Test
		public void telefone1SemEspacosValido() {
			String telefone1 = "(89)99407-9165";
			filiado.setNome(telefone1);
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			String telefone1cadastrado = facade.searchAluno(aluno).get(0).getFiliado().getTelefone1();
			assertEquals("Não são iguais",telefone1,telefone1cadastrado);	
		}
		
		@Test
		public void telefone1SemCaracteresEspeciaisValido() {
			String telefone1 = "89994079165";
			filiado.setNome(telefone1);
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			String telefone1cadastrado = facade.searchAluno(aluno).get(0).getFiliado().getTelefone1();
			assertEquals("Não são iguais",telefone1,telefone1cadastrado);	
		}
		
		
		@Test(expected=Exception.class)
		public void telefone1ComLetrasInvalido() throws Exception{
			filiado.setTelefone1("89 99a-07916S");
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);
		}
		
		@Test(expected=Exception.class)
		public void telefone1ComCaracteresEspeciaisInvalido() throws Exception{
			filiado.setTelefone1("89 99a%07916$");
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);
		}
		
		
		
		
		
		
		
		
		// Testes para a variavel "email"
		
		@Test
		public void emailValido() throws Exception{
			String email = "fcoantonioufpi@gmail.com";
			filiado.setEmail(email);
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);
			
			String emailcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getEmail();
			assertEquals("Não são iguais",email, emailcadastrado);
			
		}
		
		@Test(expected=Exception.class)
		public void emailInvalidoSemArroba() throws Exception{
			String email = "fcoantonioufpigmail.com";
			filiado.setEmail(email);
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);			
		}
		
		@Test(expected=Exception.class)
		public void emailInvalidoSemDominio() throws Exception{
			String email = "fcoantonioufpigmail@";
			filiado.setEmail(email);
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);			
		}
		
		@Test(expected=Exception.class)
		public void emailInvalidoVazio() throws Exception{
			String email = " ";
			filiado.setEmail(email);
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);			
		}
		
		@Test(expected=Exception.class)
		public void emailInvalidoComCaracteresEspeciais() throws Exception{
			String email = "fcoant$%&#onioufpigmail@gmail.com";
			filiado.setEmail(email);
			aluno.setFiliado(filiado);
			
			facade.createAluno(aluno);			
		}
		
		
		
		
	
	
		
		//Testes para a variavel "CPF"
	
	@Test(expected=Exception.class)
	public void testCPFTem11DigitosInvalido() throws Exception{
		filiado.setCpf("12345678910");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test
	public void  testCPFTem11DigitosValido() throws Exception{
		String cpf = "03779108306";
		filiado.setCpf(cpf);
		aluno.setFiliado(filiado);
		facade.createAluno(aluno);
		String cpfcadastrado = facade.searchAluno(aluno).get(0).getFiliado().getCpf();
		
		assertEquals("Não são iguais",cpf,cpfcadastrado);	
	}
	
	@Test(expected=Exception.class)
	public void testCPFVazio() throws Exception{
		filiado.setCpf(" ");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void testCPFComLetras() throws Exception{
		filiado.setCpf("03779L0B306");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	
	@Test(expected=Exception.class)
	public void testCPFComCaracteresEspeciais() throws Exception{
		filiado.setCpf("03779&$#0B306");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void testCPFComMaisde11Digitos() throws Exception{
		filiado.setCpf("037791083068");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	
	@Test(expected=Exception.class)
	public void testCPFComMenosde11Digitos() throws Exception{
		filiado.setCpf("0377910830");
		aluno.setFiliado(filiado);
		
		facade.createAluno(aluno);
	}
	

}
