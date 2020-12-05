package com.marin.dogapp

import com.marin.dogapp.entity.DogEntity

class Utilitary {
    companion object {
        fun getListOfDogs(): List<DogEntity> {
            return listOf(
                    DogEntity(
                            "Dálmata", "10-13 años", "10-14 Lbs", "Juguetón, Amigable",
                            "El dálmata es una raza canina que debe su nombre a la histórica región de Dalmacia. Su característica principal es su singular pelaje moteado de color negro, hígado o limón. Al nacer, las crías carecen de manchas, las cuales van apareciendo por todo su cuerpo durante el primer año de vida",
                            R.mipmap.dalmata, R.color.colorAmarillo
                    ),
                    DogEntity(
                            "Chihuahua", "12 a 20 años", "10-14 Lbs", "Alerta, Valiente",
                            "El chihuahua o chihuahueño es una raza de perro originaria de México. Es una de las razas de perros más antiguas del continente americano, además de ser el perro más pequeño del mundo. El perro chihuahua es originario del estado mexicano de Chihuahua",
                            R.mipmap.chihuahua, R.color.colorNaranja
                    ),
                    DogEntity(
                            "Pitbull", "8–15 años", "10-14 Lbs", "Leal, Amigable",
                            "El American Pit Bull Terrier es una raza canina, originaria de Estados Unidos y descendiente del Bull and Terrier, una mezcla entre el antiguo bulldog y el terrier",
                            R.mipmap.pitbull, R.color.colorRosa
                    ),
                    DogEntity(
                            "Russell Terrier", "9-12 años", "10-14 Lbs", "Energético",
                            "El Jack Russell Terrier es una raza canina originaria del Reino Unido, y cuyo desarrollo se basó en el estándar del Club de trabajo en Australia. Es un perro básicamente blanco, más compacto que alto, ágil, y que a pesar de su tamaño pequeño tiene mucha fuerza y resistencia",
                            R.mipmap.rusellterrier, R.color.colorPurputa
                    ),
                    DogEntity(
                            "Golden Retriever", "10 a 12 años", "10-14 Lbs", "Inteligente",
                            "El golden retriever o cobrador dorado es una raza de perro que se desarrolló en el Reino Unido, más concretamente en Escocia, alrededor de 1850. Con sus características de perro cobrador, sabueso, bloodhound y spaniel de agua, es un hábil perro de caza con aptitudes para el rastreo",
                            R.mipmap.goldenretriever, R.color.colorVerde
                    )
            )
        }
    }
}