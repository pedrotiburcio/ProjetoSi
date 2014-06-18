
package views.html

import play.templates._
import play.templates.TemplateMagic._

import play.api.templates._
import play.api.templates.PlayMagic._
import models._
import controllers._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.api.i18n._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._
import views.html._
/**/
object index extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template3[controllers.Alocador,Form[models.Task],String,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(alocador: controllers.Alocador, formTask:Form[models.Task], message: String):play.api.templates.HtmlFormat.Appendable = {
        _display_ {import helper._ 


Seq[Any](format.raw/*1.79*/("""

"""),_display_(Seq[Any](/*4.2*/main("Grade Curricular - CC")/*4.31*/ {_display_(Seq[Any](format.raw/*4.33*/("""
	<font color="#848400"> 
		<head>
			<meta charset="utf-8">
			<link rel="stylesheet" href="../public/stylesheets/main.css">
		</head>

		<body>
			<header>
				<h1><strong> Grade Curricular - Ciência da Computação </strong></h1>
				<br>
				<div class="adicionarUmPeriodo">
					"""),_display_(Seq[Any](/*16.7*/form(routes.Application.criaPeriodo())/*16.45*/ {_display_(Seq[Any](format.raw/*16.47*/("""
						<button type="submit" class="btn btn-large btn-primary" type="button">Novo Período</button><br>
					""")))})),format.raw/*18.7*/("""
				</div> 
				"""),_display_(Seq[Any](/*20.6*/if(alocador.getPeriodos.size() > 1)/*20.41*/ {_display_(Seq[Any](format.raw/*20.43*/("""
					<!--janela de alerta - limite dos periodos-->
						"""),_display_(Seq[Any](/*22.8*/if(message != "")/*22.25*/{_display_(Seq[Any](format.raw/*22.26*/("""
							<script language="JavaScript" type="text/javascript">
								alert(""""),_display_(Seq[Any](/*24.17*/message)),format.raw/*24.24*/("""")
							</script>
						""")))})),format.raw/*26.8*/("""  
					
					<div class= "adicionarUmaDisciplina">
						"""),_display_(Seq[Any](/*29.8*/form(routes.Application.adicionaDisciplinaNoPeriodo())/*29.62*/{_display_(Seq[Any](format.raw/*29.63*/("""
							"""),_display_(Seq[Any](/*30.9*/if(alocador.getPeriodos.size() > 1)/*30.44*/ {_display_(Seq[Any](format.raw/*30.46*/("""
				        		 <nome>Adicionar Disciplina
				            		    <select class="selectpicker" data-live-search="true" name="inputNameDisc" >

				                		"""),_display_(Seq[Any](/*34.24*/for(disciplina <- alocador.getGradeCurricular().getListaDeDisciplinas()) yield /*34.96*/ {_display_(Seq[Any](format.raw/*34.98*/("""
				                			"""),_display_(Seq[Any](/*35.25*/if(!alocador.jaFoiAdicionada(disciplina))/*35.66*/{_display_(Seq[Any](format.raw/*35.67*/("""
				            	    	     <option value=""""),_display_(Seq[Any](/*36.44*/disciplina/*36.54*/.getNome())),format.raw/*36.64*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*36.89*/disciplina/*36.99*/.getNome())),format.raw/*36.109*/("""</option>
				                 	    	""")))})),format.raw/*37.29*/("""
				                		""")))})),format.raw/*38.24*/("""
				        				</select>no Período</nome>
				        				<select class="selectpicker" data-width="100px" name="idPeriodo" >
				         		   		"""),_display_(Seq[Any](/*41.22*/for(periodo <- alocador.getPeriodos()) yield /*41.60*/ {_display_(Seq[Any](format.raw/*41.62*/("""
								
				                			 """),_display_(Seq[Any](/*43.26*/if(alocador.getPeriodos().indexOf(periodo) != 0)/*43.74*/ {_display_(Seq[Any](format.raw/*43.76*/("""
				                    	  	<option value="""),_display_(Seq[Any](/*44.44*/(alocador.getPeriodos().indexOf(periodo)))),format.raw/*44.85*/(""" name="idPeriodo" >"""),_display_(Seq[Any](/*44.105*/(alocador.getPeriodos().indexOf(periodo)+1))),format.raw/*44.148*/("""</option><br>

				                 			""")))})),format.raw/*46.26*/("""
				            			""")))})),format.raw/*47.21*/("""
				        			</select><button type="submit" class="btn btn-primary" type="button">Adicionar Disciplina</button>  
				 			""")))})),format.raw/*49.10*/("""
						""")))})),format.raw/*50.8*/("""
					</div><br>
					"""),_display_(Seq[Any](/*52.7*/if(alocador.getPeriodos().get(1).getDisciplinas().size() > 0)/*52.68*/{_display_(Seq[Any](format.raw/*52.69*/("""
					<br><div class="removeDisciplina">
					"""),_display_(Seq[Any](/*54.7*/form(routes.Application.removeDisciplinaDoPeriodo())/*54.59*/{_display_(Seq[Any](format.raw/*54.60*/("""
						"""),_display_(Seq[Any](/*55.8*/if(alocador.getPeriodos.size() > 1)/*55.43*/ {_display_(Seq[Any](format.raw/*55.45*/("""
		    				<nome>Remover disciplina <select class="selectpicker" data-live-search="true" name="inputNameDisc" >
		            			"""),_display_(Seq[Any](/*57.19*/for(disciplina <- alocador.getGradeCurricular().getListaDeDisciplinas()) yield /*57.91*/ {_display_(Seq[Any](format.raw/*57.93*/("""
		            				"""),_display_(Seq[Any](/*58.20*/if(alocador.jaFoiAdicionada(disciplina) && !alocador.getPeriodos().get(0).getDisciplinas().contains(disciplina))/*58.132*/{_display_(Seq[Any](format.raw/*58.133*/("""
		        	        			 </nome><option value=""""),_display_(Seq[Any](/*59.47*/disciplina/*59.57*/.getNome())),format.raw/*59.67*/("""" name="inputNameDisc" >"""),_display_(Seq[Any](/*59.92*/disciplina/*59.102*/.getNome())),format.raw/*59.112*/("""</option>
			             			""")))})),format.raw/*60.21*/("""
		            			""")))})),format.raw/*61.19*/("""
		        			</select><button type="submit" class="btn btn-primary" type="button">Remover Disciplina</button>
						""")))})),format.raw/*63.8*/("""
					""")))})),format.raw/*64.7*/(""" </div><br><br>

					""")))})),format.raw/*66.7*/("""
			""")))})),format.raw/*67.5*/("""
			</header>
					<br><section class="planejamento">
				<!-- tabela com as disciplinas e o calculo do total de creditos de qualquer periodo-->
				<table>
					"""),_display_(Seq[Any](/*72.7*/for(periodo <- alocador.getPeriodos()) yield /*72.45*/{_display_(Seq[Any](format.raw/*72.46*/("""
						<center>
						<th class="titulo">"""),_display_(Seq[Any](/*74.27*/(alocador.getPeriodos.indexOf(periodo)+1))),format.raw/*74.68*/("""º PERÍODO </th>
						"""),_display_(Seq[Any](/*75.8*/for(disciplina <- alocador.getDisciplinasDadoPeriodo(alocador.getPeriodos.indexOf(periodo))) yield /*75.100*/{_display_(Seq[Any](format.raw/*75.101*/("""
							<tr><td class="disciplina">"""),_display_(Seq[Any](/*76.36*/disciplina/*76.46*/.getNome())),format.raw/*76.56*/("""</tr>
							
						""")))})),format.raw/*78.8*/(""" 
						<tr><td class="numero">Total de Créditos: """),_display_(Seq[Any](/*79.50*/periodo/*79.57*/.getTotalDeCreditos())),format.raw/*79.78*/("""</tr></td>
						</center>
						"""),_display_(Seq[Any](/*81.8*/if(alocador.getCreditosDeUmPeriodo(alocador.getPeriodos.indexOf(periodo)) < alocador.minimoDeCreditos())/*81.112*/{_display_(Seq[Any](format.raw/*81.113*/("""
							<tr><td class="numero">Os créditos totais do período estão abaixo do mínimo.</tr></td>
						""")))})),format.raw/*83.8*/("""
				 	""")))})),format.raw/*84.8*/("""   
			</section>
			
			<footer class="curriculo">	
				<!-- tabela de todas as disciplinas, seus creditos e pre-requisitos -->
				<table class="table table-bordered">
				<TH> Nome da disciplina</TH><TH> Créditos </TH> <TH> Pré-Requisitos</TH>
				"""),_display_(Seq[Any](/*91.6*/for(disciplina <- alocador.getGradeCurricular().getListaDeDisciplinas()) yield /*91.78*/{_display_(Seq[Any](format.raw/*91.79*/("""	
					<TR><TD>"""),_display_(Seq[Any](/*92.15*/disciplina/*92.25*/.getNome())),format.raw/*92.35*/("""</td><td> """),_display_(Seq[Any](/*92.46*/disciplina/*92.56*/.getCreditos())),format.raw/*92.70*/("""</td><td>"""),_display_(Seq[Any](/*92.80*/disciplina/*92.90*/.getPreRequisitos())),format.raw/*92.109*/("""</TD></TR> 

				""")))})),format.raw/*94.6*/("""       
		   		</table>
			</footer>
		</body>
	</font>
""")))})))}
    }
    
    def render(alocador:controllers.Alocador,formTask:Form[models.Task],message:String): play.api.templates.HtmlFormat.Appendable = apply(alocador,formTask,message)
    
    def f:((controllers.Alocador,Form[models.Task],String) => play.api.templates.HtmlFormat.Appendable) = (alocador,formTask,message) => apply(alocador,formTask,message)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 18 02:10:24 GMT-03:00 2014
                    SOURCE: C:/play-2.2.1/ProjetoSi/app/views/index.scala.html
                    HASH: a66add0dedc7d2f408dfab29bc952adccbb97c96
                    MATRIX: 813->1|1001->78|1038->99|1075->128|1114->130|1432->413|1479->451|1519->453|1659->562|1712->580|1756->615|1796->617|1890->676|1916->693|1955->694|2069->772|2098->779|2156->806|2250->865|2313->919|2352->920|2396->929|2440->964|2480->966|2681->1131|2769->1203|2809->1205|2870->1230|2920->1271|2959->1272|3039->1316|3058->1326|3090->1336|3151->1361|3170->1371|3203->1381|3273->1419|3329->1443|3513->1591|3567->1629|3607->1631|3678->1666|3735->1714|3775->1716|3855->1760|3918->1801|3975->1821|4041->1864|4113->1904|4166->1925|4324->2051|4363->2059|4421->2082|4491->2143|4530->2144|4612->2191|4673->2243|4712->2244|4755->2252|4799->2287|4839->2289|5005->2419|5093->2491|5133->2493|5189->2513|5311->2625|5351->2626|5434->2673|5453->2683|5485->2693|5546->2718|5566->2728|5599->2738|5661->2768|5712->2787|5861->2905|5899->2912|5953->2935|5989->2940|6187->3103|6241->3141|6280->3142|6358->3184|6421->3225|6479->3248|6588->3340|6628->3341|6700->3377|6719->3387|6751->3397|6803->3418|6890->3469|6906->3476|6949->3497|7018->3531|7132->3635|7172->3636|7305->3738|7344->3746|7631->3998|7719->4070|7758->4071|7810->4087|7829->4097|7861->4107|7908->4118|7927->4128|7963->4142|8009->4152|8028->4162|8070->4181|8119->4199
                    LINES: 26->1|30->1|32->4|32->4|32->4|44->16|44->16|44->16|46->18|48->20|48->20|48->20|50->22|50->22|50->22|52->24|52->24|54->26|57->29|57->29|57->29|58->30|58->30|58->30|62->34|62->34|62->34|63->35|63->35|63->35|64->36|64->36|64->36|64->36|64->36|64->36|65->37|66->38|69->41|69->41|69->41|71->43|71->43|71->43|72->44|72->44|72->44|72->44|74->46|75->47|77->49|78->50|80->52|80->52|80->52|82->54|82->54|82->54|83->55|83->55|83->55|85->57|85->57|85->57|86->58|86->58|86->58|87->59|87->59|87->59|87->59|87->59|87->59|88->60|89->61|91->63|92->64|94->66|95->67|100->72|100->72|100->72|102->74|102->74|103->75|103->75|103->75|104->76|104->76|104->76|106->78|107->79|107->79|107->79|109->81|109->81|109->81|111->83|112->84|119->91|119->91|119->91|120->92|120->92|120->92|120->92|120->92|120->92|120->92|120->92|120->92|122->94
                    -- GENERATED --
                */
            