package com.example.demo.activator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

	@Entity
	public class Cliente {
		
		@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		private String name;
		private String email;
		private String phone;
		
		private boolean active;
		
		public Cliente(String name, String email, String phone) {
			this.name = name;
			this.email = email;
			this.phone = phone;
		}

		public String getName() {
			return name;
		}

		
		public String getEmail() {
			return email;
		}

		
		public String getPhone() {
			return phone;
		}

		
		public boolean isActive() {
			return active;
		}

		public void setActive(boolean active) {
			this.active = active;
		}
		
		public void activer() {
			this.active = true;
		}

		public Long getId() {
			return id;
		}		

	}



