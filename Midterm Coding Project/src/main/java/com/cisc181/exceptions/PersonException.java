package com.cisc181.exceptions;

import com.cisc181.core.Person;

public class PersonException extends Exception {

		private Person p;

		public PersonException(Person p) {
			super();
			this.p = p;
		}

		protected Person getp() {
			return p;
		}
		
	}

