package pl.mrmario.tutorials.spring.owczarek.cz11;

import java.util.List;
import java.util.Set;

public class SomeBean {
	private List<String> stringsList;
	private Set<Integer> integerSet;
	private Long[] array;

	public SomeBean(List<String> stringsList, Set<Integer> integerSet, Long[] array) {
		super();
		this.stringsList = stringsList;
		this.integerSet = integerSet;
		this.array = array;
	}

	public List<String> getStringsList() {
		return stringsList;
	}

	public void setStringsList(List<String> stringsList) {
		this.stringsList = stringsList;
	}

	public Set<Integer> getIntegerSet() {
		return integerSet;
	}

	public void setIntegerSet(Set<Integer> integerSet) {
		this.integerSet = integerSet;
	}

	public Long[] getArray() {
		return array;
	}

	public void setArray(Long[] array) {
		this.array = array;
	}
}
