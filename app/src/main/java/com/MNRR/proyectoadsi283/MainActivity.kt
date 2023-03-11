package com.MNRR.proyectoadsi283

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ImageButton
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.Switch
import android.widget.TextView
import android.widget.Toast
import android.widget.ToggleButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnSent: Button= findViewById(R.id.btnSent)
        btnSent.setOnClickListener({mensaje()})

        val btnColor: ImageButton= findViewById(R.id.btnColor)
        btnColor.setOnClickListener({chageColorInterface()})
    }

    private fun mensaje(){
        val campoTexto: EditText =findViewById(R.id.editTextTextPersonNam5)
        var nombre:String=campoTexto.text.toString()
        val myRadioGroup:RadioGroup=findViewById(R.id.RadiogroupPadre)
        val myoption:RadioButton=findViewById(R.id.btnSaludar)
        val myoption2:RadioButton=findViewById(R.id.btnDespedirce)
        val checkBox1:CheckBox=findViewById(R.id.checkBox1)
        val checkBox2:CheckBox=findViewById(R.id.checkBox2)
        val myToggleButton:ToggleButton=findViewById(R.id.btnToggle)
        val mySwitch:Switch=findViewById(R.id.btnSwitch)

        var texto= "bienvenido $nombre \n"

        if (myoption.id==myRadioGroup.checkedRadioButtonId){
            texto+="pulso la opcion radio ${myoption.text} \n"
        }
        if (myoption2.id==myRadioGroup.checkedRadioButtonId){
            texto+="pulso la opcion radio ${myoption2.text} \n"
        }
        if (checkBox1.isChecked){
            texto+="pulso la opcion check ${checkBox1.text} \n"
        }
        if (checkBox2.isChecked){
            texto+="pulso la opcion check ${checkBox2.text} \n"
        }
        if (mySwitch.isChecked){
            texto+="el switch esta prendido \n"
        }else{
            texto+="el switch esta apagado \n"
        }
        texto+="el toggle ${myToggleButton.text}"

        Toast.makeText( this,"$texto", Toast.LENGTH_SHORT).show()


        val campoBienvenida:TextView=findViewById(R.id.bienvenida)
        campoBienvenida.text="bienvenido otra vez $nombre"


    }
    var count=0
    private fun chageColorInterface() {

        if (count == 0) {
            val body: LinearLayout = findViewById(R.id.body)
            body.setBackgroundColor(getResources().getColor(R.color.purple_200));
            count = 1
        } else {
            val body: LinearLayout = findViewById(R.id.body)
            body.setBackgroundColor(getResources().getColor(R.color.white));
            count = 0
        }
    }
}