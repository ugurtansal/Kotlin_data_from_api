package com.example.kisileruygulamasi.retrofit

class ApiUtils {
    companion object{
        //http://kasimadalan.pe.hu/kisiler/tum_kisiler.php
        //http://kasimadalan.pe.hu/ =>Base URL
        // kisiler/kisiler.php => Api URL

        val BASE_URL="http://kasimadalan.pe.hu/"

        //Her interface için bir fonksiyon oluşturulmalıdır
        //Örneğin mağazalar tablosu olsaydı onun için de getStoreDao()
        fun getKisilerDao(): KisilerDao {
            return RetrofitClient.getClient(BASE_URL).create(KisilerDao::class.java)
        }

    }
}