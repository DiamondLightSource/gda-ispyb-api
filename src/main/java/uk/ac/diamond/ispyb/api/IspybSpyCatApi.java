package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.util.List;
import java.util.Optional;

public interface IspybSpyCatApi extends Closeable {
    public List<String> retrieveVisitsForUser(String beamline, String username, Integer tolerance);
    public Optional<String> retrieveLatestVisitWithPrefix(String beamline, String proposalCode);
    public Optional<String> retrieveTitleForVisit(String proposalCode, Integer proposalNumber);
}
