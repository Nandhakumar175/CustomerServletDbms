package com.ebrain.dto;

import java.sql.Date;

public class CutomerDto {
	 private int id;
	    private String name;
	    private String code;
	    private String email;
	    private String phone;
	    private String contactPersonName;
	    private String contactPersonPhone;
	    private String status;
	    private Date createdDate;
	    private String createdBy;
	    private Date modifiedDate;
	    private String modifiedBy;
	    
	    // getters and setters for all the fields

	    public CutomerDto() {
			// TODO Auto-generated constructor stub
		}

		public int getId() {
	        return id;
	    }
	    
	    public void setId(int id) {
	        this.id = id;
	    }
	    
	    public String getName() {
	        return name;
	    }
	    
	    public void setName(String name) {
	        this.name = name;
	    }
	    
	    public String getCode() {
	        return code;
	    }
	    
	    public void setCode(String code) {
	        this.code = code;
	    }
	    
	    public String getEmail() {
	        return email;
	    }
	    
	    public void setEmail(String email) {
	        this.email = email;
	    }
	    
	    public String getPhone() {
	        return phone;
	    }
	    
	    public void setPhone(String phone) {
	        this.phone = phone;
	    }
	    
	    public String getContactPersonName() {
	        return contactPersonName;
	    }
	    
	    public void setContactPersonName(String contactPersonName) {
	        this.contactPersonName = contactPersonName;
	    }
	    
	    public String getContactPersonPhone() {
	        return contactPersonPhone;
	    }
	    
	    public void setContactPersonPhone(String contactPersonPhone) {
	        this.contactPersonPhone = contactPersonPhone;
	    }
	    
	    public String getStatus() {
	        return status;
	    }
	    
	    public void setStatus(String status) {
	        this.status = status;
	    }
	    
	    public Date getCreatedDate() {
	        return createdDate;
	    }
	    
	    public void setCreatedDate(Date createdDate) {
	        this.createdDate = createdDate;
	    }
	    
	    public String getCreatedBy() {
	        return createdBy;
	    }
	    
	    public void setCreatedBy(String createdBy) {
	        this.createdBy = createdBy;
	    }
	    
	    public Date getModifiedDate() {
	        return modifiedDate;
	    }
	    
	    public void setModifiedDate(Date modifiedDate) {
	        this.modifiedDate = modifiedDate;
	    }
	    
	    public String getModifiedBy() {
	        return modifiedBy;
	    }
	    
	    public void setModifiedBy(String modifiedBy) {
	        this.modifiedBy = modifiedBy;
	        
	        

}

		public CutomerDto(String name, String code, String email, String phone, String contactPersonName,
				String contactPersonPhone, String status, String createdBy, String modifiedBy) {
			super();
			this.name = name;
			this.code = code;
			this.email = email;
			this.phone = phone;
			this.contactPersonName = contactPersonName;
			this.contactPersonPhone = contactPersonPhone;
			this.status = status;
			this.createdBy = createdBy;
			this.modifiedBy = modifiedBy;
		}

		public CutomerDto(int id, Date createdDate, Date modifiedDate) {
			super();
			this.id = id;
			this.createdDate = createdDate;
			this.modifiedDate = modifiedDate;
		}

		
		

		
		

		
		

		
}
