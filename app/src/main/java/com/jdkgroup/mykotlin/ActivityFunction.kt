package com.jdkgroup.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

class ActivityFunction : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        System.out.println("Tag" + multiplication(2))
        sum(2,2)

        val listItem : List<String> = mutableListOf("1", "2", "3")
        listItem(listItem)
    }

    fun multiplication(x: Int): Int {
        return 2*x
    }

    fun sum(a: Int, b: Int) {
        System.out.println("Tag" + (a+b))
    }

    fun listItem(args : List<String>) {
        //TODO for loop
        for(str in args) {
            System.out.println("Tag" + str)
        }

        //TODO iterating
        for((index, element) in args.withIndex()) {
            System.out.println("Tag" + "$element at index $index")
        }

        //TODO for each
        args.forEach {
            System.out.println("Tag" + it.toString())
        }
    }
}
