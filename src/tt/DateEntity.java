package tt;

import java.util.HashMap;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
@Entity
public class DateEntity extends TTData {
	@Id 
	@GeneratedValue (strategy = GenerationType.TABLE)
	protected Long ttId = null;
	@ Column
	protected String ttStyle = null;
	@ Column
	protected String ttEmail = null;
	@ Column
	protected String ttPassword = null;
	@ Column
	protected String ttName = null;
	@ Column
	protected String ttTimeZone = null;
	@ Column
	protected String ttTimeSlot = null;
	@ Column
	protected String startWorkeTime = null;
	@ Column
	protected String endWorkeTime = null;
	@ Column
	protected List<Integer> workeDays = null;
	// 0 - non selected slots, 1 - one client selects one slot, n - n clients select one slot
	@ Column
	protected Integer countClientsSelectedOneSlot = null;
	@OneToMany (targetEntity=EventEntity.class)
	protected HashMap<Long, EventEntity> ttEvents = null;  

}
