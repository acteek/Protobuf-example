package proto

import com.trueaccord.scalapb.GeneratedMessage
import com.trueaccord.scalapb.json.JsonFormat


package object grpc {


  def json[A <: GeneratedMessage](m: A): String = JsonFormat.toJsonString(m)
}
