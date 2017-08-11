package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TLgLanguage;

public interface TLgLanguageDAO {
	public TLgLanguage getLanguageById(int id);
	public TLgLanguage getLanguageByName(String name);
	public List<TLgLanguage> getLanguageList();
	public void save(TLgLanguage language);
	public void delete(TLgLanguage language);
}
