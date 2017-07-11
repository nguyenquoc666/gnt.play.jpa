
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object index_Scope0 {
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import java.lang._
import java.util._
import scala.collection.JavaConversions._
import scala.collection.JavaConverters._
import play.core.j.PlayMagicForJava._
import play.mvc._
import play.data._
import play.api.data.Field
import play.mvc.Http.Context.Implicit._

class index extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Add person!</h1>

  <ul id="persons"></ul>

  <form method="post" action=""""),_display_(/*8.32*/routes/*8.38*/.PersonController.addPerson()),format.raw/*8.67*/("""">
    <input type="text" name="name">
    <button>Add Person</button>
  </form>
""")))}),format.raw/*12.2*/("""
"""))
      }
    }
  }

  def render(): play.twirl.api.HtmlFormat.Appendable = apply()

  def f:(() => play.twirl.api.HtmlFormat.Appendable) = () => apply()

  def ref: this.type = this

}


}

/**/
object index extends index_Scope0.index
              /*
                  -- GENERATED --
                  DATE: Tue Jul 11 21:06:05 ICT 2017
                  SOURCE: D:/WorkSpace/GNT/Project/play-jpa/app/views/index.scala.html
                  HASH: dec0c41febb3c631a079ec1a1c2c9e54b2cabd3f
                  MATRIX: 738->1|834->3|862->6|893->29|932->31|961->34|1066->113|1080->119|1129->148|1241->230
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|43->12
                  -- GENERATED --
              */
          