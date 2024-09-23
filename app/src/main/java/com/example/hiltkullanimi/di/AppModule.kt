package com.example.hiltkullanimi.di

import com.example.hiltkullanimi.Adres
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

//Sağlayıcı
@Module
@InstallIn(SingletonComponent::class) //Bir yerden nesne oluşturacğız her yerden bunu kulllanacağız demek
class AppModule {
    @Provides //sağlayıcı
    @Singleton
    fun provideAdres() : Adres {
        return Adres("Kadıköy / İstanbul")
    }
}