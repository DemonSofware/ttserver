package tt;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class EventEntity extends TTEvent {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	protected Long eId = null;
	
	@Column
	protected Date eStartDate = null;
	
	@Column
	protected Integer eSize = null; //in minutes
	
	@Column
	protected String eTag = null;
	
	@Column
	protected Boolean isEventInfoAvailableForClient = null;
}
