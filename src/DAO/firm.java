package DAO;

import java.io.Serializable;
import java.util.List;

public class firm implements Serializable{
	
	public Integer id = null;
	public String Name =null;
	public List<woker> ListWokers = null;
	
	public firm(Integer id, String name, List<woker> listWokers) {
		super();
		this.id = id;
		Name = name;
		ListWokers = listWokers;
	}
	
	public firm(){}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ListWokers == null) ? 0 : ListWokers.hashCode());
		result = prime * result + ((Name == null) ? 0 : Name.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		firm other = (firm) obj;
		if (ListWokers == null) {
			if (other.ListWokers != null)
				return false;
		} else if (!ListWokers.equals(other.ListWokers))
			return false;
		if (Name == null) {
			if (other.Name != null)
				return false;
		} else if (!Name.equals(other.Name))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public List<woker> getListWokers() {
		return ListWokers;
	}

	public void setListWokers(List<woker> listWokers) {
		ListWokers = listWokers;
	}

	@Override
	public String toString() {
		return "firm [id=" + id + ", Name=" + Name + ", ListWokers=" + ListWokers + "]";
	}
	
	
	
}
