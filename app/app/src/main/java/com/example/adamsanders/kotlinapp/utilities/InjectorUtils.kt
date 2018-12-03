package com.example.adamsanders.kotlinapp.utilities

import com.example.adamsanders.kotlinapp.data.FakeDatabase
import com.example.adamsanders.kotlinapp.data.QuoteRepository
import com.example.adamsanders.kotlinapp.ui.quotes.QuotesViewModelFactory

object InjectorUtils {

    fun provideQuotesViewModelFactory(): QuotesViewModelFactory {
        val quoteRepository = QuoteRepository.getInstance(FakeDatabase.getInstance().quoteDao)
        return QuotesViewModelFactory(quoteRepository)
    }
}