package com.d3if2089.hitungbmi.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bmi")
data class BmiEntity (
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    var tanggal: Long = System.currentTimeMillis(),
    var berat: Float,
    var tinggi: Float,
    var isMale: Boolean
)