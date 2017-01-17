package com.knoldus.Assignment3
class Person(val name: String, val age: Int) extends Ordered[Person] {

def compare(that: Person)= {
	if(this.name==that.name)                                   // Comparing names 
          this.age - that.age                                        //Now Compare the ages as names are equal
	else   
 	  this.name.length - that.name.length                        // If names are not equal compare the lenght of names 
   }
 }

 object Person {
  def main(args:Array[String]) {
   val person1 = new Person("Raman",23)
   val person2 = new Person("Raman",27)
   val result = person1 < person2
   println(result)

   val person3 = new Person("Simarpreet",23)
   val result2 = person1 > person3
   println(result2)
  }

}

