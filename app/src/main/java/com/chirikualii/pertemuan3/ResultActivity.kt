package com.chirikualii.pertemuan3

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.chirikualii.pertemuan3.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {

    lateinit var binding : ActivityResultBinding

    var resultA = ""
    var resultB = ""
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        /**
         * TODO
          tampilkan data dari activity match seperti pada layout [activity_result.XML]
         **/
        resultA = intent.getStringExtra("StimA") ?: "team A"
        binding.tvResultA.text=resultA

        resultB = intent.getStringExtra("StimB") ?: "team B"
        binding.tvResultB.text=resultB


    }
}