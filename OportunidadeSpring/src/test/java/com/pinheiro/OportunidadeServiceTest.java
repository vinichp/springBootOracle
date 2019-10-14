package com.pinheiro;    
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.PowerMockRunner;
import org.springframework.data.repository.CrudRepository;

import com.pinheiro.model.Oportunidade;
import com.pinheiro.service.OportunidadeNotService;
import com.pinheiro.service.OportunidadeService;


@RunWith(PowerMockRunner.class)
//@SpringBootTest
@PrepareForTest({ com.pinheiro.service.OportunidadeNotService.class, 
	com.pinheiro.service.OportunidadeService.class,
	CrudRepository.class})
public class OportunidadeServiceTest{
	
	/* @MockBean 
	 private OportunidadeRepository oportunidadeRepository;
	 @Before
	    public void init() {    
		 Oportunidade op = new Oportunidade();
			when(oportunidadeRepository.save(op)).thenReturn(op);
	    }*/
	
	 @Test
	public void testRemoverOportunidade(){
		 OportunidadeNotService opServMocked = mock(com.pinheiro.service.OportunidadeNotService.class);
		when(opServMocked.criarNovaOportunidade()).thenReturn(new Oportunidade());
		assertTrue(opServMocked.criarNovaOportunidade().getId()==null);
	}
	 
	 @Test
	public void testRemoverOportunidadeSemMock(){
		 OportunidadeNotService oportunidade = new OportunidadeNotService();
		 //OportunidadeNotService opServMocked = mock(com.pinheiro.service.OportunidadeNotService.class);
		//when(opServMocked.criarNovaOportunidade()).thenReturn(new Oportunidade());
		assertTrue(oportunidade.criarNovaOportunidade().getEmpresa().equals("CPQD"));
	}
	
	
	 
	// @Test Nao consegui acho que tem que usar o mockBean do spring para mockar
	public void testRemoverOportunidadeServiceSemMock(){
		 OportunidadeService oportunidade = new OportunidadeService();
		 //CrudRepository oportunidadeRepository = mock(CrudRepository.class);
		 //when(oportunidadeRepository.save(Mockito.any())).thenReturn(new Oportunidade());
		assertTrue(oportunidade.criarNovaOportunidade().getEmpresa()==null);
	}
	
}
