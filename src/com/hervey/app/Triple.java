package com.hervey.app;


	
public class Triple<S, I>{
	public S stringValue;
	public I integerValue1;
	public I integerValue2;
	
	public Triple(S stringValue, I integerValue1, I integerValue2) {
		this.stringValue=stringValue;
		this.integerValue1=integerValue1;
		this.integerValue2=integerValue2;	
	}

	public S getStringValue() {
		return stringValue;
	}

	public void setStringValue(S stringValue) {
		this.stringValue = stringValue;
	}

	public I getIntegerValue1() {
		return integerValue1;
	}

	public void setIntegerValue1(I integerValue1) {
		this.integerValue1 = integerValue1;
	}

	public I getIntegerValue2() {
		return integerValue2;
	}

	public void setIntegerValue2(I integerValue2) {
		this.integerValue2 = integerValue2;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((integerValue1 == null) ? 0 : integerValue1.hashCode());
		result = prime * result + ((integerValue2 == null) ? 0 : integerValue2.hashCode());
		result = prime * result + ((stringValue == null) ? 0 : stringValue.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Triple other = (Triple) obj;
		if (integerValue1 == null) {
			if (other.integerValue1 != null)
				return false;
		} else if (!integerValue1.equals(other.integerValue1))
			return false;
		if (integerValue2 == null) {
			if (other.integerValue2 != null)
				return false;
		} else if (!integerValue2.equals(other.integerValue2))
			return false;
		if (stringValue == null) {
			if (other.stringValue != null)
				return false;
		} else if (!stringValue.equals(other.stringValue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Triple [stringValue=" + stringValue + ", integerValue1=" + integerValue1 + ", integerValue2="
				+ integerValue2 + "]";
	}
		
		
		
		
		
		
	
	
	
	

}
