package setting;

import java.io.File;

import javafx.scene.ImageCursor;
import javafx.scene.image.Image;

public class Cursor {
	
	public static ImageCursor cursor() {
		File cursorPath = new File(".\\src\\resources\\Cursor_icon_with_shadow.png");
		Image cursorImg = new Image(cursorPath.toURI().toString());
		ImageCursor cursorImgC = new ImageCursor(cursorImg);
		return cursorImgC;
	}

}
