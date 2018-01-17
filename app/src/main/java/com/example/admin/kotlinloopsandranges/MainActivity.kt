package com.example.admin.kotlinloopsandranges

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnPlayString.setOnClickListener {
            var items = listOf<Int>(1,2,3,4,5,6,7,8,9)
            //For loop
            for (index in items.indices)
                Log.d("For loop", "index: $index = ${items[index]}")

            for ((index, value) in items.withIndex())
                Log.e("###", "index: $index = $value")

            //While loop
            var x = 0
            while (x < 10){
                x++
                if (x%2==0)
                    Log.d("While Loop", "X = $x")
                else
                    continue
            }

            //Do-While loop
            var y = 0
            do {
                Log.d("Do-While Loop", "" + y)
                y++
            } while (y < 5)

            //------------------------------------------------------
            //Ranges
            for (i in 1..10) //equivalent of 1<= i && i<=10
                Log.d("Ranges ", "" + i)

            for (i in 4 downTo 1)
                Log.d("DownTo", "" + i)

            for (i in 5 downTo 1 step 2)
                Log.d("DownTo-Step", "" + i)

            for (i in 1 until 10) //[1,10) 10 is exclued
                Log.d("Until", "" + i)

            //-------------------------------------------------------
            //Collections
            val numbers = mutableListOf<Int>(1,2,3,4,5,6,7,8)

            numbers.add(10)
            for (i in numbers)
                Log.d("Numbers", i.toString())

            Log.d("FIRST ITEM", numbers.first().toString())
            Log.d("LAST ITEM", numbers.last().toString())
            Log.d("FILTER", numbers.filter { it%2!= 0 }.toString())


            val noDuplicate = hashSetOf<String>("a", "b", "c", "d")
            for (item in noDuplicate.toSortedSet())
                Log.d("Duplicate", item)

            val myHashMap = hashMapOf<String, Int>("First" to 5, "Second" to 20)
            Log.d("HashMap FIRST", myHashMap["First"].toString())
            Log.d("HashMap SECOND", myHashMap["Second"].toString())
        }
    }
}
