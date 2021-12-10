package com.nico.cryptoapp.data.repository_imp

import com.nico.cryptoapp.data.remote.CoinPaprikaApi
import com.nico.cryptoapp.data.remote.dto.CoinDetailDto
import com.nico.cryptoapp.data.remote.dto.CoinDto
import com.nico.cryptoapp.domain.repository.CoinRepository
import javax.inject.Inject

class CoinRepositoryImp @Inject constructor(
    private val api: CoinPaprikaApi
): CoinRepository{

    override suspend fun getCoins(): List<CoinDto> {
        return api.getCoins()
    }

    override suspend fun getCoinById(coinId: String): CoinDetailDto {
        return api.getCoinById(coinId)
    }
}