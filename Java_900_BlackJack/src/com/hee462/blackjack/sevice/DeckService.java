package com.hee462.blackjack.sevice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import com.hee462.blackjack.models.CardDto;

/*
 * 게임을 위한 52자으이 카드 이미지를 생성하고
 * hit을 했을 때 사용할 카드 제출하기
 */
public interface DeckService {
	

	public List<CardDto> newCardDeck();
	public CardDto getDeck();
	public void makeDeckList();
	 
	 

	

	

	
}
