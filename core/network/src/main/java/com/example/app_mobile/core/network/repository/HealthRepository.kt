package com.example.app_mobile.core.network.repository

import com.example.app_mobile.core.network.model.ApiResult

data class HealthStatus(val status: String)

interface HealthRepository {
    suspend fun checkServer(): ApiResult<HealthStatus>
    suspend fun checkDatabase(): ApiResult<Unit>
}
