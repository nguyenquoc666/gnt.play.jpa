
// @GENERATOR:play-routes-compiler
// @SOURCE:D:/WorkSpace/GNT/Project/play-jpa/conf/routes
// @DATE:Wed Jul 12 06:12:44 ICT 2017

package controllers;

import router.RoutesPrefix;

public class routes {
  
  public static final controllers.ReverseBookController BookController = new controllers.ReverseBookController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReversePersonController PersonController = new controllers.ReversePersonController(RoutesPrefix.byNamePrefix());
  public static final controllers.ReverseAssets Assets = new controllers.ReverseAssets(RoutesPrefix.byNamePrefix());

  public static class javascript {
    
    public static final controllers.javascript.ReverseBookController BookController = new controllers.javascript.ReverseBookController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReversePersonController PersonController = new controllers.javascript.ReversePersonController(RoutesPrefix.byNamePrefix());
    public static final controllers.javascript.ReverseAssets Assets = new controllers.javascript.ReverseAssets(RoutesPrefix.byNamePrefix());
  }

}
