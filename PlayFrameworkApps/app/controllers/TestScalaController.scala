package controllers

import play.api.libs.json._
import play.api.libs.functional.syntax._
import play.api.mvc.Action
import play.api.mvc.Controller

object TestScalaController extends Controller {

  def returnJson = Action {
    Ok(Json.toJson("{message: 'Hello world'}"))
  }

  //    Action{Ok("Hello Scala World")}

}