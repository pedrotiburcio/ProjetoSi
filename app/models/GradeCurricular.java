package models;

import java.util.ArrayList;
import java.util.List;

public class GradeCurricular {
	
	private Disciplina[] listaDisciplinas;
	private List<Disciplina> disciplinasPrimeiroPeriodo; 
	private Disciplina calc1, prog1, labProg1, ic, lpt, vetorial, calc2, prog2, labProg2, discreta, grafos, metodologia, fisicaClassica, eda, leda, linear, prob, tc, fisicaModerna, gi,
	metodos, plp, logica, oac, loac, es, si1, atal, infosoc, direito, comp, redes, bd1, si2, labEs, so, interRedes, LabInterRedes, bd2, ia, softNum, sistemasDiscretos, projeto1, projeto2,
	adm, sociologia, economia, futsal, basq, calc3, eqDif, ingles, didatica1, didatica2, sistemasDist, segurancaRedes, realidadeVirt, empreendorismo;
	
	
	public GradeCurricular() {
		listaDisciplinas = new Disciplina[]{
				calc1 = new Disciplina("Cálculo I", 4, new Disciplina[0]),
				vetorial = new Disciplina("Álgebra Vetorial e Geometria Analítica", 4, new Disciplina[0]),
				prog1 = new Disciplina("Programação I", 4, new Disciplina[0]),
				labProg1 = new Disciplina("Lab. de Programação I", 4, new Disciplina[0]),
				ic = new Disciplina("Introdução a Computação", 4, new Disciplina[0]),
				lpt = new Disciplina("Leitura e Produção de Textos", 4, new Disciplina[0]),
				calc2 = new Disciplina("Cálculo II", 4, new Disciplina[]{calc1}),
				prog2 = new Disciplina("Programação II", 4, new Disciplina[]{prog1,labProg1,ic}),
				labProg2 = new Disciplina("Lab. de Programação II", 4, new Disciplina[]{prog1,labProg1,ic}),
				grafos = new Disciplina("Teoria dos Grafos", 2, new Disciplina[]{prog1,labProg1}),
				discreta = new Disciplina("Matemática Discreta", 4, new Disciplina[0]),
				metodologia = new Disciplina("Metodologia Científica", 4, new Disciplina[0]),
				fisicaClassica = new Disciplina("Fundamentos de Física Clássica", 4, new Disciplina[]{calc1, vetorial}),
				eda = new Disciplina("Estrutura de Dados e Algoritmos", 4,new Disciplina[]{prog2,labProg2,grafos}),
				leda = new Disciplina("Lab. de Estrutura de Dados e Algoritmos", 4, new Disciplina[]{prog2,labProg2,grafos}),
				prob = new Disciplina("Probabilidade e Estatística", 4, new Disciplina[]{calc2}),		
				linear = new Disciplina("Álgebra Linear", 4, new Disciplina[]{vetorial}),
				tc = new Disciplina("Teoria da Computação", 4, new Disciplina[]{ic,discreta,grafos}),
				fisicaModerna = new Disciplina("Fundamentos de Física Moderna", 4, new Disciplina[]{fisicaClassica,calc2}),
				gi = new Disciplina("Gerência da Informação", 4, new Disciplina[0]),
				metodos = new Disciplina("Métodos Estatísticos", 4, new Disciplina[]{linear,prob}),
				plp = new Disciplina("Paradigmas de Linguagens de Programação", 2,new Disciplina[]{eda ,leda,tc}),
				logica = new Disciplina("Lógica Matemática", 4,new Disciplina[]{tc}),
				oac = new Disciplina("Organização e Arquitetura de Computadores", 4,new Disciplina[]{eda ,leda,fisicaModerna}),
				loac = new Disciplina("Lab. de Organizacao e Arquitetura de Computadores", 4,new Disciplina[]{eda ,leda,fisicaModerna}),			
				es = new Disciplina ("Engenharia de Software 1", 4, new Disciplina[]{labProg2,prog2,prob}),
				si1 = new Disciplina("Sistemas de Informação 1", 4, new Disciplina[]{gi}),
				atal = new Disciplina("Análise e Tecnicas de Algoritmos", 4,new Disciplina[]{eda, leda, logica,calc2}),
				infosoc = new Disciplina("Informática e Sociedade", 2,new Disciplina[0]),
				direito = new Disciplina("Direito e Cidadania", 4, new Disciplina[0]),
				comp = new Disciplina("Compiladores", 4, new Disciplina[]{oac, loac, plp}),
				redes = new Disciplina("Redes de Computadores", 4,  new Disciplina[]{oac, loac}),
				bd1 = new Disciplina("Banco de Dados 1", 4, new Disciplina[]{si1}),
				si2 = new Disciplina("Sistemas de Informação 2", 4, new Disciplina[]{si1}),
				labEs = new Disciplina ("Lab. de Engenharia de Software", 2, new Disciplina[]{es}),
				so = new Disciplina ("Sistemas Operacionais", 4, new Disciplina[]{oac, loac}),
				interRedes = new Disciplina ("Interconexão de Redes de Computadores", 2, new Disciplina[]{redes}),
				LabInterRedes = new Disciplina ("Lab. Interconexão de Redes de Computadores", 2, new Disciplina[]{redes}),
				bd2 = new Disciplina("Banco de Dados 2", 4, new Disciplina[]{bd1, si2}),
				ia = new Disciplina("Inteligência Artificial 1", 4,  new Disciplina[]{atal, plp, metodos}),
				softNum = new Disciplina("Métodos e Software Numericos", 4, new Disciplina[]{atal, linear}),
				sistemasDiscretos = new Disciplina("Avaliação de Desempenho de Sistemas Discretos", 4, new Disciplina[]{prob}),
				projeto1 = new Disciplina("Projeto em Computação 1", 4, new Disciplina[]{metodologia, labEs}),
				projeto2 = new Disciplina("Projeto em Computação 2", 6,  new Disciplina[]{projeto1}),
				adm = new Disciplina("Administração", 4,new Disciplina[0]),
				sociologia = new Disciplina("Sociologia Industrial", 3,new Disciplina[0]),
				economia = new Disciplina("Economia", 4, new Disciplina[0]),
				futsal = new Disciplina("Futsal", 2, new Disciplina[0]),
				basq = new Disciplina("Basquete", 2, new Disciplina[0]),
				calc3 = new Disciplina("Cálculo III", 4, new Disciplina[]{calc1, vetorial}),
				eqDif = new Disciplina("Equações Diferenciais", 4, new Disciplina[]{linear}),
				ingles = new Disciplina("Inglês", 4, new Disciplina[0]),
				didatica1 = new Disciplina("TECC (Didática Em Ciência Da Computação I)", 2, new Disciplina[0]),														
				didatica2 = new Disciplina("TECC (Didática Em Ciência Da Computação II)", 2, new Disciplina[]{didatica1}),
				sistemasDist = new Disciplina("TECC (Sistemas Distribuidos)", 4, new Disciplina[]{so}),	
				segurancaRedes = new Disciplina("TECC (Segurança de Redes de Computadores)", 4, new Disciplina[]{interRedes, LabInterRedes}),
				realidadeVirt = new Disciplina("TECC (Fundamentos e Aplicações de Realidade Virtual)", 4, new Disciplina[0]),
				empreendorismo = new Disciplina("TECC (Empreendedorismo em Software)", 4,  new Disciplina[0])
			};
			

			disciplinasPrimeiroPeriodo = new ArrayList<Disciplina>(); 
		}

		public Disciplina pesquisaDisciplina(String nomeDaDisciplina) throws Exception{
			for (int i = 0; i < this.getQuantidadeDisciplinas(); i++) {
				if (this.getListaDeDisciplinas()[i].getNome().equalsIgnoreCase(nomeDaDisciplina)) {
					return this.getListaDeDisciplinas()[i];
				}
			}
			throw new Exception("A disciplina procurada não existe.");
		}
		
		public boolean contains(Disciplina disciplina) {
			boolean resp = false;
				for (int i = 0; i < this.getListaDeDisciplinas().length; i++) {
					if (this.getListaDeDisciplinas()[i].equals(disciplina)) {
						resp = true;
					}
				}
			return resp;
		}
		
		public int getQuantidadeDisciplinas(){
			return this.listaDisciplinas.length;
		}
		
		public Disciplina[] getListaDeDisciplinas() {
			return this.listaDisciplinas;
		}
		
		public List<Disciplina> criaOPrimeiroPeriodo() {
			disciplinasPrimeiroPeriodo.add(calc1);
			disciplinasPrimeiroPeriodo.add(prog1);
			disciplinasPrimeiroPeriodo.add(labProg1);
			disciplinasPrimeiroPeriodo.add(ic);
			disciplinasPrimeiroPeriodo.add(lpt);
			disciplinasPrimeiroPeriodo.add(vetorial);
			return disciplinasPrimeiroPeriodo;
		}
	
}