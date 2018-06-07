package nGageMagicians.persistence;

import java.sql.Timestamp;

public class Influence {
	private Mage mage;
	private Spell spell;
	private Timestamp timeStamp;

	public Influence(Mage mage, Spell spell) {
		super();
		this.mage = mage;
		this.spell = spell;
		timeStamp = new Timestamp(System.currentTimeMillis());
	}

	public Influence(Mage mage, Spell spell, Timestamp timeStamp) {
		super();
		this.mage = mage;
		this.spell = spell;
		this.timeStamp = timeStamp;
	}

	public Mage getMage() {
		return mage;
	}

	public void setMage(Mage mage) {
		this.mage = mage;
	}

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	public Timestamp getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(Timestamp timeStamp) {
		this.timeStamp = timeStamp;
	}

	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Influence other = (Influence) obj;
		if (mage == null) {
			if (other.mage != null)
				return false;
		} else if (!mage.equals(other.mage))
			return false;
		if (spell == null) {
			if (other.spell != null)
				return false;
		} else if (!spell.equals(other.spell))
			return false;
		if (timeStamp == null) {
			if (other.timeStamp != null)
				return false;
		} else if (!timeStamp.equals(other.timeStamp))
			return false;
		return true;
	}

}
