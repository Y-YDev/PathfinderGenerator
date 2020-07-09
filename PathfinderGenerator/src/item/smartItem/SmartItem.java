package item.smartItem;

import java.util.ArrayList;

/**
 * represente les propriété d'un objet intelligent.
 * @author Mentra20
 *
 */
public class SmartItem {
	private String alignement;//L'alignement de l'objet intelligent.
	private double basePrice;//Prix de base de l'objet.
	private int ego;//L'ego de l'objet.
	private double price;//Prix bonus de l'objet
	private int langage;//Nombre de langue connue par l'objet.
	private ArrayList<SmartItemCommunication> communication;//Capacité de communication de l'objet
	private ArrayList<SmartItemSkill> skill;//Pouvoirs des objets intelligents
	private SmartItemDedicatePower dedicatePower;//Pouvoir dédié de l'objet.
	private SmartItemPlan plan;//Objectif d'un objet intelligent.
	private ArrayList<String> traits;//Traits de l'objet.
	
	private SmartItemStat Int;//Intelligence de l'objet
	private SmartItemStat Sag;//Sagesse de l'objet
	private SmartItemStat Char;//Charisme de l'objet
	
	public SmartItem(double basePrice) {
		this.setEgo(0);
		this.setBasePrice(basePrice);
		this.setPrice(500);//un objet intelligent coute 500 po de plus
		this.setPlan(null);
		this.setPower(null);
		
		this.setCommunication(new ArrayList<SmartItemCommunication>());
		this.setSkill(new ArrayList<SmartItemSkill>());
		this.setTraits(new ArrayList<String>());
		
		//Capacité que tout les objets intelligents ont..
		this.getCommunication().add(new SmartItemCommunication("Empathie", 0, 0));
		this.getCommunication().add(new SmartItemCommunication("Sens (9m)", 0, 0));
	}

	public SmartItemStat getInt() {
		return Int;
	}

	public void setInt(SmartItemStat i) {
		Int = i;
	}

	public SmartItemStat getSag() {
		return Sag;
	}

	public void setSag(SmartItemStat sag) {
		Sag = sag;
	}

	public SmartItemStat getChar() {
		return Char;
	}

	public void setChar(SmartItemStat c) {
		Char = c;
	}

	public String getAlignement() {
		return alignement;
	}

	public void setAlignement(String alignement) {
		this.alignement = alignement;
	}

	public int getEgo() {
		return ego;
	}

	public void setEgo(int ego) {
		this.ego = ego;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getLangage() {
		return langage;
	}

	public void setLangage(int langage) {
		this.langage = langage;
	}

	public ArrayList<SmartItemCommunication> getCommunication() {
		return communication;
	}

	public void setCommunication(ArrayList<SmartItemCommunication> communication) {
		this.communication = communication;
	}

	public ArrayList<SmartItemSkill> getSkill() {
		return skill;
	}

	public void setSkill(ArrayList<SmartItemSkill> skill) {
		this.skill = skill;
	}

	public SmartItemDedicatePower getPower() {
		return dedicatePower;
	}

	public void setPower(SmartItemDedicatePower power) {
		this.dedicatePower = power;
	}

	public SmartItemPlan getPlan() {
		return plan;
	}

	public void setPlan(SmartItemPlan plan) {
		this.plan = plan;
	}

	public ArrayList<String> getTraits() {
		return traits;
	}

	public void setTraits(ArrayList<String> traits) {
		this.traits = traits;
	}

	public double getBasePrice() {
		return basePrice;
	}

	public void setBasePrice(double basePrice) {
		this.basePrice = basePrice;
	}
}
