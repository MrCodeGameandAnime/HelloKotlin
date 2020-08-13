package com.example.hellokotlin

import android.util.Log
import java.util.*

const val TAG:String = "INV"
class Invoice(val buyersFirstName:String, val buyersLastName: String, val date: String, val goodName: String,
val amount: Int, val pricePerItem:Double)
{
    val buyersFullName:String
    val totalPrice:Double
    init {
        buyersFullName = buyersFirstName +" "+ buyersLastName
        totalPrice = amount * pricePerItem
    }
}

class NextInvoice(val buyersFirstName:String, val buyersLastName: String, val date: String, val goodName: String,
              val amount: Int, val pricePerItem:Double)
{
    val buyersFullName:String = buyersFirstName +" "+ buyersLastName
    val totalPrice:Double = amount * pricePerItem
}

fun main(args:Array<String>) {
    val firstInvoice = Invoice("Code","Lord","08/12/20","Wes",
        1000000,0.002)
    val secondInvoice = NextInvoice("Wizard","Topaz","08/12/20","Babe",
    1000000000,500.55)
    Log.d(TAG, "main: ")
}


