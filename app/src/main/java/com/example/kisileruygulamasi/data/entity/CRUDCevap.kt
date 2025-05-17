package com.example.kisileruygulamasi.data.entity

data class CRUDCevap (var success: Int,var message: String){
    //Success ve message dönen cevap ile birebir aynı isimlendirme olmalı
    //Aksi takdirde veri çekilemez

    //Eğer apiden gelen veri farklı bir isimlendirme ile gelirse ve o ismi kullanmak istemezsek @SerializedName("api_ismi") var myValue annotation'ını kullanabiliriz
    //Örnek: @SerializedName("success") var myValue: Int



}