package com.knoldus

class Person(val name: String, val age: Int) extends Ordered[Person] {
  def compare(that: Person): Int = {
    if (this.name.equals(that.name)) {
      this.age - that.age
    } else {
      this.name.length - that.name.length
    }
  }
}

object Person extends App {

  print("Enter name of first person : ")
  val firstPersonName: String = scala.io.StdIn.readLine()
  print("Enter age of first person : ")
  val firstPersonAge: Int = scala.io.StdIn.readInt()
  val firstPerson = new Person(firstPersonName, firstPersonAge)

  print("Enter name of second person : ")
  val secondPersonName: String = scala.io.StdIn.readLine()
  print("Enter age of second  person : ")
  val secondPersonAge: Int = scala.io.StdIn.readInt()
  val secondPerson = new Person(secondPersonName, secondPersonAge)

  val res1 = firstPerson < secondPerson
  val res2 = firstPerson > secondPerson
  print(s"firstPerson < secondPerson : $res1 \nfirstPerson > secondPerson : $res2")
}