package br.com.unipac.protocolo.repositorio

import br.com.unipac.protocolo.model.Protocolo
import android.content.Context

class ProtocoloRepositorio(context: Context){
    var protocolos: ArrayList<Protocolo>? = null

            fun salvar(protocolo: Protocolo){
                protocolos?.add(protocolo)
            }

            fun listar(): List<Protocolo>?{
                return protocolos
            }
}