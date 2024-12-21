package com.example.flash

import android.content.Context
import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.flash.R.drawable.sweet
import com.example.flash.data.DataSource
import kotlin.coroutines.coroutineContext


@Composable
fun startscreen(){
    val context = LocalContext.current

    LazyVerticalGrid(GridCells.Adaptive(minSize = 128.dp),
      contentPadding = PaddingValues(30.dp),
        verticalArrangement =  Arrangement.spacedBy(10.dp),
        horizontalArrangement = Arrangement.spacedBy(5.dp)
        ) {
   items(DataSource.localcatogiries()) {
       CatogeryCard(context=context,
               StringresourceId=it. StringresourceId,
           DrawebalResourceid=it.DrawebalResourceid
           )
   }
    }

}
@Composable
fun CatogeryCard (context:Context,
                  StringresourceId:Int,
                  DrawebalResourceid : Int
                  ) {

    Card(modifier = Modifier.clickable {
        Toast.makeText( context,"This card was clickerd ", Toast.LENGTH_LONG).show()
    }) {
        Column (modifier = Modifier.padding(5.dp)){  Text(
            text = stringResource(id= StringresourceId)        ,
            fontSize = 17.sp,
            modifier = Modifier.width(150.dp)
        )
        }
        Image(painter = painterResource(id =  DrawebalResourceid ),
            contentDescription = "Sweet Items ",
            modifier = Modifier.size(150.dp
            )
        )
    }
}