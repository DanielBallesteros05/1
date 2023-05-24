package com.catalogodetienda

import androidx.lifecycle.ViewModel
import java.util.UUID

class TiendaListViewModel: ViewModel(){
    val tiendas = mutableListOf<>()
    init {
        for (i in 0 until 100){
            val tienda=Tienda(
            id= UUID.ramdomUUID(),
            nombre= "Tienda #${i}",
            telefono= "${i}"
            )
            tiendas += tienda
        }
    }
}