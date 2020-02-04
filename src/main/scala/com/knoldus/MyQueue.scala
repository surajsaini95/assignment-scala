package com.knoldus

trait Queue {
  def enqueue(list: List[Int], input: Int): List[Int]

  def dequeue(list: List[Int]): List[Int] = {
    list.tail
  }
}

class DoubleQueue extends Queue {
  override def enqueue(list: List[Int], element: Int): List[Int] = {
    List.concat(list, List(element * 2))
  }
}

class SquareQueue extends Queue {
  override def enqueue(list: List[Int], element: Int): List[Int] = {
    List.concat(list, List(element * element))
  }
}

class MyQueue {

}

object MyQueue extends App {

  val doubleElement = new DoubleQueue
  val squareElement = new SquareQueue

  val list: List[Int] = List(1, 2, 3)

  print("Your list is initialized with elements 1,2,3 ")
  print("\n\nEnter new element to double it while insertion : ")
  val element1: Int = scala.io.StdIn.readInt

  val resultantList1 = doubleElement.enqueue(list, element1)
  print(s"\nElement doubled and enqueue applied.\nList is : ")
  resultantList1.foreach((element: Int) => print(element + " "))

  val resultantList2 = doubleElement.dequeue(resultantList1)
  print(s"\nElement dequeue applied.\nList is : ")
  resultantList2.foreach((element: Int) => print(element + " "))


  print("\nEnter new element to square it while insertion : ")
  val element2: Int = scala.io.StdIn.readInt

  val resultantList3 = squareElement.enqueue(resultantList2, element2)
  print(s"\nElement squared and enqueue applied.\nList is : ")
  resultantList3.foreach((element: Int) => print(element + " "))

  val resultantList4 = doubleElement.dequeue(resultantList3)
  print(s"\nElement dequeue applied.\nList is :.")
  resultantList4.foreach((element: Int) => print(element + " "))

}
