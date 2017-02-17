package com.example.popal94143.synthesizer;

import android.media.MediaPlayer;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class SynthesizerActivity extends AppCompatActivity {
    private final int WHOLE_NOTE = 1000;
    private static final String TAG = SynthesizerActivity.class.getName();
    private Button button1;
    private Button button2;
    private Button button3;
    private Button button4;
    private Button button5;
    private Button button6;
    private Button button7;
    private Button button8;
    private Button button9;
    private Button button10;
    private Button button11;
    private Button button12;
    private Button button13;
    private Button button14;
    private Button button15;
    private Button button16;
    private Button button17;
    private Button button18;

    private MediaPlayer mpE;
    private MediaPlayer mpF;
    private MediaPlayer mpB;
    private MediaPlayer mpD;
    private MediaPlayer mpFSharp;
    private MediaPlayer mpG;
    private MediaPlayer mpA;
    private MediaPlayer mpCSharp;
    private MediaPlayer mpEHigh;
    private MediaPlayer mpFHighSharp;
    private MediaPlayer mpC;
    private MediaPlayer mpFavoriteSong;
    private MediaPlayer mpBB;
    private MediaPlayer mpDSharp;
    private MediaPlayer mpGSharp;
    private MediaPlayer mpFHigh;
    private MediaPlayer mpGHigh;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_synthesizer);

        button1 = (Button) findViewById(R.id.eButton);
        button2 = (Button) findViewById(R.id.fButton);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        button18 = (Button) findViewById(R.id.button18);


        mpE = MediaPlayer.create(this, R.raw.scalee);
        mpF = MediaPlayer.create(this, R.raw.scalef);
        mpB = MediaPlayer.create(this, R.raw.scaleb);
        mpD = MediaPlayer.create(this, R.raw.scaled);
        mpFSharp = MediaPlayer.create(this, R.raw.scalefs);
        mpG = MediaPlayer.create(this, R.raw.scaleg);
        mpA = MediaPlayer.create(this, R.raw.scalea);
        mpCSharp = MediaPlayer.create(this, R.raw.scalecs);
        mpEHigh = MediaPlayer.create(this, R.raw.scalehighe);
        mpFHighSharp = MediaPlayer.create(this, R.raw.scalehighfs);
        mpC = MediaPlayer.create(this, R.raw.scalec);
        mpFavoriteSong = MediaPlayer.create(this, R.raw.hey_ya);
        mpBB = MediaPlayer.create(this, R.raw.scalec);
        mpDSharp = MediaPlayer.create(this, R.raw.scalec);
        mpGSharp = MediaPlayer.create(this, R.raw.scalec);
        mpFHigh = MediaPlayer.create(this, R.raw.scalec);
        mpGHigh = MediaPlayer.create(this, R.raw.scalec);

        MediaPlayer[] challenge7Array = {mpA, mpA, mpEHigh, mpEHigh, mpFHighSharp, mpFHighSharp,
                mpEHigh, mpD, mpD, mpCSharp, mpCSharp, mpB, mpB, mpA};

        ArrayList<MediaPlayer> noteList = null;
    }

    private void delayPlaying(int delay) throws InterruptedException {
        try {
            Thread.sleep(delay);
        } catch (InterruptedException e) {
            Log.e("SynthesizerActivity", "Audio playback interrupted");
        }
    }

    public void onButton1Click(View v) {
        mpE.seekTo(0);
        Log.i(TAG, "Button 1 Clicked");
        mpE.start();
    }

    public void onButton2Click(View v) {
        mpF.seekTo(0);
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
    }

    public void onButton3Click(View v) {
        mpB.seekTo(0);
        Log.i(TAG, "Button 3 Clicked");
        mpB.start();
    }

    public void onChallenge2Click(View v) {
        Log.e("SynthesizerActivity", "Challenge 1 Button clicked");
        try {
            mpE.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpF.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpFSharp.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpG.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 2);
            mpCSharp.start();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void onChallenge5Click(View v) {
        Log.e("SynthesizerActivity", "Challenge 5 Button clicked");
        try {
            mpA.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpEHigh.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpEHigh.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpFHighSharp.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpFHighSharp.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpEHigh.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpD.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpCSharp.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpCSharp.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpB.start();
            delayPlaying(WHOLE_NOTE / 4);
            mpA.start();
            delayPlaying(WHOLE_NOTE / 4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    /*MediaPlayer[] challenge7Array = {mpA, mpA, mpEHigh, mpEHigh, mpFHighSharp, mpFHighSharp,
            mpEHigh, mpD, mpD, mpCSharp, mpCSharp, mpB, mpB, mpA};*/

    public void onChallenge7Click(View v) {
        Log.e("SynthesizerActivity", "Challenge 7 Button clicked");
        try {
            for (int i = 0; i < challenge7Array.length; i++) {
                challenge7Array[i].start();
                delayPlaying(WHOLE_NOTE / 4);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public void onChallenge12Click(View v) {
        Log.e("SynthesizerActivity", "Challenge 7 Button clicked");
        try {
            mpFavoriteSong.start();
            delayPlaying(WHOLE_NOTE / 4);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    //Next part of code is my unique addition.

    //ArrayList<MediaPlayer> noteList = null;

    public void onANoteClick(View v) {
        noteList.add(mpA);
    }
    public void onBNoteClick(View v) {
        noteList.add(mpB);
        mpF.seekTo(0);
        Log.i(TAG, "Button 2 Clicked");
        mpF.start();
    }
    public void onBBNoteClick(View v) {
        noteList.add(mpBB);
    }
    public void onCNoteClick(View v) {
        noteList.add(mpC);
    }
    public void onCSharpNoteClick(View v) {
        noteList.add(mpCSharp);
    }
    public void onDNoteClick(View v) {
        noteList.add(mpD);
    }
    public void onDSharpNoteClick(View v) {
        noteList.add(mpDSharp);
    }
    public void onENoteClick(View v) {
        noteList.add(mpE);
    }
    public void onFNoteClick(View v) {
        noteList.add(mpF);
    }
    public void onFSharpNoteClick(View v) {
        noteList.add(mpFSharp);
    }
    public void onGNoteClick(View v) {
        noteList.add(mpG);
    }
    public void onGSharpNoteClick(View v) {
        noteList.add(mpGSharp);
    }
    public void onHighENoteClick(View v) {
        noteList.add(mpEHigh);
    }
    public void onHighFNoteClick(View v) {
        noteList.add(mpFHigh);
    }
    public void onHighFSharpNoteClick(View v) {
        noteList.add(mpFHighSharp);
    }
    public void onHighGNoteClick(View v) {
        noteList.add(mpGHigh);
    }

    public void onStart(View v) {
        for (MediaPlayer note: noteList){
            note.seekTo(0);
            Log.i(TAG, "Playing note.");
            note.start();
            try {
                delayPlaying(WHOLE_NOTE);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public void onReset(View v) {
        noteList = null;
    }

}