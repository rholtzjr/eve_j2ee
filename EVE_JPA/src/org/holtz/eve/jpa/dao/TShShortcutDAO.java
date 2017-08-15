package org.holtz.eve.jpa.dao;

import java.util.List;

import org.holtz.eve.jpa.entity.TShShortcut;

public interface TShShortcutDAO {
	public TShShortcut getShortcutById(int id);
	public TShShortcut getShortcutByName(String name);
	public List<TShShortcut> getShortcutList();
	public void save(TShShortcut shortcut);
	public void delete(TShShortcut shortcut);
}
