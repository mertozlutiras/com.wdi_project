package blocker;

import de.uni_mannheim.informatik.dws.winter.matching.blockers.generators.RecordBlockingKeyGenerator;
import de.uni_mannheim.informatik.dws.winter.model.Correspondence;
import de.uni_mannheim.informatik.dws.winter.model.Matchable;
import de.uni_mannheim.informatik.dws.winter.model.Pair;
import de.uni_mannheim.informatik.dws.winter.model.defaultmodel.Attribute;
import de.uni_mannheim.informatik.dws.winter.processing.DataIterator;
import de.uni_mannheim.informatik.dws.winter.processing.Processable;
import model.Player;

public class PlayerBlockingKeyByNameNationalityGenerator extends
        RecordBlockingKeyGenerator<Player, Attribute> {

    private static final long serialVersionUID = 1L;


    @Override
    public void generateBlockingKeys(Player record, Processable<Correspondence<Attribute, Matchable>> correspondences, DataIterator<Pair<String, Player>> resultCollector) {
        String name  = record.getName();
        String nationality  = record.getNationality();
        String blockingKeyValue = "";
        if (name.length() > 2) {
            if (nationality.length() >3){
                blockingKeyValue = name.substring(0, 2) + nationality.substring(0, 3);
            }else {
                blockingKeyValue = name.substring(0, 2) + nationality;
            }
        } else {
            if (nationality.length() >3){
                blockingKeyValue = name + nationality.substring(0, 3);
            } else {
                blockingKeyValue = name + nationality;
            }
        }

        resultCollector.next(new Pair<>(blockingKeyValue, record));
    }
}
