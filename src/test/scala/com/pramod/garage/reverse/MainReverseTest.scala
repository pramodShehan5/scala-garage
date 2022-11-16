package com.pramod.garage.reverse

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.must.Matchers.be
import org.scalatest.matchers.should.Matchers.convertToAnyShouldWrapper

class MainReverseTest extends AnyFlatSpec {
  "An empty List" should "have size 0" in {
//    assert(List.empty.size == 0)
    MainReverse.reverse1(List(1,2,3,4)) should be(List(1,2,3,4))
  }

  it should "throw an IndexOutOfBoundsException when trying to access any element" in {
    val emptyList = List();
    assertThrows[IndexOutOfBoundsException] {
      emptyList(1)
    }
  }
}
