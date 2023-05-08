package com.dev.superior.SQL.Table.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "Department")
public class Department {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long dept_Code;
		private String dept_Name;
		private String location;
		
		public Department() {
		}

		

		public Long getDept_Code() {
			return dept_Code;
		}



		public void setDept_Code(Long dept_Code) {
			this.dept_Code = dept_Code;
		}



		public String getDept_Name() {
			return dept_Name;
		}



		public void setDept_Name(String dept_Name) {
			this.dept_Name = dept_Name;
		}



		public String getLocation() {
			return location;
		}



		public void setLocation(String location) {
			this.location = location;
		}
		
		


		
	}
