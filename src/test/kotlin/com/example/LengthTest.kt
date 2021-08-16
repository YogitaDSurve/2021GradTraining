package com.example
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

class LengthTest : StringSpec({
    "should add two lengths in both meters" {
        Addition(5.0, Unit.Metre).add(
            Addition(5.0,Unit.Metre)
        ) shouldBe Addition(10.0,Unit.Metre)
    }

    "should add two lengths one in meter and another one in centimeter" {
    Addition(7.0, Unit.Metre).add(
        Addition(5.0, Unit.Centimetre)
    ) shouldBe Addition(7.05, Unit.Metre)
    }
    "should add two lengths one in centimeter and another one in meter" {
        Addition(7.0, Unit.Centimetre).add(
            Addition(5.0, Unit.Metre)
        ) shouldBe Addition(507.0, Unit.Centimetre)
    }

    "should add two lengths in both centimeters" {
        Addition(7.0, Unit.Centimetre).add(
            Addition(5.0, Unit.Centimetre)
        ) shouldBe Addition(12.0, Unit.Centimetre)
    }
    "should add two lengths one in millimeter and another one in meter" {
        Addition(7.0, Unit.Millimetre).add(
            Addition(5.0, Unit.Metre)
        ) shouldBe Addition(5007.0, Unit.Millimetre)
    }



})