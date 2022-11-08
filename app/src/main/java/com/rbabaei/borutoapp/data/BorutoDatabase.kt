package com.rbabaei.borutoapp.data

import androidx.room.Database
import androidx.room.TypeConverters
import com.rbabaei.borutoapp.data.dao.HeroDao
import com.rbabaei.borutoapp.data.dao.HeroRemoteKeyDao
import com.rbabaei.borutoapp.domain.model.Hero
import com.rbabaei.borutoapp.domain.model.HeroRemoteKey

@Database(entities = [Hero::class,HeroRemoteKey::class], version = 1)
@TypeConverters(DatabaseConvertor::class)
abstract class BorutoDatabase {
    abstract fun heroDao(): HeroDao
    abstract fun heroRemoteKeyDao():HeroRemoteKeyDao
}