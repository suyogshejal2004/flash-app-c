package com.example.flash.data

import com.example.flash.R

object DataSource {
    fun localcatogiries(): List<Catogiries> {
  return listOf<Catogiries>(
      Catogiries(
          StringresourceId = R.string.sweet, DrawebalResourceid = R.drawable.sweet,),
      Catogiries(R.string.Kihcen,R.drawable.kitchen),
      Catogiries(R.string.fruits,R.drawable.fruits),
      Catogiries(R.string.bread,R.drawable.bread),
      Catogiries(R.string.bath_body,R.drawable.bathbody),
      Catogiries(R.string.bevrages,R.drawable.beverages),
      Catogiries(R.string.munchies,R.drawable.munchies),
      Catogiries(R.string.packeged,R.drawable.packaged),
      Catogiries(R.string.vegetables,R.drawable.kitchen)
  ) }
}