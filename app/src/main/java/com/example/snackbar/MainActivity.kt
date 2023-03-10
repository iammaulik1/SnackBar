package com.example.snackbar

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.constraintlayout.widget.ConstraintLayout
import com.google.android.material.snackbar.Snackbar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var showSnackBar = findViewById<Button>(R.id.buttonShowSnackBar)
        var myLayout = findViewById<ConstraintLayout>(R.id.myLayout)

        showSnackBar.setOnClickListener {
            Snackbar.make(myLayout,"This is snackbar Message",Snackbar.LENGTH_INDEFINITE).setAction("Close",
                View.OnClickListener {  }).show()
        }
    }
}