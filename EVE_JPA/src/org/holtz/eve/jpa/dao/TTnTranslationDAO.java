package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TTnTranslation;

public interface TTnTranslationDAO {
	public TTnTranslation getTranslationById(int id);
	public TTnTranslation getTranslationByName(String name);
	public List<TTnTranslation> getTranslationList();
	public void save(TTnTranslation translation);
	public void delete(TTnTranslation translation);
}
