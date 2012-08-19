package com.kissaki

import org.specs2.mutable._
import org.specs2.runner.JUnitRunner
import org.junit.runner.RunWith
 
@RunWith(classOf[JUnitRunner])
class SampleTests extends Specification {
	
	"Some test for my specs2 understand" should {
		"same-check between List & Seq" in {
			val a = List("A","B")
			val b = Seq("A","B")
			
			 a != b must beTrue
		}
	}
	
	
}