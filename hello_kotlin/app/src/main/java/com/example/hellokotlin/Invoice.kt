package com.example.hellokotlin

import android.util.Log

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

    fun getState(): String {
        return "First name: ${buyersFirstName}\n"+
                "Last name: ${buyersLastName}\n+"+
                "Full name: ${buyersFullName}\n"+
                "Date: ${date}\n"+
                "Good: ${goodName}\n"+
                "Amount: ${amount}\n"+
                "Price per item: ${pricePerItem}\n"+
                "Total price: ${totalPrice.toString()}"
    }

    fun tax(taxRate:Double):Double {
        return taxRate * amount * pricePerItem
    }

    fun goodInfo():String {
        return "${amount.toString()} pieces of ${goodName}"
    }
}

class NextInvoice(val buyersFirstName:String, val buyersLastName: String, val date: String, val goodName: String,
              val amount: Int, val pricePerItem:Double)
{
    // Joined declaration and assignment
    val buyersFullName:String = buyersFirstName +" "+ buyersLastName
    val totalPrice:Double = amount * pricePerItem
}

fun main(args:Array<String>) {
    // Instantiation
    val firstInvoice = Invoice("Code","Lord","08/12/20","Wes",
        1000000,0.002)
    val secondInvoice = NextInvoice("Wizard","Topaz","08/12/20","Babe",
    1000000000,500.55)

    // Usage
    val state:String = firstInvoice.getState()
    val tax:Double = firstInvoice.tax(0.07)
    val info:String = firstInvoice.goodInfo()


    Log.d(TAG, "main: " +firstInvoice.buyersFullName)
    Log.d(TAG, "main: " +secondInvoice.buyersFullName+ " paid " +secondInvoice.totalPrice)
}


