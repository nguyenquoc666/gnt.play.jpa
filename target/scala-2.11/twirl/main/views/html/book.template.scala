
package views.html

import play.twirl.api._
import play.twirl.api.TemplateMagic._


     object book_Scope0 {
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

class book extends BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with play.twirl.api.Template0[play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/():play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.4*/("""

"""),_display_(/*3.2*/main("Welcome to Play")/*3.25*/ {_display_(Seq[Any](format.raw/*3.27*/("""
  """),format.raw/*4.3*/("""<h1>Add book!</h1>

  <ul id="books"></ul>

  <form method="post" action=""""),_display_(/*8.32*/routes/*8.38*/.BookController.addBook()),format.raw/*8.63*/("""">
    <input type="text" name="name">
    <button>Add book</button>
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
object book extends book_Scope0.book
              /*
                  -- GENERATED --
                  DATE: Tue Jul 11 21:06:04 ICT 2017
                  SOURCE: D:/WorkSpace/GNT/Project/play-jpa/app/views/book.scala.html
                  HASH: 45b86162a14cc4607f1bef096ab520511eae1f32
                  MATRIX: 736->1|832->3|860->6|891->29|930->31|959->34|1060->109|1074->115|1119->140|1229->220
                  LINES: 27->1|32->1|34->3|34->3|34->3|35->4|39->8|39->8|39->8|43->12
                  -- GENERATED --
              */
          