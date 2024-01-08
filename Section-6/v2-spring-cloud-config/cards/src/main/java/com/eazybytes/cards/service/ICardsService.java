package com.eazybytes.cards.service;

import com.eazybytes.cards.dto.CardsDto;

public interface ICardsService {
    void create(String mobileNumber);

    CardsDto fetchCard(String mobileNumber);

    boolean update(CardsDto cardsDto);

    boolean deleteCard(String mobileNumber);
}
