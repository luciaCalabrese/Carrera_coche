package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val list = mutableListOf<CarouselItem>()

            val carousel: ImageCarousel = findViewById(R.id.carousel)


            list.add(
                CarouselItem(
                    imageUrl = "https://i.blogs.es/452c0c/ferrari-458-challenge/450_1000.jpg",
                    caption = "Caracteristicas" +
                            "Velocidad: 300 km/hs" +
                            "Nombre: Ferrari 458 " +
                            "Color: rojo " +
                            "Consumo: 2l cada 100 metros" +
                            "Aceleración: 30km " +
                            "Frenado: 8 km",

                    )
            )

            list.add(
                CarouselItem(
                    imageUrl = "https://www.elcarrocolombiano.com/wp-content/uploads/2019/12/20191209-MCLAREN-620R-AA01.jpg",
                    caption = "Caracteristicas \n" +
                            "Velocidad: 250 km/hs \n" +
                            "nombre: McLaren MSO X \n" +
                            "color: \n" +
                            "consumo: 3l cada 100 metros\n" +
                            "Aceleración: 40 km\n" +
                            "Frenado: 2 km\n",
                )
            )
            list.add(
                CarouselItem(
                    imageUrl = "https://www.autolimite.com/wp-content/uploads/2013/04/Porsche-911-GT3-Cup-2013_05.jpg",
                    caption = "Caracteristicas: \n" +
                            "Velocidad: 200 km/hs \n" +
                            "nombre: Porche CUP \n" +
                            "color: \n" +
                            "consumo: 1l cada 100 metros\n" +
                            "Aceleración: 35 km\n" +
                            "Frenado: 4 km\n",
                )
            )

            list.add(
                CarouselItem(
                    imageUrl = "https://cdn.topgear.es/sites/navi.axelspringer.es/public/styles/1200/public/media/image/2017/12/coches-mas-rapidos-historia-mclaren-f1-1993.jpg?itok=s8i763Y8",
                    caption = "Caracteristicas \n " +
                            "Velocidad: 400 km/hs \n" +
                            "nombre: McLaren  \n" +
                            "color: \n" +
                            "consumo: 8l cada 100 metros\n" +
                            "Aceleración: 50 km\n" +
                            "Frenado: 1km\n",
                )
            )
            list.add(
                CarouselItem(
                    imageUrl = "https://www.actualidadmotor.com/wp-content/uploads/2018/01/mclaren-mso-x-frontal-3-4-830x460.jpg",
                    caption = "Caracteristicas \n " +
                            "Velocidad: 450 km/hs \n" +
                            "nombre: McLaren MSO Y \n" +
                            "color: \n" +
                            "consumo: 10l cada 100 metros\n" +
                            "Aceleración: 50km\n" +
                            "Frenado: 4km\n",

                    )
            )
            carousel.addData(list)
        }
    }
