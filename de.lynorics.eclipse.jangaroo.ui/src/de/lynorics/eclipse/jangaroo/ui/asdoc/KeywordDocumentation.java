package de.lynorics.eclipse.jangaroo.ui.asdoc;

public class KeywordDocumentation {

	private String name;
	private String description;
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
	public boolean isSuitable(String match) {
		String[] strings = name.split(" ");
		if (strings != null) {
			for (String string : strings) {
				if (string.equals(match)) {
					return true;
				}
			}
		}
		strings = name.split("\\.");
		if (strings != null) {
			for (String string : strings) {
				if (string.equals(match)) {
					return true;
				}
			}
		}
		return false;
	}
}
