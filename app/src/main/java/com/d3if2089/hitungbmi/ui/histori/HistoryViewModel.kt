package com.d3if2089.hitungbmi.ui.histori

import androidx.lifecycle.ViewModel
import com.d3if2089.hitungbmi.db.BmiDao

class HistoryViewModel(db: BmiDao): ViewModel() {
    val data = db.getLastBmi()
}