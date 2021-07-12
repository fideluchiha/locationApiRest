package com.locations.apiRest.entities;

import java.math.BigInteger;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value = "org.hibernate.jpamodelgen.JPAMetaModelEntityProcessor")
@StaticMetamodel(Locations.class)
public abstract class Locations_ {

	public static volatile SingularAttribute<Locations, Date> createdAt;
	public static volatile SingularAttribute<Locations, String> name;
	public static volatile SingularAttribute<Locations, BigInteger> areaM2;
	public static volatile SingularAttribute<Locations, Long> location;
	public static volatile SingularAttribute<Locations, String> setParentLocation;
	public static volatile SingularAttribute<Locations, Date> updatedAt;

}

