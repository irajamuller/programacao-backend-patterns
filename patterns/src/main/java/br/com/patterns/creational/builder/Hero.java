package br.com.patterns.creational.builder;

public class Hero {
	public enum Armor {
		CLOTHES, LEATHER, CHAIN_MAIL, PLATE_MAIL;
	}

	public enum HairColor {
		WHITE, BLOND, RED, BROWN, BLACK;
	}

	public enum HairType {
		BALD, SHORT, CURLY, LONG_STRAIGHT, LONG_CURLY;
	}

	public enum Profession {
		WARRIOR, THIEF, MAGE, PRIEST;
	}

	public enum Weapon {
		DAGGER, SWORD, AXE, WARHAMMER, BOW;
	}

	private Profession profession;
	private String name;
	private HairType hairType;
	private HairColor hairColor;
	private Armor armor;
	private Weapon weapon;

	private Hero(Builder builder) {
		profession = builder.profession;
		name = builder.name;
		hairColor = builder.hairColor;
		hairType = builder.hairType;
		weapon = builder.weapon;
		armor = builder.armor;
	}

	public Profession getProfession() {
		return profession;
	}

	public String getName() {
		return name;
	}

	public HairType getHairType() {
		return hairType;
	}

	public HairColor getHairColor() {
		return hairColor;
	}

	public Armor getArmor() {
		return armor;
	}

	public Weapon getWeapon() {
		return weapon;
	}

	
	@Override
	public String toString() {
		return "Hero [profession=" + profession + ", name=" + name + ", hairType=" + hairType + ", hairColor="
				+ hairColor + ", armor=" + armor + ", weapon=" + weapon + "]";
	}

	public static class Builder {
		private Profession profession;
		private String name;
		private HairType hairType;
		private HairColor hairColor;
		private Armor armor;
		private Weapon weapon;

		public Builder(Profession profession, String name) {
			if (profession == null || name == null) {
				throw new IllegalArgumentException("profession and name can not be null");
			}
			this.profession = profession;
			this.name = name;
		}

		public Builder withHairType(HairType hairType) {
			this.hairType = hairType;
			return this;
		}

		public Builder withHairColor(HairColor hairColor) {
			this.hairColor = hairColor;
			return this;
		}

		public Builder withArmor(Armor armor) {
			this.armor = armor;
			return this;
		}

		public Builder withWeapon(Weapon weapon) {
			this.weapon = weapon;
			return this;
		}

		public Hero build() {
			return new Hero(this);
		}
	}
}
