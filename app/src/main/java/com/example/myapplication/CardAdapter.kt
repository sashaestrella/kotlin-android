package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class CardAdapter(private val context: Context, private val dataSource: ArrayList<Card>): BaseAdapter() {
    private class ViewHolder {
        var fecha: TextView? = null
        var valorTranferencia: TextView? = null
        var cantTranferencias: TextView? = null
    }
    private val inflater: LayoutInflater
            = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater

    override fun getView(p0: Int, p1: View?, p2: ViewGroup?): View? {
        val card: Card? = getItem(p0)
        val viewHolder: ViewHolder
        val result: View
        val rowView: View = inflater.inflate(R.layout.card_item, p2, false)

        if (p1 == null) {
            viewHolder = ViewHolder()
            viewHolder.fecha = rowView.findViewById(R.id.fecha) as TextView
            viewHolder.valorTranferencia = rowView.findViewById(R.id.valorTranferencia) as TextView
            viewHolder.cantTranferencias = rowView.findViewById(R.id.cantTranferencias) as TextView
            result = rowView
            rowView.setTag(viewHolder)
        } else {
            viewHolder = p1.getTag() as ViewHolder
            result = p1
        }

        if (card != null) {
            viewHolder.fecha?.setText(card.getFecha())
        }
        if (card != null) {
            viewHolder.valorTranferencia?.setText(card.getValorTranferencia())
        }
        if (card != null) {
            viewHolder.cantTranferencias?.setText(card.getCantTranferencias())
        }

        return rowView
    }

    override fun getItem(p0: Int): Card? {
        return dataSource[p0]
    }

    override fun getItemId(p0: Int): Long {
        return p0.toLong()
    }

    override fun getCount(): Int {
        return dataSource.size
    }
}