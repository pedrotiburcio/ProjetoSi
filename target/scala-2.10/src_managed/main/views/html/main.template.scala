
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
object main extends BaseScalaTemplate[play.api.templates.HtmlFormat.Appendable,Format[play.api.templates.HtmlFormat.Appendable]](play.api.templates.HtmlFormat) with play.api.templates.Template2[String,Html,play.api.templates.HtmlFormat.Appendable] {

    /**/
    def apply/*1.2*/(title: String)(content: Html):play.api.templates.HtmlFormat.Appendable = {
        _display_ {

Seq[Any](format.raw/*1.32*/("""

<!DOCTYPE html>

<html>
    <head>
        <title>"""),_display_(Seq[Any](/*7.17*/title)),format.raw/*7.22*/("""</title>
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*8.54*/routes/*8.60*/.Assets.at("stylesheets/main.css"))),format.raw/*8.94*/("""">
        
        <!-- begin bootstrap css -->
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*11.54*/routes/*11.60*/.Assets.at("stylesheets/bootstrap.css"))),format.raw/*11.99*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*12.54*/routes/*12.60*/.Assets.at("stylesheets/bootstrap.min.css"))),format.raw/*12.103*/("""">
       	<link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*13.54*/routes/*13.60*/.Assets.at("stylesheets/bootstrap-theme.min.css"))),format.raw/*13.109*/("""">
        <link rel="stylesheet" media="screen" href=""""),_display_(Seq[Any](/*14.54*/routes/*14.60*/.Assets.at("stylesheets/bootstrap-theme.css"))),format.raw/*14.105*/("""">
        <!-- end bootstrap css -->
        
        <link rel="shortcut icon" type="image/png" href=""""),_display_(Seq[Any](/*17.59*/routes/*17.65*/.Assets.at("images/favicon.png"))),format.raw/*17.97*/("""">
        <script src=""""),_display_(Seq[Any](/*18.23*/routes/*18.29*/.Assets.at("javascripts/jquery-1.9.0.min.js"))),format.raw/*18.74*/("""" type="text/javascript"></script>
    </head>
    <body>
        """),_display_(Seq[Any](/*21.10*/content)),format.raw/*21.17*/("""
    </body>
</html>
"""))}
    }
    
    def render(title:String,content:Html): play.api.templates.HtmlFormat.Appendable = apply(title)(content)
    
    def f:((String) => (Html) => play.api.templates.HtmlFormat.Appendable) = (title) => (content) => apply(title)(content)
    
    def ref: this.type = this

}
                /*
                    -- GENERATED --
                    DATE: Wed Jun 18 01:07:01 GMT-03:00 2014
                    SOURCE: C:/play-2.2.1/ProjetoSi/app/views/main.scala.html
                    HASH: af220b2956d13ca85f4eae7a7a33bd94d27d0386
                    MATRIX: 778->1|902->31|990->84|1016->89|1113->151|1127->157|1182->191|1320->293|1335->299|1396->338|1488->394|1503->400|1569->443|1661->499|1676->505|1748->554|1840->610|1855->616|1923->661|2064->766|2079->772|2133->804|2194->829|2209->835|2276->880|2379->947|2408->954
                    LINES: 26->1|29->1|35->7|35->7|36->8|36->8|36->8|39->11|39->11|39->11|40->12|40->12|40->12|41->13|41->13|41->13|42->14|42->14|42->14|45->17|45->17|45->17|46->18|46->18|46->18|49->21|49->21
                    -- GENERATED --
                */
            