package com.me.GameTrial;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;

public class Main {
	public static void main(String[] args) {
		LwjglApplicationConfiguration cfg = new LwjglApplicationConfiguration();
		cfg.title = "Pixel War";
		cfg.useGL20 = true;
		cfg.width = 800;
		cfg.height = 800;
		cfg.vSyncEnabled = true;
	    
		new LwjglApplication(new GameTrial(), cfg);
	}
}
