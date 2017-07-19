package proto.grpc

import scala.concurrent.Future
import com.example.protos.hello.GreeterGrpc.Greeter
import com.example.protos.hello._
import com.typesafe.scalalogging.StrictLogging
import Request.Body._


class ServerImpl extends Greeter with StrictLogging {

  def sayHello(request: Request): Future[Response] = {
    logger.info("Receive request {}", request)

    request.body match {
      case Hello(hello) =>
        Future.successful{
          Response()
            .withId(request.id)
            .withHello(HelloResponse(hello.name))
        }
      case Bye(by) =>
        Future.successful{
          Response()
            .withId(request.id)
            .withBye(ByeRequest(by.name))
        }
      case Empty =>
        Future.failed{
          new NoSuchElementException("Request body is Empty")
        }
    }
  }
}
