package org.fax4j.bridge.http;

import org.fax4j.bridge.AbstractContextFaxBridge;
import org.fax4j.spi.http.HTTPRequest;

/**
 * This is the HTTP web2fax based implementation of the fax bridge.
 * <br>
 * Below table describes the configuration values relevant for this class.<br>
 * <b>Configuration:</b>
 * <table summary="" border="1">
 * 	<tr>
 * 		<td>Name</td>
 * 		<td>Description</td>
 * 		<td>Preconfigured Value</td>
 * 		<td>Default Value</td>
 * 		<td>Mandatory</td>
 * </tr>
 * 	<tr>
 * 		<td>org.fax4j.bridge.vendor.policy.class.name</td>
 * 		<td>The vendor policy class name.</td>
 * 		<td>org.fax4j.bridge.EmptyVendorPolicy</td>
 * 		<td>org.fax4j.bridge.EmptyVendorPolicy</td>
 * 		<td>false</td>
 * 	</tr>
 * 	<tr>
 * 		<td>org.fax4j.bridge.http.request.parser.class.name</td>
 * 		<td>The HTTP request parser class name used to convert the HTTP request to fax job data.</td>
 * 		<td>org.fax4j.bridge.http.MultiPartHTTPRequestParser</td>
 * 		<td>org.fax4j.bridge.http.MultiPartHTTPRequestParser</td>
 * 		<td>false</td>
 * 	</tr>
 * </table>
 * 
 * @author 	Sagie Gur-Ari
 * @version 1.04
 * @since	0.40.6
 */
public class HTTP2FaxBridge extends AbstractContextFaxBridge<HTTPRequest>
{
	/**The HTTP request parser class name*/
	public static final String HTTP_REQUEST_PARSER_CLASS_NAME_PROPERTY_KEY="org.fax4j.bridge.http.request.parser.class.name";

	/**
	 * This is the class constructor.
	 */
	public HTTP2FaxBridge()
	{
		super();
	}
	
	/**
	 * This function returns the key used to fetch the request parser
	 * class name from the fax4j.properties.
	 * 
	 * @return	The request parser class name configuration key
	 */
	@Override
	protected String getRequestParserConfigurationKey()
	{
		return HTTP2FaxBridge.HTTP_REQUEST_PARSER_CLASS_NAME_PROPERTY_KEY;
	}
	
	/**
	 * This function returns the default request parser class name.
	 * 
	 * @return	The default request parser class name
	 */
	@Override
	protected String getDefaultParserClassName()
	{
		return MultiPartHTTPRequestParser.class.getName();
	}
}