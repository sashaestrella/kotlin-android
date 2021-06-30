package com.example.myapplication

class Card() {
    var fecha: String? = null
    var valorTranferencia: String? = null
    var cantTranferencias: String? = null

    constructor(fecha: String?, valorTranferencia: String?, cantTranferencias: String?) : this() {
        this.fecha = fecha
        this.valorTranferencia = valorTranferencia
        this.cantTranferencias = cantTranferencias
    }

    @JvmName("getFecha1")
    fun getFecha(): String? {
        return fecha
    }

    @JvmName("getValorTranferencia1")
    fun getValorTranferencia(): String? {
        return valorTranferencia
    }

    @JvmName("getCantTranferencias1")
    fun getCantTranferencias(): String? {
        return cantTranferencias
    }
}