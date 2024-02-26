package com.example.superherobook

import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.superherobook.databinding.ActivityMainBinding
import java.lang.reflect.Array

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        // Veri hazırlığı

        var superKahramanIsimleri = ArrayList<String>()
        superKahramanIsimleri.add("Superman")
        superKahramanIsimleri.add("Iron Man")
        superKahramanIsimleri.add("Aquaman")
        superKahramanIsimleri.add("Spiderman")


        // verimsiz tanımlamalar
        /*
        val batmanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.batman)
        val supermanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.superman)
        val ironmanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.ironman)
        val aquamanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.aquaman)
        val spidermanBitmap =
            BitmapFactory.decodeResource(applicationContext.resources, R.drawable.spiderman)

        var superKahramanGorselleri = ArrayList<Bitmap>()
        superKahramanGorselleri.add(batmanBitmap)
        superKahramanGorselleri.add(supermanBitmap)
        superKahramanGorselleri.add(ironmanBitmap)
        superKahramanGorselleri.add(aquamanBitmap)
        superKahramanGorselleri.add(spidermanBitmap)


*/

        // verimli tanımlamalar

        val supermanDrawableId = R.drawable.superman
        val ironmanDrawableId = R.drawable.ironman
        val aquamanDrawableId = R.drawable.aquaman
        val spidermanDrawableId = R.drawable.spiderman

        var superKahramanDrawableListesi =ArrayList<Int>()
        superKahramanDrawableListesi.add(supermanDrawableId)
        superKahramanDrawableListesi.add(ironmanDrawableId)
        superKahramanDrawableListesi.add(aquamanDrawableId)
        superKahramanDrawableListesi.add(spidermanDrawableId)




        val layoutManager = LinearLayoutManager(this)
        binding.recyclerView.layoutManager =layoutManager

        val adapter = RecyclerAdapter(superKahramanIsimleri, superKahramanDrawableListesi)

        binding.recyclerView.adapter= adapter

    }
}