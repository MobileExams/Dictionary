package com.mobile.android;

public class Contact {

	public String getCode() {
		return Code;
	}

	public void setCode(String code) {
		Code = code;
	}

	// private variables
	String _title;
	String _propeties;

	public Contact(String id, String title, String content, String like,
			String code) {
		super();
		this.Id=id;
		this._title=title;
		this._propeties=content;
		this._like=like;
		this.Code=code;
	}

	String _like;
	String Id;
	String Code;

	static Contact contact = new Contact();

	public Contact() {

	}

	public Contact(String _proString) {
		this._propeties = _proString;
	}

	public Contact(String id, String _title, String _propeties, String _like) {
		super();
		this.Id = id;
		this._title = _title;
		this._propeties = _propeties;
		this._like = _like;

	}

	public String get_title() {
		return _title;
	}

	public void set_title(String _title) {
		this._title = _title;
	}

	public String get_propeties() {
		return _propeties;
	}

	public void set_propeties(String _propeties) {
		this._propeties = _propeties;
	}

	public String get_like() {
		return _like;
	}

	public void set_like(String _like) {
		this._like = _like;
	}

	public String getId() {
		return Id;
	}

	public void setId(String id) {
		Id = id;
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "title:" + this._title + ":" + "propeties:" + this._propeties
				+ ":" + "like:" + this._like;
	}

}
