package com.example.exam;

/**
 * TextAndImageNote contains text and the URL to an image
 *
 */
public class TextAndImageNote extends Note {
	private String text;
	private String imageUrl;
	
	public TextAndImageNote() {
		super();
	}

	public TextAndImageNote(String text, String imageUrl) {
		this();
		this.text = text;
		this.imageUrl = imageUrl;
	}
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append(text);
		builder.append(", ");
		builder.append(imageUrl);
		return builder.toString();
	}
}
