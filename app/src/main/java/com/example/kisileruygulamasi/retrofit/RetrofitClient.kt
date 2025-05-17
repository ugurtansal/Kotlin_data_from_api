package com.example.kisileruygulamasi.retrofit

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {
    //Bu her zaman aynıdır , diğer projelerde de kullanılabilir

    companion object{
        fun getClient(baseUrl: String): Retrofit {
            return Retrofit.Builder()
                .baseUrl(baseUrl)
                .addConverterFactory(GsonConverterFactory.create()) //Gson ile Json verisi doğrudan model sınıfına dönüştürülür,
                                                                    //Ayrıca Sınıfı da doğrudan Json'a dönüştürebiliriz
                .build()
        }
    }
}