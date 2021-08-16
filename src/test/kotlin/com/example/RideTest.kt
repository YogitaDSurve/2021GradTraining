package com.example
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class RideTest : StringSpec({
    "calculate total fare for one ride for given distance"{
        val total = Ride(10.0,0.0,Standard()).fare()
        total shouldBe (105.00)
    }

    "calculate total fare for one ride for given distance and duration"{
        val total = Ride(10.0,7.0,Premium()).fare()
        total shouldBe (169.00)
    }

})