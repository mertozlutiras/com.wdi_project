package evaluation;

import de.uni_mannheim.informatik.dws.winter.datafusion.EvaluationRule;
import de.uni_mannheim.informatik.dws.winter.model.Correspondence;
import de.uni_mannheim.informatik.dws.winter.model.Matchable;
import de.uni_mannheim.informatik.dws.winter.model.defaultmodel.Attribute;
import model.Player;

public class BirthDateEvaluationRule extends EvaluationRule<Player, Attribute> {

    @Override
    public boolean isEqual(Player record1, Player record2, Attribute schemaElement) {
        if(record1.getBirth_date()==null && record2.getBirth_date()==null)
            return true;
        else if(record1.getBirth_date()==null || record2.getBirth_date()==null)
            return false;
        else
            return record1.getBirth_date().getYear() == record2.getBirth_date().getYear();
    }

    @Override
    public boolean isEqual(Player record1, Player record2,
                           Correspondence<Attribute, Matchable> schemaCorrespondence) {
        return isEqual(record1, record2, (Attribute)null);
    }

}

