package proto.grpc

import io.grpc.{Server, ServerBuilder}

import scala.concurrent.ExecutionContext
import com.example.protos.hello.GreeterGrpc
import com.typesafe.scalalogging.StrictLogging

object HelloWorldServer extends App {

  implicit val context = ExecutionContext.Implicits.global

  val server = new HelloWorldServer(port = 50052)
  server.start()


}

class HelloWorldServer(port: Int)(implicit executionContext: ExecutionContext) extends StrictLogging{
  private var server: Server = null

  private def start(): Unit = {
    server = ServerBuilder
      .forPort(port)
      .addService(GreeterGrpc.bindService(new ServerImpl, executionContext))
      .build
      .start

      logger.info("Hello Server => UP ")
    server.awaitTermination()
  }

  private def stop(): Unit = {
    if (server != null) {
      server.shutdown()
      logger.info("Hello Server => DOWN")
    }
  }
}
