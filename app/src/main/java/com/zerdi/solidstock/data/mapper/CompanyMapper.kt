package com.zerdi.solidstock.data.mapper

import com.zerdi.solidstock.data.local.CompanyListingEntity
import com.zerdi.solidstock.data.remote.dto.CompanyInfoDto
import com.zerdi.solidstock.domain.model.CompanyInfo
import com.zerdi.solidstock.domain.model.CompanyListing

fun CompanyListingEntity.toCompanyListing(): CompanyListing {
    return CompanyListing(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyListing.toCompanyListingEntity(): CompanyListingEntity {
    return CompanyListingEntity(
        name = name,
        symbol = symbol,
        exchange = exchange
    )
}

fun CompanyInfoDto.toCompanyInfo(): CompanyInfo {
    return CompanyInfo(
        symbol = symbol ?: "",
        description = description ?: "",
        name = name ?: "",
        country = country ?: "",
        industry = industry ?: ""
    )
}