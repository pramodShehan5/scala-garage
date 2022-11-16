package com.pramod.garage.fibonachi

object FibMain extends App {
  def fibTR(num: Int): Int = {
      def fib(n: Int, acc1: Int, acc2: Int): Int = {
        n match {
          case 0 => acc1
          case 1 =>acc2
          case _ => fib(n-1 , acc2, acc1 + acc2)
        }
      }
    fib(num, 0, 1)
  }

  (0 to 10).foreach(n => print(fibTR(n) + " "))

}
// fib(4, 0, 1)
// fib(3, 0, 1)
