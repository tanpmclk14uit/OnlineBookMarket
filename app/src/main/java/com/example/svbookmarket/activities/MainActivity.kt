package com.example.svbookmarket.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.svbookmarket.R

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // set activity to display here
        setContentView(R.layout.activity_cart   )

        //tam thoi de funtion nay o day
//        card.setOnClickListener{
//            card.setChecked(!card.isChecked)
//            true
//        }
//

//        val myDataset =DataSource().loadCheckoutCard()
//        val recyclerView  = findViewById<RecyclerView>(R.id.rc_checkout)
//        recyclerView.adapter = CheckoutAdapter(this,myDataset)
//        recyclerView.setHasFixedSize(true)
    }
}
