package com.pramod.garage.overflow

object OverflowMain extends App {
  println(s"Integer max value is ${Integer.MAX_VALUE}")

  //Add 1
  val sum = Integer.MAX_VALUE + 1
  println(s"New value ${sum}")

  // Add 1
//  println(s"New value with Math package ${Math.addExact(Integer.MAX_VALUE, 1)}")
  val longValue: Long = Long.MaxValue
  println(s"New value for long ${longValue + 1}")

//  val bigValue = BigInt.
//  new BigInteger

  import java.math.BigInteger

   var largeValue = new BigInteger(Integer.MAX_VALUE + "")
  for (i <- 0 until 4) {
    System.out.println(s"New value is ${largeValue}")
    largeValue = largeValue.add(BigInteger.ONE)
  }

  var bigInt = BigInt(Integer.MAX_VALUE)
  for (i <- 0 until 4) {
    bigInt = bigInt+1
    println(s"New value is ${bigInt}" )
  }

}