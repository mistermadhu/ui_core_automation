package com.sempra.hr.cucumber.frwk.util;

import org.modelmapper.spi.MatchingStrategy;

import com.sempra.hr.cucumber.frwk.annotations.Data;

/**
 * ModelMapper matcher implementation that can match object properties based
 * on @Data annotations
 * 
 * @author maritakula@prokarma.com
 * @version 1.0
 */
public class DataAnnotePropertyMatcher implements MatchingStrategy {

	/**
	 * Returns the exact match
	 */
	@Override
	public boolean isExact() {
		return false;
	}

	/**
	 * return if the property matches
	 */
	@Override
	public boolean matches(PropertyNameInfo propertyInfo) {
		String sourceName = propertyInfo.getSourceProperties().get(0).getName().replaceAll(" ", "");

		/**
		 * logger.info("Source Name: " + sourceName); for (PropertyInfo
		 * property : propertyInfo.getDestinationProperties()) {
		 * logger.info(property.getAnnotation(Data.class)); }
		 */

		return propertyInfo.getDestinationProperties().stream()
				.anyMatch(propType -> propType.getAnnotation(Data.class) != null
						&& propType.getAnnotation(Data.class).name().replace(" ", "").equalsIgnoreCase(sourceName));
	}
}