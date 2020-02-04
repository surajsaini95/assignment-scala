package com.knoldus

class FirstName(val firstName: String) extends AnyVal {
  override def toString: String = firstName
}

class LastName(val lastName: String) extends AnyVal {
  override def toString: String = lastName
}

class Age(val age: Int) extends AnyVal {
  override def toString: String = age.toString
}

class PersonDetails {
 def displayDetails(firstName: FirstName, lastName: LastName, age: Age): String = {
    s"$firstName $lastName is of $age years."
  }
}

object PersonDetails extends App {
  print("Enter first name : ")
  val fName: String = scala.io.StdIn.readLine()
  val firstName = new FirstName(fName)

  print("Enter last name : ")
  val lName: String = scala.io.StdIn.readLine()
  val lastName = new LastName(lName)

  print("Enter age : ")
  val age: Int = scala.io.StdIn.readInt
  val personAge = new Age(age)

  val personDetails = new PersonDetails
  val details = personDetails.displayDetails(firstName, lastName, personAge)
  print(details)
}
