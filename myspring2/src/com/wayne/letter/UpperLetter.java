package com.wayne.letter;

import com.wayne.inter.ChangeLetter;

public class UpperLetter implements ChangeLetter{
	private String str;
	
	@Override
	public String change() {
		// TODO Auto-generated method stub
		//ะกะด-->ด๓ะด
		return str.toUpperCase();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
