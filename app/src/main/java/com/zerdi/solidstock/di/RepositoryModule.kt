package com.zerdi.solidstock.di

import com.zerdi.solidstock.data.csv.CSVParser
import com.zerdi.solidstock.data.csv.CompanyListingsParser
import com.zerdi.solidstock.data.csv.IntradayInfoParser
import com.zerdi.solidstock.data.repository.StockRepositoryImpl
import com.zerdi.solidstock.domain.model.CompanyListing
import com.zerdi.solidstock.domain.model.IntradayInfo
import com.zerdi.solidstock.domain.repository.StockRepository
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    @Singleton
    abstract fun bindCompanyListingsParser(
        companyListingsParser: CompanyListingsParser
    ): CSVParser<CompanyListing>

    @Binds
    @Singleton
    abstract fun bindIntradayInfoParser(
        intradayInfoParser: IntradayInfoParser
    ): CSVParser<IntradayInfo>

    @Binds
    @Singleton
    abstract fun bindStockRepository(
        stockRepositoryImpl: StockRepositoryImpl
    ): StockRepository
}