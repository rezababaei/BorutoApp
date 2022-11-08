package com.rbabaei.borutoapp.data.dao

import androidx.paging.PagingSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.rbabaei.borutoapp.domain.model.Hero

@Dao
interface HeroDao {

    @Query("SELECT * From hero_table ORDER BY id ASC")
    fun getAllHeroes():PagingSource <Int,Hero>

    @Query("SELECT * FROM hero_table WHERE id=:heroId")
    fun getSelectedHero(heroId:Int):Hero

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun addHeroes(heroes:List<Hero>)

    @Query("DELETE FROM hero_table")
    suspend fun deleteAllHeroes()
}