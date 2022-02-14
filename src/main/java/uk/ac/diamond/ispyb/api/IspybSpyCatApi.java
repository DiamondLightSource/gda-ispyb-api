package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.util.List;
import java.util.Optional;

public interface IspybSpyCatApi extends Closeable {
    public List<String> retrieveVisitsForUser(String beamline, String username, Integer tolerance);
    public Optional<String> retrieveLatestVisitWithPrefix(String beamline, String proposalCode);
    public Optional<String> retrieveTitleForProposal(String proposalCode, Integer proposalNumber);
    public List<Session> retrieveCurrentSessions(String beamline, Integer toleranceMinutes);
    public List<SessionPerson> retrievePersonsForSession(String proposalCode, Integer proposalNumber, Integer visitNumber);
}
