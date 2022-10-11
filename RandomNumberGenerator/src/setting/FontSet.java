package setting;

import javafx.scene.text.Font;

public class FontSet {
	
	public static Font font() {
		Font font = Font.loadFont("file:" + ".\\src\\resources\\alagard.ttf", 18);
		return font;
	}

	private static Font loadFont(String string, int i) {
		// TODO Auto-generated method stub
		return null;
	}

	public FontSet() {
		// TODO Auto-generated constructor stub
	}

}

