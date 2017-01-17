package com.knoldus.Assignment3
{
  trait Queue{
    def enqueue(myQueue:List[Int],element: Int):List[Int]              
    def dequeue(myQueue:List[Int]):List[Int] = myQueue.tail             //concrete function
  }

  class DoubleQueue extends Queue {                                    //DoubleQueue -> enqueues the doubled element 
   override def enqueue(myQueue:List[Int],element: Int):List[Int] = myQueue:+(2*element)
  }

  class SquareQueue extends Queue {                                    //SquareQueue -> enqueues the square element
  override def enqueue(myQueue:List[Int],element: Int) = myQueue:+(element*element)
  
  }

  object QueueOperation {

   def main(args: Array[String]) {

    val mydequeue = new DoubleQueue()
    var myList = List[Int]()
        println("==========DOUBLE QUEUE=================")  
    myList = mydequeue.enqueue(myList,5)
    println(myList)
    myList = mydequeue.enqueue(myList,95)
    println(myList)
    myList = mydequeue.enqueue(myList,59)
    println(myList)
    myList = mydequeue.dequeue(myList)
    println(myList)

    println("==========SQUARE QUEUE=================")
    val mySqueue = new SquareQueue()
    var myList2 = List[Int]()
    myList2 = mySqueue.enqueue(myList2,2)
    println(myList2)
    myList2 = mySqueue.enqueue(myList2,6)
    println(myList2)
    myList2 = mySqueue.enqueue(myList2,9)
    println(myList2)
    myList2 = mySqueue.dequeue(myList2)
    println(myList2)
   }

 }
}
