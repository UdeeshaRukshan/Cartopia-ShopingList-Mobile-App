package hu.ait.shoppinglist

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.daimajia.androidanimations.library.Techniques
import com.daimajia.androidanimations.library.YoYo

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()

        val startScrollingActivity = Runnable {
            val intentScrolling = Intent(this, ScrollingActivity::class.java)
            startActivity(intentScrolling)
            finish() // Finish the current activity if you don't want to return to it
        }

        // Delay for 2 seconds and then post the Runnable to start the ScrollingActivity
        val handler = Handler(Looper.getMainLooper())
        handler.postDelayed(startScrollingActivity, 2000)
    }
}