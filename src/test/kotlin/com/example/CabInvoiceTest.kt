package com.example
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class CabInvoiceTest : StringSpec({
    val rides=listOf(Ride(10.0,7.0, Standard()),Ride(3.0,10.0,Premium()))
    val invoice=CabInvoice(rides)

    "generate total fare for both rides"{
         invoice.totalFare() shouldBe (182.0)

    }
    "Calculate the number of rides"{
        invoice.numberOfRides() shouldBe (2)
    }
    "Calculate the average fare per ride"{
        invoice.averageFarePerRide() shouldBe (91.0)
    }


    })