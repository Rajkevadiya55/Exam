package com.example.exam

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.exam.Adapter.ProductAdapter
import com.example.exam.DB.ProductDB
import com.example.exam.DB.ProductEntity
import com.example.exam.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var db: ProductDB
    lateinit var adapter: ProductAdapter
    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        db = ProductDB.init(this)


        binding.btnadd.setOnClickListener {


            var name = binding.pname.text.toString()
            var price = binding.pprice.text.toString()
            var address = binding.paddress.text.toString()
            var dscrip = binding.pdscrip.text.toString()
            var data = ProductEntity(name, price, address,dscrip)


            db.productDao().addpro(data)

            finish()
        }

        var list = db.productDao().getproduct()
        adapter = ProductAdapter(list)
        binding.recycle.layoutManager = LinearLayoutManager(this)
        binding.recycle.adapter = adapter
    }
}