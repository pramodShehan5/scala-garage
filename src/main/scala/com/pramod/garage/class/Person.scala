package com.pramod.garage.`class`

class Person (name: String, age: Int) {
  private var _nic = ""
  def this(name: String, age: Int, nic: String) = {
    this(name, age)
    _nic = nic
  }
}