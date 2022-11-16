package com.pramod.garage.reverse

object MainReverse {
  def main(args: Array[String]): Unit = {
    println(reverse1(List(5,4,3,2,1)))
  }

  //[1,2,3,4,5,6]
  //[6,5,4,3,2,1]
  def reverse(list: List[Int]): List[Int] = {
    list.sorted
  }

  def reverse1(list: List[Int]): List[Int] = {
    def sorted(number: Int, sortedList: List[Int]): List[Int] = {
        if(sortedList.isEmpty || sortedList.head >= number) {
          println(s"List is empty or head is bigger than number $number $sortedList")
          number :: sortedList
        } else {
          println(s"List is not empty, else condition $number $sortedList")
          sortedList.head :: sorted(number, sortedList.tail)
        }
    }

    if(list.isEmpty || list.tail.isEmpty) {
      println(s"reverse1 if condition $list")
      list
    } else {
      println(s"reverse1 else condition $list")
      sorted(list.head, reverse1(list.tail))
    }
  }
}
