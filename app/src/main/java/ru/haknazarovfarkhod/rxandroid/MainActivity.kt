package ru.haknazarovfarkhod.rxandroid

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import ru.haknazarovfarkhod.rxandroid.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

//        binding.repositoryName.text = "Modern Android Medium Article"

        var repository = Repository("Medium Android Repository Article",
            "Farkhod Khaknazarov", 1000, true)

        binding.repository = repository
        binding.executePendingBindings()
    }
}
