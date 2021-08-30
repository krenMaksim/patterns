package com.kren.pattern.adapter;

class AdvancedMediaPlayerAdapter implements MediaPalyer {

    private final AdvancedMediaPlayer player;

    public AdvancedMediaPlayerAdapter(AdvancedMediaPlayer player) {
        this.player = player;
    }

    @Override
    public void play(String fileType, String song) {
        switch (fileType) {
            case "Mp3":
                player.playMp3(song);
                break;
            case "Mp4":
                player.playMp4(song);
                break;
            default:
                throw new IllegalArgumentException();
        }
    }
}
