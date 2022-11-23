package com.search;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.Base;

public class SearchPojo extends Base {
	
	public SearchPojo() {
		PageFactory.initElements(driver, this);
	}
	
	
		@FindBy(id="location")
		private WebElement location;
		@FindBy(id="hotels")
		private WebElement hotels;
		@FindBy(id="room_type")
		private WebElement roomType;
		@FindBy(id="room_nos")
		private WebElement noOfRooms;
		@FindBy(id="datepick_in")
		private WebElement cinDate;
		@FindBy(id="datepick_out")
		private WebElement coutDate;
		@FindBy(id="adult_room")
		private WebElement aRoom;
		@FindBy(id="child_room")
		private WebElement cRoom;
		@FindBy(name="Submit")
		private WebElement search;
		
		public WebElement getSearch() {
			return search;
		}
		public WebElement getLocation() {
			return location;
		}
		public WebElement getHotels() {
			return hotels;
		}
		public WebElement getRoomType() {
			return roomType;
		}
		public WebElement getNoOfRooms() {
			return noOfRooms;
		}
		public WebElement getCinDate() {
			return cinDate;
		}
		public WebElement getCoutDate() {
			return coutDate;
		}
		public WebElement getaRoom() {
			return aRoom;
		}
		public WebElement getcRoom() {
			return cRoom;
		}

}
