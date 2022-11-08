package com.rbabaei.borutoapp.navigation

import com.rbabaei.borutoapp.util.Constants.DETAILS_ARGUMENT_KEY

sealed class Screen(val route:String){
    object Splash:Screen("splash_screen")
    object Welcome:Screen("welcome_screen")
    object Home:Screen("home_screen")
    object Details:Screen("details_screen/{$DETAILS_ARGUMENT_KEY}") //required argument
    {
      fun passHeroId(heroId:Int):String{
          return "details_screen/$heroId"
      }
    } //there are two types of argument optional and required

    object Search:Screen("search_screen")
}
