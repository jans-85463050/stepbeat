/**
 * 
 * 
 */

package de.cluetec.trash.stepbeat;

import java.io.IOException;

import android.content.res.AssetFileDescriptor;
import android.media.AudioManager;
import android.media.SoundPool;

/**
 * 
 * @author Jan Sauerwein
 */
public class BeatRemixer {

	private float sampleRate = 1.0f;
	private SoundPool soundPool = null;
	private int streamID = 0;
	
	public BeatRemixer() {
		this.soundPool = new SoundPool(1, AudioManager.STREAM_MUSIC, 0);
	}
	
	public void setSample(AssetFileDescriptor sampleFile) {
		int id = this.soundPool.load(sampleFile, 1);
        this.streamID = this.soundPool.play(id, 1, 1, 1, -1, sampleRate);
	}
	
	public void setRate() {
		soundPool.setRate(this.streamID, this.sampleRate);
	}
}
