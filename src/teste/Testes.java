package teste;

import static org.junit.Assert.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

import java.util.Date;

import org.fpij.jitakyoei.facade.AppFacade;
import org.fpij.jitakyoei.facade.AppFacadeImpl;
import org.fpij.jitakyoei.model.beans.Aluno;
import org.fpij.jitakyoei.model.beans.Endereco;
import org.fpij.jitakyoei.model.beans.Faixa;
import org.fpij.jitakyoei.model.beans.Filiado;
import org.fpij.jitakyoei.model.beans.Professor;
import org.fpij.jitakyoei.view.AppView;
import org.fpij.jitakyoei.view.MainAppView;
import org.junit.Before;
import org.junit.Test;

import org.junit.Before;
import org.junit.Test;

@SuppressWarnings("unused")
public class Testes {


AppView view = new MainAppView();
	
	AppFacade facade = new AppFacadeImpl(view);
	
	Aluno aluno;
	Filiado filiado;
	Professor professor;
	Faixa faixa;
	Endereco endereco;
	@Before
	public void setup() {
		aluno = new Aluno();
		filiado = new Filiado();
		professor = new Professor();
		faixa = new Faixa();
		endereco = new Endereco();
	}
	
	////////
	
		@Test
		public void nomeValido() {
			String nome = "Sales";
			filiado.setNome(nome);
			aluno.setFiliado(filiado);
			professor.setFiliado(filiado);
			//faixa.setCor("corTeste");
			endereco.setCep("123");
			facade.createAluno(aluno);
			facade.createProfessor(professor);
			//facade.createEndereco(endereco);
			
			String nomeExistente = facade.searchAluno(aluno).get(0).getFiliado().getNome();
			assertEquals("Não são iguais",nome,nomeExistente);	
			
			String nomeExistente2 = facade.searchProfessor(professor).get(0).getFiliado().getNome();
			assertEquals("Não são iguais",nome,nomeExistente2);
				
		}
		
		@Test(expected=Exception.class)
		public void Vazio() {
			filiado.setNome(" ");
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			facade.createProfessor(professor);
		}
		
		@Test(expected=Exception.class)
		public void comNumeros() {
			filiado.setNome("S4l35");
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			facade.createProfessor(professor);
		}
		
		
		@Test(expected=Exception.class)
		public void cbjComEspacos() throws Exception{
			filiado.setCpf("200 788 522 96");
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			facade.createProfessor(professor);
		}
		
		@Test(expected=Exception.class)
		public void cbjVazio() throws Exception{
			filiado.setCpf(" ");
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			facade.createProfessor(professor);
		}
		
		@Test(expected=Exception.class)
		public void cbjCaracteresEspeciais() throws Exception{
			filiado.setCpf("3222&$#");
			aluno.setFiliado(filiado);
			facade.createAluno(aluno);
			facade.createProfessor(professor);
		}
	
	
	
}
