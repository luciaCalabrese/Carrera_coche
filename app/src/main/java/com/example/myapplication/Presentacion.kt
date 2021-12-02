package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import org.imaginativeworld.whynotimagecarousel.ImageCarousel
import org.imaginativeworld.whynotimagecarousel.model.CarouselItem

class Presentacion : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_presentacion)

        val list = mutableListOf<CarouselItem>()

        val carousel: ImageCarousel = findViewById(R.id.carousel)


        list.add(
            CarouselItem(
                imageUrl = "https://media.istockphoto.com/photos/asphalt-road-race-track-and-green-forest-natural-landscape-picture-id1042876780?k=20&m=1042876780&s=170667a&w=0&h=YC4krtMRPl-X5B1lpbhZ7fJqE8YnkqTqCJVo2gqmrfI=",


                )
        )

        list.add(
            CarouselItem(
                imageUrl = "https://www.teletracnavman.com.mx/media/13276/99020930-primavera_blg-tw.jpg",

            )
        )

        list.add(
            CarouselItem(
                imageUrl = "https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcR67ivVmwVo3aG8ONzs6sGQNv8iF-fRFEZcAA&usqp=CAU",


                )
        )
        carousel.addData(list)

    }
}