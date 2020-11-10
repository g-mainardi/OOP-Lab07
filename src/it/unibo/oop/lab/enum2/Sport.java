/**
 * 
 */
package it.unibo.oop.lab.enum2;

/**
 * Represents an enumeration for declaring sports.
 * 
 * 1) You must add a field keeping track of the number of members each team is
 * composed of (1 for individual sports)
 * 
 * 2) A second field will keep track of the name of the sport.
 * 
 * 3) A third field, of type Place, will allow to define if the sport is
 * practiced indoor or outdoor
 * 
 */
public enum Sport {

    /*
     * TODO
     * 
     * Declare the following sports:
     * 
     * - basket
     * 
     * - volley
     * 
     * - tennis
     * 
     * - bike
     * 
     * - F1
     * 
     * - motogp
     * 
     * - soccer
     * 
     */

	BASKET(Place.INDOOR, "Basket", 5),
	VOLLEY(Place.INDOOR, "Volley", 6),
	TENNIS(Place.OUTDOOR, "Tennis", 1),
	BIKE(Place.OUTDOOR, "Bike", 1),
	F1(Place.OUTDOOR, "F1", 1),
	MOTOGP(Place.OUTDOOR, "Moto GP", 1),
	SOCCER(Place.OUTDOOR, "Soccer", 11);
	
    /*
     * TODO
     * 
     * [FIELDS]
     * 
     * Declare required fields
     */
	
	private final Place place;
	private final String actualName;
	private int nTeamMembers;


    /*
     * TODO
     * 
     * [CONSTRUCTOR]
     * 
     * Define a constructor like this:
     * 
     * - Sport(final Place place, final int nTeamMembers, final String actualName)
     */

	private Sport(final Place place, final String actualName, final int nTeamMembers) {
		this.place = place;
		this.actualName = actualName;
		this.nTeamMembers = nTeamMembers;
	}
	
    /*
     * TODO
     * 
     * [METHODS] To be defined
     * 
     * 
     * 1) public boolean isIndividualSport()
     * 
     * Must return true only if called on individual sports
     * 
     * 
     * 2) public boolean isIndoorSport()
     * 
     * Must return true in case the sport is practices indoor
     * 
     * 
     * 3) public Place getPlace()
     * 
     * Must return the place where this sport is practiced
     * 
     * 
     * 4) public String toString()
     * 
     * Returns the string representation of a sport
     */
	
	public boolean isIndividualSport() {
		return this.nTeamMembers == 1;
	}
	
	public boolean isIndoorSport() {
		return this.getPlace().equals(Place.INDOOR);
	}

	public Place getPlace() {
		return this.place;
	}
	
	public String toString() {
		return this.actualName + " is practiced " + this.getPlace() 
		+ " and is an invididual sport : " + this.isIndividualSport();
	}
	
	
}
