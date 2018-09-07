package com.wayne.letter;

import com.wayne.inter.ChangeLetter;

public class LowerLetter implements ChangeLetter {
	private String str;

	@Override
	public String change() {
		// TODO Auto-generated method stub
		//ด๓ะด-->ะกะด
		return str.toLowerCase();
	}

	public String getStr() {
		return str;
	}

	public void setStr(String str) {
		this.str = str;
	}

}
