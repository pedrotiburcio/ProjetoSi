package controllers;

import models.*;
import play.*;
import play.data.Form;
import play.mvc.*;
import play.data.*;
import views.html.*;

public class Application extends Controller {
	
	static GradeCurricular grade = new GradeCurricular();
	static Alocador alocador = new Alocador(grade);
	static Form<Task> formTask = Form.form(Task.class);
	static Periodo periodo = new Periodo();
	static String message = "";


	public static Result index() {
		return redirect(routes.Application.montaGradeDoCurso());
	}

	public static Result montaGradeDoCurso(){
		if (alocador.quantidadeDePeriodos() == 0) {
			try {
				alocador.adicionaPrimeiroPeriodo();
				message = "";
			} catch (Exception e) {
				message = e.getMessage();
			}
		}
		return ok(views.html.index.render(alocador, formTask,
				message));
	}

	public static Result criaPeriodo() {
		try {
			if (alocador.getPeriodos().size() >= 1) {
				alocador.adicionaPeriodo();
			}
			message = "";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return redirect(routes.Application.montaGradeDoCurso());
    
	}
 
	public static Result adicionaDisciplinaNoPeriodo() throws Exception {
		Form<Task> form = formTask.bindFromRequest();
		int idPeriodo = form.get().getIdPeriodo();
		try {
			alocador.adicionaDisciplinaEmPeriodo(idPeriodo, form
					.get().getInsercaoDisciplina());
			message = "";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return redirect(routes.Application.montaGradeDoCurso());
	}
	
	public static Result removeDisciplinaDoPeriodo() throws Exception {
		Form<Task> form = formTask.bindFromRequest();
		try {
			for (int i = 0; i < alocador.getPeriodos().size(); i++) {
				if (alocador.getDisciplinasDadoPeriodo(i).contains(alocador.getGradeCurricular().pesquisaDisciplina(form.get().getInsercaoDisciplina()))) {
					alocador.removeDisciplinaDoPeriodo(i, form.get().getInsercaoDisciplina());
				}
			}
			message = "";
		} catch (Exception e) {
			message = e.getMessage();
		}
		return redirect(routes.Application.montaGradeDoCurso());
	}
	
}
