package com.me.GameTrial.Attacks;

import java.util.ArrayList;

import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.graphics.OrthographicCamera;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;
import com.badlogic.gdx.graphics.g2d.TextureRegion;
import com.badlogic.gdx.math.Vector2;
import com.me.GameTrial.entities.CollisionObjects;
import com.me.GameTrial.entities.positions;

 
public class StandardFireBall {

	public static final float SPEED = 2.0f;
	public ArrayList<positions> pos = new ArrayList<positions>();
	
	//animation parameters
	public boolean leftMode = false;
	public boolean frontMode = true;
	public boolean rightMode = false;
	public boolean upMode = false;
	public float animationTime = 0;
    boolean animationPlaying = true;
    boolean animationPlaying2 = true;
	//Texture Utilities
	private Texture walkSheet;
	private TextureRegion[][] tmp;  
	private TextureRegion Texture;
    private TextureRegion Texture2;
    private TextureRegion Texture3;
    private TextureRegion Texture4;
    private TextureRegion TextureShootLeft;
    private TextureRegion TextureShootRight;
    private TextureRegion TextureShootDown;
    private TextureRegion TextureShootUp;
    public Animation walking;
    public Animation walkingLeft;
    private Sprite sp;

	public Animation walkingRight;
    public Animation walkingUp;
    
    public StandardFireBall() {
    	walkSheet = new Texture(Gdx.files.internal("data/modified2.png"));
    	tmp = TextureRegion.split(walkSheet, walkSheet.getWidth()/6, walkSheet.getHeight()/6);
    	Texture = tmp[1][2];
    	Texture text = tmp[2][0].getTexture();
	    Texture2 = tmp[2][0];
	    sp = new Sprite(text);
	    Texture3 = tmp[0][1];
	    Texture4 = tmp[0][0];
	    TextureShootLeft = tmp[4][0];
	    TextureShootRight = tmp[5][0];
	    TextureShootUp = tmp[4][1];
	    TextureShootDown = tmp[4][2];
	    walking = new Animation(1/10f,tmp[2][2],tmp[3][2]);
	    walking.setPlayMode(Animation.LOOP);
	    walkingLeft = new Animation(1/10f,tmp[3][0],tmp[1][0]);
	    
	    walkingLeft.setPlayMode(Animation.LOOP);
	    walkingRight = new Animation(1/10f,tmp[2][1],tmp[1][1]);
	    walkingRight.setPlayMode(Animation.LOOP);
	    walkingUp = new Animation(1/10f,tmp[0][2],tmp[3][1]);
	    walkingUp.setPlayMode(Animation.LOOP);

	    
	    CollisionObjects CO = new CollisionObjects();
	    pos = CO.positionsTop();
    }
    
    private void setGameToNormal(TextureRegion texture, SpriteBatch batch) {
    	
		batch.draw(texture, 400, 400);
	}
    
	public void moveUp(OrthographicCamera camera, SpriteBatch batch) {
    	boolean settonormal = false;
    	for(int i=0; i<pos.size(); i++){
    		if(camera.position.x == pos.get(i).getX() && camera.position.y == pos.get(i).getY()){
    			settonormal = true;
    		}
    		
    	}
    	
    	if(settonormal){
    		setGameToNormal(Texture4, batch);
    	}else{
    		camera.position.y +=2;
	        animationPlaying  = true;
            if(animationPlaying){
            	
		        batch.draw(walkingUp.getKeyFrame(animationTime  += Gdx.graphics.getDeltaTime()), 400, 400);
		        if(walkingUp.isAnimationFinished(animationTime)){
		        	animationPlaying = false;
		        	leftMode = false;
		        	frontMode = false;
		        	rightMode = false;
		        	upMode = true;
		        	animationTime = 0;
		        }
            }
    	}
    }
    
    public void moveDown(OrthographicCamera camera, SpriteBatch batch) {
    	camera.position.y -=2;
        
        animationPlaying  = true;
        if(animationPlaying){
        	
            batch.draw(walking.getKeyFrame(animationTime  += Gdx.graphics.getDeltaTime()), 400, 400);
            if(walking.isAnimationFinished(animationTime)){
            	animationPlaying = false;
            	leftMode = false;
            	frontMode = true;
            	rightMode = false;
            	upMode = false;
            	animationTime = 0;
            
            }
        }
    }
    
    public void moveRight(OrthographicCamera camera, SpriteBatch batch) {
    	camera.position.x +=2;
        
        animationPlaying  = true;
        if(animationPlaying){
        	
            batch.draw(walkingRight.getKeyFrame(animationTime  += Gdx.graphics.getDeltaTime()), 400, 400);
            if(walkingRight.isAnimationFinished(animationTime)){
            	animationPlaying = false;
            	leftMode = false;
            	frontMode = false;
            	rightMode = true;
            	upMode = false;
            	animationTime = 0;
            
            }
        }
    }
    
    public void moveLeft(OrthographicCamera camera, SpriteBatch batch) {
    	
        int x = 400;
        int y = 400;
        
        animationPlaying  = true;
        if(animationPlaying){
        	batch.draw(sp, x, y);
        	while(animationPlaying) {
            	if(x != 0) {
            		sp.translateX(2);
            		
                	x--;
            	} else {
            		animationPlaying = false;
            	}
            	
            }
        }
        
            
        
        	
            
        
    }
    public TextureRegion getTexture() {
		return Texture;
	}

	public void setTexture(TextureRegion texture) {
		Texture = texture;
	}

	public TextureRegion getTexture2() {
		return Texture2;
	}

	public void setTexture2(TextureRegion texture2) {
		Texture2 = texture2;
	}

	public TextureRegion getTexture3() {
		return Texture3;
	}

	public void setTexture3(TextureRegion texture3) {
		Texture3 = texture3;
	}

	public TextureRegion getTexture4() {
		return Texture4;
	}

	public void setTexture4(TextureRegion texture4) {
		Texture4 = texture4;
	}

	
}