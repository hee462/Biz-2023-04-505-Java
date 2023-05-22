package com.hee462.blackjack.models;
/*
 * BlackJack 에서 사용하는 카드는 4가지 문양(suit) 와 13개의 숫자(denomination)을 갖는다
 * 총 52개의 카드를 가지고 있다
 * 
 * => playing Card
 */
public class CardDto {

	public String suit;
	public String denomination;
	public int value;

	// 매개변수가 없는 기본생성자
	public CardDto() {
		super();
		// TODO Auto-generated constructor stub
	}

	// 필드변수와 같은 매개변수를 갖는 임의 생성자(필드생성자)
	public CardDto(String suit, String denomination, int value) {
		super();
		this.suit = suit;
		this.denomination = denomination;
		this.value = value;
	}

	@Override
	public String toString() {
		return "CardDto [suit=" + suit + ", denomination=" + denomination + ", value=" + value + "]";
	}
	
	public String[] getPattern() {
		String[] patterns = {
				String.format("┌─────┐ "),
				String.format("│  %1s  │ ",this.suit),
				String.format("│     │ "),
				String.format("│  %2s │ ",this.denomination),
				String.format("└─────┘ "),
		};
		return patterns;
	}
	
}
