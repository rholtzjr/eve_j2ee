/**
 * 
 */
package org.holtz.eve.util;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.fasterxml.jackson.databind.deser.DefaultDeserializationContext;
import com.fasterxml.jackson.databind.ser.DefaultSerializerProvider;
import com.fasterxml.jackson.datatype.hibernate4.Hibernate4Module;

/**
 * @author ronh
 *
 */
public class HibernateAwareObjectMapper extends ObjectMapper {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 
	 */
	public HibernateAwareObjectMapper() {
		registerModule(new Hibernate4Module());
		this.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
	}

	/**
	 * @param jf
	 */
	public HibernateAwareObjectMapper(JsonFactory jf) {
		super(jf);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param src
	 */
	public HibernateAwareObjectMapper(ObjectMapper src) {
		super(src);
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param jf
	 * @param sp
	 * @param dc
	 */
	public HibernateAwareObjectMapper(JsonFactory jf, DefaultSerializerProvider sp, DefaultDeserializationContext dc) {
		super(jf, sp, dc);
		// TODO Auto-generated constructor stub
	}

}
