package com.example.hiltkullanimi

import android.util.Log
import javax.inject.Inject

class Kargo @Inject constructor (var adres:Adres) {
   //kargo class'ı adres türünden bir nesne istiyor gönder demiş olduk bu tanım ile.

    fun gonder(){
        Log.e("Sonuç:", "${adres.bilgi} adresine kargo gönderildi.")

    }
}