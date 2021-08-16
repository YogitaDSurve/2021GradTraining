package com.example

import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe
import kotlin.Unit

class WeightTest: StringSpec({
    "should add two weights one in kilogram and another one in gram" {
        Weight(7.0, WeightUnit.Kilogram).add1(
            Weight(500.0, WeightUnit.Gram)
        ) shouldBe Weight(7.5, WeightUnit.Kilogram)
    }
    "should add two weights both in gram" {
        Weight(70.0, WeightUnit.Gram).add1(
            Weight(500.0, WeightUnit.Gram)
        ) shouldBe Weight(570.0, WeightUnit.Gram)
    }

    "should add two weights both in Kilogram" {
        Weight(70.0, WeightUnit.Kilogram).add1(
            Weight(50.0, WeightUnit.Kilogram)
        ) shouldBe Weight(120.0, WeightUnit.Kilogram)
    }

    "should add two weights one in pound and another one in gram" {
        Weight(7.0, WeightUnit.Pound).add1(
            Weight(453.592, WeightUnit.Gram)
        ) shouldBe Weight(8.0, WeightUnit.Pound)
    }


})