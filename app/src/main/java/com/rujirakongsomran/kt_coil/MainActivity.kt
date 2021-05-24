package com.rujirakongsomran.kt_coil

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import coil.load
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.GrayscaleTransformation
import coil.transform.RoundedCornersTransformation
import com.rujirakongsomran.kt_coil.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        setContentView(binding.root)

        binding.imageView.load("https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519_960_720.jpg") {
            crossfade(true)
            crossfade(400)
            transformations(
                BlurTransformation(applicationContext, 20f),
                RoundedCornersTransformation(10f)
            )
        }

        binding.imageView2.load("https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519_960_720.jpg") {
            transformations(RoundedCornersTransformation(10f))
        }
        binding.imageView3.load("https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519_960_720.jpg") {
            transformations(
                BlurTransformation(applicationContext, 20f),
                CircleCropTransformation()
            )
        }
        binding.imageView4.load("https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519_960_720.jpg") {
            transformations(CircleCropTransformation())
        }
        binding.imageView5.load("https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519_960_720.jpg") {
            transformations(
                BlurTransformation(applicationContext, 20f),
                GrayscaleTransformation()
            )
        }
        binding.imageView6.load("https://cdn.pixabay.com/photo/2016/01/20/13/05/cat-1151519_960_720.jpg") {
            transformations(GrayscaleTransformation())
        }

    }
}