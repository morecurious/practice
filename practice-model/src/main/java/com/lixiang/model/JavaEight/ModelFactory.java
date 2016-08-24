package com.lixiang.model.JavaEight;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by lixiang on 8/24/2016.
 */
public class ModelFactory {

    /**
     * 获得一个album集合
     * @return
     */
    public static List<Album> getAlbums(){
        List<Album> albumList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Album album = new Album();
            album.setName(i+"name");
            albumList.add(album);
        }
        return albumList;
    }

    /**
     * 获得一个Aritist集合
     * @return
     */
    public static List<Artist> getAritists(){
        List<Artist> artists = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Artist artist = new Artist();
            artist.setName(i+"name");
            artist.setOrigin("china");
            artists.add(artist);
        }
        return artists;
    }

}
