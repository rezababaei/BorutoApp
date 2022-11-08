package com.rbabaei.borutoapp.data

import androidx.room.Database
import com.rbabaei.borutoapp.data.dao.HeroDao
import com.rbabaei.borutoapp.domain.model.Hero

@Database(entities = [Hero::class], version = 1)
abstract class BorutoDatabase {
    abstract fun heroDao(): HeroDao
}