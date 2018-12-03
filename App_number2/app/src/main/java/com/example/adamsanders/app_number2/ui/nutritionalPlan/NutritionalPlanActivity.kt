package com.example.adamsanders.app_number2.ui.nutritionalPlan

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.example.adamsanders.app_number2.R
import com.example.adamsanders.app_number2.databinding.ActivityNutritionalplanBinding
import java.util.*

class NutritionalPlanActivity : AppCompatActivity(), Observer {
    private val viewModel = NutritionalPlanViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initbinding()
        setContentView(R.layout.activity_nutritionalplan)
    }

    override fun update(p0: Observable?, p1: Any?) {
        if(p1.toString() == NutritionalPlanViewModel.SHOW_ADD_FOOD_DIALOG){
            showDialog(viewModel)
        }
    }

    private fun initbinding() {
        val activityMainBinding = DataBindingUtil.setContentView<ActivityNutritionalplanBinding>(this,
            R.layout.activity_nutritionalplan)
        activityMainBinding.viewModel = viewModel
        viewModel.addObserver(this)
        rv_foods.layoutManager = LinearLayoutManager(this)

    }


    private fun showDialog(viewModel: NutritionalPlanViewModel){
        var dialog = AddFoodDialog.newInstance(viewModel)
        dialog.show(supportFragmentManager, "")
    }
}
