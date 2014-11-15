package com.me.GameTrial;

import com.badlogic.gdx.Game;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL10;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.scenes.scene2d.Stage;
import com.badlogic.gdx.scenes.scene2d.actions.Actions;
import com.badlogic.gdx.scenes.scene2d.ui.Image;

public class Splash implements Screen {


	private Texture texture = new Texture(Gdx.files.internal("data/splash.png"));
    private Image splashImage = new Image(texture);
    private Stage stage = new Stage();

    private Texture logo;
    private SpriteBatch spriteBatch;
    private GameTrial game;

    public Splash( GameTrial game )
    {
    	this.game = game;
    }
   
   @Override
    public void show()
    {
        logo = new Texture(Gdx.files.internal("data/splash.png"));
        spriteBatch = new SpriteBatch();
    }
  
    @Override
    public void render(float delta)
    {
    	handleInput();
  
        GL10 gl = Gdx.graphics.getGL10();        
       
 
        spriteBatch.begin();
        spriteBatch.draw(logo, 0, 0, 800, 800);
        spriteBatch.end();
    }
    private void handleInput()
     {
         if(Gdx.input.justTouched())
         {
            game.setScreen(new gameFirst(game));
             
         }
     }
  
    @Override
     public void resize(int width, int height) {
    }
     @Override
     public void hide() {
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
