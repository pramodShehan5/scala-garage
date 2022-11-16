package com.pramod.garage.factorial

object MainFactorial {
  def main(args: Array[String]): Unit = {
    println(factorial1(4))
  }

  // N! = N*(N-1)*(N-2)!
  def factorial(number: Int): Int = {
    var total = 1
    for(i <- 1 to number) {
      total = total * i
    }
    total
  }

  def factorial1(n: Int): Int = {
    n match {
      case 0 => 1
      case num => num * factorial(num-1)
    }
  }
}
