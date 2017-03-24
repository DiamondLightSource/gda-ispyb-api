package uk.ac.diamond.ispyb.api;

import java.io.Closeable;
import java.util.List;

public interface IspybXpdfApi extends Closeable {
    List<Sample> retrieveSamplesAssignedForProposal(String proposalCode, Long proposalNumber);
}
