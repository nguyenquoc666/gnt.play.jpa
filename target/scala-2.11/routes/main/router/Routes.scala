
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/WorkSpace/GNT/Project/play-jpa/conf/routes
// @DATE:Wed Jul 12 06:12:44 ICT 2017

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._
import play.core.j._

import play.api.mvc._

import _root_.controllers.Assets.Asset
import _root_.play.libs.F

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  PersonController_2: controllers.PersonController,
  // @LINE:10
  BookController_0: controllers.BookController,
  // @LINE:19
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    PersonController_2: controllers.PersonController,
    // @LINE:10
    BookController_0: controllers.BookController,
    // @LINE:19
    Assets_1: controllers.Assets
  ) = this(errorHandler, PersonController_2, BookController_0, Assets_1, "/")

  import ReverseRouteContext.empty

  def withPrefix(prefix: String): Routes = {
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, PersonController_2, BookController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.PersonController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """person""", """controllers.PersonController.addPerson()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """persons""", """controllers.PersonController.getPersons()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """book""", """controllers.BookController.index"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """book""", """controllers.BookController.addBook()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """add-books""", """controllers.BookController.addBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """sadd-books""", """controllers.BookController.synAddBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """books""", """controllers.BookController.getBooks()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """delete-book""", """controllers.BookController.deleteBook(id:Long)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.at(path:String = "/public", file:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test_book""", """controllers.BookController.addBookWithTran()"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """test_books""", """controllers.BookController.getBooksWithTran()"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_PersonController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_PersonController_index0_invoker = createInvoker(
    PersonController_2.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "index",
      Nil,
      "GET",
      """ An example controller showing a sample home page""",
      this.prefix + """"""
    )
  )

  // @LINE:7
  private[this] lazy val controllers_PersonController_addPerson1_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("person")))
  )
  private[this] lazy val controllers_PersonController_addPerson1_invoker = createInvoker(
    PersonController_2.addPerson(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "addPerson",
      Nil,
      "POST",
      """""",
      this.prefix + """person"""
    )
  )

  // @LINE:8
  private[this] lazy val controllers_PersonController_getPersons2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("persons")))
  )
  private[this] lazy val controllers_PersonController_getPersons2_invoker = createInvoker(
    PersonController_2.getPersons(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.PersonController",
      "getPersons",
      Nil,
      "GET",
      """""",
      this.prefix + """persons"""
    )
  )

  // @LINE:10
  private[this] lazy val controllers_BookController_index3_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("book")))
  )
  private[this] lazy val controllers_BookController_index3_invoker = createInvoker(
    BookController_0.index,
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "index",
      Nil,
      "GET",
      """""",
      this.prefix + """book"""
    )
  )

  // @LINE:11
  private[this] lazy val controllers_BookController_addBook4_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("book")))
  )
  private[this] lazy val controllers_BookController_addBook4_invoker = createInvoker(
    BookController_0.addBook(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "addBook",
      Nil,
      "POST",
      """""",
      this.prefix + """book"""
    )
  )

  // @LINE:12
  private[this] lazy val controllers_BookController_addBooks5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("add-books")))
  )
  private[this] lazy val controllers_BookController_addBooks5_invoker = createInvoker(
    BookController_0.addBooks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "addBooks",
      Nil,
      "GET",
      """""",
      this.prefix + """add-books"""
    )
  )

  // @LINE:13
  private[this] lazy val controllers_BookController_synAddBooks6_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("sadd-books")))
  )
  private[this] lazy val controllers_BookController_synAddBooks6_invoker = createInvoker(
    BookController_0.synAddBooks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "synAddBooks",
      Nil,
      "GET",
      """""",
      this.prefix + """sadd-books"""
    )
  )

  // @LINE:14
  private[this] lazy val controllers_BookController_getBooks7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("books")))
  )
  private[this] lazy val controllers_BookController_getBooks7_invoker = createInvoker(
    BookController_0.getBooks(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "getBooks",
      Nil,
      "GET",
      """""",
      this.prefix + """books"""
    )
  )

  // @LINE:15
  private[this] lazy val controllers_BookController_deleteBook8_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("delete-book")))
  )
  private[this] lazy val controllers_BookController_deleteBook8_invoker = createInvoker(
    BookController_0.deleteBook(fakeValue[Long]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "deleteBook",
      Seq(classOf[Long]),
      "GET",
      """""",
      this.prefix + """delete-book"""
    )
  )

  // @LINE:19
  private[this] lazy val controllers_Assets_at9_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_at9_invoker = createInvoker(
    Assets_1.at(fakeValue[String], fakeValue[String]),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "at",
      Seq(classOf[String], classOf[String]),
      "GET",
      """ Map static resources from the /public folder to the /assets URL path""",
      this.prefix + """assets/""" + "$" + """file<.+>"""
    )
  )

  // @LINE:22
  private[this] lazy val controllers_BookController_addBookWithTran10_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test_book")))
  )
  private[this] lazy val controllers_BookController_addBookWithTran10_invoker = createInvoker(
    BookController_0.addBookWithTran(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "addBookWithTran",
      Nil,
      "GET",
      """ Test""",
      this.prefix + """test_book"""
    )
  )

  // @LINE:23
  private[this] lazy val controllers_BookController_getBooksWithTran11_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("test_books")))
  )
  private[this] lazy val controllers_BookController_getBooksWithTran11_invoker = createInvoker(
    BookController_0.getBooksWithTran(),
    HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.BookController",
      "getBooksWithTran",
      Nil,
      "GET",
      """""",
      this.prefix + """test_books"""
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_PersonController_index0_route(params) =>
      call { 
        controllers_PersonController_index0_invoker.call(PersonController_2.index)
      }
  
    // @LINE:7
    case controllers_PersonController_addPerson1_route(params) =>
      call { 
        controllers_PersonController_addPerson1_invoker.call(PersonController_2.addPerson())
      }
  
    // @LINE:8
    case controllers_PersonController_getPersons2_route(params) =>
      call { 
        controllers_PersonController_getPersons2_invoker.call(PersonController_2.getPersons())
      }
  
    // @LINE:10
    case controllers_BookController_index3_route(params) =>
      call { 
        controllers_BookController_index3_invoker.call(BookController_0.index)
      }
  
    // @LINE:11
    case controllers_BookController_addBook4_route(params) =>
      call { 
        controllers_BookController_addBook4_invoker.call(BookController_0.addBook())
      }
  
    // @LINE:12
    case controllers_BookController_addBooks5_route(params) =>
      call { 
        controllers_BookController_addBooks5_invoker.call(BookController_0.addBooks())
      }
  
    // @LINE:13
    case controllers_BookController_synAddBooks6_route(params) =>
      call { 
        controllers_BookController_synAddBooks6_invoker.call(BookController_0.synAddBooks())
      }
  
    // @LINE:14
    case controllers_BookController_getBooks7_route(params) =>
      call { 
        controllers_BookController_getBooks7_invoker.call(BookController_0.getBooks())
      }
  
    // @LINE:15
    case controllers_BookController_deleteBook8_route(params) =>
      call(params.fromQuery[Long]("id", None)) { (id) =>
        controllers_BookController_deleteBook8_invoker.call(BookController_0.deleteBook(id))
      }
  
    // @LINE:19
    case controllers_Assets_at9_route(params) =>
      call(Param[String]("path", Right("/public")), params.fromPath[String]("file", None)) { (path, file) =>
        controllers_Assets_at9_invoker.call(Assets_1.at(path, file))
      }
  
    // @LINE:22
    case controllers_BookController_addBookWithTran10_route(params) =>
      call { 
        controllers_BookController_addBookWithTran10_invoker.call(BookController_0.addBookWithTran())
      }
  
    // @LINE:23
    case controllers_BookController_getBooksWithTran11_route(params) =>
      call { 
        controllers_BookController_getBooksWithTran11_invoker.call(BookController_0.getBooksWithTran())
      }
  }
}
