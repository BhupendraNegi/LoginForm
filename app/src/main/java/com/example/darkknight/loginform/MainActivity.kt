package com.example.darkknight.loginform

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val tv = findViewById<TextView>(R.id.tv)
        val Str = getIntent().getStringExtra("name")


        val Delhi = "Tim, Munyon, Tim@example.com, 702213321, Delhi \n" +
                "Ram, Singh, ram@example.com, 102213321, Delhi \n" +
                "Tina, Mehra, tina@example.com, 102213323, Delhi\n" +
                "Manoj, Mehra, manoj@example.com, 102213323, Delhi\n" +
                "Deepak, Ahuja, deepak@example.com, 102213323, Delhi\n"

        val Gurgaon = "Ketan, Das, ketan@example.com, 102213323, Gurgaon\n" +
                "Sachin, Maurya, sachin@example.com, 102213323, Gurgaon\n" +
                "Sunil, Singh, sunil@example.com, 102213323, Gurgaon\n" +
                "Vinnet, Singh, vineet@example.com, 102213323, Gurgaon\n" +
                "Akansha, Rawat, aks@example.com, 102213323, Gurgaon\n"

        val Jaipur = "Shivraj, Chauhan, shiv@example.com, 102213323, Jaipur\n" +
                "Mohit, Tyagi, mohit@example.com, 102213323, Jaipur\n" +
                "Vicky, Jindal, vicky@example.com, 102213323, Jaipur\n" +
                "Naveen, Aggarwal, naveen@example.com, 102213323, Jaipur\n" +
                "Lalit, Tariyal, lalit@example.com, 102213323, Jaipur\n"

        val Kota = "Shivraj, Chauhan, shiv@example.com, 102213323, Jaipur\n" +
                "Mohit, Tyagi, mohit@example.com, 102213323, Jaipur\n" +
                "Vicky, Jindal, vicky@example.com, 102213323, Jaipur\n" +
                "Naveen, Aggarwal, naveen@example.com, 102213323, Jaipur\n" +
                "Lalit, Tariyal, lalit@example.com, 102213323, Jaipur\n"

        val data = arrayListOf<String>(Delhi, Gurgaon, Jaipur, Kota)

        if (Str == "Manager"){
            tv.setText(Delhi+ " /n" + Gurgaon)
        }
        if (Str == ""){
            tv.setText(Delhi+ " /n" + Gurgaon +" /n" + Jaipur+" /n" + Kota)
        }
        if (Str == "Supervisor1"){
            tv.setText(Jaipur+" /n" + Kota)
        }
        if (Str == "Supervisor2"){
            tv.setText(Delhi+ " /n" + Gurgaon +" /n" + Jaipur+" /n" + Kota)
        }
        if (Str == "Employee1"){
            tv.setText(Delhi)
        }






    }
}
