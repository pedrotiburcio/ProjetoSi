// @SOURCE:C:/play-2.2.1/ProjetoSi/conf/routes
// @HASH:eb33333efaa3c0403ef0f9ca30133a94fbc8717a
// @DATE:Sun Jun 15 02:24:43 GMT-03:00 2014

import Routes.{prefix => _prefix, defaultPrefix => _defaultPrefix}
import play.core._
import play.core.Router._
import play.core.j._

import play.api.mvc._
import play.libs.F

import Router.queryString


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(file:String): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "assets/" + implicitly[PathBindable[String]].unbind("file", file))
}
                                                
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def adicionaDisciplinaNoPeriodo(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "montaGradeDoCurso/adicionaDisciplinaNoPeriodo")
}
                                                

// @LINE:10
def criaPeriodo(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "montaGradeDoCurso/criaPeriodo")
}
                                                

// @LINE:9
def montaGradeDoCurso(): Call = {
   Call("GET", _prefix + { _defaultPrefix } + "montaGradeDoCurso")
}
                                                

// @LINE:12
def removeDisciplinaDoPeriodo(): Call = {
   Call("POST", _prefix + { _defaultPrefix } + "montaGradeDoCurso/removeDisciplinaDoPeriodo")
}
                                                

// @LINE:6
def index(): Call = {
   Call("GET", _prefix)
}
                                                
    
}
                          
}
                  


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.javascript {

// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Assets.at",
   """
      function(file) {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file)})
      }
   """
)
                        
    
}
              

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def adicionaDisciplinaNoPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.adicionaDisciplinaNoPeriodo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "montaGradeDoCurso/adicionaDisciplinaNoPeriodo"})
      }
   """
)
                        

// @LINE:10
def criaPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.criaPeriodo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "montaGradeDoCurso/criaPeriodo"})
      }
   """
)
                        

// @LINE:9
def montaGradeDoCurso : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.montaGradeDoCurso",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "montaGradeDoCurso"})
      }
   """
)
                        

// @LINE:12
def removeDisciplinaDoPeriodo : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.removeDisciplinaDoPeriodo",
   """
      function() {
      return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "montaGradeDoCurso/removeDisciplinaDoPeriodo"})
      }
   """
)
                        

// @LINE:6
def index : JavascriptReverseRoute = JavascriptReverseRoute(
   "controllers.Application.index",
   """
      function() {
      return _wA({method:"GET", url:"""" + _prefix + """"})
      }
   """
)
                        
    
}
              
}
        


// @LINE:15
// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
package controllers.ref {


// @LINE:15
class ReverseAssets {
    

// @LINE:15
def at(path:String, file:String): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Assets.at(path, file), HandlerDef(this, "controllers.Assets", "at", Seq(classOf[String], classOf[String]), "GET", """ Map static resources from the /public folder to the /assets URL path""", _prefix + """assets/$file<.+>""")
)
                      
    
}
                          

// @LINE:12
// @LINE:11
// @LINE:10
// @LINE:9
// @LINE:6
class ReverseApplication {
    

// @LINE:11
def adicionaDisciplinaNoPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.adicionaDisciplinaNoPeriodo(), HandlerDef(this, "controllers.Application", "adicionaDisciplinaNoPeriodo", Seq(), "POST", """""", _prefix + """montaGradeDoCurso/adicionaDisciplinaNoPeriodo""")
)
                      

// @LINE:10
def criaPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.criaPeriodo(), HandlerDef(this, "controllers.Application", "criaPeriodo", Seq(), "POST", """""", _prefix + """montaGradeDoCurso/criaPeriodo""")
)
                      

// @LINE:9
def montaGradeDoCurso(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.montaGradeDoCurso(), HandlerDef(this, "controllers.Application", "montaGradeDoCurso", Seq(), "GET", """ Alocador""", _prefix + """montaGradeDoCurso""")
)
                      

// @LINE:12
def removeDisciplinaDoPeriodo(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.removeDisciplinaDoPeriodo(), HandlerDef(this, "controllers.Application", "removeDisciplinaDoPeriodo", Seq(), "POST", """""", _prefix + """montaGradeDoCurso/removeDisciplinaDoPeriodo""")
)
                      

// @LINE:6
def index(): play.api.mvc.HandlerRef[_] = new play.api.mvc.HandlerRef(
   controllers.Application.index(), HandlerDef(this, "controllers.Application", "index", Seq(), "GET", """ Home page""", _prefix + """""")
)
                      
    
}
                          
}
        
    