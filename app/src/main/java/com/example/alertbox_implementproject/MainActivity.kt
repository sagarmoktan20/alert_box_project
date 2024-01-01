package com.example.alertbox_implementproject

import android.content.DialogInterface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.example.alertbox_implementproject.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tv1.setOnClickListener {
            val builder1=AlertDialog.Builder(this)
            val option= arrayOf("blue","red","green","black")
            builder1.setTitle("what is your favourate color")
            builder1.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You selected ${option[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "response submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "F#UCK U", Toast.LENGTH_SHORT).show()
            })
            builder1.show()
        }
        binding.tv2.setOnClickListener {
            val builder1=AlertDialog.Builder(this)
            val option= arrayOf("MoMo","chowmein","pizza","burger")
            builder1.setTitle("what is your favourate food")
            builder1.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You selected ${option[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "response submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "F#UCK U", Toast.LENGTH_SHORT).show()
            })
            builder1.show()
        }
        binding.tv3.setOnClickListener {
            val builder1=AlertDialog.Builder(this)
            val option= arrayOf("c","c++","python","kotlin")
            builder1.setTitle("what is your favourate programming language")
            builder1.setSingleChoiceItems(option,0,DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "You selected ${option[which]}", Toast.LENGTH_SHORT).show()
            })
            builder1.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "response submitted", Toast.LENGTH_SHORT).show()
            })
            builder1.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->
                Toast.makeText(this, "F#UCK U", Toast.LENGTH_SHORT).show()
            })
            builder1.show()
        }
        binding.button.setOnClickListener {
            val builder2=AlertDialog.Builder(this)
            builder2.setTitle("Are you sure?")
            builder2.setMessage("Do you really want to close application?")
            builder2.setPositiveButton("Yes",DialogInterface.OnClickListener { dialog, which ->
                finish()
            })
            builder2.setNegativeButton("No",DialogInterface.OnClickListener { dialog, which ->

            })
        builder2.show()
        }
    }

}