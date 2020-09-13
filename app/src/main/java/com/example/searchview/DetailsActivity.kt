package com.example.searchview
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.searchview.R
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        detail_country_text.text = intent.extras!!.getString("passselectedcountry")!!

    }
}
