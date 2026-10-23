package com.example.navigationwithmvvm.view

import android.R.attr.title
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK:List<string> = listof("Laki-laki","Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier = Modifier,
        {
            TopAppBar()
            title = {Text(stringResource(id=R.string.home), color = color.White)},
            colors = TopAppBarDefaults.colorResource(id = R.color.teal_700))
        }
        )
    


}