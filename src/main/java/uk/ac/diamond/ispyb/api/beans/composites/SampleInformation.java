package uk.ac.diamond.ispyb.api.beans.composites;

import java.util.List;

import uk.ac.diamond.ispyb.api.Component;
import uk.ac.diamond.ispyb.api.ComponentLattice;
import uk.ac.diamond.ispyb.api.DataCollectionPlan;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

/**
 * 
 * This composite assumes a 1:1 mapping between Component and Lattice as per
 * https://confluence.diamond.ac.uk/x/uRSvAw
 * 
 * @author Matthew Gerring
 *
 */
public class SampleInformation {
	
	private long sampleId;

	public SampleInformation() {
		
	}
	public SampleInformation(long sampleId) {
		this.sampleId = sampleId;
	}

	/**
	 * List of DataCollectionPlans for sample
	 */
	private List<DataCollectionPlan> plans;
	
	/**
	 * List of components for sample
	 */
	private List<Component>          components;
	
	/**
	 * Insertion Ordered Map of sampleid -> DataCollectionPlan
	 */
	private List<ComponentLattice>   lattices;

	public long getSampleId() {
		return sampleId;
	}

	public void setSampleId(long sampleId) {
		this.sampleId = sampleId;
	}

	public List<DataCollectionPlan> getPlans() {
		return plans;
	}

	public void setPlans(List<DataCollectionPlan> plans) {
		this.plans = plans;
	}

	public List<Component> getComponents() {
		return components;
	}

	public void setComponents(List<Component> components) {
		this.components = components;
	}

	public List<ComponentLattice> getLattices() {
		return lattices;
	}

	public void setLattices(List<ComponentLattice> lattices) {
		this.lattices = lattices;
	}

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}
	
	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object that) {
		return EqualsBuilder.reflectionEquals(this, that);
	}
}
