package br.com.patterns.creational.builder;

import br.com.patterns.creational.builder.Hero.Armor;
import br.com.patterns.creational.builder.Hero.HairColor;
import br.com.patterns.creational.builder.Hero.HairType;
import br.com.patterns.creational.builder.Hero.Profession;
import br.com.patterns.creational.builder.Hero.Weapon;

public class HeroTest {

	public static void main(String[] args) {
		Hero mage = new Hero.Builder(Profession.MAGE, "Renato Portaluppi")
							.withHairColor(HairColor.BLACK)
							.withWeapon(Weapon.DAGGER).build();
		System.out.println(mage);

		Hero warrior = new Hero.Builder(Profession.WARRIOR, "Luan")
								.withHairColor(HairColor.BLOND)
								.withHairType(HairType.LONG_CURLY)
								.withArmor(Armor.CHAIN_MAIL)
								.withWeapon(Weapon.SWORD).build();
		System.out.println(warrior);
	}
}
