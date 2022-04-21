package com.zerdi.solidstock.domain.repository

import com.zerdi.solidstock.domain.model.CompanyInfo
import com.zerdi.solidstock.domain.model.CompanyListing
import com.zerdi.solidstock.domain.model.IntradayInfo
import com.zerdi.solidstock.util.Resource
import kotlinx.coroutines.flow.Flow

interface StockRepository {

    suspend fun getCompanyListings(
        fetchFromRemote: Boolean,
        query: String
    ): Flow<Resource<List<CompanyListing>>>

    suspend fun getIntradayInfo(
        symbol: String
    ): Resource<List<IntradayInfo>>

    suspend fun getCompanyInfo(
        symbol: String
    ): Resource<CompanyInfo>
}