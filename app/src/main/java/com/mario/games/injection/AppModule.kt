package com.mario.games.injection

import android.content.Context
import com.mario.games.data.DataSource
import com.mario.games.data.DataSourceImpl
import com.mario.games.remote.rest.RestApi
import com.mario.games.remote.rest.RestApiImpl
import com.mario.games.remote.retrofit.RetrofitApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.Dispatchers

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    fun providesContext(@ApplicationContext context: Context) = context

    @Provides
    fun providesRestApi(retrofitApi: RetrofitApi): RestApi = RestApiImpl(retrofitApi = retrofitApi)

    @Provides
    fun providesDataSource(restApi: RestApi): DataSource = DataSourceImpl(restApi = restApi)

    @Provides
    fun providesDispatcher() = Dispatchers.IO
}