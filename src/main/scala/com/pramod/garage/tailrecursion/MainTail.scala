package com.pramod.garage.tailrecursion

import scala.annotation.tailrec

object MainTail extends App {
  def recursiveLength(list: List[String]): Long = list match {
    case Nil => 0
    case head :: tail => 1 + recursiveLength(tail)
  }
  var list = scala.collection.mutable.ListBuffer[String]()
  for(i <- 0 to 20) {
    list += i.toString
  }
//  recursiveLength(list.toList)
  println(list.toList)
  println(reverseTail(list.toList))

//  def recursiveTailLength(list: List[String], n: Int): Long = list match {
//    case Nil =>
//    case head :: tail => recursiveTailLength(tail, )
//  }

  def reverseTail[A](inputList: List[A]): List[A] = {
    @tailrec
    def reverse(reversedList: List[A], remainingList: List[A]): List[A] = remainingList match {
      case Nil => reversedList
      case head :: tail => reverse(head :: reversedList, tail)
    }
    reverse(Nil, inputList)
  }

//  def reverse[A](inputList: List[A]): List[A] = inputList match {
//    case head :: tail => reverse(tail) ::: List(head)
//    case Nil => Nil
//  }
}
