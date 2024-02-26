package com.example.superherobook

import android.content.Intent
import android.graphics.Bitmap
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.superherobook.databinding.RecyclerRowBinding

class RecyclerAdapter(
    val kahramanListesi: ArrayList<String>,
    val kahramanGorselleri: ArrayList<Int>
) : RecyclerView.Adapter<RecyclerAdapter.SuperKahramanVH>() {                                 // SuperKahramanVH diye bir sınıf tanımlıyoruz(view holder)

    class SuperKahramanVH(var itemBinding: RecyclerRowBinding) :
        RecyclerView.ViewHolder(itemBinding.root) {                                                                     // görünüm tutucu bir sınıf olduğunu belirtmemiz lazım

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SuperKahramanVH {
        // inflater, Layourinflater, Manuinflater -> alıp burda göstericez inflate edicez -> her zxaman xml i kullanırken inflate kullanmamız gerektiğini düşüncez
        // burda oluşturduğumuz itemview daha önce oluşturduğumuz recycler orw ile birbirine bağlamamıza yardımcı olacak

        val binding = RecyclerRowBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return SuperKahramanVH(binding)
    }

    override fun getItemCount(): Int {
        return kahramanListesi.size
    }


    override fun onBindViewHolder(holder: SuperKahramanVH, position: Int) {

        holder.itemBinding.recyclerViewTextView.text = kahramanListesi.get(position)
        holder.itemBinding.root.setOnClickListener {
            val intent = Intent(holder.itemBinding.root.context, TanitimActivity::class.java)
            intent.putExtra("superKahramanIsmi", kahramanListesi.get(position))
            intent.putExtra("superKahramanGorseli", kahramanGorselleri.get(position))


           /* val singleton = SingletonClass.SecilenKahraman
            singleton.gorsel = kahramanGorselleri.get(position)
            */

            holder.itemBinding.root.context.startActivity(intent)

        }

    }
}