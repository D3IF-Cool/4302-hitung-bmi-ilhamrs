package org.d3if3051.hitungbmi.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "bmi")
data class BmiEntity(
    @PrimaryKey(autoGenerate = true)
    var id: Long = 0L,
    var tgl: Long = System.currentTimeMillis(),
    var berat: Float,
    var tinggi: Float,
    var isMale: Boolean
) {
}