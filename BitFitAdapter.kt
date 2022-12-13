package com.ifespencer.bitfit

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.bitfit.databinding.ActivityMainBinding

class BitFitAdapter (private val context: Context, private val liquids: MutableList<LIQUID>): RecyclerView.Adapter:
      inner class ViewHolder(itemView:View): RecyclerView.ViewHolder(itemView), View.OnClickListener{
          private val tvLiquidType = itemView.findViewById<TextView>(R.id.tv_LiquidType)
          private val tvAmount = itemView.findViewById<TextView>(R.id.tv_tvAmount)
          
          fun bind(liquid: LIQUID) {
          tvLiquidType.text = liquid.name
          tvAmount.text = liquid.amount.toString()
          }
          
          init {
              itemView.setOnClickListener(this)
          }
          
          override fun onClick(v: View?) {
          log.i("BoxClicked", "The onClick works for box $position")
          }
          
     }
     
     override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {
          val view = LayoutInflater.from(viewGroup.context)
                .inflate(R.layour.item_liquid, viewGroup, attachedToRoot:false)
          return ViewHolder(view) 
        }

 override fun onBindViewHolder(holder: ViewHolder, postion:Int) {
          val article = liquids[postion]
          holder.bind(article) 
        }
        
  override fun getItemCount() = liquids.size
        }
