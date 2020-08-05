package com.andra.tugasrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.RadioButton
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        try {
            this.supportActionBar?.hide()
        } catch (e: NullPointerException) {
        }

        recyclerview.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
    }

    val listNaruto= arrayListOf(
        ClassCharacter("Naruto","Kyuubi",18),
        ClassCharacter("Sasuke","Sharingan",18),
        ClassCharacter("Killer Bee","Kyuubi",40),
        ClassCharacter("Sakura","Kyuubi",18),
        ClassCharacter("Tsunade","Kyuubi",50),
        ClassCharacter("Kakashi","Kyuubi",18),
        ClassCharacter("Jiraiya","Sennin",50),
        ClassCharacter("Kaguya","Jyuubi",100),
        ClassCharacter("Pain","Rinnegan",32),
        ClassCharacter("Shikamaru","Doggy",18),
        ClassCharacter("Shino","Bug",18),
        ClassCharacter("Hinata","Jyuken",18),
        ClassCharacter("Gaara","Sand",18),
        ClassCharacter("Temari","Kipas",18),
        ClassCharacter("Asuma","Wind",18),
        ClassCharacter("Tenten","Weapon",18),
        ClassCharacter("Neji","Byakugan",19)
    )

    val listOnepiece = arrayListOf(
        ClassCharacter("Luffy","Gum",17),
        ClassCharacter("Zorro","Swordsman",17),
        ClassCharacter("Robin","Flower",17),
        ClassCharacter("Nami","Weather",17),
        ClassCharacter("Usopp","Sniper",17),
        ClassCharacter("Chopper","Human",17),
        ClassCharacter("Franky","Cyborg",17),
        ClassCharacter("Sanji","Germa Tech",17),
        ClassCharacter("Boa Hancock","Stone trans",17),
        ClassCharacter("Jinbei","Fishman",17),
        ClassCharacter("Ace","Fire",17),
        ClassCharacter("Kizaru","Light",50),
        ClassCharacter("Aokiji","Ice",40),
        ClassCharacter("Shirohige","Earthquake",80),
        ClassCharacter("Kurohige","Dark",35),
        ClassCharacter("Kaidou","Dragon",80),
        ClassCharacter("Doflamingo","String",17)

    )


    val adapterOnepiece = CharaAdapter(listOnepiece)
    val adapterNaruto = CharaAdapter(listNaruto)

    fun onClickedRadioButton(view: View) {
        if (view is RadioButton) {
            // checked radio btn
            val checked = view.isChecked

            // Check which radio btn was clicked
            when (view.getId()) {
                R.id.onepiece ->
                    if (checked) {
                        Log.d("Anime","op")
                        recyclerview.adapter = adapterOnepiece
                    }
                R.id.naruto ->
                    if (checked) {
                        Log.d("Anime","naru")
                        recyclerview.adapter = adapterNaruto
                    }
            }
        }

    }
}