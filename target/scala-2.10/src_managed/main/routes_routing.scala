// @SOURCE:C:/play-2.2.1/ProjetoSi/conf/routes
// @HASH:eb33333efaa3c0403ef0f9ca30133a94fbc8717a
// @DATE:Sun Jun 15 02:24:43 GMT-03:00 2014


import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString

object Routes extends Router.Routes {

private var _prefix = "/"

def setPrefix(prefix: String) {
  _prefix = prefix
  List[(String,Routes)]().foreach {
    case (p, router) => router.setPrefix(prefix + (if(prefix.endsWith("/")) "" else "/") + p)
  }
}

def prefix = _prefix

lazy val defaultPrefix = { if(Routes.prefix.endsWith("/")) "" else "/" }


// @LINE:6
private[this] lazy val controllers_Application_index0 = Route("GET", PathPattern(List(StaticPart(Routes.prefix))))
        

// @LINE:9
private[this] lazy val controllers_Application_montaGradeDoCurso1 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("montaGradeDoCurso"))))
        

// @LINE:10
private[this] lazy val controllers_Application_criaPeriodo2 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("montaGradeDoCurso/criaPeriodo"))))
        

// @LINE:11
private[this] lazy val controllers_Application_adicionaDisciplinaNoPeriodo3 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("montaGradeDoCurso/adicionaDisciplinaNoPeriodo"))))
        

// @LINE:12
private[this] lazy val controllers_Application_removeDisciplinaDoPeriodo4 = Route("POST", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("montaGradeDoCurso/removeDisciplinaDoPeriodo"))))
        

// @LINE:15
private[this] lazy val controllers_Assets_at5 = Route("GET", PathPattern(List(StaticPart(Routes.prefix),StaticPart(Routes.defaultPrefix),StaticPart("assets/"),DynamicPart("file", """.+""",false))))
        
def documentation = List(("""GET""", prefix,"""controllers.Application.index()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """montaGradeDoCurso""","""controllers.Application.montaGradeDoCurso()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """montaGradeDoCurso/criaPeriodo""","""controllers.Application.criaPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """montaGradeDoCurso/adicionaDisciplinaNoPeriodo""","""controllers.Application.adicionaDisciplinaNoPeriodo()"""),("""POST""", prefix + (if(prefix.endsWith("/")) "" else "/") + """montaGradeDoCurso/removeDisciplinaDoPeriodo""","""controllers.Application.removeDisciplinaDoPeriodo()"""),("""GET""", prefix + (if(prefix.endsWith("/")) "" else "/") + """assets/$file<.+>""","""controllers.Assets.at(path:String = "/public", file:String)""")).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
  case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
  case l => s ++ l.asInstanceOf[List[(String,String,String)]] 
}}
      

def routes:PartialFunction[RequestHeader,Handler] = {

// @LINE:6
case controllers_Application_index0(params) => {
   call { 
        invokeHandler(controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Nil,"GET", """ Home page""", Routes.prefix + """"""))
   }
}
        

// @LINE:9
case controllers_Application_montaGradeDoCurso1(params) => {
   call { 
        invokeHandler(controllers.Application.montaGradeDoCurso(), HandlerDef(this, "controllers.Application", "montaGradeDoCurso", Nil,"GET", """ Alocador""", Routes.prefix + """montaGradeDoCurso"""))
   }
}
        

// @LINE:10
case controllers_Application_criaPeriodo2(params) => {
   call { 
        invokeHandler(controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Nil,"POST", """""", Routes.prefix + """montaGradeDoCurso/criaPeriodo"""))
   }
}
        

// @LINE:11
case controllers_Application_adicionaDisciplinaNoPeriodo3(params) => {
   call { 
        invokeHandler(controllers.Application.adicionaDisciplinaNoPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaNoPeriodo", Nil,"POST", """""", Routes.prefix + """montaGradeDoCurso/adicionaDisciplinaNoPeriodo"""))
   }
}
        

// @LINE:12
case controllers_Application_removeDisciplinaDoPeriodo4(params) => {
   call { 
        invokeHandler(controllers.Application.removeDisciplinaDoPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaDoPeriodo", Nil,"POST", """""", Routes.prefix + """montaGradeDoCurso/removeDisciplinaDoPeriodo"""))
   }
}
        

// @LINE:15
case controllers_Assets_at5(params) => {
   call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        invokeHandler(controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]),"GET", """ Map static resources from the /public folder to the /assets URL path""", Routes.prefix + """assets/$file<.+>"""))
   }
}
        
}

}
     