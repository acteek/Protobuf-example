package proto.grpc.client

import com.example.protos.hello._
import io.grpc.ManagedChannelBuilder

import scala.concurrent.duration.Duration
import scala.concurrent.{Await, ExecutionContext, Future}
import scala.util.{Failure, Random, Success}
import com.typesafe.scalalogging.StrictLogging
import proto.grpc.json

object Client extends App with StrictLogging {
  implicit val context = ExecutionContext.Implicits.global


  val host = "localhost"
  val port = 50052

  val channel = ManagedChannelBuilder
    .forAddress(host, port)
    .usePlaintext(true)
    .build

  val request = Request()
    .withId(Random.nextInt())
    .withBye(ByeRequest(name = "Bob"))


  //Blocking call
  // val blockingStub = GreeterGrpc.blockingStub(channel)
  //  val reply: HelloResponse = blockingStub.sayHello(request)
  //    println(s"Receive response blocking $reply")

  //Async call
  val stub = GreeterGrpc.stub(channel)

  val f = stub.sayHello(request)
  //
  val response = Await.result(f, Duration.Inf)
  logger.info(s"Receive response async {}", response)

  //    f.onSuccess{
  //      case response =>
  //        logger.info(s"Receive response async  ${response.message}")
  //    }2

  //
  //  f.onFailure{
  //    case e => throw e
  //  }
  //
  //  Await.ready(f,Duration.Inf)


}
