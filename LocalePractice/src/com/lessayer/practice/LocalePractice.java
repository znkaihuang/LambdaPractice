package com.lessayer.practice;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Locale.LanguageRange;
import java.util.Map;
import java.util.ResourceBundle;

public class LocalePractice {
	
	public static void main(String... args) {
		Map<String, String> languageTagsMap = createLanguageTagMap();
		List<Locale> localeList = createLocaleList(languageTagsMap.values());
		
		// Design your matching rule. It should follow the order jp, zh-tw, en, en-US, fr, fr-ca, es, it.
		// Notice that you should give each language a weight.
		List<LanguageRange> priorityList = LanguageRange.parse("");
		
		System.out.println(selectClosetLocale("jp", priorityList, localeList));
		System.out.println(selectClosetLocale("de", priorityList, localeList));
		System.out.println(selectClosetLocale("en", priorityList, localeList));
		System.out.println(selectClosetLocale("fr", priorityList, localeList));
		System.out.println(selectClosetLocale("es", priorityList, localeList));
		System.out.println(selectClosetLocale("fr-ca", priorityList, localeList));
		System.out.println(selectClosetLocale("it", priorityList, localeList));
		
		printGreetings(selectClosetLocale("jp", priorityList, localeList));
	}
	
	public static Map<String, String> createLanguageTagMap() {
		Map<String, String> languageTagMap = new HashMap<>();
		languageTagMap.put("Traditional_Chinese", "zh-TW");
		languageTagMap.put("English", "en-US");
		languageTagMap.put("American_English", "en-US");
		languageTagMap.put("French", "fr");
		languageTagMap.put("Canadian_French", "fr-CA");
		languageTagMap.put("Spanish", "es");
		
		return languageTagMap;
	}
	
	public static List<Locale> createLocaleList(Collection<String> collection) {
		List<Locale> localeList = new ArrayList<>();
		collection.forEach(tag -> localeList.add(Locale.forLanguageTag(tag)));
		
		return localeList;
	}
	
	public static void printGreetings(Locale locale) {
		ResourceBundle messageBundle = ResourceBundle.getBundle("language_bundles/MessagesBundle", locale);
		System.out.println("=====" + messageBundle.getString("greetings") + "=====");
		Integer count = 1;
		for (String key : messageBundle.keySet()) {
			if (!key.equals("greetings")) {
				System.out.println(count++ + ": " + messageBundle.getString(key));
			}
		}
	}
	
	public static Locale selectClosetLocale(String languageTag, List<LanguageRange> priorityList, List<Locale> localeList) {
		// Complete your code here!
		return null;
	}
	
}
