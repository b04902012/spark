import org.apache.spark.SparkContext
import org.apache.spark.SparkContext._
object HelloWorld {
  def main(args: Array[String]): Unit = {
    val sc=new SparkContext()
    println("Hello, world!")
  }
}
