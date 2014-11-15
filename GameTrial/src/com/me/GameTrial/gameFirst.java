package com.me.GameTrial;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input.Keys;
import com.badlogic.gdx.Screen;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureAtlas;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.maps.tiled.TiledMap;
import com.badlogic.gdx.maps.tiled.TmxMapLoader;
import com.badlogic.gdx.maps.tiled.renderers.OrthogonalTiledMapRenderer;
import com.me.GameTrial.Attacks.StandardFireBall;
import com.me.GameTrial.entities.Player;
import com.me.GameTrial.entities.positions;

public class gameFirst implements Screen {
	private OrthographicCamera camera;
	private OrthogonalTiledMapRenderer mapRenderer;
    private TiledMap map;	 
    //private Texture Texture2;
    private TextureAtlas textureAtlas;
    private Player player;
    private SpriteBatch batch;  
    private OrthogonalTiledMapRenderer renderer;
    //private MyGestureHandler gestureHandler;
    float animationTime = 0;
    boolean animationPlaying = true;
    boolean animationPlaying2 = true;
    public Animation walking;
    public Animation walkingLeft;
    public Animation walkingRight;
    public Animation walkingUp;
    //modes
    public boolean leftMode = false;
    public boolean frontMode = true;
    public boolean rightMode = false;
    public boolean upMode = false;
    public ArrayList<positions> pos = new ArrayList<positions>();
    public float zoom = 0.1f;
    public float xposCamera = 0f;
    public float yposCamera = 0f;
	public gameFirst(GameTrial game) {
		
	}

	@Override
	public void render(float delta) {
		
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		
		camera.zoom = .5f;
	    renderer.render();
	    camera.update();
	    renderer.setView(camera);
	    batch.begin();
	    
	    
	    // to move the camera
	    if(Gdx.input.isKeyPressed(Keys.A)){
	       player.moveLeft(camera, batch);
	    	
	    }else if(Gdx.input.isKeyPressed(Keys.D)){
	    	player.moveRight(camera, batch);

	    }else if(Gdx.input.isKeyPressed(Keys.S)){
	    	player.moveDown(camera, batch);

	    }else if(Gdx.input.isKeyPressed(Keys.W)){
	    	player.moveUp(camera, batch);
	       
	        
	    }else if(Gdx.input.isKeyPressed(Keys.SPACE)){
	    	player.shoot(camera, batch);
	    
	    }else{
	    
	    	if(player.frontMode){
	    		setGameToNormal(player.getTexture());
	    	}else if(player.rightMode){
	    		setGameToNormal(player.getTexture3());
	    	}else if(player.leftMode){
	    		setGameToNormal(player.getTexture2());
	    	}else if(player.upMode){
	    		setGameToNormal(player.getTexture4());
	    	}
	    	
	    }
	    
	    batch.end();
	    System.out.println(camera.position.x + " " + camera.position.y);
	}

	private void setGameToNormal(TextureRegion texture) {
		batch.draw(texture, 400, 400);
	}

	@Override
	public void resize(int width, int height) {
		camera.setToOrtho(false, 800, 800);
	}

	@Override
	public void show() {
		TmxMapLoader loader = new TmxMapLoader();
	    map = loader.load("data/StreetYard.tmx");

	    player = new Player();
	    
	    batch = new SpriteBatch();
	    camera = new OrthographicCamera();
	    renderer = new OrthogonalTiledMapRenderer(map);
		
	}

	@Override
	public void hide() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void pause() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resume() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void dispose() {
		mapRenderer.dispose();
		map.dispose();
		batch.dispose();
		textureAtlas.dispose();
	}

}
