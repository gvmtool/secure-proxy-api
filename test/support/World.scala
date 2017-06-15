package support

import scala.collection.mutable

object World {

  val SERVICE_UP_HOST = "wiremock"
  val SERVICE_UP_PORT = 8080

  val statusCodes = Map(
    "CREATED" -> 201,
    "BAD_REQUEST" -> 400,
    "FORBIDDEN" -> 403,
    "NOT_FOUND" -> 404,
    "CONFLICT" -> 409,
    "INTERNAL_SERVER_ERROR" -> 500,
    "BAD_GATEWAY" -> 502)

  var adminToken: String = "invalid"

  var issuedToken = "invalid"

  val headers = mutable.Map[String, String]()

  var responseCode = 0

  var responseBody = "invalid"
}
