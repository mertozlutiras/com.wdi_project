package model;
import de.uni_mannheim.informatik.dws.winter.model.AbstractRecord;
import de.uni_mannheim.informatik.dws.winter.model.defaultmodel.Attribute;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.List;

public class Player extends AbstractRecord<Attribute> implements Serializable {

    private static final long serialVersionUID = 1L;
    protected String id;
    protected String provenance;
    private String name;
    private String nationality;
    private LocalDate birth_date;
    private String birth_place;
    private List<String> positions;
    private List<String> competitions;
    private String strong_foot;
    private String club;
    private int kit_number;
    private int wage;
    private int market_value_19;
    private int est_market_value_18;
    private LocalDate contract_exp;
    private int release_clause;
    private int overall;
    private int potential;
    private String last_injury;


    public static final Attribute NAME = new Attribute("Name");
    public static final Attribute NATIONALITY = new Attribute("Nationality");
    public static final Attribute CLUB = new Attribute("Club");
    public static final Attribute BIRTHDATE = new Attribute("BirthDate");
    public static final Attribute BIRTHPLACE = new Attribute("BirthPlace");
    public static final Attribute POSITIONS = new Attribute("Positions");
    public static final Attribute COMPETITIONS = new Attribute("Competitions");
    public static final Attribute STRONGFOOT = new Attribute("StrongFoot");
    public static final Attribute KITNUMBER = new Attribute("KitNumber");
    public static final Attribute WAGE = new Attribute("Wage");
    public static final Attribute MARKETVALUE19 = new Attribute("MarketValue19");
    public static final Attribute ESTMARKETVALUE18 = new Attribute("EstMarketValue18");
    public static final Attribute CONTRACTEXP = new Attribute("ContractExp");
    public static final Attribute RELEASECLAUSE = new Attribute("ReleaseClause");
    public static final Attribute OVERALL = new Attribute("Overall");
    public static final Attribute POTENTIAL = new Attribute("Potential");
    public static final Attribute LASTINJURY = new Attribute("LastInjury");

    public Player(String identifier, String provenance) {
        id = identifier;
        this.provenance = provenance;
    }

    @Override
    public int hashCode() {
        return getIdentifier().hashCode();
    }

    @Override
    public boolean hasValue(Attribute attribute) {
        if(attribute==NAME)
            return name!=null;
        else if(attribute==NATIONALITY)
            return nationality!=null;
        else if(attribute==CLUB)
            return club!=null;
        return false;
    }

    @Override
    public String getIdentifier() {
        return id;
    }

    @Override
    public String getProvenance() {
        return provenance;
    }

    public String getId() {
        return id;
    }

    public void setId(String identifier) {
        this.id = identifier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public List<String> getPositions() {
        return positions;
    }

    public void setPositions(List<String> positions) {
        this.positions = positions;
    }

    public String getStrong_foot() {
        return strong_foot;
    }

    public void setStrong_foot(String strong_foot) {
        this.strong_foot = strong_foot;
    }

    public LocalDate getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(LocalDate birth_date) {
        this.birth_date = birth_date;
    }

    public String getBirth_place() {
        return birth_place;
    }

    public void setBirth_place(String birth_place) {
        this.birth_place = birth_place;
    }

    public int getKit_number() {
        return kit_number;
    }

    public void setKit_number(int kit_number) {
        this.kit_number = kit_number;
    }

    public int getMarket_value_19() {
        return market_value_19;
    }

    public void setMarket_value_19(int market_value_19) {
        this.market_value_19 = market_value_19;
    }

    public LocalDate getContract_exp() {
        return contract_exp;
    }

    public void setContract_exp(LocalDate contract_exp) {
        this.contract_exp = contract_exp;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }

    public int getWage() {
        return wage;
    }

    public void setWage(int wage) {
        this.wage = wage;
    }

    public int getRelease_clause() {
        return release_clause;
    }

    public void setRelease_clause(int release_clause) {
        this.release_clause = release_clause;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }

    public int getPotential() {
        return potential;
    }

    public void setPotential(int potential) {
        this.potential = potential;
    }

    public String getLast_injury() {
        return last_injury;
    }

    public void setLast_injury(String last_injury) {
        this.last_injury = last_injury;
    }


    public List<String> getCompetitions() {
        return competitions;
    }

    public void setCompetitions(List<String> competitions) {
        this.competitions = competitions;
    }

    public int getEst_market_value_18() {
        return est_market_value_18;
    }

    public void setEst_market_value_18(int est_market_value_18) {
        this.est_market_value_18 = est_market_value_18;
    }
}

