package com.example.drum

import android.media.AudioAttributes
import android.media.SoundPool
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.annotation.RequiresApi
import java.util.*

class MainActivity : AppCompatActivity() {

    private lateinit var mSoundPool: SoundPool
    private lateinit var mSoundID:Array<Int?>
    private val mSoundResorce = arrayOf(
        R.raw.cymbal1,
        R.raw.cymbal2,
        R.raw.cymbal3,
        R.raw.tom1,
        R.raw.tom2,
        R.raw.tom3,
        R.raw.hihat,
        R.raw.snare,
        R.raw.bass
    )
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onResume() {
        super.onResume()

        val audioAttributes = AudioAttributes.Builder()
            .setUsage(AudioAttributes.USAGE_MEDIA)
            .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
            .build()

        mSoundPool=SoundPool.Builder()
            .setAudioAttributes(audioAttributes)
            .setMaxStreams(mSoundResorce.size)
            .build()

        mSoundID= arrayOfNulls(mSoundResorce.size)

        for(i in 0 .. (mSoundResorce.size-1)){
            mSoundID[i]=mSoundPool.load(applicationContext,mSoundResorce[i],0)
        }
    }

    override fun onDestroy() {
        super.onDestroy()
        mSoundPool.release()
    }
    fun cymbal1(view: View){
        if (mSoundID[0]!=0){
            mSoundPool.play(mSoundID[0] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun cymbal2(view: View){
        if (mSoundID[1]!=0){
            mSoundPool.play(mSoundID[1] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun cymbal3(view: View){
        if (mSoundID[2]!=0){
            mSoundPool.play(mSoundID[2] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun tom1(view: View){
        if (mSoundID[3]!=0){
            mSoundPool.play(mSoundID[3] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun tom2(view: View){
        if (mSoundID[4]!=0){
            mSoundPool.play(mSoundID[4] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun tom3(view: View){
        if (mSoundID[5]!=0){
            mSoundPool.play(mSoundID[5] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun hihat(view: View){
        if (mSoundID[6]!=0){
            mSoundPool.play(mSoundID[6] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun snare(view: View){
        if (mSoundID[7]!=0){
            mSoundPool.play(mSoundID[7] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
    fun bass(view: View){
        if (mSoundID[8]!=0){
            mSoundPool.play(mSoundID[8] as Int, 1.0F,1.0F, 0, 0, 1.0F)
        }
    }
}