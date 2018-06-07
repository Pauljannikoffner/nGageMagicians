package nGageMagicians.persistence;

import java.sql.Timestamp;

import nGageMagicians.common.Severity;
import nGageMagicians.common.Target;

public class Spell {

	private String name;
	private String description;
	private int duration;
	private Target target;
	private Severity severity;
	private Timestamp firstCreated;
	private String imagePath;
	private String soundPath;

	public Spell(String name, String description, int duration, Target target, Severity severity,
			Timestamp firstCreated, String imagePath, String soundPath) {
		super();
		this.name = name;
		this.description = description;
		this.duration = duration;
		this.target = target;
		this.severity = severity;
		this.firstCreated = firstCreated;
		this.imagePath = imagePath;
		this.soundPath = soundPath;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getDuration() {
		return duration;
	}

	public void setDuration(int duration) {
		this.duration = duration;
	}

	public Target getTarget() {
		return target;
	}

	public void setTarget(Target target) {
		this.target = target;
	}

	public Severity getSeverity() {
		return severity;
	}

	public void setSeverity(Severity severity) {
		this.severity = severity;
	}

	public Timestamp getFirstCreated() {
		return firstCreated;
	}

	public void setFirstCreated(Timestamp firstCreated) {
		this.firstCreated = firstCreated;
	}

	public String getImagePath() {
		return imagePath;
	}

	public void setImagePath(String imagePath) {
		this.imagePath = imagePath;
	}

	public String getSoundPath() {
		return soundPath;
	}

	public void setSoundPath(String soundPath) {
		this.soundPath = soundPath;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spell other = (Spell) obj;
		if (description == null) {
			if (other.description != null)
				return false;
		} else if (!description.equals(other.description))
			return false;
		if (duration != other.duration)
			return false;
		if (firstCreated == null) {
			if (other.firstCreated != null)
				return false;
		} else if (!firstCreated.equals(other.firstCreated))
			return false;
		if (imagePath == null) {
			if (other.imagePath != null)
				return false;
		} else if (!imagePath.equals(other.imagePath))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (severity != other.severity)
			return false;
		if (soundPath == null) {
			if (other.soundPath != null)
				return false;
		} else if (!soundPath.equals(other.soundPath))
			return false;
		if (target != other.target)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Spell [name=" + name + ", description=" + description + ", duration=" + duration + ", target=" + target
				+ ", severity=" + severity + ", firstCreated=" + firstCreated + ", imagePath=" + imagePath
				+ ", soundPath=" + soundPath + "]";
	}

}
