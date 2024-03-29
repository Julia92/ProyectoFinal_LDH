package desmoj.extensions.visualization2d.engine.model;

/**
 * An attribute has a key, a value and a date since its valid
 * 
 * @version DESMO-J, Ver. 2.4.0 copyright (c) 2013
 * @author christian.mueller@th-wildau.de
 *         For information about subproject: desmoj.extensions.visualization2d
 *         please have a look at: 
 *         http://www.th-wildau.de/cmueller/Desmo-J/Visualization2d/ 
 * 
 *         Licensed under the Apache License, Version 2.0 (the "License"); you
 *         may not use this file except in compliance with the License. You may
 *         obtain a copy of the License at
 *         http://www.apache.org/licenses/LICENSE-2.0
 * 
 *         Unless required by applicable law or agreed to in writing, software
 *         distributed under the License is distributed on an "AS IS" BASIS,
 *         WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or
 *         implied. See the License for the specific language governing
 *         permissions and limitations under the License.
 *
 */
public class Attribute {

	private String 	key;
	private String 	value;
	private long	since;
	
	public Attribute(String key, String value){
		this.key	= key;
		this.value	= value;
	}
	
	public Attribute(String key, String value, long since){
		this.key	= key;
		this.value	= value;
		this.since	= since;
	}
	
	public String getKey(){
		return this.key;
	}
	
	public String getValue(){
		return this.value;
	}
	
	public long getSince(){
		return this.since;
	}
}
