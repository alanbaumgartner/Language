package com.alanbaumgartner.language;

import java.util.HashSet;
import java.util.List;
import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		Dictionary dict = new Dictionary();

		Word a = new Word("Bye", Locale.ENGLISH);
		Word b = new Word("Hi", Locale.ENGLISH);
		Word c = new Word("你好", Locale.CHINESE);

		dict.addWord(a);
		dict.addWord(b);
		dict.addWord(c);

		List<Word> sub = dict.getWordsFromLanguage(Locale.ENGLISH);
		System.out.println(sub);

		dict.addRelation(a, b);
		dict.addRelation(c, b);
		System.out.println(dict.relations);


	}

}
