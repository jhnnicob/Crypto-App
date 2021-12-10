package com.nico.cryptoapp.domain.repository

import com.nico.cryptoapp.data.remote.dto.CoinDetailDto
import com.nico.cryptoapp.data.remote.dto.CoinDto

interface CoinRepository {

    suspend fun getCoins(): List<CoinDto>

    suspend fun getCoinById(coinId: String): CoinDetailDto

}