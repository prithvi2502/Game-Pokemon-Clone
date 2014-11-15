package com.me.GameTrial;




import java.util.ArrayList;

import com.badlogic.gdx.ApplicationListener;
import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.me.GameTrial.entities.Player;
import com.me.GameTrial.entities.positions;
 

/**
 * See: http://blog.xoppa.com/loading-models-using-libgdx/
 * @author Xoppa
 */
public class GameTrial extends Game {
	public static int WIDTH;
	      public static int HEIGHT;
	 
	     @Override
	     public void create() {
	         WIDTH = Gdx.graphics.getWidth();
	         HEIGHT = Gdx.graphics.getHeight();
	  
	         Texture.setEnforcePotImages(false);
	         setScreen( new Splash(this) );
	         }
	     @Override
	     public void resize(int width, int height) {
	     }
	     @Override
	     public void pause() {
	     }
	     @Override
	     public void resume() {
	     }
	     @Override
	     public void dispose() {
	     }
    
}