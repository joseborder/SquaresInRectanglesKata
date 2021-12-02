object SqInRect{
  def sqInRect(min: Int, max:Int):Array[Int] = {
    val arr : Array[Int] = Array()
    if(min == max) return arr
    if(min > max){
      val newMin = max
      val newMax = min
      return foo(newMin,newMax,arr)
    }

    def foo(min:Int, max:Int, arr:Array[Int]):Array[Int] = {
      if(max == 0 || min == 0) return arr
      if(max == min) arr :+ min

      foo(getMin(min,max-min),getMax(min,max-min),arr:+getMin(min,max))
    }

    def getMax(a: Int, b: Int):Int={
      if(a>b){
        a
      }else{
        b
      }
    }
    def getMin(a: Int, b: Int):Int={
      if(a<b){
        a
      }else{
        b
      }
    }
    foo(min,max,arr)
  }
  def main(args: Array[String]): Unit = {
    var a :Array[Int] = sqInRect(5,3)
    print("alo")
  }

}
