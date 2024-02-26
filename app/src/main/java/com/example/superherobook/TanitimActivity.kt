package com.example.superherobook

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.superherobook.databinding.ActivityTanitimBinding

class TanitimActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTanitimBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTanitimBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val intent = intent
        val secilenKahramanIsmi =intent.getStringExtra("superKahramanIsmi")
        binding.textView.text =secilenKahramanIsmi

        val secilenKahramanGorseli =intent.getIntExtra("superKahramanGorseli",0)
        val bitmap = BitmapFactory.decodeResource(applicationContext.resources,secilenKahramanGorseli)
        binding.imageView.setImageBitmap(bitmap)






        /*
        val secilenKahraman = SingletonClass.SecilenKahraman
        val secilenGorsel = secilenKahraman.gorsel
        binding.imageView.setImageBitmap(secilenGorsel)

         */


    }
}