package com.thirdship.util

import org.scalatest.{Matchers, FlatSpec}

import scala.util.Random

class NameGeneratorTest extends FlatSpec with Matchers {

	"The NameGenerator" should "create names" in {
		NameGenerator() should not equal NameGenerator()
	}

	it should "use a given random" in {
		val rand = new Random(1000)
		List("distracted_kowalevski", "determined_kilby", "serene_liskov", "cocky_liskov", "reverent_morse")
			.foreach(s => NameGenerator(rand) should equal(s))
	}

	it should "generate results that span the lists" in {

		NameGenerator(6579) should equal("admiring_albattani")
		NameGenerator(321) should equal("trusting_albattani")
		NameGenerator(5435) should equal("trusting_yonath")
		NameGenerator(13026) should equal("admiring_yonath")
	}

	it should "not generate boring_wozniak" in {
		0.to(100000).exists(n => NameGenerator(n).equals("boring_wozniak")) should equal(false)
	}

}