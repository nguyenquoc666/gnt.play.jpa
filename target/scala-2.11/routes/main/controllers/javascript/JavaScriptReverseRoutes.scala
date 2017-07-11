
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/WorkSpace/GNT/Project/play-jpa/conf/routes
// @DATE:Tue Jul 11 21:06:04 ICT 2017

import play.api.routing.JavaScriptReverseRoute
import play.api.mvc.{ QueryStringBindable, PathBindable, Call, JavascriptLiteral }
import play.core.routing.{ HandlerDef, ReverseRouteContext, queryString, dynamicString }


import _root_.controllers.Assets.Asset
import _root_.play.libs.F

// @LINE:6
package controllers.javascript {
  import ReverseRouteContext.empty

  // @LINE:10
  class ReverseBookController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:13
    def synAddBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.synAddBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "sadd-books"})
        }
      """
    )
  
    // @LINE:11
    def addBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.addBook",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "book"})
        }
      """
    )
  
    // @LINE:14
    def getBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.getBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "books"})
        }
      """
    )
  
    // @LINE:12
    def addBooks: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.addBooks",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "add-books"})
        }
      """
    )
  
    // @LINE:15
    def deleteBook: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.deleteBook",
      """
        function(id0) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "delete-book" + _qS([(""" + implicitly[QueryStringBindable[Long]].javascriptUnbind + """)("id", id0)])})
        }
      """
    )
  
    // @LINE:10
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.BookController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "book"})
        }
      """
    )
  
  }

  // @LINE:6
  class ReversePersonController(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:8
    def getPersons: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.getPersons",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "persons"})
        }
      """
    )
  
    // @LINE:6
    def index: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.index",
      """
        function() {
          return _wA({method:"GET", url:"""" + _prefix + """"})
        }
      """
    )
  
    // @LINE:7
    def addPerson: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.PersonController.addPerson",
      """
        function() {
          return _wA({method:"POST", url:"""" + _prefix + { _defaultPrefix } + """" + "person"})
        }
      """
    )
  
  }

  // @LINE:19
  class ReverseAssets(_prefix: => String) {

    def _defaultPrefix: String = {
      if (_prefix.endsWith("/")) "" else "/"
    }

  
    // @LINE:19
    def at: JavaScriptReverseRoute = JavaScriptReverseRoute(
      "controllers.Assets.at",
      """
        function(file1) {
          return _wA({method:"GET", url:"""" + _prefix + { _defaultPrefix } + """" + "assets/" + (""" + implicitly[PathBindable[String]].javascriptUnbind + """)("file", file1)})
        }
      """
    )
  
  }


}
