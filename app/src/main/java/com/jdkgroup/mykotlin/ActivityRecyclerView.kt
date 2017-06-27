package com.jdkgroup.mykotlin

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout
import com.jdkgroup.mykotlin.model.ModelUser

class ActivityRecyclerView : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recyclerview)

        val recyclerView = findViewById(R.id.recyclerView) as RecyclerView
        recyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

        //CREATING LIST
        val users = ArrayList<ModelUser>()

        //adding some dummy data to the list
        users.add(ModelUser("JK Lakhani", "Kamlesh Lakhani"))
        users.add(ModelUser("JDK Lakhani", "Kamlesh Lakhani"))
        users.add(ModelUser("Kamlesh Lakhani", "Kamlesh Lakhani"))
        users.add(ModelUser("Kamlesh Lakhani", "Kamlesh Lakhani"))

        //CREATING ADAPTER
        val adapter = AdapterRecyclerView(users)

        //NOW ADDING THE ADAPTER TO RECYCLERVIEW
        recyclerView.adapter = adapter
    }
}
