package simon.codes.eventhandlerprogramkotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible
import java.util.*
import kotlin.concurrent.schedule

class MainActivity : AppCompatActivity() {
    open var count: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val butt = findViewById<Button>(R.id.butt)
        val counter = findViewById<TextView>(R.id.counter)
        val text = findViewById<TextView>(R.id.text)
        butt.setOnClickListener {
            count++
            counter.text = count.toString()
            when (count) {
                in 1..10 -> text.text = "Wow.. thank you for trying"
                in 20..50 -> text.text = "ugh mmorre taps senpai JK"
                in 100..150 -> text.text = "are you waiting for any response from me? tap more"
                in 150..180 -> text.text = "unfortunately.. there will be no more update from me"
                in 180..200 -> text.text = "no seriously, there's no surprise what so ever even if you reach a thousand"
                in 200..230 -> text.text = "so you really pushed... i mean tapped this far?"
                in 230..240 -> text.text = "-_-, seriously..."
                in 240..270 -> text.text = "even if you look into the source code there will be nothing in the end of this"
                in 270..290 -> text.text = "in fact. there won't be an end, just your boredom"
                in 290..1280 -> text.text = "you know what..? for your boredom, I will help you. hmmm"
                in 1280..1281 -> count += 2316
                in 2606..2620 -> text.text = "How does it feel to reach this far? feels good?"
                in 2620..2635 -> count += 2316
                in 4936..3945 -> text.text = "i'm done... please stop. I don't have any idea why keep tapping up to this point"
                in 3945..3955 -> text.text = "You're literally in 7000s. You must be sick!"
                in 3955..3970 -> text.text = "Oh come on. f**c i'm running out of words to say. come on! stop now!"
                in 3970..7515 -> {
                    count = 7513
                    text.text = "I have to stop you for good! Whatever taps you do won't count!"
                }
                in 9999..10100 -> {
                    text.text = "Enough of this, I'll reset the counter and disable the button for good. BYYEEE"
                    Timer().schedule(500) {
                        count = 0
                    }
                    Timer().schedule(1500) {
                        butt.visibility = View.INVISIBLE
                    }
                }

            }

        }
        butt.setOnLongClickListener {
            if (count >= 7513){
                text.text = "AHA! so you figured it out. Yeah! the button also listens to press and holds"
                count = 9999
                true
            }else{
                false
            }
        }
    }

}