package com.classifieds.bean;

public class Item {
	int itemId;
	String itemCategory;
	String itemTitle;
	String shortDescription;
	String longDescription;
	float itemPrice;
	String itemPoster;
	String posterAddress;
	long posterContact;
	
	public Item(int itemId, String itemCategory, String itemTitle, String shortDescription, String longDescription,
			float itemPrice, String itemPoster, String posterAddress, long posterContact) {
		super();
		this.itemId = itemId;
		this.itemCategory = itemCategory;
		this.itemTitle = itemTitle;
		this.shortDescription = shortDescription;
		this.longDescription = longDescription;
		this.itemPrice = itemPrice;
		this.itemPoster = itemPoster;
		this.posterAddress = posterAddress;
		this.posterContact = posterContact;
	}

	public Item() {
		super();
	}

	public int getItemId() {
		return itemId;
	}

	public void setItemId(int itemId) {
		this.itemId = itemId;
	}

	public String getItemCategory() {
		return itemCategory;
	}

	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}

	public String getItemTitle() {
		return itemTitle;
	}

	public void setItemTitle(String itemTitle) {
		this.itemTitle = itemTitle;
	}

	public String getShortDescription() {
		return shortDescription;
	}

	public void setShortDescription(String shortDescription) {
		this.shortDescription = shortDescription;
	}

	public String getLongDescription() {
		return longDescription;
	}

	public void setLongDescription(String longDescription) {
		this.longDescription = longDescription;
	}

	public float getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(float itemPrice) {
		this.itemPrice = itemPrice;
	}

	public String getItemPoster() {
		return itemPoster;
	}

	public void setItemPoster(String itemPoster) {
		this.itemPoster = itemPoster;
	}

	public String getPosterAddress() {
		return posterAddress;
	}

	public void setPosterAddress(String posterAddress) {
		this.posterAddress = posterAddress;
	}

	public double getPosterContact() {
		return posterContact;
	}

	public void setPosterContact(long posterContact) {
		this.posterContact = posterContact;
	}
}