import org.junit.Assert;
import org.junit.Test;

import controllers.Alocador;
import models.*;

public class TestaAlocador {
	
	GradeCurricular grade = new GradeCurricular();
	Alocador alocador = new Alocador(grade);
	@Test
	public void testaAlocador() throws Exception{
		Assert.assertEquals(alocador.getGradeCurricular(), grade);
		Assert.assertEquals(16, alocador.minimoDeCreditos());
		Assert.assertEquals(28, alocador.maximoDeCreditos());
		
		try{
			alocador.adicionaPrimeiroPeriodo();
		}
		catch(Exception e){
			e.getMessage();
		}
		Assert.assertEquals(1, alocador.quantidadeDePeriodos());
	}
	
	@Test
	public void testaQuantidadeDePeriodos() throws Exception{
		
		try{
			for(int i = 0; i < 10; i++){
				alocador.adicionaPeriodo();
			}
			alocador.adicionaPeriodo();
		}
		catch(Exception e){
		//	System.out.println("caiu aqui");
			Assert.assertEquals("Grade completa. Não é possível adicionar mais perídos.", e.getMessage());
		}
		
		Assert.assertEquals(10, alocador.quantidadeDePeriodos());
		
	}
	
	@Test
	public void testaDeterminadoPeriodo(){
		try{
			
		}
		
		catch(Exception e){
			
		}
	}
	
	
}
