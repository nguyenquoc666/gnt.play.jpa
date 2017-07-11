
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/WorkSpace/GNT/Project/play-jpa/conf/routes
// @DATE:Wed Jul 12 06:12:44 ICT 2017


package router {
  object RoutesPrefix {
    private var _prefix: String = "/"
    def setPrefix(p: String): Unit = {
      _prefix = p
    }
    def prefix: String = _prefix
    val byNamePrefix: Function0[String] = { () => prefix }
  }
}
