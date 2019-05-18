package com.xworkz.maven.dto;

import java.io.Serializable;
import java.util.Date;

public class AddAlbumDTO implements Serializable{
	private String albumName;
	private String artist;
	private String language;
	private String genre;
	private Date date;
	private int noOfSongs;
	
	
	
	
	public AddAlbumDTO() {
		System.out.println("created:\t"+this.getClass().getSimpleName());
	}

	public String getAlbumName() {
		return albumName;
	}

	public void setAlbumName(String albumName) {
		this.albumName = albumName;
	}

	public String getArtist() {
		return artist;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public int getNoOfSongs() {
		return noOfSongs;
	}

	public void setNoOfSongs(int noOfSongs) {
		this.noOfSongs = noOfSongs;
	}

	@Override
	public String toString() {
		return "AddAlbumDTO [albumName=" + albumName + ", artist=" + artist + ", language=" + language + ", genre="
				+ genre + ", date=" + date + ", noOfSongs=" + noOfSongs + "]";
	}
	
	

}
