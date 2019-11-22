package com.alanbaumgartner.language;

import java.util.Locale;

public class Word {

	private String text;
	private String definition;
	private String notes;

	private Locale locale;

	public Word(String text, Locale locale) {
		this.text = text;
		this.definition = "";
		this.notes = "";

		this.locale = locale;
	}

	public Word(String text, Locale locale, String definition) {
		this.text = text;
		this.definition = definition;
		this.notes = "";

		this.locale = locale;
	}

	public Word(String text, Locale locale, String definition, String notes) {
		this.text = text;
		this.definition = definition;
		this.notes = notes;

		this.locale = locale;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public String getDefinition() {
		return definition;
	}

	public void setDefinition(String definition) {
		this.definition = definition;
	}

	public String getNotes() {
		return notes;
	}

	public void setNotes(String notes) {
		this.notes = notes;
	}

	public Locale getLocale() {
		return locale;
	}

	public void setLocale(Locale locale) {
		this.locale = locale;
	}

	@Override
	public String toString() {
		final StringBuilder sb = new StringBuilder("Word{");
		sb.append("text='").append(text).append('\'');
		sb.append(", definition='").append(definition).append('\'');
		sb.append(", notes='").append(notes).append('\'');
		sb.append(", locale=").append(locale);
		sb.append('}');
		return sb.toString();
	}
}
