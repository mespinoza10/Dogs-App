package com.marin.dogapp.entity

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

@Parcelize
class DogEntity(

    val raza:String,
    val rangoEdad:String,
    val tamanio:String ,
    val especialidad:String,
    val descripcion:String,
    val imagen:Int,
    val background:Int

): Parcelable