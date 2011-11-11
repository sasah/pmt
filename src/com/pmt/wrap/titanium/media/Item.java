package com.pmt.wrap.titanium.media;

import com.google.gwt.core.client.JavaScriptObject;

/**
 * <b>Titanium.Media.Item</b>
 * <p>
 * A representation of a media item returned by the music picker as part of the items array in the dictionary passed to its success function.
 * <p>
 * <b>Platforms:</b> iphone ipad 
 * <p>
 * <b>Since:</b> 1.4.0
 * <p>
 * <b>Type:</b> object
 * <p>
 * <b>Subtype:</b> null
 * <p>
 * <b>Returns:</b> null
 */
public class Item {

	private JavaScriptObject handler;

	public Item(JavaScriptObject handler) {
		this.handler = handler;
	}
	
	public JavaScriptObject getHandler() {
		return handler;
	}

	/**
	 * <b>albumArtist</b> (string)
	 * <p>
	 * the artist for the album of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getAlbumArtist() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.albumArtist;
	}-*/;

	/**
	 * <b>albumArtist</b> (string)
	 * <p>
	 * the artist for the album of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setAlbumArtist(String albumArtist) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.albumArtist = albumArtist;
	}-*/;

	/**
	 * <b>albumTitle</b> (string)
	 * <p>
	 * the album title of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getAlbumTitle() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.albumTitle;
	}-*/;

	/**
	 * <b>albumTitle</b> (string)
	 * <p>
	 * the album title of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setAlbumTitle(String albumTitle) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.albumTitle = albumTitle;
	}-*/;

	/**
	 * <b>albumTrackCount</b> (int)
	 * <p>
	 * the number of tracks for the album of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getAlbumTrackCount() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.albumTrackCount;
	}-*/;

	/**
	 * <b>albumTrackCount</b> (int)
	 * <p>
	 * the number of tracks for the album of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setAlbumTrackCount(int albumTrackCount) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.albumTrackCount = albumTrackCount;
	}-*/;

	/**
	 * <b>albumTrackNumber</b> (int)
	 * <p>
	 * the track number of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getAlbumTrackNumber() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.albumTrackNumber;
	}-*/;

	/**
	 * <b>albumTrackNumber</b> (int)
	 * <p>
	 * the track number of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setAlbumTrackNumber(int albumTrackNumber) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.albumTrackNumber = albumTrackNumber;
	}-*/;

	/**
	 * <b>artist</b> (string)
	 * <p>
	 * the artist of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getArtist() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.artist;
	}-*/;

	/**
	 * <b>artist</b> (string)
	 * <p>
	 * the artist of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setArtist(String artist) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.artist = artist;
	}-*/;

	/**
	 * <b>artwork</b> (object)
	 * <p>
	 * a blob object containing the image for the item's artwork, or null if none
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native JavaScriptObject getArtwork() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.artwork;
	}-*/;

	/**
	 * <b>artwork</b> (object)
	 * <p>
	 * a blob object containing the image for the item's artwork, or null if none
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setArtwork(JavaScriptObject artwork) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.artwork = artwork;
	}-*/;

	/**
	 * <b>composer</b> (string)
	 * <p>
	 * the composer of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getComposer() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.composer;
	}-*/;

	/**
	 * <b>composer</b> (string)
	 * <p>
	 * the composer of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setComposer(String composer) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.composer = composer;
	}-*/;

	/**
	 * <b>discCount</b> (int)
	 * <p>
	 * the total number of discs of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getDiscCount() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.discCount;
	}-*/;

	/**
	 * <b>discCount</b> (int)
	 * <p>
	 * the total number of discs of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setDiscCount(int discCount) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.discCount = discCount;
	}-*/;

	/**
	 * <b>discNumber</b> (int)
	 * <p>
	 * the disc number of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getDiscNumber() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.discNumber;
	}-*/;

	/**
	 * <b>discNumber</b> (int)
	 * <p>
	 * the disc number of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setDiscNumber(int discNumber) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.discNumber = discNumber;
	}-*/;

	/**
	 * <b>genre</b> (string)
	 * <p>
	 * the genre of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getGenre() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.genre;
	}-*/;

	/**
	 * <b>genre</b> (string)
	 * <p>
	 * the genre of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setGenre(String genre) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.genre = genre;
	}-*/;

	/**
	 * <b>isCompilation</b> (boolean)
	 * <p>
	 * true if the item is part of a compilation album
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native boolean getIsCompilation() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.isCompilation;
	}-*/;

	/**
	 * <b>isCompilation</b> (boolean)
	 * <p>
	 * true if the item is part of a compilation album
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setIsCompilation(boolean isCompilation) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.isCompilation = isCompilation;
	}-*/;

	/**
	 * <b>lyrics</b> (string)
	 * <p>
	 * the lyrics of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getLyrics() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.lyrics;
	}-*/;

	/**
	 * <b>lyrics</b> (string)
	 * <p>
	 * the lyrics of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setLyrics(String lyrics) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.lyrics = lyrics;
	}-*/;

	/**
	 * <b>mediaType</b> (int)
	 * <p>
	 * the type of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getMediaType() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.mediaType;
	}-*/;

	/**
	 * <b>mediaType</b> (int)
	 * <p>
	 * the type of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setMediaType(int mediaType) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.mediaType = mediaType;
	}-*/;

	/**
	 * <b>playCount</b> (int)
	 * <p>
	 * the number of times the item has been played
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getPlayCount() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.playCount;
	}-*/;

	/**
	 * <b>playCount</b> (int)
	 * <p>
	 * the number of times the item has been played
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setPlayCount(int playCount) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.playCount = playCount;
	}-*/;

	/**
	 * <b>playbackDuration</b> (double)
	 * <p>
	 * the length (in seconds) of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native double getPlaybackDuration() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.playbackDuration;
	}-*/;

	/**
	 * <b>playbackDuration</b> (double)
	 * <p>
	 * the length (in seconds) of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setPlaybackDuration(double playbackDuration) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.playbackDuration = playbackDuration;
	}-*/;

	/**
	 * <b>podcastTitle</b> (string)
	 * <p>
	 * the title of a podcast item.  Only for media types of Titanium.Media.MUSIC_MEDIA_TYPE_PODCAST.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getPodcastTitle() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.podcastTitle;
	}-*/;

	/**
	 * <b>podcastTitle</b> (string)
	 * <p>
	 * the title of a podcast item.  Only for media types of Titanium.Media.MUSIC_MEDIA_TYPE_PODCAST.
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setPodcastTitle(String podcastTitle) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.podcastTitle = podcastTitle;
	}-*/;

	/**
	 * <b>rating</b> (int)
	 * <p>
	 * the rating of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getRating() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.rating;
	}-*/;

	/**
	 * <b>rating</b> (int)
	 * <p>
	 * the rating of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setRating(int rating) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.rating = rating;
	}-*/;

	/**
	 * <b>skipCount</b> (int)
	 * <p>
	 * the number of times the item has been skipped
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native int getSkipCount() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.skipCount;
	}-*/;

	/**
	 * <b>skipCount</b> (int)
	 * <p>
	 * the number of times the item has been skipped
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setSkipCount(int skipCount) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.skipCount = skipCount;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the title of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native String getTitle() /*-{
		return this.@com.pmt.wrap.titanium.media.Item::handler.title;
	}-*/;

	/**
	 * <b>title</b> (string)
	 * <p>
	 * the title of the item
	 * <p>
	 * <b>Platforms:</b> iphone ipad, <b>Since:</b> 1.4.0
	 */
	public native void setTitle(String title) /*-{
		this.@com.pmt.wrap.titanium.media.Item::handler.title = title;
	}-*/;
}
