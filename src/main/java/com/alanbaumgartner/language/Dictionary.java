package com.alanbaumgartner.language;

import java.util.*;
import java.util.stream.Collectors;

public class Dictionary {

	private List<Word> words;

	public Map<Word, Set<Word>> relations = new HashMap<>();

	public List<Word> getWords() {
		return this.words;
	}

	public Dictionary() {
		this.words = new ArrayList<>();
	}

	public void addWord(Word word) {
		words.add(word);
		relations.putIfAbsent(word, new HashSet<>());
	}

	public void addRelation(Word word, Word related) {
		relations.get(word).add(related);
		for (Word w : relations.get(word)) {
			relations.get(w).addAll(relations.get(word));
		}
	}


	public List<Word> getWordsFromLanguage(Locale locale) {
		return words.stream().filter(x -> x.getLocale().equals(locale)).collect(Collectors.toList());
	}




}
