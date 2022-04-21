package com.zerdi.solidstock.presentation.company_info

import com.zerdi.solidstock.domain.model.CompanyInfo
import com.zerdi.solidstock.domain.model.IntradayInfo

data class CompanyInfoState(
    val stockInfos: List<IntradayInfo> = emptyList(),
    val company: CompanyInfo? = null,
    val isLoading: Boolean = false,
    val error: String? = null
)
