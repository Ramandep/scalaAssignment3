package com.knoldus.Assignment3
class FirstName(val fname: String) extends AnyVal {                       // Value Class FirstName
 override def toString()=fname
}

class LastName(val lname: String) extends AnyVal {                        // Value Class LastName
  override def toString()=lname
}

class Age(val age: Int) extends AnyVal {                                  // Value Class Age
  override def toString()=age +""
}


object ValueClass {

  def displayDetails(fname: FirstName, lname: LastName, age: Age)= {
   println(s"$fname $lname is of $age age")

  }

  def main(args:Array[String]) {
    val fname=new FirstName("Prashant")
    val lname=new LastName("Goel")
    val age=new Age(24)
    displayDetails(fname,lname,age)
  }

}

