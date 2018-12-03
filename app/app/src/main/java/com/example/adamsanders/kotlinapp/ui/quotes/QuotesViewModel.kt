package com.example.adamsanders.kotlinapp.ui.quotes

import androidx.lifecycle.ViewModel
import com.example.adamsanders.kotlinapp.data.Quote
import com.example.adamsanders.kotlinapp.data.QuoteRepository

class QuotesViewModel(private val quotesRepository: QuoteRepository)
    :ViewModel(){

    fun getQuotes() = quotesRepository.getQuotes()

    fun addQuotes(quote: Quote) = quotesRepository.addQuote(quote)
}