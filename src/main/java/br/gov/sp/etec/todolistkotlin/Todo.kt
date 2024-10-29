package br.gov.sp.etec.todolistkotlin

import android.app.ActivityManager.AppTask

data class Todo (
    val task: String,
    var isChecked: Boolean = false
)