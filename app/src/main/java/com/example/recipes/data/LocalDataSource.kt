package com.example.recipes.data

import com.example.recipes.data.database.RecipesDao
import com.example.recipes.data.database.RecipesEntity
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class LocalDataSource @Inject constructor(
        private var recipesDao: RecipesDao
) {

    fun readDatabase() : Flow<List<RecipesEntity>>{
        return recipesDao.readRecipes()
    }

    suspend fun insertRecipes(recipesEntity: RecipesEntity){
        recipesDao.insertRecipes(recipesEntity)
    }
}