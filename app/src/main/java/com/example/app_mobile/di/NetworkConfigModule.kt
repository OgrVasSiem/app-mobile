package com.example.app_mobile.di

import com.example.app_mobile.BuildConfig
import com.example.app_mobile.core.network.NetworkConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object NetworkConfigModule {
    @Provides
    @Singleton
    fun provideNetworkConfig(): NetworkConfig = NetworkConfig(
        baseUrl = BuildConfig.API_BASE_URL,
        allowCleartext = BuildConfig.DEBUG,
        enableHttpLogging = false,
    )
}
